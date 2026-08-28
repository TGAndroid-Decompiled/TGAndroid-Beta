package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class b20 implements Runnable {
    public final int f36606a;
    public final o50 f36607b;

    public b20(o50 o50Var, int i9) {
        this.f36606a = i9;
        this.f36607b = o50Var;
    }

    @Override
    public final void run() {
        switch (this.f36606a) {
            case 0:
                o50 o50Var = this.f36607b;
                if (o50Var.r1() && AndroidUtilities.checkInlinePermissions(o50Var.f40898e0) && !org.telegram.ui.Components.voip.g1.Z.R) {
                    o50Var.dismiss();
                    AndroidUtilities.runOnUIThread(new b20(o50Var, 4), 100L);
                    return;
                }
                return;
            case 1:
                o50 o50Var2 = this.f36607b;
                if (o50Var2.W0 != null && o50Var2.N1 && VoIPService.getSharedInstance() != null) {
                    try {
                        o50Var2.f40972w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    o50Var2.J1(1, true);
                    AndroidUtilities.runOnUIThread(o50Var2.f40962t2, 80L);
                    o50Var2.N1 = false;
                    o50Var2.O1 = true;
                    return;
                }
                return;
            case 2:
                o50 o50Var3 = this.f36607b;
                int i9 = o50Var3.P1;
                if (i9 == 1 || i9 == 2 || i9 == 6 || i9 == 5) {
                    o50Var3.N1(true, false);
                    return;
                }
                return;
            case 3:
                this.f36607b.v1();
                return;
            case 4:
                org.telegram.ui.Components.voip.g1.n(this.f36607b.f40898e0);
                return;
            case 5:
                this.f36607b.dismiss();
                return;
            case 6:
                o50 o50Var4 = this.f36607b;
                o50Var4.K1();
                AndroidUtilities.runOnUIThread(o50Var4.f40988z1, 1000L);
                return;
            case 7:
                j40 j40Var = this.f36607b.f40934n0;
                if (j40Var != null) {
                    j40Var.show();
                    return;
                }
                return;
            case 8:
                o50.t(this.f36607b);
                return;
            case 9:
                this.f36607b.d.getMessagesController().deleteUserPhoto(null);
                return;
            default:
                o50 o50Var5 = this.f36607b;
                o50Var5.f40963t3 = null;
                o50Var5.H1(true);
                return;
        }
    }
}
