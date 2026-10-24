package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class u2 implements Runnable {
    public final int f30989a;
    public final int f30990b;
    public final long f30991c;
    public final long d;
    public final Utilities.Callback e;
    public final long f30992f;

    public u2(int i10, long j10, long j11, Utilities.Callback callback, long j12, int i11) {
        this.f30989a = i11;
        this.f30990b = i10;
        this.f30991c = j10;
        this.d = j11;
        this.e = callback;
        this.f30992f = j12;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.g6 bVar;
        switch (this.f30989a) {
            case 0:
                int i10 = this.f30990b;
                u2 u2Var = new u2(i10, this.f30991c, this.d, this.e, this.f30992f, 1);
                if (!ai.ha.y(i10, false).e) {
                    ai.ha y3 = ai.ha.y(i10, false);
                    y3.e = false;
                    y3.q(false, true, u2Var);
                    y3.e = true;
                    return;
                }
                u2Var.run();
                return;
            default:
                int i11 = this.f30990b;
                long j10 = ai.ha.y(i11, false).p().amount;
                long j11 = this.f30991c;
                int i12 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
                Utilities.Callback callback = this.e;
                long j12 = this.f30992f;
                if (i12 < 0) {
                    Activity activity = AndroidUtilities.getActivity();
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (!PhotoViewer.u1().T1() && (U == null || !U.hasShownSheet())) {
                        if (U != null) {
                            bVar = U.getResourceProvider();
                        } else {
                            bVar = null;
                        }
                    } else {
                        bVar = new ci.b();
                    }
                    org.telegram.ui.ActionBar.g6 g6Var = bVar;
                    if (activity != null) {
                        long j13 = this.d;
                        new ai.dd(activity, g6Var, j11, 13, DialogObject.getShortName(i11, j13), new org.telegram.ui.j6(j12, 1, callback), j13).show();
                        return;
                    }
                    return;
                }
                callback.run(Long.valueOf(j12));
                return;
        }
    }
}
