package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class t2 implements Runnable {
    public final int f30933a;
    public final int f30934b;
    public final long f30935c;
    public final long d;
    public final Utilities.Callback f30936e;
    public final long f30937f;

    public t2(int i10, long j3, long j10, Utilities.Callback callback, long j11, int i11) {
        this.f30933a = i11;
        this.f30934b = i10;
        this.f30935c = j3;
        this.d = j10;
        this.f30936e = callback;
        this.f30937f = j11;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.d6 dVar;
        switch (this.f30933a) {
            case 0:
                int i10 = this.f30934b;
                t2 t2Var = new t2(i10, this.f30935c, this.d, this.f30936e, this.f30937f, 1);
                if (!yh.t5.y(i10, false).f52014e) {
                    yh.t5 y3 = yh.t5.y(i10, false);
                    y3.f52014e = false;
                    y3.q(false, true, t2Var);
                    y3.f52014e = true;
                    return;
                }
                t2Var.run();
                return;
            default:
                int i11 = this.f30934b;
                long j3 = yh.t5.y(i11, false).p().amount;
                long j10 = this.f30935c;
                Utilities.Callback callback = this.f30936e;
                long j11 = this.f30937f;
                if (j3 < j10) {
                    Activity activity = AndroidUtilities.getActivity();
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
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
                        new yh.m7(activity, d6Var, j10, 13, DialogObject.getShortName(i11, j12), new org.telegram.ui.e6(j11, 1, callback), j12).show();
                        return;
                    }
                    return;
                }
                callback.run(Long.valueOf(j11));
                return;
        }
    }
}
