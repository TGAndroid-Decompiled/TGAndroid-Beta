package org.telegram.ui.Components;

import android.os.SystemClock;
public final class j40 implements Runnable {
    public final int f34925a;
    public final o40 f34926b;

    public j40(o40 o40Var, int i7) {
        this.f34925a = i7;
        this.f34926b = o40Var;
    }

    @Override
    public final void run() {
        wi.s0 s0Var;
        int i7 = this.f34925a;
        o40 o40Var = this.f34926b;
        switch (i7) {
            case 0:
                wi.s0 s0Var2 = o40Var.Q;
                if (s0Var2 != null && s0Var2.f58148a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j3 = o40Var.G0;
                    if (j3 == 0 || elapsedRealtimeNanos - j3 >= 70000000) {
                        o40Var.F();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i10 = o40.L0;
                o40Var.u();
                return;
            default:
                int i11 = o40.L0;
                wi.t0 t0Var = o40Var.O;
                if (t0Var != null && (s0Var = o40Var.Q) != null) {
                    if (s0Var.f58148a == 3) {
                        o40Var.y();
                        return;
                    } else if (s0Var.f58151e) {
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
