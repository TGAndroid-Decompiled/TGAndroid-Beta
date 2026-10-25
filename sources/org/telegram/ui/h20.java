package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class h20 implements Runnable {
    public final int f39870a;
    public final v50 f39871b;

    public h20(v50 v50Var, int i10) {
        this.f39870a = i10;
        this.f39871b = v50Var;
    }

    @Override
    public final void run() {
        switch (this.f39870a) {
            case 0:
                v50 v50Var = this.f39871b;
                if (v50Var.r1() && AndroidUtilities.checkInlinePermissions(v50Var.f44640i0) && !org.telegram.ui.Components.voip.i1.f33841d0.V) {
                    v50Var.dismiss();
                    AndroidUtilities.runOnUIThread(new h20(v50Var, 4), 100L);
                    return;
                }
                return;
            case 1:
                v50 v50Var2 = this.f39871b;
                if (v50Var2.f44607a1 != null && v50Var2.R1 && VoIPService.getSharedInstance() != null) {
                    try {
                        v50Var2.f44697w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    v50Var2.K1(1, true);
                    AndroidUtilities.runOnUIThread(v50Var2.f44705x2, 80L);
                    v50Var2.R1 = false;
                    v50Var2.S1 = true;
                    return;
                }
                return;
            case 2:
                v50 v50Var3 = this.f39871b;
                int i10 = v50Var3.T1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    v50Var3.O1(true, false);
                    return;
                }
                return;
            case 3:
                this.f39871b.v1();
                return;
            case 4:
                org.telegram.ui.Components.voip.i1.n(this.f39871b.f44640i0);
                return;
            case 5:
                this.f39871b.dismiss();
                return;
            case 6:
                v50 v50Var4 = this.f39871b;
                v50Var4.L1();
                AndroidUtilities.runOnUIThread(v50Var4.D1, 1000L);
                return;
            case 7:
                p40 p40Var = this.f39871b.f44676r0;
                if (p40Var != null) {
                    p40Var.show();
                    return;
                }
                return;
            case 8:
                v50.t(this.f39871b);
                return;
            case 9:
                this.f39871b.d.getMessagesController().deleteUserPhoto(null);
                return;
            default:
                v50 v50Var5 = this.f39871b;
                v50Var5.f44706x3 = null;
                v50Var5.I1(true);
                return;
        }
    }
}
