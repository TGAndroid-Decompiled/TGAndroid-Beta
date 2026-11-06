package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class e1 implements Runnable {
    public final int f33092a;
    public final int f33093b;
    public final long f33094c;
    public final long d;
    public final org.telegram.messenger.c20 f33095e;
    public final long f33096f;

    public e1(int i7, long j3, long j10, org.telegram.messenger.c20 c20Var, long j11, int i10) {
        this.f33092a = i10;
        this.f33093b = i7;
        this.f33094c = j3;
        this.d = j10;
        this.f33095e = c20Var;
        this.f33096f = j11;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.f6 bVar;
        switch (this.f33092a) {
            case 0:
                int i7 = this.f33093b;
                long j3 = bi.ea.y(i7, false).p().amount;
                long j10 = this.f33094c;
                int i10 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
                org.telegram.messenger.c20 c20Var = this.f33095e;
                long j11 = this.f33096f;
                if (i10 < 0) {
                    Activity u02 = org.telegram.messenger.g0.u0();
                    org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                    if (!PhotoViewer.p1().P1() && (T == null || !T.hasShownSheet())) {
                        if (T != null) {
                            bVar = T.getResourceProvider();
                        } else {
                            bVar = null;
                        }
                    } else {
                        bVar = new di.b();
                    }
                    org.telegram.ui.ActionBar.f6 f6Var = bVar;
                    if (u02 != null) {
                        long j12 = this.d;
                        new bi.tc(u02, f6Var, j10, 13, org.telegram.messenger.m5.s(i7, j12), new org.telegram.ui.a6(1, j11, c20Var), j12).show();
                        return;
                    }
                    return;
                }
                c20Var.a(Long.valueOf(j11));
                return;
            default:
                int i11 = this.f33093b;
                e1 e1Var = new e1(i11, this.f33094c, this.d, this.f33095e, this.f33096f, 0);
                if (!bi.ea.y(i11, false).f3810e) {
                    bi.ea y10 = bi.ea.y(i11, false);
                    y10.f3810e = false;
                    y10.q(e1Var, false, true);
                    y10.f3810e = true;
                    return;
                }
                e1Var.run();
                return;
        }
    }
}
