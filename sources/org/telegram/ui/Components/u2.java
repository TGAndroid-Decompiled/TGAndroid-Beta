package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class u2 implements Runnable {
    public final int f27551a;
    public final int f27552b;
    public final long f27553c;
    public final long d;
    public final Utilities.Callback e;
    public final long f27554f;

    public u2(int i10, long j3, long j10, Utilities.Callback callback, long j11, int i11) {
        this.f27551a = i11;
        this.f27552b = i10;
        this.f27553c = j3;
        this.d = j10;
        this.e = callback;
        this.f27554f = j11;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.f6 bVar;
        switch (this.f27551a) {
            case 0:
                int i10 = this.f27552b;
                u2 u2Var = new u2(i10, this.f27553c, this.d, this.e, this.f27554f, 1);
                if (!xh.v5.y(i10, false).e) {
                    xh.v5 y3 = xh.v5.y(i10, false);
                    y3.e = false;
                    y3.q(false, true, u2Var);
                    y3.e = true;
                    return;
                }
                u2Var.run();
                return;
            default:
                int i11 = this.f27552b;
                long j3 = xh.v5.y(i11, false).p().amount;
                long j10 = this.f27553c;
                Utilities.Callback callback = this.e;
                long j11 = this.f27554f;
                if (j3 < j10) {
                    Activity activity = AndroidUtilities.getActivity();
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (!PhotoViewer.t1().Q1() && (U == null || !U.hasShownSheet())) {
                        if (U != null) {
                            bVar = U.getResourceProvider();
                        } else {
                            bVar = null;
                        }
                    } else {
                        bVar = new zh.b();
                    }
                    org.telegram.ui.ActionBar.f6 f6Var = bVar;
                    if (activity != null) {
                        long j12 = this.d;
                        new xh.o7(activity, f6Var, j10, 13, DialogObject.getShortName(i11, j12), new org.telegram.ui.g6(j11, 1, callback), j12).show();
                        return;
                    }
                    return;
                }
                callback.run(Long.valueOf(j11));
                return;
        }
    }
}
