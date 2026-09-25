package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.VoIPService;
public final class q20 implements Runnable {
    public final int f36736a;
    public final d60 f36737b;

    public q20(d60 d60Var, int i10) {
        this.f36736a = i10;
        this.f36737b = d60Var;
    }

    @Override
    public final void run() {
        switch (this.f36736a) {
            case 0:
                d60 d60Var = this.f36737b;
                if (d60Var.r1() && AndroidUtilities.checkInlinePermissions(d60Var.f32969i0) && !org.telegram.ui.Components.voip.k1.f29421d0.V) {
                    d60Var.dismiss();
                    AndroidUtilities.runOnUIThread(new q20(d60Var, 4), 100L);
                    return;
                }
                return;
            case 1:
                d60 d60Var2 = this.f36737b;
                if (d60Var2.f32936a1 != null && d60Var2.R1 && VoIPService.getSharedInstance() != null) {
                    try {
                        d60Var2.f33025w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    d60Var2.J1(1, true);
                    AndroidUtilities.runOnUIThread(d60Var2.f33033x2, 80L);
                    d60Var2.R1 = false;
                    d60Var2.S1 = true;
                    return;
                }
                return;
            case 2:
                d60 d60Var3 = this.f36737b;
                int i10 = d60Var3.T1;
                if (i10 == 1 || i10 == 2 || i10 == 6 || i10 == 5) {
                    d60Var3.N1(true, false);
                    return;
                }
                return;
            case 3:
                this.f36737b.v1();
                return;
            case 4:
                org.telegram.ui.Components.voip.k1.n(this.f36737b.f32969i0);
                return;
            case 5:
                this.f36737b.dismiss();
                return;
            case 6:
                d60 d60Var4 = this.f36737b;
                d60Var4.K1();
                AndroidUtilities.runOnUIThread(d60Var4.D1, 1000L);
                return;
            case 7:
                y40 y40Var = this.f36737b.f33004r0;
                if (y40Var != null) {
                    y40Var.show();
                    return;
                }
                return;
            case 8:
                d60.t(this.f36737b);
                return;
            case 9:
                this.f36737b.d.getMessagesController().deleteUserPhoto(null);
                return;
            default:
                d60 d60Var5 = this.f36737b;
                d60Var5.f33034x3 = null;
                d60Var5.H1(true);
                return;
        }
    }
}
