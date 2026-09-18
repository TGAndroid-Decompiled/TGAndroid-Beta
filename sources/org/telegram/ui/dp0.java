package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class dp0 implements Utilities.Callback2 {
    public final int f33059a;
    public final TL_stars.TL_starGiftUnique f33060b;
    public final long f33061c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final Object f33062f;

    public dp0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Object obj2, int i10) {
        this.f33059a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.f33060b = tL_starGiftUnique;
        this.f33061c = j3;
        this.f33062f = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.f33059a) {
            case 0:
                cq0.U((cq0) this.d, (boolean[]) this.e, this.f33060b, this.f33061c, (zo0) this.f33062f, (yh.b3) obj, (nf.e) obj2);
                return;
            default:
                yh.y3 y3Var = (yh.y3) this.d;
                xh.j0 j0Var = (xh.j0) this.f33062f;
                String str = (String) obj2;
                ((nf.e) this.e).b();
                if (((Boolean) obj).booleanValue()) {
                    yh.k2 k2Var = y3Var.O0;
                    if (k2Var != null) {
                        if (j0Var != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        k2Var.b(this.f33060b, this.f33061c, z10);
                    }
                    if (j0Var != null) {
                        AndroidUtilities.runOnUIThread(new xh.d0(j0Var, 2));
                        y3Var.skipDismissAnimation();
                    }
                    y3Var.dismiss();
                    return;
                }
                return;
        }
    }
}
