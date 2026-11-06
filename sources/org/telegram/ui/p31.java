package org.telegram.ui;

import android.os.SystemClock;
import java.util.HashSet;
public final class p31 implements Runnable {
    public final int f48610a;
    public final long f48611b;
    public final Object f48612c;

    public p31(Object obj, long j3, int i7) {
        this.f48610a = i7;
        this.f48612c = obj;
        this.f48611b = j3;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f48610a) {
            case 0:
                ((org.telegram.messenger.voip.k) this.f48612c).a(Long.valueOf(this.f48611b));
                return;
            case 1:
                org.telegram.ui.web.b0 b0Var = (org.telegram.ui.web.b0) this.f48612c;
                b0Var.getClass();
                b0Var.presentFragment(an.ra(this.f48611b));
                return;
            case 2:
                vi.h hVar = (vi.h) ((ac.e) this.f48612c).f1025c;
                if (this.f48611b == hVar.f57461o && (i7 = hVar.G) != 9 && i7 != 10 && i7 != 8) {
                    SystemClock.elapsedRealtime();
                    hVar.f57468w = false;
                    hVar.s(3);
                    hVar.f57455i.removeCallbacks(hVar.D);
                    vi.b bVar = hVar.h;
                    bVar.b("recording started: retainedDurationMs=" + vi.h.r(hVar.f57462p));
                    return;
                }
                return;
            default:
                wg.w0 w0Var = (wg.w0) this.f48612c;
                HashSet hashSet = w0Var.W1;
                hashSet.remove(Long.valueOf(this.f48611b));
                w0Var.Q1.b(true, hashSet, new wg.r0(w0Var, 5), null);
                w0Var.n1(true, false);
                return;
        }
    }
}
