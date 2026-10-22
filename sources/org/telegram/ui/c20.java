package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class c20 implements Runnable {
    public final int f35795a;
    public final q50 f35796b;

    public c20(q50 q50Var, int i10) {
        this.f35795a = i10;
        this.f35796b = q50Var;
    }

    @Override
    public final void run() {
        switch (this.f35795a) {
            case 0:
                q50 q50Var = this.f35796b;
                if (q50Var.s1() && AndroidUtilities.checkInlinePermissions(q50Var.f40412i0) && !org.telegram.ui.Components.voip.h1.f31444d0.V) {
                    q50Var.dismiss();
                    AndroidUtilities.runOnUIThread(new c20(q50Var, 4), 100L);
                    return;
                }
                return;
            case 1:
                q50 q50Var2 = this.f35796b;
                if (q50Var2.f40379a1 != null && q50Var2.R1 && VoIPService.getSharedInstance() != null) {
                    try {
                        q50Var2.f40469w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    q50Var2.K1(1, true);
                    AndroidUtilities.runOnUIThread(q50Var2.f40477x2, 80L);
                    q50Var2.R1 = false;
                    q50Var2.S1 = true;
                    return;
                }
                return;
            case 2:
                q50 q50Var3 = this.f35796b;
                int i10 = q50Var3.T1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    q50Var3.O1(true, false);
                    return;
                }
                return;
            case 3:
                this.f35796b.w1();
                return;
            case 4:
                org.telegram.ui.Components.voip.h1.n(this.f35796b.f40412i0);
                return;
            case 5:
                this.f35796b.dismiss();
                return;
            case 6:
                q50 q50Var4 = this.f35796b;
                q50Var4.L1();
                AndroidUtilities.runOnUIThread(q50Var4.D1, 1000L);
                return;
            case 7:
                k40 k40Var = this.f35796b.f40448r0;
                if (k40Var != null) {
                    k40Var.show();
                    return;
                }
                return;
            case 8:
                q50.v(this.f35796b);
                return;
            case 9:
                this.f35796b.d.getMessagesController().deleteUserPhoto(null);
                return;
            default:
                q50 q50Var5 = this.f35796b;
                q50Var5.f40478x3 = null;
                q50Var5.I1(true);
                return;
        }
    }
}
