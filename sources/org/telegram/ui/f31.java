package org.telegram.ui;

import android.os.SystemClock;
import java.util.HashSet;
public final class f31 implements Runnable {
    public final int f45134a;
    public final long f45135b;
    public final Object f45136c;

    public f31(Object obj, long j10, int i3) {
        this.f45134a = i3;
        this.f45136c = obj;
        this.f45135b = j10;
    }

    @Override
    public final void run() {
        int i3;
        switch (this.f45134a) {
            case 0:
                ((mi.f) this.f45136c).a(Long.valueOf(this.f45135b));
                return;
            case 1:
                org.telegram.ui.web.b0 b0Var = (org.telegram.ui.web.b0) this.f45136c;
                b0Var.getClass();
                b0Var.presentFragment(wm.ra(this.f45135b));
                return;
            case 2:
                vi.j jVar = (vi.j) ((vi.f) this.f45136c).f56973c;
                if (this.f45135b == jVar.f56993o && (i3 = jVar.G) != 9 && i3 != 10 && i3 != 8) {
                    SystemClock.elapsedRealtime();
                    jVar.f57000w = false;
                    jVar.s(3);
                    jVar.f56987i.removeCallbacks(jVar.D);
                    vi.b bVar = jVar.h;
                    bVar.b("recording started: retainedDurationMs=" + vi.j.r(jVar.f56994p));
                    return;
                }
                return;
            default:
                xg.w0 w0Var = (xg.w0) this.f45136c;
                HashSet hashSet = w0Var.X1;
                hashSet.remove(Long.valueOf(this.f45135b));
                w0Var.R1.b(true, hashSet, new xg.r0(w0Var, 5), null);
                w0Var.n1(true, false);
                return;
        }
    }
}
