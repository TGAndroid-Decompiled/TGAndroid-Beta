package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class v2 implements Runnable {
    public final int f31705a;
    public final int f31706b;
    public final long f31707c;
    public final long d;
    public final Utilities.Callback f31708e;
    public final long f31709f;

    public v2(int i10, long j3, long j10, Utilities.Callback callback, long j11, int i11) {
        this.f31705a = i11;
        this.f31706b = i10;
        this.f31707c = j3;
        this.d = j10;
        this.f31708e = callback;
        this.f31709f = j11;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.e6 dVar;
        switch (this.f31705a) {
            case 0:
                int i10 = this.f31706b;
                v2 v2Var = new v2(i10, this.f31707c, this.d, this.f31708e, this.f31709f, 1);
                if (!yh.m5.y(i10, false).f52927e) {
                    yh.m5 y3 = yh.m5.y(i10, false);
                    y3.f52927e = false;
                    y3.q(false, true, v2Var);
                    y3.f52927e = true;
                    return;
                }
                v2Var.run();
                return;
            default:
                int i11 = this.f31706b;
                long j3 = yh.m5.y(i11, false).p().amount;
                long j10 = this.f31707c;
                int i12 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
                Utilities.Callback callback = this.f31708e;
                long j11 = this.f31709f;
                if (i12 < 0) {
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
                    org.telegram.ui.ActionBar.e6 e6Var = dVar;
                    if (activity != null) {
                        long j12 = this.d;
                        new yh.e7(activity, e6Var, j10, 13, DialogObject.getShortName(i11, j12), new org.telegram.ui.f6(j11, 1, callback), j12).show();
                        return;
                    }
                    return;
                }
                callback.run(Long.valueOf(j11));
                return;
        }
    }
}
