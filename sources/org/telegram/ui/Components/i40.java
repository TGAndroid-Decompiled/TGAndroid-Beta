package org.telegram.ui.Components;

import android.os.SystemClock;
public final class i40 implements Runnable {
    public final int f34479a;
    public final n40 f34480b;

    public i40(n40 n40Var, int i7) {
        this.f34479a = i7;
        this.f34480b = n40Var;
    }

    @Override
    public final void run() {
        wi.t0 t0Var;
        int i7 = this.f34479a;
        n40 n40Var = this.f34480b;
        switch (i7) {
            case 0:
                wi.t0 t0Var2 = n40Var.Q;
                if (t0Var2 != null && t0Var2.f58049a == 3) {
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
                wi.u0 u0Var = n40Var.O;
                if (u0Var != null && (t0Var = n40Var.Q) != null) {
                    if (t0Var.f58049a == 3) {
                        n40Var.y();
                        return;
                    } else if (t0Var.f58052e) {
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
