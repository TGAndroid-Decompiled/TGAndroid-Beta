package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;

public final class e20 implements Runnable {

    public final int f37604a;

    public final s50 f37605b;

    public e20(s50 s50Var, int i10) {
        this.f37604a = i10;
        this.f37605b = s50Var;
    }

    @Override
    public final void run() {
        switch (this.f37604a) {
            case 0:
                s50 s50Var = this.f37605b;
                if (s50Var.r1() && AndroidUtilities.checkInlinePermissions(s50Var.f42427e0) && !org.telegram.ui.Components.voip.g1.Z.R) {
                    s50Var.dismiss();
                    AndroidUtilities.runOnUIThread(new e20(s50Var, 4), 100L);
                    break;
                }
                break;
            case 1:
                s50 s50Var2 = this.f37605b;
                if (s50Var2.W0 != null && s50Var2.N1 && VoIPService.getSharedInstance() != null) {
                    try {
                        s50Var2.f42501w.performHapticFeedback(3, 2);
                        break;
                    } catch (Exception unused) {
                    }
                    s50Var2.J1(1, true);
                    AndroidUtilities.runOnUIThread(s50Var2.f42491t2, 80L);
                    s50Var2.N1 = false;
                    s50Var2.O1 = true;
                    break;
                }
                break;
            case 2:
                s50 s50Var3 = this.f37605b;
                int i10 = s50Var3.P1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    s50Var3.N1(true, false);
                }
                break;
            case 3:
                this.f37605b.v1();
                break;
            case 4:
                org.telegram.ui.Components.voip.g1.n(this.f37605b.f42427e0);
                break;
            case 5:
                this.f37605b.dismiss();
                break;
            case 6:
                s50 s50Var4 = this.f37605b;
                s50Var4.K1();
                AndroidUtilities.runOnUIThread(s50Var4.f42517z1, 1000L);
                break;
            case 7:
                m40 m40Var = this.f37605b.f42463n0;
                if (m40Var != null) {
                    m40Var.show();
                }
                break;
            case 8:
                s50.u(this.f37605b);
                break;
            case 9:
                this.f37605b.d.getMessagesController().deleteUserPhoto(null);
                break;
            default:
                s50 s50Var5 = this.f37605b;
                s50Var5.f42492t3 = null;
                s50Var5.H1(true);
                break;
        }
    }
}
