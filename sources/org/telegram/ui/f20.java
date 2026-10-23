package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class f20 implements Runnable {
    public final int f37193a;
    public final u50 f37194b;

    public f20(u50 u50Var, int i10) {
        this.f37193a = i10;
        this.f37194b = u50Var;
    }

    @Override
    public final void run() {
        switch (this.f37193a) {
            case 0:
                u50 u50Var = this.f37194b;
                if (u50Var.r1() && AndroidUtilities.checkInlinePermissions(u50Var.f42204i0) && !org.telegram.ui.Components.voip.h1.f31626d0.V) {
                    u50Var.dismiss();
                    AndroidUtilities.runOnUIThread(new f20(u50Var, 4), 100L);
                    return;
                }
                return;
            case 1:
                u50 u50Var2 = this.f37194b;
                if (u50Var2.f42171a1 != null && u50Var2.R1 && VoIPService.getSharedInstance() != null) {
                    try {
                        u50Var2.f42261w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    u50Var2.K1(1, true);
                    AndroidUtilities.runOnUIThread(u50Var2.f42269x2, 80L);
                    u50Var2.R1 = false;
                    u50Var2.S1 = true;
                    return;
                }
                return;
            case 2:
                u50 u50Var3 = this.f37194b;
                int i10 = u50Var3.T1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    u50Var3.O1(true, false);
                    return;
                }
                return;
            case 3:
                this.f37194b.v1();
                return;
            case 4:
                org.telegram.ui.Components.voip.h1.n(this.f37194b.f42204i0);
                return;
            case 5:
                this.f37194b.dismiss();
                return;
            case 6:
                u50 u50Var4 = this.f37194b;
                u50Var4.L1();
                AndroidUtilities.runOnUIThread(u50Var4.D1, 1000L);
                return;
            case 7:
                n40 n40Var = this.f37194b.f42240r0;
                if (n40Var != null) {
                    n40Var.show();
                    return;
                }
                return;
            case 8:
                u50.u(this.f37194b);
                return;
            case 9:
                this.f37194b.d.getMessagesController().deleteUserPhoto(null);
                return;
            default:
                u50 u50Var5 = this.f37194b;
                u50Var5.f42270x3 = null;
                u50Var5.I1(true);
                return;
        }
    }
}
