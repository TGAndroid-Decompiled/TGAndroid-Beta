package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class d20 implements Runnable {
    public final int f37280a;
    public final r50 f37281b;

    public d20(r50 r50Var, int i10) {
        this.f37280a = i10;
        this.f37281b = r50Var;
    }

    @Override
    public final void run() {
        switch (this.f37280a) {
            case 0:
                r50 r50Var = this.f37281b;
                if (r50Var.r1() && AndroidUtilities.checkInlinePermissions(r50Var.f41885e0) && !org.telegram.ui.Components.voip.h1.Z.R) {
                    r50Var.dismiss();
                    AndroidUtilities.runOnUIThread(new d20(r50Var, 4), 100L);
                    return;
                }
                return;
            case 1:
                r50 r50Var2 = this.f37281b;
                if (r50Var2.W0 != null && r50Var2.N1 && VoIPService.getSharedInstance() != null) {
                    try {
                        r50Var2.f41959w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    r50Var2.J1(1, true);
                    AndroidUtilities.runOnUIThread(r50Var2.f41949t2, 80L);
                    r50Var2.N1 = false;
                    r50Var2.O1 = true;
                    return;
                }
                return;
            case 2:
                r50 r50Var3 = this.f37281b;
                int i10 = r50Var3.P1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    r50Var3.N1(true, false);
                    return;
                }
                return;
            case 3:
                this.f37281b.v1();
                return;
            case 4:
                org.telegram.ui.Components.voip.h1.n(this.f37281b.f41885e0);
                return;
            case 5:
                this.f37281b.dismiss();
                return;
            case 6:
                r50 r50Var4 = this.f37281b;
                r50Var4.K1();
                AndroidUtilities.runOnUIThread(r50Var4.f41975z1, 1000L);
                return;
            case 7:
                m40 m40Var = this.f37281b.f41921n0;
                if (m40Var != null) {
                    m40Var.show();
                    return;
                }
                return;
            case 8:
                r50.t(this.f37281b);
                return;
            case 9:
                this.f37281b.d.getMessagesController().deleteUserPhoto(null);
                return;
            default:
                r50 r50Var5 = this.f37281b;
                r50Var5.f41950t3 = null;
                r50Var5.H1(true);
                return;
        }
    }
}
