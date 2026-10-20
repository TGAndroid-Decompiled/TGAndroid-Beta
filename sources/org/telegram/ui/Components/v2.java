package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class v2 implements Runnable {
    public final int f31117a;
    public final int f31118b;
    public final long f31119c;
    public final long d;
    public final Utilities.Callback e;
    public final long f31120f;

    public v2(int i10, long j10, long j11, Utilities.Callback callback, long j12, int i11) {
        this.f31117a = i11;
        this.f31118b = i10;
        this.f31119c = j10;
        this.d = j11;
        this.e = callback;
        this.f31120f = j12;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.d6 bVar;
        switch (this.f31117a) {
            case 0:
                int i10 = this.f31118b;
                v2 v2Var = new v2(i10, this.f31119c, this.d, this.e, this.f31120f, 1);
                if (!ai.ga.y(i10, false).e) {
                    ai.ga y3 = ai.ga.y(i10, false);
                    y3.e = false;
                    y3.q(false, true, v2Var);
                    y3.e = true;
                    return;
                }
                v2Var.run();
                return;
            default:
                int i11 = this.f31118b;
                long j10 = ai.ga.y(i11, false).p().amount;
                long j11 = this.f31119c;
                int i12 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
                Utilities.Callback callback = this.e;
                long j12 = this.f31120f;
                if (i12 < 0) {
                    Activity activity = AndroidUtilities.getActivity();
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (!PhotoViewer.u1().T1() && (U == null || !U.hasShownSheet())) {
                        if (U != null) {
                            bVar = U.getResourceProvider();
                        } else {
                            bVar = null;
                        }
                    } else {
                        bVar = new ci.b();
                    }
                    org.telegram.ui.ActionBar.d6 d6Var = bVar;
                    if (activity != null) {
                        long j13 = this.d;
                        new ai.cd(activity, d6Var, j11, 13, DialogObject.getShortName(i11, j13), new org.telegram.ui.j6(j12, 1, callback), j13).show();
                        return;
                    }
                    return;
                }
                callback.run(Long.valueOf(j12));
                return;
        }
    }
}
