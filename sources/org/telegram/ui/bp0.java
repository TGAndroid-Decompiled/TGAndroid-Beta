package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class bp0 implements Utilities.Callback2 {
    public final int f36366a;
    public final TL_stars.TL_starGiftUnique f36367b;
    public final long f36368c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f36369e;
    public final Object f36370f;

    public bp0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Object obj2, int i10) {
        this.f36366a = i10;
        this.d = notificationCenterDelegate;
        this.f36369e = obj;
        this.f36367b = tL_starGiftUnique;
        this.f36368c = j3;
        this.f36370f = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.f36366a) {
            case 0:
                aq0.U((aq0) this.d, (boolean[]) this.f36369e, this.f36367b, this.f36368c, (xo0) this.f36370f, (yh.w2) obj, (of.e) obj2);
                return;
            default:
                yh.s3 s3Var = (yh.s3) this.d;
                xh.l0 l0Var = (xh.l0) this.f36370f;
                String str = (String) obj2;
                ((of.e) this.f36369e).b();
                if (((Boolean) obj).booleanValue()) {
                    yh.g2 g2Var = s3Var.P0;
                    if (g2Var != null) {
                        if (l0Var != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        g2Var.b(this.f36367b, this.f36368c, z10);
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
