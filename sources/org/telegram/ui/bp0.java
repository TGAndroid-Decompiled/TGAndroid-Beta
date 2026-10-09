package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class bp0 implements Utilities.Callback2 {
    public final int f36364a;
    public final TL_stars.TL_starGiftUnique f36365b;
    public final long f36366c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f36367e;
    public final Object f36368f;

    public bp0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Object obj2, int i10) {
        this.f36364a = i10;
        this.d = notificationCenterDelegate;
        this.f36367e = obj;
        this.f36365b = tL_starGiftUnique;
        this.f36366c = j3;
        this.f36368f = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.f36364a) {
            case 0:
                aq0.U((aq0) this.d, (boolean[]) this.f36367e, this.f36365b, this.f36366c, (xo0) this.f36368f, (yh.w2) obj, (of.e) obj2);
                return;
            default:
                yh.s3 s3Var = (yh.s3) this.d;
                xh.l0 l0Var = (xh.l0) this.f36368f;
                String str = (String) obj2;
                ((of.e) this.f36367e).b();
                if (((Boolean) obj).booleanValue()) {
                    yh.g2 g2Var = s3Var.P0;
                    if (g2Var != null) {
                        if (l0Var != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        g2Var.b(this.f36365b, this.f36366c, z10);
                    }
                    if (l0Var != null) {
                        AndroidUtilities.runOnUIThread(new xh.f0(l0Var, 2));
                        s3Var.skipDismissAnimation();
                    }
                    s3Var.dismiss();
                    return;
                }
                return;
        }
    }
}
