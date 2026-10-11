package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class v2 implements Runnable {
    public final int f31787a;
    public final int f31788b;
    public final long f31789c;
    public final long d;
    public final Utilities.Callback f31790e;
    public final long f31791f;

    public v2(int i10, long j3, long j10, Utilities.Callback callback, long j11, int i11) {
        this.f31787a = i11;
        this.f31788b = i10;
        this.f31789c = j3;
        this.d = j10;
        this.f31790e = callback;
        this.f31791f = j11;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.d6 dVar;
        switch (this.f31787a) {
            case 0:
                int i10 = this.f31788b;
                v2 v2Var = new v2(i10, this.f31789c, this.d, this.f31790e, this.f31791f, 1);
                if (!yh.n5.y(i10, false).f53034e) {
                    yh.n5 y3 = yh.n5.y(i10, false);
                    y3.f53034e = false;
                    y3.q(false, true, v2Var);
                    y3.f53034e = true;
                    return;
                }
                v2Var.run();
                return;
            default:
                int i11 = this.f31788b;
                long j3 = yh.n5.y(i11, false).p().amount;
                long j10 = this.f31789c;
                int i12 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
                Utilities.Callback callback = this.f31790e;
                long j11 = this.f31791f;
                if (i12 < 0) {
                    Activity activity = AndroidUtilities.getActivity();
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (!PhotoViewer.t1().R1() && (U == null || !U.hasShownSheet())) {
                        if (U != null) {
                            dVar = U.getResourceProvider();
                        } else {
                            dVar = null;
                        }
                    } else {
                        dVar = new ai.d();
                    }
                    org.telegram.ui.ActionBar.d6 d6Var = dVar;
                    if (activity != null) {
                        long j12 = this.d;
                        new yh.e7(activity, d6Var, j10, 13, DialogObject.getShortName(i11, j12), new org.telegram.ui.e6(j11, 1, callback), j12).show();
                        return;
                    }
                    return;
                }
                callback.run(Long.valueOf(j11));
                return;
        }
    }
}
