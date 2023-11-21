/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package rpgmanager.main;

import java.text.NumberFormat;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author Xoan
 */
public class EntityDialog extends javax.swing.JDialog {
    private static App app;

    public EntityDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        app = (App) parent;
        initComponents();
        setLocationRelativeTo(parent);
        
        NumberFormat format = NumberFormat.getInstance();
        NumberFormatter formatter = new NumberFormatter(format);
        formatter.setValueClass(Integer.class);
        formatter.setMinimum(0);
        formatter.setMaximum(Integer.MAX_VALUE);
        formatter.setAllowsInvalid(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInfo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        panelStats = new javax.swing.JPanel();
        panelStr = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        lblModStr = new javax.swing.JLabel();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        panelDex = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblModDex = new javax.swing.JLabel();
        panelCon = new javax.swing.JPanel();
        lblModCon = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        panelWis = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        lblModWis = new javax.swing.JLabel();
        panelInl = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lblModInl = new javax.swing.JLabel();
        panelChr = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lblModChr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Create Entity");
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(800, 500));
        setPreferredSize(new java.awt.Dimension(800, 500));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Subrace");
        panelInfo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 50, 24));

        jLabel3.setText("Class");
        panelInfo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, 24));

        tfName.setToolTipText("Name");
        tfName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNameActionPerformed(evt);
            }
        });
        panelInfo.add(tfName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, -1));

        jComboBox1.setMaximumSize(new java.awt.Dimension(70, 24));
        jComboBox1.setMinimumSize(new java.awt.Dimension(70, 24));
        jComboBox1.setName(""); // NOI18N
        jComboBox1.setPreferredSize(new java.awt.Dimension(70, 24));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        panelInfo.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 110, -1));

        jComboBox2.setMaximumSize(new java.awt.Dimension(70, 24));
        jComboBox2.setMinimumSize(new java.awt.Dimension(70, 24));
        jComboBox2.setPreferredSize(new java.awt.Dimension(70, 24));
        panelInfo.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 10, 110, -1));

        jLabel1.setText("Level");
        panelInfo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, 24));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        panelInfo.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 30, -1));

        jLabel6.setText("Race");
        panelInfo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 30, 24));

        jComboBox3.setMaximumSize(new java.awt.Dimension(70, 24));
        jComboBox3.setMinimumSize(new java.awt.Dimension(70, 24));
        jComboBox3.setName(""); // NOI18N
        jComboBox3.setPreferredSize(new java.awt.Dimension(70, 24));
        panelInfo.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 110, -1));

        getContentPane().add(panelInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 40));

        panelStr.setBackground(new java.awt.Color(255, 102, 102));
        panelStr.setMaximumSize(new java.awt.Dimension(70, 70));
        panelStr.setMinimumSize(new java.awt.Dimension(70, 70));
        panelStr.setName(""); // NOI18N
        panelStr.setPreferredSize(new java.awt.Dimension(70, 70));
        panelStr.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Strength");
        panelStr.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 20));

        lblModStr.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblModStr.setForeground(new java.awt.Color(0, 0, 0));
        lblModStr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        panelStr.add(lblModStr, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 70, 25));

        jFormattedTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextField1ActionPerformed(evt);
            }
        });
        panelStr.add(jFormattedTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 45, 30, 25));

        panelDex.setBackground(new java.awt.Color(255, 153, 102));
        panelDex.setMaximumSize(new java.awt.Dimension(70, 70));
        panelDex.setMinimumSize(new java.awt.Dimension(70, 70));
        panelDex.setName(""); // NOI18N
        panelDex.setPreferredSize(new java.awt.Dimension(70, 70));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Dexterity");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblModDex.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblModDex.setForeground(new java.awt.Color(0, 0, 0));
        lblModDex.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelDexLayout = new javax.swing.GroupLayout(panelDex);
        panelDex.setLayout(panelDexLayout);
        panelDexLayout.setHorizontalGroup(
            panelDexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblModDex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelDexLayout.setVerticalGroup(
            panelDexLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDexLayout.createSequentialGroup()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblModDex, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        panelCon.setBackground(new java.awt.Color(153, 255, 153));
        panelCon.setMaximumSize(new java.awt.Dimension(70, 70));
        panelCon.setMinimumSize(new java.awt.Dimension(70, 70));
        panelCon.setName(""); // NOI18N
        panelCon.setPreferredSize(new java.awt.Dimension(70, 70));

        lblModCon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblModCon.setForeground(new java.awt.Color(0, 0, 0));
        lblModCon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Constitution");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelConLayout = new javax.swing.GroupLayout(panelCon);
        panelCon.setLayout(panelConLayout);
        panelConLayout.setHorizontalGroup(
            panelConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblModCon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelConLayout.setVerticalGroup(
            panelConLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelConLayout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblModCon, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        panelWis.setBackground(new java.awt.Color(204, 153, 255));
        panelWis.setMaximumSize(new java.awt.Dimension(70, 70));
        panelWis.setMinimumSize(new java.awt.Dimension(70, 70));
        panelWis.setName(""); // NOI18N
        panelWis.setPreferredSize(new java.awt.Dimension(70, 70));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Wisdom");
        jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblModWis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblModWis.setForeground(new java.awt.Color(0, 0, 0));
        lblModWis.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelWisLayout = new javax.swing.GroupLayout(panelWis);
        panelWis.setLayout(panelWisLayout);
        panelWisLayout.setHorizontalGroup(
            panelWisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblModWis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelWisLayout.setVerticalGroup(
            panelWisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelWisLayout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblModWis, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        panelInl.setBackground(new java.awt.Color(153, 153, 255));
        panelInl.setMaximumSize(new java.awt.Dimension(70, 70));
        panelInl.setMinimumSize(new java.awt.Dimension(70, 70));
        panelInl.setName(""); // NOI18N
        panelInl.setPreferredSize(new java.awt.Dimension(70, 70));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Intelligence");

        lblModInl.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblModInl.setForeground(new java.awt.Color(0, 0, 0));
        lblModInl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelInlLayout = new javax.swing.GroupLayout(panelInl);
        panelInl.setLayout(panelInlLayout);
        panelInlLayout.setHorizontalGroup(
            panelInlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 70, Short.MAX_VALUE)
            .addComponent(lblModInl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelInlLayout.setVerticalGroup(
            panelInlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInlLayout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblModInl, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        panelChr.setBackground(new java.awt.Color(255, 255, 51));
        panelChr.setMaximumSize(new java.awt.Dimension(70, 70));
        panelChr.setMinimumSize(new java.awt.Dimension(70, 70));
        panelChr.setName(""); // NOI18N
        panelChr.setPreferredSize(new java.awt.Dimension(70, 70));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Charisma");

        lblModChr.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblModChr.setForeground(new java.awt.Color(0, 0, 0));
        lblModChr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelChrLayout = new javax.swing.GroupLayout(panelChr);
        panelChr.setLayout(panelChrLayout);
        panelChrLayout.setHorizontalGroup(
            panelChrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblModChr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelChrLayout.setVerticalGroup(
            panelChrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChrLayout.createSequentialGroup()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblModChr, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelStatsLayout = new javax.swing.GroupLayout(panelStats);
        panelStats.setLayout(panelStatsLayout);
        panelStatsLayout.setHorizontalGroup(
            panelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStatsLayout.createSequentialGroup()
                .addGroup(panelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(panelDex, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelStr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelWis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelChr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelInl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 12, Short.MAX_VALUE))
        );
        panelStatsLayout.setVerticalGroup(
            panelStatsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelStatsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelStr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelWis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelInl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelChr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(panelStats, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 32, -1, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNameActionPerformed
        
    }//GEN-LAST:event_tfNameActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        app.setVisible(true);
    }//GEN-LAST:event_formWindowClosing

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jFormattedTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EntityDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntityDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntityDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntityDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EntityDialog dialog = new EntityDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblModChr;
    private javax.swing.JLabel lblModCon;
    private javax.swing.JLabel lblModDex;
    private javax.swing.JLabel lblModInl;
    private javax.swing.JLabel lblModStr;
    private javax.swing.JLabel lblModWis;
    private javax.swing.JPanel panelChr;
    private javax.swing.JPanel panelCon;
    private javax.swing.JPanel panelDex;
    private javax.swing.JPanel panelInfo;
    private javax.swing.JPanel panelInl;
    private javax.swing.JPanel panelStats;
    private javax.swing.JPanel panelStr;
    private javax.swing.JPanel panelWis;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
}