package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class q20 implements Runnable {
    public final int f40304a;
    public final d60 f40305b;

    public q20(d60 d60Var, int i10) {
        this.f40304a = i10;
        this.f40305b = d60Var;
    }

    @Override
    public final void run() {
        switch (this.f40304a) {
            case 0:
                d60 d60Var = this.f40305b;
                if (d60Var.r1() && AndroidUtilities.checkInlinePermissions(d60Var.f36012f0) && !org.telegram.ui.Components.voip.h1.f32071a0.S) {
                    d60Var.dismiss();
                    AndroidUtilities.runOnUIThread(new q20(d60Var, 4), 100L);
                    return;
                }
                return;
            case 1:
                d60 d60Var2 = this.f40305b;
                if (d60Var2.X0 != null && d60Var2.O1 && VoIPService.getSharedInstance() != null) {
                    try {
                        d60Var2.f36081w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    d60Var2.J1(1, true);
                    AndroidUtilities.runOnUIThread(d60Var2.f36075u2, 80L);
                    d60Var2.O1 = false;
                    d60Var2.P1 = true;
                    return;
                }
                return;
            case 2:
                d60 d60Var3 = this.f40305b;
                int i10 = d60Var3.Q1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    d60Var3.N1(true, false);
                    return;
                }
                return;
            case 3:
                this.f40305b.v1();
                return;
            case 4:
                org.telegram.ui.Components.voip.h1.n(this.f40305b.f36012f0);
                return;
            case 5:
                this.f40305b.dismiss();
                return;
            case 6:
                d60 d60Var4 = this.f40305b;
                d60Var4.K1();
                AndroidUtilities.runOnUIThread(d60Var4.A1, 1000L);
                return;
            case 7:
                z40 z40Var = this.f40305b.f36047o0;
                if (z40Var != null) {
                    z40Var.show();
                    return;
                }
                return;
            case 8:
                d60.t(this.f40305b);
                return;
            case 9:
                this.f40305b.d.getMessagesController().deleteUserPhoto(null);
                return;
            default:
                d60 d60Var5 = this.f40305b;
                d60Var5.f36076u3 = null;
                d60Var5.H1(true);
                return;
        }
    }
}
