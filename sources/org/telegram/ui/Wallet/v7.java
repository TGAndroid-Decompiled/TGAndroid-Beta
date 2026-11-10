package org.telegram.ui.Wallet;

import org.telegram.ui.ra0;
public final class v7 implements Runnable {
    public final int f43265a;
    public final d8 f43266b;

    public v7(d8 d8Var, int i7) {
        this.f43265a = i7;
        this.f43266b = d8Var;
    }

    @Override
    public final void run() {
        q7 j3;
        switch (this.f43265a) {
            case 0:
                d8 d8Var = this.f43266b;
                d8Var.f42416s0 = false;
                d8Var.f42392g0 = null;
                d8Var.f0();
                return;
            case 1:
                this.f43266b.Q();
                return;
            case 2:
                d8 d8Var2 = this.f43266b;
                c8 c8Var = d8Var2.f42392g0;
                if (c8Var != null && !d8Var2.m0) {
                    if (d8Var2.f42420u0) {
                        d8Var2.f42405n0 = true;
                        d8Var2.f42394h0 = c8Var;
                        d8Var2.B0 = Float.NaN;
                        d8Var2.E0 = Float.NaN;
                        d8Var2.C0 = 0.0f;
                        d8Var2.L0 = false;
                        d8Var2.D0 = c8Var.f42229i.f42184b;
                        c8Var.f42237q.a(0.0f);
                        c8 c8Var2 = d8Var2.f42392g0;
                        b8 b8Var = c8Var2.f42232l;
                        b8Var.d = 260.0f;
                        b8Var.f42186e = 0.58f;
                        b8Var.f42184b = 1.0f;
                        long j10 = d8Var2.N0 + 1;
                        d8Var2.N0 = j10;
                        c8Var2.I = j10;
                        di.z2 z2Var = c8Var2.f42223c;
                        z2Var.f21227u0 = true;
                        z2Var.P0(false);
                        d8Var2.performHapticFeedback(0);
                        d8Var2.f0();
                        return;
                    } else if (d8Var2.f42408p0 && (j3 = d8Var2.j(c8Var)) != null) {
                        d8Var2.S(j3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                d8 d8Var3 = this.f43266b;
                if (d8Var3.f42410q0 && d8Var3.f42392g0 != null) {
                    d8Var3.f42410q0 = false;
                    d8Var3.f42408p0 = true;
                    d8Var3.removeCallbacks(d8Var3.B1);
                    ((ra0) d8Var3.d.f19616a).X();
                    d8Var3.getParent().requestDisallowInterceptTouchEvent(true);
                    d8Var3.performHapticFeedback(4);
                    q7 j11 = d8Var3.j(d8Var3.f42392g0);
                    if (j11 != null) {
                        j11.o();
                        j11.animate().scaleX(0.94f).scaleY(0.94f).setDuration(100L).start();
                    }
                    d8Var3.f0();
                    return;
                }
                return;
        }
    }
}
