package org.telegram.ui.Components;

import android.os.SystemClock;
public final class t40 implements Runnable {
    public final int f39793a;
    public final y40 f39794b;

    public t40(y40 y40Var, int i7) {
        this.f39793a = i7;
        this.f39794b = y40Var;
    }

    @Override
    public final void run() {
        zi.t0 t0Var;
        int i7 = this.f39793a;
        y40 y40Var = this.f39794b;
        switch (i7) {
            case 0:
                zi.t0 t0Var2 = y40Var.R;
                if (t0Var2 != null && t0Var2.f62433a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j3 = y40Var.H0;
                    if (j3 == 0 || elapsedRealtimeNanos - j3 >= 70000000) {
                        y40Var.F();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i10 = y40.M0;
                y40Var.u();
                return;
            default:
                int i11 = y40.M0;
                zi.u0 u0Var = y40Var.P;
                if (u0Var != null && (t0Var = y40Var.R) != null) {
                    if (t0Var.f62433a == 3) {
                        y40Var.y();
                        return;
                    } else if (t0Var.f62436e) {
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
