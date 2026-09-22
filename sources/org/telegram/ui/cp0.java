package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class cp0 implements Utilities.Callback2 {
    public final int f32843a;
    public final TL_stars.TL_starGiftUnique f32844b;
    public final long f32845c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final Object f32846f;

    public cp0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Object obj2, int i10) {
        this.f32843a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.f32844b = tL_starGiftUnique;
        this.f32845c = j3;
        this.f32846f = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.f32843a) {
            case 0:
                aq0.U((aq0) this.d, (boolean[]) this.e, this.f32844b, this.f32845c, (yo0) this.f32846f, (yh.c3) obj, (nf.e) obj2);
                return;
            default:
                yh.z3 z3Var = (yh.z3) this.d;
                xh.j0 j0Var = (xh.j0) this.f32846f;
                String str = (String) obj2;
                ((nf.e) this.e).b();
                if (((Boolean) obj).booleanValue()) {
                    yh.l2 l2Var = z3Var.O0;
                    if (l2Var != null) {
                        if (j0Var != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        l2Var.b(this.f32844b, this.f32845c, z10);
                    }
                    if (j0Var != null) {
                        AndroidUtilities.runOnUIThread(new xh.d0(j0Var, 2));
                        z3Var.skipDismissAnimation();
                    }
                    z3Var.dismiss();
                    return;
                }
                return;
        }
    }
}
