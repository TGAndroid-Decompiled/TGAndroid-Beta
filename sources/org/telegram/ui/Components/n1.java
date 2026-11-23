package org.telegram.ui.Components;

import android.app.Activity;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
public final class n1 implements Runnable {
    public final int f37669a;
    public final int f37670b;
    public final long f37671c;
    public final long d;
    public final org.telegram.messenger.y10 f37672e;
    public final long f37673f;

    public n1(int i7, long j3, long j10, org.telegram.messenger.y10 y10Var, long j11, int i10) {
        this.f37669a = i10;
        this.f37670b = i7;
        this.f37671c = j3;
        this.d = j10;
        this.f37672e = y10Var;
        this.f37673f = j11;
    }

    @Override
    public final void run() {
        org.telegram.ui.ActionBar.h6 bVar;
        switch (this.f37669a) {
            case 0:
                int i7 = this.f37670b;
                long j3 = di.y8.y(i7, false).p().amount;
                long j10 = this.f37671c;
                int i10 = (j3 > j10 ? 1 : (j3 == j10 ? 0 : -1));
                org.telegram.messenger.y10 y10Var = this.f37672e;
                long j11 = this.f37673f;
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
                        new di.fb(u02, h6Var, j10, 13, org.telegram.messenger.n5.s(i7, j12), new org.telegram.ui.a6(1, j11, y10Var), j12).show();
                        return;
                    }
                    return;
                }
                y10Var.a(Long.valueOf(j11));
                return;
            default:
                int i11 = this.f37670b;
                n1 n1Var = new n1(i11, this.f37671c, this.d, this.f37672e, this.f37673f, 0);
                if (!di.y8.y(i11, false).f10051e) {
                    di.y8 y10 = di.y8.y(i11, false);
                    y10.f10051e = false;
                    y10.q(n1Var, false, true);
                    y10.f10051e = true;
                    return;
                }
                n1Var.run();
                return;
        }
    }
}
