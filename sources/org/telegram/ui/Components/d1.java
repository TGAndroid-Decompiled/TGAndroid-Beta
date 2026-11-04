package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class d1 implements Runnable {
    public final int f32887a;
    public final int f32888b;
    public final long f32889c;
    public final long d;
    public final org.telegram.messenger.u10 f32890e;
    public final long f32891f;

    public d1(int i3, long j10, long j11, org.telegram.messenger.u10 u10Var, long j12, int i10) {
        this.f32887a = i10;
        this.f32888b = i3;
        this.f32889c = j10;
        this.d = j11;
        this.f32890e = u10Var;
        this.f32891f = j12;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.e6 bVar;
        switch (this.f32887a) {
            case 0:
                int i3 = this.f32888b;
                long j10 = ci.e9.y(i3, false).p().amount;
                long j11 = this.f32889c;
                int i10 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
                org.telegram.messenger.u10 u10Var = this.f32890e;
                long j12 = this.f32891f;
                if (i10 < 0) {
                    Activity u02 = org.telegram.messenger.g0.u0();
                    org.telegram.ui.ActionBar.d2 T = LaunchActivity.T();
                    if (!PhotoViewer.v1().U1() && (T == null || !T.hasShownSheet())) {
                        if (T != null) {
                            bVar = T.getResourceProvider();
                        } else {
                            bVar = null;
                        }
                    } else {
                        bVar = new ei.b();
                    }
                    org.telegram.ui.ActionBar.e6 e6Var = bVar;
                    if (u02 != null) {
                        long j13 = this.d;
                        new ci.mb(u02, e6Var, j11, 13, org.telegram.messenger.m5.s(i3, j13), new org.telegram.ui.c6(1, j12, u10Var), j13).show();
                        return;
                    }
                    return;
                }
                u10Var.a(Long.valueOf(j12));
                return;
            default:
                int i11 = this.f32888b;
                d1 d1Var = new d1(i11, this.f32889c, this.d, this.f32890e, this.f32891f, 0);
                if (!ci.e9.y(i11, false).f5032e) {
                    ci.e9 y9 = ci.e9.y(i11, false);
                    y9.f5032e = false;
                    y9.q(d1Var, false, true);
                    y9.f5032e = true;
                    return;
                }
                d1Var.run();
                return;
        }
    }
}
