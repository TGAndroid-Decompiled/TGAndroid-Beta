package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class cp0 implements Utilities.Callback2 {
    public final int f31751a;
    public final TL_stars.TL_starGiftUnique f31752b;
    public final long f31753c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final Object f31754f;

    public cp0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Object obj2, int i10) {
        this.f31751a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.f31752b = tL_starGiftUnique;
        this.f31753c = j3;
        this.f31754f = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.f31751a) {
            case 0:
                bq0.U((bq0) this.d, (boolean[]) this.e, this.f31752b, this.f31753c, (yo0) this.f31754f, (xh.a3) obj, (nf.e) obj2);
                return;
            default:
                xh.x3 x3Var = (xh.x3) this.d;
                wh.k0 k0Var = (wh.k0) this.f31754f;
                String str = (String) obj2;
                ((nf.e) this.e).b();
                if (((Boolean) obj).booleanValue()) {
                    xh.k2 k2Var = x3Var.O0;
                    if (k2Var != null) {
                        if (k0Var != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        k2Var.a(this.f31752b, this.f31753c, z10);
                    }
                    if (k0Var != null) {
                        AndroidUtilities.runOnUIThread(new wh.e0(k0Var, 2));
                        x3Var.skipDismissAnimation();
                    }
                    x3Var.dismiss();
                    return;
                }
                return;
        }
    }
}
