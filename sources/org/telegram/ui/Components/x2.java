package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class x2 implements Runnable {
    public final int f34593a;
    public final int f34594b;
    public final long f34595c;
    public final long d;
    public final Utilities.Callback e;
    public final long f34596f;

    public x2(int i10, long j10, long j11, Utilities.Callback callback, long j12, int i11) {
        this.f34593a = i11;
        this.f34594b = i10;
        this.f34595c = j10;
        this.d = j11;
        this.e = callback;
        this.f34596f = j12;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.u6 bVar;
        switch (this.f34593a) {
            case 0:
                int i10 = this.f34594b;
                x2 x2Var = new x2(i10, this.f34595c, this.d, this.e, this.f34596f, 1);
                if (!bi.ca.y(i10, false).e) {
                    bi.ca y3 = bi.ca.y(i10, false);
                    y3.e = false;
                    y3.q(false, true, x2Var);
                    y3.e = true;
                    return;
                }
                x2Var.run();
                return;
            default:
                int i11 = this.f34594b;
                long j10 = bi.ca.y(i11, false).p().amount;
                long j11 = this.f34595c;
                int i12 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
                Utilities.Callback callback = this.e;
                long j12 = this.f34596f;
                if (i12 < 0) {
                    Activity activity = AndroidUtilities.getActivity();
                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                    if (!PhotoViewer.u1().T1() && (U == null || !U.hasShownSheet())) {
                        if (U != null) {
                            bVar = U.getResourceProvider();
                        } else {
                            bVar = null;
                        }
                    } else {
                        bVar = new di.b();
                    }
                    org.telegram.ui.ActionBar.u6 u6Var = bVar;
                    if (activity != null) {
                        long j13 = this.d;
                        new bi.tc(activity, u6Var, j11, 13, DialogObject.getShortName(i11, j13), new org.telegram.ui.f6(j12, 1, callback), j13).show();
                        return;
                    }
                    return;
                }
                callback.run(Long.valueOf(j12));
                return;
        }
    }
}
