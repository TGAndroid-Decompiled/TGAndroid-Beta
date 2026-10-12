package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class ip0 implements Utilities.Callback2 {
    public final int f37185a;
    public final TL_stars.TL_starGiftUnique f37186b;
    public final long f37187c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object e;
    public final Object f37188f;

    public ip0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, Object obj2, int i10) {
        this.f37185a = i10;
        this.d = notificationCenterDelegate;
        this.e = obj;
        this.f37186b = tL_starGiftUnique;
        this.f37187c = j10;
        this.f37188f = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.f37185a) {
            case 0:
                gq0.U((gq0) this.d, (boolean[]) this.e, this.f37186b, this.f37187c, (ep0) this.f37188f, (zh.v2) obj, (pf.c) obj2);
                return;
            default:
                zh.r3 r3Var = (zh.r3) this.d;
                yh.k0 k0Var = (yh.k0) this.f37188f;
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
                        f2Var.b(this.f37186b, this.f37187c, z10);
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
