package org.telegram.ui;

import android.os.SystemClock;
import java.util.HashSet;
public final class p31 implements Runnable {
    public final int f48615a;
    public final long f48616b;
    public final Object f48617c;

    public p31(Object obj, long j3, int i7) {
        this.f48615a = i7;
        this.f48617c = obj;
        this.f48616b = j3;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f48615a) {
            case 0:
                ((org.telegram.messenger.voip.k) this.f48617c).a(Long.valueOf(this.f48616b));
                return;
            case 1:
                org.telegram.ui.web.b0 b0Var = (org.telegram.ui.web.b0) this.f48617c;
                b0Var.getClass();
                b0Var.presentFragment(an.ra(this.f48616b));
                return;
            case 2:
                vi.h hVar = (vi.h) ((ac.e) this.f48617c).f1025c;
                if (this.f48616b == hVar.f57436o && (i7 = hVar.G) != 9 && i7 != 10 && i7 != 8) {
                    SystemClock.elapsedRealtime();
                    hVar.f57443w = false;
                    hVar.s(3);
                    hVar.f57430i.removeCallbacks(hVar.D);
                    vi.b bVar = hVar.h;
                    bVar.b("recording started: retainedDurationMs=" + vi.h.r(hVar.f57437p));
                    return;
                }
                return;
            default:
                wg.w0 w0Var = (wg.w0) this.f48617c;
                HashSet hashSet = w0Var.W1;
                hashSet.remove(Long.valueOf(this.f48616b));
                w0Var.Q1.b(true, hashSet, new wg.r0(w0Var, 5), null);
                w0Var.n1(true, false);
                return;
        }
    }
}
