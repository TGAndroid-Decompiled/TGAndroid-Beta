package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class b1 implements Runnable {
    public final int f33138a;
    public final int f33139b;
    public final long f33140c;
    public final long d;
    public final org.telegram.messenger.z10 f33141e;
    public final long f33142f;

    public b1(int i7, long j3, long j10, org.telegram.messenger.z10 z10Var, long j11, int i10) {
        this.f33138a = i10;
        this.f33139b = i7;
        this.f33140c = j3;
        this.d = j10;
        this.f33141e = z10Var;
        this.f33142f = j11;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.e6 bVar;
        switch (this.f33138a) {
            case 0:
                int i7 = this.f33139b;
                long j3 = di.u8.y(i7, false).p().amount;
                long j10 = this.f33140c;
                int i10 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
                org.telegram.messenger.z10 z10Var = this.f33141e;
                long j11 = this.f33142f;
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
                        new di.bb(u02, e6Var, j10, 13, org.telegram.messenger.m5.s(i7, j12), new org.telegram.ui.b6(1, j11, z10Var), j12).show();
                        return;
                    }
                    return;
                }
                z10Var.a(Long.valueOf(j11));
                return;
            default:
                int i11 = this.f33139b;
                b1 b1Var = new b1(i11, this.f33140c, this.d, this.f33141e, this.f33142f, 0);
                if (!di.u8.y(i11, false).f9532e) {
                    di.u8 y10 = di.u8.y(i11, false);
                    y10.f9532e = false;
                    y10.q(b1Var, false, true);
                    y10.f9532e = true;
                    return;
                }
                b1Var.run();
                return;
        }
    }
}
