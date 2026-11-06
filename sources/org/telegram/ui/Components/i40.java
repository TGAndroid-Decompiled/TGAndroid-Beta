package org.telegram.ui.Components;

import android.os.SystemClock;
public final class i40 implements Runnable {
    public final int f34489a;
    public final n40 f34490b;

    public i40(n40 n40Var, int i7) {
        this.f34489a = i7;
        this.f34490b = n40Var;
    }

    @Override
    public final void run() {
        wi.s0 s0Var;
        int i7 = this.f34489a;
        n40 n40Var = this.f34490b;
        switch (i7) {
            case 0:
                wi.s0 s0Var2 = n40Var.Q;
                if (s0Var2 != null && s0Var2.f58021a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j3 = n40Var.F0;
                    if (j3 == 0 || elapsedRealtimeNanos - j3 >= 70000000) {
                        n40Var.D();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i10 = n40.K0;
                n40Var.t();
                return;
            default:
                int i11 = n40.K0;
                wi.t0 t0Var = n40Var.O;
                if (t0Var != null && (s0Var = n40Var.Q) != null) {
                    if (s0Var.f58021a == 3) {
                        n40Var.w();
                        return;
                    } else if (s0Var.f58024e) {
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
