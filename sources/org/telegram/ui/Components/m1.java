package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class m1 implements Runnable {
    public final int f37314a;
    public final int f37315b;
    public final long f37316c;
    public final long d;
    public final org.telegram.messenger.x10 f37317e;
    public final long f37318f;

    public m1(int i7, long j3, long j10, org.telegram.messenger.x10 x10Var, long j11, int i10) {
        this.f37314a = i10;
        this.f37315b = i7;
        this.f37316c = j3;
        this.d = j10;
        this.f37317e = x10Var;
        this.f37318f = j11;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.i6 bVar;
        switch (this.f37314a) {
            case 0:
                int i7 = this.f37315b;
                long j3 = di.x8.y(i7, false).p().amount;
                long j10 = this.f37316c;
                int i10 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
                org.telegram.messenger.x10 x10Var = this.f37317e;
                long j11 = this.f37318f;
                if (i10 < 0) {
                    Activity u02 = org.telegram.messenger.g0.u0();
                    org.telegram.ui.ActionBar.h2 T = LaunchActivity.T();
                    if (!PhotoViewer.p1().P1() && (T == null || !T.hasShownSheet())) {
                        if (T != null) {
                            bVar = T.getResourceProvider();
                        } else {
                            bVar = null;
                        }
                    } else {
                        bVar = new fi.b();
                    }
                    org.telegram.ui.ActionBar.i6 i6Var = bVar;
                    if (u02 != null) {
                        long j12 = this.d;
                        new di.fb(u02, i6Var, j10, 13, org.telegram.messenger.n5.s(i7, j12), new org.telegram.ui.a6(1, j11, x10Var), j12).show();
                        return;
                    }
                    return;
                }
                x10Var.a(Long.valueOf(j11));
                return;
            default:
                int i11 = this.f37315b;
                m1 m1Var = new m1(i11, this.f37316c, this.d, this.f37317e, this.f37318f, 0);
                if (!di.x8.y(i11, false).f10021e) {
                    di.x8 y10 = di.x8.y(i11, false);
                    y10.f10021e = false;
                    y10.q(m1Var, false, true);
                    y10.f10021e = true;
                    return;
                }
                m1Var.run();
                return;
        }
    }
}
