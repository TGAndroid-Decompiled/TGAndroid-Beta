package org.telegram.ui.Components;

import android.os.SystemClock;
public final class w40 implements Runnable {
    public final int f41617a;
    public final b50 f41618b;

    public w40(b50 b50Var, int i7) {
        this.f41617a = i7;
        this.f41618b = b50Var;
    }

    @Override
    public final void run() {
        zi.t0 t0Var;
        int i7 = this.f41617a;
        b50 b50Var = this.f41618b;
        switch (i7) {
            case 0:
                zi.t0 t0Var2 = b50Var.R;
                if (t0Var2 != null && t0Var2.f62313a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j3 = b50Var.H0;
                    if (j3 == 0 || elapsedRealtimeNanos - j3 >= 70000000) {
                        b50Var.F();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i10 = b50.M0;
                b50Var.u();
                return;
            default:
                int i11 = b50.M0;
                zi.u0 u0Var = b50Var.P;
                if (u0Var != null && (t0Var = b50Var.R) != null) {
                    if (t0Var.f62313a == 3) {
                        b50Var.y();
                        return;
                    } else if (t0Var.f62316e) {
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
