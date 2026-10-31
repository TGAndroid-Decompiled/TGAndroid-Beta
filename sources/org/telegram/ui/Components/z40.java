package org.telegram.ui.Components;

import android.os.SystemClock;
public final class z40 implements Runnable {
    public final int f32896a;
    public final d50 f32897b;

    public z40(d50 d50Var, int i10) {
        this.f32896a = i10;
        this.f32897b = d50Var;
    }

    @Override
    public final void run() {
        li.w0 w0Var;
        int i10 = this.f32896a;
        d50 d50Var = this.f32897b;
        switch (i10) {
            case 0:
                li.w0 w0Var2 = d50Var.Q;
                if (w0Var2 != null && w0Var2.f12298a == 3) {
                    long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                    long j10 = d50Var.F0;
                    if (j10 == 0 || elapsedRealtimeNanos - j10 >= 70000000) {
                        d50Var.D();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                int i11 = d50.K0;
                d50Var.t();
                return;
            default:
                int i12 = d50.K0;
                li.x0 x0Var = d50Var.O;
                if (x0Var != null && (w0Var = d50Var.Q) != null) {
                    if (w0Var.f12298a == 3) {
                        d50Var.w();
                        return;
                    } else if (w0Var.e) {
                        x0Var.p();
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
