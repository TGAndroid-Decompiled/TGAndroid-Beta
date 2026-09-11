package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public final class dp0 implements Utilities.Callback2 {
    public final int f35835a;
    public final TL_stars.TL_starGiftUnique f35836b;
    public final long f35837c;
    public final NotificationCenter.NotificationCenterDelegate d;
    public final Object f35838e;
    public final Object f35839f;

    public dp0(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Object obj, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3, Object obj2, int i10) {
        this.f35835a = i10;
        this.d = notificationCenterDelegate;
        this.f35838e = obj;
        this.f35836b = tL_starGiftUnique;
        this.f35837c = j3;
        this.f35839f = obj2;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        boolean z10;
        switch (this.f35835a) {
            case 0:
                bq0.U((bq0) this.d, (boolean[]) this.f35838e, this.f35836b, this.f35837c, (zo0) this.f35839f, (zh.a3) obj, (of.e) obj2);
                return;
            default:
                zh.w3 w3Var = (zh.w3) this.d;
                yh.j0 j0Var = (yh.j0) this.f35839f;
                String str = (String) obj2;
                ((of.e) this.f35838e).b();
                if (((Boolean) obj).booleanValue()) {
                    zh.j2 j2Var = w3Var.O0;
                    if (j2Var != null) {
                        if (j0Var != null) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        j2Var.b(this.f35836b, this.f35837c, z10);
                    }
                    if (j0Var != null) {
                        AndroidUtilities.runOnUIThread(new yh.d0(j0Var, 2));
                        w3Var.skipDismissAnimation();
                    }
                    w3Var.dismiss();
                    return;
                }
                return;
        }
    }
}
