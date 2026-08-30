package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class r2 implements Runnable {
    public final int f28362a;
    public final int f28363b;
    public final long f28364c;
    public final long d;
    public final Utilities.Callback e;
    public final long f28365f;

    public r2(int i10, long j10, long j11, Utilities.Callback callback, long j12, int i11) {
        this.f28362a = i11;
        this.f28363b = i10;
        this.f28364c = j10;
        this.d = j11;
        this.e = callback;
        this.f28365f = j12;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.f6 bVar;
        switch (this.f28362a) {
            case 0:
                int i10 = this.f28363b;
                r2 r2Var = new r2(i10, this.f28364c, this.d, this.e, this.f28365f, 1);
                if (!lh.t7.y(i10, false).e) {
                    lh.t7 y10 = lh.t7.y(i10, false);
                    y10.e = false;
                    y10.q(false, true, r2Var);
                    y10.e = true;
                    return;
                }
                r2Var.run();
                return;
            default:
                int i11 = this.f28363b;
                long j10 = lh.t7.y(i11, false).p().amount;
                long j11 = this.f28364c;
                Utilities.Callback callback = this.e;
                long j12 = this.f28365f;
                if (j10 < j11) {
                    Activity activity = AndroidUtilities.getActivity();
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (!PhotoViewer.t1().Q1() && (U == null || !U.hasShownSheet())) {
                        if (U != null) {
                            bVar = U.getResourceProvider();
                        } else {
                            bVar = null;
                        }
                    } else {
                        bVar = new nh.b();
                    }
                    org.telegram.ui.ActionBar.f6 f6Var = bVar;
                    if (activity != null) {
                        long j13 = this.d;
                        new lh.z9(activity, f6Var, j11, 13, DialogObject.getShortName(i11, j13), new org.telegram.ui.i6(j12, 1, callback), j13).show();
                        return;
                    }
                    return;
                }
                callback.run(Long.valueOf(j12));
                return;
        }
    }
}
