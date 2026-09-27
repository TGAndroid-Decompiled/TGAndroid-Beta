package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class t2 implements Runnable {
    public final int f28437a;
    public final int f28438b;
    public final long f28439c;
    public final long d;
    public final Utilities.Callback e;
    public final long f28440f;

    public t2(int i10, long j3, long j10, Utilities.Callback callback, long j11, int i11) {
        this.f28437a = i11;
        this.f28438b = i10;
        this.f28439c = j3;
        this.d = j10;
        this.e = callback;
        this.f28440f = j11;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.e6 dVar;
        switch (this.f28437a) {
            case 0:
                int i10 = this.f28438b;
                t2 t2Var = new t2(i10, this.f28439c, this.d, this.e, this.f28440f, 1);
                if (!yh.s5.y(i10, false).e) {
                    yh.s5 y3 = yh.s5.y(i10, false);
                    y3.e = false;
                    y3.q(false, true, t2Var);
                    y3.e = true;
                    return;
                }
                t2Var.run();
                return;
            default:
                int i11 = this.f28438b;
                long j3 = yh.s5.y(i11, false).p().amount;
                long j10 = this.f28439c;
                Utilities.Callback callback = this.e;
                long j11 = this.f28440f;
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
                    org.telegram.ui.ActionBar.e6 e6Var = dVar;
                    if (activity != null) {
                        long j12 = this.d;
                        new yh.k7(activity, e6Var, j10, 13, DialogObject.getShortName(i11, j12), new org.telegram.ui.e6(j11, 1, callback), j12).show();
                        return;
                    }
                    return;
                }
                callback.run(Long.valueOf(j11));
                return;
        }
    }
}
