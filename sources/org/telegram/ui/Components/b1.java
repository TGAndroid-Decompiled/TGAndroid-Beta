package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class b1 implements Runnable {
    public final int f33135a;
    public final int f33136b;
    public final long f33137c;
    public final long d;
    public final org.telegram.messenger.z10 f33138e;
    public final long f33139f;

    public b1(int i7, long j3, long j10, org.telegram.messenger.z10 z10Var, long j11, int i10) {
        this.f33135a = i10;
        this.f33136b = i7;
        this.f33137c = j3;
        this.d = j10;
        this.f33138e = z10Var;
        this.f33139f = j11;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.e6 bVar;
        switch (this.f33135a) {
            case 0:
                int i7 = this.f33136b;
                long j3 = di.v8.y(i7, false).p().amount;
                long j10 = this.f33137c;
                int i10 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
                org.telegram.messenger.z10 z10Var = this.f33138e;
                long j11 = this.f33139f;
                if (i10 < 0) {
                    Activity u02 = org.telegram.messenger.g0.u0();
                    org.telegram.ui.ActionBar.e2 T = LaunchActivity.T();
                    if (!PhotoViewer.p1().P1() && (T == null || !T.hasShownSheet())) {
                        if (T != null) {
                            bVar = T.getResourceProvider();
                        } else {
                            bVar = null;
                        }
                    } else {
                        bVar = new fi.b();
                    }
                    org.telegram.ui.ActionBar.e6 e6Var = bVar;
                    if (u02 != null) {
                        long j12 = this.d;
                        new di.cb(u02, e6Var, j10, 13, org.telegram.messenger.m5.s(i7, j12), new org.telegram.ui.b6(1, j11, z10Var), j12).show();
                        return;
                    }
                    return;
                }
                z10Var.a(Long.valueOf(j11));
                return;
            default:
                int i11 = this.f33136b;
                b1 b1Var = new b1(i11, this.f33137c, this.d, this.f33138e, this.f33139f, 0);
                if (!di.v8.y(i11, false).f9601e) {
                    di.v8 y10 = di.v8.y(i11, false);
                    y10.f9601e = false;
                    y10.q(b1Var, false, true);
                    y10.f9601e = true;
                    return;
                }
                b1Var.run();
                return;
        }
    }
}
