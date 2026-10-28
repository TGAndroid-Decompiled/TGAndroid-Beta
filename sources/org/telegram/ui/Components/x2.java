package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class x2 implements Runnable {
    public final int f34639a;
    public final int f34640b;
    public final long f34641c;
    public final long d;
    public final Utilities.Callback e;
    public final long f34642f;

    public x2(int i10, long j10, long j11, Utilities.Callback callback, long j12, int i11) {
        this.f34639a = i11;
        this.f34640b = i10;
        this.f34641c = j10;
        this.d = j11;
        this.e = callback;
        this.f34642f = j12;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.u6 bVar;
        switch (this.f34639a) {
            case 0:
                int i10 = this.f34640b;
                x2 x2Var = new x2(i10, this.f34641c, this.d, this.e, this.f34642f, 1);
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
                int i11 = this.f34640b;
                long j10 = bi.ca.y(i11, false).p().amount;
                long j11 = this.f34641c;
                int i12 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
                Utilities.Callback callback = this.e;
                long j12 = this.f34642f;
                if (i12 < 0) {
                    Activity activity = AndroidUtilities.getActivity();
                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                    if (!PhotoViewer.v1().U1() && (U == null || !U.hasShownSheet())) {
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
