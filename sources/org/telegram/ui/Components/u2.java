package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class u2 implements Runnable {
    public final int f30808a;
    public final int f30809b;
    public final long f30810c;
    public final long d;
    public final Utilities.Callback f30811e;
    public final long f30812f;

    public u2(int i10, long j3, long j10, Utilities.Callback callback, long j11, int i11) {
        this.f30808a = i11;
        this.f30809b = i10;
        this.f30810c = j3;
        this.d = j10;
        this.f30811e = callback;
        this.f30812f = j11;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.f6 bVar;
        switch (this.f30808a) {
            case 0:
                int i10 = this.f30809b;
                u2 u2Var = new u2(i10, this.f30810c, this.d, this.f30811e, this.f30812f, 1);
                if (!zh.s5.y(i10, false).f52600e) {
                    zh.s5 y3 = zh.s5.y(i10, false);
                    y3.f52600e = false;
                    y3.q(false, true, u2Var);
                    y3.f52600e = true;
                    return;
                }
                u2Var.run();
                return;
            default:
                int i11 = this.f30809b;
                long j3 = zh.s5.y(i11, false).p().amount;
                long j10 = this.f30810c;
                Utilities.Callback callback = this.f30811e;
                long j11 = this.f30812f;
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
