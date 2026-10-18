package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class e20 implements Runnable {
    public final int f36342a;
    public final s50 f36343b;

    public e20(s50 s50Var, int i10) {
        this.f36342a = i10;
        this.f36343b = s50Var;
    }

    @Override
    public final void run() {
        switch (this.f36342a) {
            case 0:
                s50 s50Var = this.f36343b;
                if (s50Var.s1() && AndroidUtilities.checkInlinePermissions(s50Var.f40929i0) && !org.telegram.ui.Components.voip.h1.f31480d0.V) {
                    s50Var.dismiss();
                    AndroidUtilities.runOnUIThread(new e20(s50Var, 4), 100L);
                    return;
                }
                return;
            case 1:
                s50 s50Var2 = this.f36343b;
                if (s50Var2.f40896a1 != null && s50Var2.R1 && VoIPService.getSharedInstance() != null) {
                    try {
                        s50Var2.f40986w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    s50Var2.K1(1, true);
                    AndroidUtilities.runOnUIThread(s50Var2.f40994x2, 80L);
                    s50Var2.R1 = false;
                    s50Var2.S1 = true;
                    return;
                }
                return;
            case 2:
                s50 s50Var3 = this.f36343b;
                int i10 = s50Var3.T1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    s50Var3.O1(true, false);
                    return;
                }
                return;
            case 3:
                this.f36343b.w1();
                return;
            case 4:
                org.telegram.ui.Components.voip.h1.n(this.f36343b.f40929i0);
                return;
            case 5:
                this.f36343b.dismiss();
                return;
            case 6:
                s50 s50Var4 = this.f36343b;
                s50Var4.L1();
                AndroidUtilities.runOnUIThread(s50Var4.D1, 1000L);
                return;
            case 7:
                m40 m40Var = this.f36343b.f40965r0;
                if (m40Var != null) {
                    m40Var.show();
                    return;
                }
                return;
            case 8:
                s50.v(this.f36343b);
                return;
            case 9:
                this.f36343b.d.getMessagesController().deleteUserPhoto(null);
                return;
            default:
                s50 s50Var5 = this.f36343b;
                s50Var5.f40995x3 = null;
                s50Var5.I1(true);
                return;
        }
    }
}
