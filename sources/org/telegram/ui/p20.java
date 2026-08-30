package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class p20 implements Runnable {
    public final int f37154a;
    public final c60 f37155b;

    public p20(c60 c60Var, int i10) {
        this.f37154a = i10;
        this.f37155b = c60Var;
    }

    @Override
    public final void run() {
        switch (this.f37154a) {
            case 0:
                c60 c60Var = this.f37155b;
                if (c60Var.r1() && AndroidUtilities.checkInlinePermissions(c60Var.f33119f0) && !org.telegram.ui.Components.voip.g1.f29636a0.S) {
                    c60Var.dismiss();
                    AndroidUtilities.runOnUIThread(new p20(c60Var, 4), 100L);
                    return;
                }
                return;
            case 1:
                c60 c60Var2 = this.f37155b;
                if (c60Var2.X0 != null && c60Var2.O1 && VoIPService.getSharedInstance() != null) {
                    try {
                        c60Var2.f33188w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    c60Var2.J1(1, true);
                    AndroidUtilities.runOnUIThread(c60Var2.f33182u2, 80L);
                    c60Var2.O1 = false;
                    c60Var2.P1 = true;
                    return;
                }
                return;
            case 2:
                c60 c60Var3 = this.f37155b;
                int i10 = c60Var3.Q1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    c60Var3.N1(true, false);
                    return;
                }
                return;
            case 3:
                this.f37155b.v1();
                return;
            case 4:
                org.telegram.ui.Components.voip.g1.n(this.f37155b.f33119f0);
                return;
            case 5:
                this.f37155b.dismiss();
                return;
            case 6:
                c60 c60Var4 = this.f37155b;
                c60Var4.K1();
                AndroidUtilities.runOnUIThread(c60Var4.A1, 1000L);
                return;
            case 7:
                y40 y40Var = this.f37155b.f33154o0;
                if (y40Var != null) {
                    y40Var.show();
                    return;
                }
                return;
            case 8:
                c60.t(this.f37155b);
                return;
            case 9:
                this.f37155b.d.getMessagesController().deleteUserPhoto(null);
                return;
            default:
                c60 c60Var5 = this.f37155b;
                c60Var5.f33183u3 = null;
                c60Var5.H1(true);
                return;
        }
    }
}
