package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class t2 implements Runnable {
    public final int f28282a;
    public final int f28283b;
    public final long f28284c;
    public final long d;
    public final Utilities.Callback e;
    public final long f28285f;

    public t2(int i10, long j3, long j10, Utilities.Callback callback, long j11, int i11) {
        this.f28282a = i11;
        this.f28283b = i10;
        this.f28284c = j3;
        this.d = j10;
        this.e = callback;
        this.f28285f = j11;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.e6 dVar;
        switch (this.f28282a) {
            case 0:
                int i10 = this.f28283b;
                t2 t2Var = new t2(i10, this.f28284c, this.d, this.e, this.f28285f, 1);
                if (!yh.t5.y(i10, false).e) {
                    yh.t5 y3 = yh.t5.y(i10, false);
                    y3.e = false;
                    y3.q(false, true, t2Var);
                    y3.e = true;
                    return;
                }
                t2Var.run();
                return;
            default:
                int i11 = this.f28283b;
                long j3 = yh.t5.y(i11, false).p().amount;
                long j10 = this.f28284c;
                Utilities.Callback callback = this.e;
                long j11 = this.f28285f;
                if (j3 < j10) {
                    Activity activity = AndroidUtilities.getActivity();
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (!PhotoViewer.t1().Q1() && (U == null || !U.hasShownSheet())) {
                        if (U != null) {
                            dVar = U.getResourceProvider();
                        } else {
                            dVar = null;
                        }
                    } else {
                        dVar = new ai.d();
                    }
                    org.telegram.ui.ActionBar.e6 e6Var = dVar;
                    if (activity != null) {
                        long j12 = this.d;
                        new yh.k7(activity, e6Var, j10, 13, DialogObject.getShortName(i11, j12), new org.telegram.ui.c6(j11, 1, callback), j12).show();
                        return;
                    }
                    return;
                }
                callback.run(Long.valueOf(j11));
                return;
        }
    }
}
