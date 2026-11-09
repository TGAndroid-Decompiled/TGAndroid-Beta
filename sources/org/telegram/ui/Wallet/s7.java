package org.telegram.ui.Wallet;

import org.telegram.ui.qa0;
public final class s7 implements Runnable {
    public final int f43099a;
    public final a8 f43100b;

    public s7(a8 a8Var, int i7) {
        this.f43099a = i7;
        this.f43100b = a8Var;
    }

    @Override
    public final void run() {
        n7 j3;
        switch (this.f43099a) {
            case 0:
                a8 a8Var = this.f43100b;
                a8Var.f42177s0 = false;
                a8Var.f42153g0 = null;
                a8Var.f0();
                return;
            case 1:
                this.f43100b.Q();
                return;
            case 2:
                a8 a8Var2 = this.f43100b;
                z7 z7Var = a8Var2.f42153g0;
                if (z7Var != null && !a8Var2.m0) {
                    if (a8Var2.f42181u0) {
                        a8Var2.f42166n0 = true;
                        a8Var2.f42155h0 = z7Var;
                        a8Var2.B0 = Float.NaN;
                        a8Var2.E0 = Float.NaN;
                        a8Var2.C0 = 0.0f;
                        a8Var2.L0 = false;
                        a8Var2.D0 = z7Var.f43445i.f43390b;
                        z7Var.f43453q.a(0.0f);
                        z7 z7Var2 = a8Var2.f42153g0;
                        y7 y7Var = z7Var2.f43448l;
                        y7Var.d = 260.0f;
                        y7Var.f43392e = 0.58f;
                        y7Var.f43390b = 1.0f;
                        long j10 = a8Var2.N0 + 1;
                        a8Var2.N0 = j10;
                        z7Var2.I = j10;
                        di.z2 z2Var = z7Var2.f43439c;
                        z2Var.f21222u0 = true;
                        z2Var.P0(false);
                        a8Var2.performHapticFeedback(0);
                        a8Var2.f0();
                        return;
                    } else if (a8Var2.f42169p0 && (j3 = a8Var2.j(z7Var)) != null) {
                        a8Var2.S(j3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                a8 a8Var3 = this.f43100b;
                if (a8Var3.f42171q0 && a8Var3.f42153g0 != null) {
                    a8Var3.f42171q0 = false;
                    a8Var3.f42169p0 = true;
                    a8Var3.removeCallbacks(a8Var3.B1);
                    ((qa0) a8Var3.d.f19611a).X();
                    a8Var3.getParent().requestDisallowInterceptTouchEvent(true);
                    a8Var3.performHapticFeedback(4);
                    n7 j11 = a8Var3.j(a8Var3.f42153g0);
                    if (j11 != null) {
                        j11.o();
                        j11.animate().scaleX(0.94f).scaleY(0.94f).setDuration(100L).start();
                    }
                    a8Var3.f0();
                    return;
                }
                return;
        }
    }
}
