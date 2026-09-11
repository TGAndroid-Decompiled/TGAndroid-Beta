package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class u2 implements Runnable {
    public final int f30781a;
    public final int f30782b;
    public final long f30783c;
    public final long d;
    public final Utilities.Callback f30784e;
    public final long f30785f;

    public u2(int i10, long j3, long j10, Utilities.Callback callback, long j11, int i11) {
        this.f30781a = i11;
        this.f30782b = i10;
        this.f30783c = j3;
        this.d = j10;
        this.f30784e = callback;
        this.f30785f = j11;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.f6 bVar;
        switch (this.f30781a) {
            case 0:
                int i10 = this.f30782b;
                u2 u2Var = new u2(i10, this.f30783c, this.d, this.f30784e, this.f30785f, 1);
                if (!zh.s5.y(i10, false).f52569e) {
                    zh.s5 y3 = zh.s5.y(i10, false);
                    y3.f52569e = false;
                    y3.q(false, true, u2Var);
                    y3.f52569e = true;
                    return;
                }
                u2Var.run();
                return;
            default:
                int i11 = this.f30782b;
                long j3 = zh.s5.y(i11, false).p().amount;
                long j10 = this.f30783c;
                Utilities.Callback callback = this.f30784e;
                long j11 = this.f30785f;
                if (j3 < j10) {
                    Activity activity = AndroidUtilities.getActivity();
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (!PhotoViewer.t1().Q1() && (U == null || !U.hasShownSheet())) {
                        if (U != null) {
                            bVar = U.getResourceProvider();
                        } else {
                            bVar = null;
                        }
                    } else {
                        bVar = new bi.b();
                    }
                    org.telegram.ui.ActionBar.f6 f6Var = bVar;
                    if (activity != null) {
                        long j12 = this.d;
                        new zh.k7(activity, f6Var, j10, 13, DialogObject.getShortName(i11, j12), new org.telegram.ui.g6(j11, 1, callback), j12).show();
                        return;
                    }
                    return;
                }
                callback.run(Long.valueOf(j11));
                return;
        }
    }
}
