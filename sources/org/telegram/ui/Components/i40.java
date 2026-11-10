package org.telegram.ui.Components;

import android.os.SystemClock;
public final class i40 implements Runnable {
    public final int f34526a;
    public final n40 f34527b;

    public i40(n40 n40Var, int i7) {
        this.f34526a = i7;
        this.f34527b = n40Var;
    }

    @Override
    public final void run() {
        wi.s0 s0Var;
        int i7 = this.f34526a;
        n40 n40Var = this.f34527b;
        switch (i7) {
            case 0:
                wi.s0 s0Var2 = n40Var.Q;
                if (s0Var2 != null && s0Var2.f58152a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j3 = n40Var.G0;
                    if (j3 == 0 || elapsedRealtimeNanos - j3 >= 70000000) {
                        n40Var.F();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i10 = n40.L0;
                n40Var.u();
                return;
            default:
                int i11 = n40.L0;
                wi.t0 t0Var = n40Var.O;
                if (t0Var != null && (s0Var = n40Var.Q) != null) {
                    if (s0Var.f58152a == 3) {
                        n40Var.y();
                        return;
                    } else if (s0Var.f58155e) {
                        t0Var.p();
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
