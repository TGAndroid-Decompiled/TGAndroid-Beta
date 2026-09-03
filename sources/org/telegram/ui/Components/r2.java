package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class r2 implements Runnable {
    public final int f30618a;
    public final int f30619b;
    public final long f30620c;
    public final long d;
    public final Utilities.Callback f30621e;
    public final long f30622f;

    public r2(int i10, long j10, long j11, Utilities.Callback callback, long j12, int i11) {
        this.f30618a = i11;
        this.f30619b = i10;
        this.f30620c = j10;
        this.d = j11;
        this.f30621e = callback;
        this.f30622f = j12;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.g6 bVar;
        switch (this.f30618a) {
            case 0:
                int i10 = this.f30619b;
                r2 r2Var = new r2(i10, this.f30620c, this.d, this.f30621e, this.f30622f, 1);
                if (!mh.t7.y(i10, false).f14833e) {
                    mh.t7 y10 = mh.t7.y(i10, false);
                    y10.f14833e = false;
                    y10.q(false, true, r2Var);
                    y10.f14833e = true;
                    return;
                }
                r2Var.run();
                return;
            default:
                int i11 = this.f30619b;
                long j10 = mh.t7.y(i11, false).p().amount;
                long j11 = this.f30620c;
                Utilities.Callback callback = this.f30621e;
                long j12 = this.f30622f;
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
                        bVar = new oh.b();
                    }
                    org.telegram.ui.ActionBar.g6 g6Var = bVar;
                    if (activity != null) {
                        long j13 = this.d;
                        new mh.z9(activity, g6Var, j11, 13, DialogObject.getShortName(i11, j13), new org.telegram.ui.i6(j12, 1, callback), j13).show();
                        return;
                    }
                    return;
                }
                callback.run(Long.valueOf(j12));
                return;
        }
    }
}
