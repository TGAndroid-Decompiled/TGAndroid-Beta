package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class u2 implements Runnable {
    public final int f33099a;
    public final int f33100b;
    public final long f33101c;
    public final long d;
    public final Utilities.Callback f33102e;
    public final long f33103f;

    public u2(int i10, long j10, long j11, Utilities.Callback callback, long j12, int i11) {
        this.f33099a = i11;
        this.f33100b = i10;
        this.f33101c = j10;
        this.d = j11;
        this.f33102e = callback;
        this.f33103f = j12;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.c6 bVar;
        switch (this.f33099a) {
            case 0:
                int i10 = this.f33100b;
                u2 u2Var = new u2(i10, this.f33101c, this.d, this.f33102e, this.f33103f, 1);
                if (!jh.s7.y(i10, false).f12790e) {
                    jh.s7 y8 = jh.s7.y(i10, false);
                    y8.f12790e = false;
                    y8.q(false, true, u2Var);
                    y8.f12790e = true;
                    return;
                }
                u2Var.run();
                return;
            default:
                int i11 = this.f33100b;
                long j10 = jh.s7.y(i11, false).p().amount;
                long j11 = this.f33101c;
                Utilities.Callback callback = this.f33102e;
                long j12 = this.f33103f;
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
                        bVar = new lh.b();
                    }
                    org.telegram.ui.ActionBar.c6 c6Var = bVar;
                    if (activity != null) {
                        long j13 = this.d;
                        new jh.y9(activity, c6Var, j11, 13, DialogObject.getShortName(i11, j13), new org.telegram.ui.f6(j12, 1, callback), j13).show();
                        return;
                    }
                    return;
                }
                callback.run(Long.valueOf(j12));
                return;
        }
    }
}
