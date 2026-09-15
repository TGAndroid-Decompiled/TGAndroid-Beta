package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class cp0 implements Utilities.Callback2 {
    public final int f32836a;
    public final TL_stars.TL_starGiftUnique f32837b;
    public final long f32838c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final Object f32839f;

    public cp0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Object obj2, int i10) {
        this.f32836a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.f32837b = tL_starGiftUnique;
        this.f32838c = j3;
        this.f32839f = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.f32836a) {
            case 0:
                aq0.U((aq0) this.d, (boolean[]) this.e, this.f32837b, this.f32838c, (yo0) this.f32839f, (yh.d3) obj, (nf.e) obj2);
                return;
            default:
                yh.a4 a4Var = (yh.a4) this.d;
                xh.j0 j0Var = (xh.j0) this.f32839f;
                String str = (String) obj2;
                ((nf.e) this.e).b();
                if (((Boolean) obj).booleanValue()) {
                    yh.m2 m2Var = a4Var.O0;
                    if (m2Var != null) {
                        if (j0Var != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        m2Var.b(this.f32837b, this.f32838c, z10);
                    }
                    if (j0Var != null) {
                        AndroidUtilities.runOnUIThread(new xh.d0(j0Var, 2));
                        a4Var.skipDismissAnimation();
                    }
                    a4Var.dismiss();
                    return;
                }
                return;
        }
    }
}
