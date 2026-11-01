package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class e1 implements Runnable {
    public final int f25656a;
    public final int f25657b;
    public final long f25658c;
    public final long d;
    public final org.telegram.messenger.r20 e;
    public final long f25659f;

    public e1(int i10, long j10, long j11, org.telegram.messenger.r20 r20Var, long j12, int i11) {
        this.f25656a = i11;
        this.f25657b = i10;
        this.f25658c = j10;
        this.d = j11;
        this.e = r20Var;
        this.f25659f = j12;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.p6 bVar;
        switch (this.f25656a) {
            case 0:
                int i10 = this.f25657b;
                long j10 = rh.e6.y(i10, false).p().amount;
                long j11 = this.f25658c;
                int i11 = (j10 > j11 ? 1 : (j10 == j11 ? 0 : -1));
                org.telegram.messenger.r20 r20Var = this.e;
                long j12 = this.f25659f;
                if (i11 < 0) {
                    Activity u02 = org.telegram.messenger.i0.u0();
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (!PhotoViewer.v1().U1() && (T == null || !T.hasShownSheet())) {
                        if (T != null) {
                            bVar = T.getResourceProvider();
                        } else {
                            bVar = null;
                        }
                    } else {
                        bVar = new th.b();
                    }
                    org.telegram.ui.ActionBar.p6 p6Var = bVar;
                    if (u02 != null) {
                        long j13 = this.d;
                        new rh.x7(u02, p6Var, j11, 13, org.telegram.messenger.o5.s(i10, j13), new org.telegram.ui.a6(1, j12, r20Var), j13).show();
                        return;
                    }
                    return;
                }
                r20Var.a(Long.valueOf(j12));
                return;
            default:
                int i12 = this.f25657b;
                e1 e1Var = new e1(i12, this.f25658c, this.d, this.e, this.f25659f, 0);
                if (!rh.e6.y(i12, false).e) {
                    rh.e6 y3 = rh.e6.y(i12, false);
                    y3.e = false;
                    y3.q(e1Var, false, true);
                    y3.e = true;
                    return;
                }
                e1Var.run();
                return;
        }
    }
}
