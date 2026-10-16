package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class w2 implements Runnable {
    public final int f30424a;
    public final int f30425b;
    public final long f30426c;
    public final long d;
    public final Utilities.Callback e;
    public final long f30427f;

    public w2(int i10, long j10, long j11, Utilities.Callback callback, long j12, int i11) {
        this.f30424a = i11;
        this.f30425b = i10;
        this.f30426c = j10;
        this.d = j11;
        this.e = callback;
        this.f30427f = j12;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.c6 bVar;
        switch (this.f30424a) {
            case 0:
                int i10 = this.f30425b;
                w2 w2Var = new w2(i10, this.f30426c, this.d, this.e, this.f30427f, 1);
                if (!zh.n5.y(i10, false).e) {
                    zh.n5 y3 = zh.n5.y(i10, false);
                    y3.e = false;
                    y3.q(false, true, w2Var);
                    y3.e = true;
                    return;
                }
                w2Var.run();
                return;
            default:
                int i11 = this.f30425b;
                long j10 = zh.n5.y(i11, false).p().amount;
                long j11 = this.f30426c;
                int i12 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
                Utilities.Callback callback = this.e;
                long j12 = this.f30427f;
                if (i12 < 0) {
                    Activity activity = AndroidUtilities.getActivity();
                    org.telegram.ui.ActionBar.m2 U = LaunchActivity.U();
                    if (!PhotoViewer.t1().R1() && (U == null || !U.hasShownSheet())) {
                        if (U != null) {
                            bVar = U.getResourceProvider();
                        } else {
                            bVar = null;
                        }
                    } else {
                        bVar = new bi.b();
                    }
                    org.telegram.ui.ActionBar.c6 c6Var = bVar;
                    if (activity != null) {
                        long j13 = this.d;
                        new zh.e7(activity, c6Var, j11, 13, DialogObject.getShortName(i11, j13), new org.telegram.ui.j6(j12, 1, callback), j13).show();
                        return;
                    }
                    return;
                }
                callback.run(Long.valueOf(j12));
                return;
        }
    }
}
