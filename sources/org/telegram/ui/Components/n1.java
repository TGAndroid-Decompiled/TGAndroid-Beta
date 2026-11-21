package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class n1 implements Runnable {
    public final int f37716a;
    public final int f37717b;
    public final long f37718c;
    public final long d;
    public final org.telegram.messenger.x10 f37719e;
    public final long f37720f;

    public n1(int i7, long j3, long j10, org.telegram.messenger.x10 x10Var, long j11, int i10) {
        this.f37716a = i10;
        this.f37717b = i7;
        this.f37718c = j3;
        this.d = j10;
        this.f37719e = x10Var;
        this.f37720f = j11;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.h6 bVar;
        switch (this.f37716a) {
            case 0:
                int i7 = this.f37717b;
                long j3 = di.y8.y(i7, false).p().amount;
                long j10 = this.f37718c;
                int i10 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
                org.telegram.messenger.x10 x10Var = this.f37719e;
                long j11 = this.f37720f;
                if (i10 < 0) {
                    Activity u02 = org.telegram.messenger.g0.u0();
                    org.telegram.ui.ActionBar.g2 T = LaunchActivity.T();
                    if (!PhotoViewer.p1().P1() && (T == null || !T.hasShownSheet())) {
                        if (T != null) {
                            bVar = T.getResourceProvider();
                        } else {
                            bVar = null;
                        }
                    } else {
                        bVar = new fi.b();
                    }
                    org.telegram.ui.ActionBar.h6 h6Var = bVar;
                    if (u02 != null) {
                        long j12 = this.d;
                        new di.fb(u02, h6Var, j10, 13, org.telegram.messenger.n5.s(i7, j12), new org.telegram.ui.a6(1, j11, x10Var), j12).show();
                        return;
                    }
                    return;
                }
                x10Var.a(Long.valueOf(j11));
                return;
            default:
                int i11 = this.f37717b;
                n1 n1Var = new n1(i11, this.f37718c, this.d, this.f37719e, this.f37720f, 0);
                if (!di.y8.y(i11, false).f10085e) {
                    di.y8 y10 = di.y8.y(i11, false);
                    y10.f10085e = false;
                    y10.q(n1Var, false, true);
                    y10.f10085e = true;
                    return;
                }
                n1Var.run();
                return;
        }
    }
}
