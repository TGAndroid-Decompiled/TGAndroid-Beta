package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class t2 implements Runnable {
    public final int f27994a;
    public final int f27995b;
    public final long f27996c;
    public final long d;
    public final Utilities.Callback e;
    public final long f27997f;

    public t2(int i10, long j3, long j10, Utilities.Callback callback, long j11, int i11) {
        this.f27994a = i11;
        this.f27995b = i10;
        this.f27996c = j3;
        this.d = j10;
        this.e = callback;
        this.f27997f = j11;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.f6 dVar;
        switch (this.f27994a) {
            case 0:
                int i10 = this.f27995b;
                t2 t2Var = new t2(i10, this.f27996c, this.d, this.e, this.f27997f, 1);
                if (!yh.v5.y(i10, false).e) {
                    yh.v5 y3 = yh.v5.y(i10, false);
                    y3.e = false;
                    y3.q(false, true, t2Var);
                    y3.e = true;
                    return;
                }
                t2Var.run();
                return;
            default:
                int i11 = this.f27995b;
                long j3 = yh.v5.y(i11, false).p().amount;
                long j10 = this.f27996c;
                Utilities.Callback callback = this.e;
                long j11 = this.f27997f;
                if (j3 < j10) {
                    Activity activity = AndroidUtilities.getActivity();
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (!PhotoViewer.t1().Q1() && (U == null || !U.hasShownSheet())) {
                        if (U != null) {
                            dVar = U.getResourceProvider();
                        } else {
                            dVar = null;
                        }
                    } else {
                        dVar = new ai.d();
                    }
                    org.telegram.ui.ActionBar.f6 f6Var = dVar;
                    if (activity != null) {
                        long j12 = this.d;
                        new yh.n7(activity, f6Var, j10, 13, DialogObject.getShortName(i11, j12), new org.telegram.ui.d6(j11, 1, callback), j12).show();
                        return;
                    }
                    return;
                }
                callback.run(Long.valueOf(j11));
                return;
        }
    }
}
