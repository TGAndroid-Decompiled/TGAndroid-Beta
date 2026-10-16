package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class gp0 implements Utilities.Callback2 {
    public final int f36286a;
    public final TL_stars.TL_starGiftUnique f36287b;
    public final long f36288c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final Object f36289f;

    public gp0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Object obj2, int i10) {
        this.f36286a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.f36287b = tL_starGiftUnique;
        this.f36288c = j10;
        this.f36289f = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.f36286a) {
            case 0:
                eq0.U((eq0) this.d, (boolean[]) this.e, this.f36287b, this.f36288c, (cp0) this.f36289f, (zh.v2) obj, (pf.c) obj2);
                return;
            default:
                zh.r3 r3Var = (zh.r3) this.d;
                yh.k0 k0Var = (yh.k0) this.f36289f;
                String str = (String) obj2;
                ((pf.c) this.e).b();
                if (((Boolean) obj).booleanValue()) {
                    zh.f2 f2Var = r3Var.P0;
                    if (f2Var != null) {
                        if (k0Var != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        f2Var.b(this.f36287b, this.f36288c, z10);
                    }
                    if (k0Var != null) {
                        AndroidUtilities.runOnUIThread(new yh.e0(k0Var, 2));
                        r3Var.skipDismissAnimation();
                    }
                    r3Var.dismiss();
                    return;
                }
                return;
        }
    }
}
