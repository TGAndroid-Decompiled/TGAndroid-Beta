package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class j20 implements Runnable {
    public final int f40361a;
    public final x50 f40362b;

    public j20(x50 x50Var, int i10) {
        this.f40361a = i10;
        this.f40362b = x50Var;
    }

    @Override
    public final void run() {
        switch (this.f40361a) {
            case 0:
                x50 x50Var = this.f40362b;
                if (x50Var.r1() && AndroidUtilities.checkInlinePermissions(x50Var.f45524i0) && !org.telegram.ui.Components.voip.i1.f33949d0.V) {
                    x50Var.dismiss();
                    AndroidUtilities.runOnUIThread(new j20(x50Var, 4), 100L);
                    return;
                }
                return;
            case 1:
                x50 x50Var2 = this.f40362b;
                if (x50Var2.f45491a1 != null && x50Var2.R1 && VoIPService.getSharedInstance() != null) {
                    try {
                        x50Var2.f45581w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    x50Var2.K1(1, true);
                    AndroidUtilities.runOnUIThread(x50Var2.f45589x2, 80L);
                    x50Var2.R1 = false;
                    x50Var2.S1 = true;
                    return;
                }
                return;
            case 2:
                x50 x50Var3 = this.f40362b;
                int i10 = x50Var3.T1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    x50Var3.O1(true, false);
                    return;
                }
                return;
            case 3:
                this.f40362b.v1();
                return;
            case 4:
                org.telegram.ui.Components.voip.i1.n(this.f40362b.f45524i0);
                return;
            case 5:
                this.f40362b.dismiss();
                return;
            case 6:
                x50 x50Var4 = this.f40362b;
                x50Var4.L1();
                AndroidUtilities.runOnUIThread(x50Var4.D1, 1000L);
                return;
            case 7:
                r40 r40Var = this.f40362b.f45560r0;
                if (r40Var != null) {
                    r40Var.show();
                    return;
                }
                return;
            case 8:
                x50.t(this.f40362b);
                return;
            case 9:
                this.f40362b.d.getMessagesController().deleteUserPhoto(null);
                return;
            default:
                x50 x50Var5 = this.f40362b;
                x50Var5.f45590x3 = null;
                x50Var5.I1(true);
                return;
        }
    }
}
