package org.telegram.ui.Components;

import android.os.SystemClock;
public final class e40 implements Runnable {
    public final int f33278a;
    public final j40 f33279b;

    public e40(j40 j40Var, int i3) {
        this.f33278a = i3;
        this.f33279b = j40Var;
    }

    @Override
    public final void run() {
        wi.s0 s0Var;
        int i3 = this.f33278a;
        j40 j40Var = this.f33279b;
        switch (i3) {
            case 0:
                wi.s0 s0Var2 = j40Var.R;
                if (s0Var2 != null && s0Var2.f58047a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j10 = j40Var.G0;
                    if (j10 == 0 || elapsedRealtimeNanos - j10 >= 70000000) {
                        j40Var.D();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i10 = j40.L0;
                j40Var.t();
                return;
            default:
                int i11 = j40.L0;
                wi.t0 t0Var = j40Var.P;
                if (t0Var != null && (s0Var = j40Var.R) != null) {
                    if (s0Var.f58047a == 3) {
                        j40Var.w();
                        return;
                    } else if (s0Var.f58050e) {
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
