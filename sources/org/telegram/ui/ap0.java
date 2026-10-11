package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class ap0 implements Utilities.Callback2 {
    public final int f36122a;
    public final TL_stars.TL_starGiftUnique f36123b;
    public final long f36124c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f36125e;
    public final Object f36126f;

    public ap0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Object obj2, int i10) {
        this.f36122a = i10;
        this.d = notificationCenterDelegate;
        this.f36125e = obj;
        this.f36123b = tL_starGiftUnique;
        this.f36124c = j3;
        this.f36126f = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.f36122a) {
            case 0:
                zp0.U((zp0) this.d, (boolean[]) this.f36125e, this.f36123b, this.f36124c, (wo0) this.f36126f, (yh.w2) obj, (of.e) obj2);
                return;
            default:
                yh.s3 s3Var = (yh.s3) this.d;
                xh.l0 l0Var = (xh.l0) this.f36126f;
                String str = (String) obj2;
                ((of.e) this.f36125e).b();
                if (((Boolean) obj).booleanValue()) {
                    yh.g2 g2Var = s3Var.P0;
                    if (g2Var != null) {
                        if (l0Var != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        g2Var.b(this.f36123b, this.f36124c, z10);
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
