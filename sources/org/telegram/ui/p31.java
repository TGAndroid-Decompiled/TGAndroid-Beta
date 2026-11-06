package org.telegram.ui;

import android.os.SystemClock;
import java.util.HashSet;
public final class p31 implements Runnable {
    public final int f48609a;
    public final long f48610b;
    public final Object f48611c;

    public p31(Object obj, long j3, int i7) {
        this.f48609a = i7;
        this.f48611c = obj;
        this.f48610b = j3;
    }

    @Override
    public final void run() {
        int i7;
        switch (this.f48609a) {
            case 0:
                ((org.telegram.messenger.voip.k) this.f48611c).a(Long.valueOf(this.f48610b));
                return;
            case 1:
                org.telegram.ui.web.b0 b0Var = (org.telegram.ui.web.b0) this.f48611c;
                b0Var.getClass();
                b0Var.presentFragment(an.ra(this.f48610b));
                return;
            case 2:
                vi.h hVar = (vi.h) ((ac.e) this.f48611c).f1025c;
                if (this.f48610b == hVar.f57460o && (i7 = hVar.G) != 9 && i7 != 10 && i7 != 8) {
                    SystemClock.elapsedRealtime();
                    hVar.f57467w = false;
                    hVar.s(3);
                    hVar.f57454i.removeCallbacks(hVar.D);
                    vi.b bVar = hVar.h;
                    bVar.b("recording started: retainedDurationMs=" + vi.h.r(hVar.f57461p));
                    return;
                }
                return;
            default:
                wg.w0 w0Var = (wg.w0) this.f48611c;
                HashSet hashSet = w0Var.W1;
                hashSet.remove(Long.valueOf(this.f48610b));
                w0Var.Q1.b(true, hashSet, new wg.r0(w0Var, 5), null);
                w0Var.n1(true, false);
                return;
        }
    }
}
