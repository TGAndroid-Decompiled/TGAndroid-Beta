package org.telegram.ui.Components;

import android.os.SystemClock;
public final class l40 implements Runnable {
    public final int f36722a;
    public final q40 f36723b;

    public l40(q40 q40Var, int i7) {
        this.f36722a = i7;
        this.f36723b = q40Var;
    }

    @Override
    public final void run() {
        zi.u0 u0Var;
        int i7 = this.f36722a;
        q40 q40Var = this.f36723b;
        switch (i7) {
            case 0:
                zi.u0 u0Var2 = q40Var.R;
                if (u0Var2 != null && u0Var2.f61738a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j3 = q40Var.H0;
                    if (j3 == 0 || elapsedRealtimeNanos - j3 >= 70000000) {
                        q40Var.F();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i10 = q40.M0;
                q40Var.u();
                return;
            default:
                int i11 = q40.M0;
                zi.v0 v0Var = q40Var.P;
                if (v0Var != null && (u0Var = q40Var.R) != null) {
                    if (u0Var.f61738a == 3) {
                        q40Var.y();
                        return;
                    } else if (u0Var.f61741e) {
                        v0Var.p();
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
