package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class q2 implements Runnable {
    public final int f31815a;
    public final int f31816b;
    public final long f31817c;
    public final long d;
    public final Utilities.Callback f31818e;
    public final long f31819f;

    public q2(int i9, long j10, long j11, Utilities.Callback callback, long j12, int i10) {
        this.f31815a = i10;
        this.f31816b = i9;
        this.f31817c = j10;
        this.d = j11;
        this.f31818e = callback;
        this.f31819f = j12;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.b6 bVar;
        switch (this.f31815a) {
            case 0:
                int i9 = this.f31816b;
                q2 q2Var = new q2(i9, this.f31817c, this.d, this.f31818e, this.f31819f, 1);
                if (!gh.v7.y(i9, false).f9048e) {
                    gh.v7 y10 = gh.v7.y(i9, false);
                    y10.f9048e = false;
                    y10.q(false, true, q2Var);
                    y10.f9048e = true;
                    return;
                }
                q2Var.run();
                return;
            default:
                int i10 = this.f31816b;
                long j10 = gh.v7.y(i10, false).p().amount;
                long j11 = this.f31817c;
                Utilities.Callback callback = this.f31818e;
                long j12 = this.f31819f;
                if (j10 < j11) {
                    Activity activity = AndroidUtilities.getActivity();
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (!PhotoViewer.t1().Q1() && (U == null || !U.hasShownSheet())) {
                        if (U != null) {
                            bVar = U.getResourceProvider();
                        } else {
                            bVar = null;
                        }
                    } else {
                        bVar = new ih.b();
                    }
                    org.telegram.ui.ActionBar.b6 b6Var = bVar;
                    if (activity != null) {
                        long j13 = this.d;
                        new gh.ea(activity, b6Var, j11, 13, DialogObject.getShortName(i10, j13), new org.telegram.ui.e6(j12, 1, callback), j13).show();
                        return;
                    }
                    return;
                }
                callback.run(Long.valueOf(j12));
                return;
        }
    }
}
