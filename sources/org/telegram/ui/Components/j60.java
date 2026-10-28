package org.telegram.ui.Components;

import android.os.SystemClock;
public final class j60 implements Runnable {
    public final int f29526a;
    public final o60 f29527b;

    public j60(o60 o60Var, int i10) {
        this.f29526a = i10;
        this.f29527b = o60Var;
    }

    @Override
    public final void run() {
        vi.t0 t0Var;
        int i10 = this.f29526a;
        o60 o60Var = this.f29527b;
        switch (i10) {
            case 0:
                vi.t0 t0Var2 = o60Var.Q;
                if (t0Var2 != null && t0Var2.f50625a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j10 = o60Var.F0;
                    if (j10 == 0 || elapsedRealtimeNanos - j10 >= 70000000) {
                        o60Var.D();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i11 = o60.K0;
                o60Var.t();
                return;
            default:
                int i12 = o60.K0;
                vi.u0 u0Var = o60Var.O;
                if (u0Var != null && (t0Var = o60Var.Q) != null) {
                    if (t0Var.f50625a == 3) {
                        o60Var.w();
                        return;
                    } else if (t0Var.e) {
                        u0Var.p();
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
