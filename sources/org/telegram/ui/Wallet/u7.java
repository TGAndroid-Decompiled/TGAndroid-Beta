package org.telegram.ui.Wallet;

import org.telegram.ui.oa0;
public final class u7 implements Runnable {
    public final int f44563a;
    public final c8 f44564b;

    public u7(c8 c8Var, int i7) {
        this.f44563a = i7;
        this.f44564b = c8Var;
    }

    @Override
    public final void run() {
        p7 j3;
        switch (this.f44563a) {
            case 0:
                c8 c8Var = this.f44564b;
                c8Var.f43688t0 = false;
                c8Var.f43664h0 = null;
                c8Var.f0();
                return;
            case 1:
                this.f44564b.Q();
                return;
            case 2:
                c8 c8Var2 = this.f44564b;
                b8 b8Var = c8Var2.f43664h0;
                if (b8Var != null && !c8Var2.f43675n0) {
                    if (c8Var2.f43692v0) {
                        c8Var2.f43676o0 = true;
                        c8Var2.f43666i0 = b8Var;
                        c8Var2.C0 = Float.NaN;
                        c8Var2.F0 = Float.NaN;
                        c8Var2.D0 = 0.0f;
                        c8Var2.M0 = false;
                        c8Var2.E0 = b8Var.f43521i.f43483b;
                        b8Var.f43529q.a(0.0f);
                        b8 b8Var2 = c8Var2.f43664h0;
                        a8 a8Var = b8Var2.f43524l;
                        a8Var.d = 260.0f;
                        a8Var.f43485e = 0.58f;
                        a8Var.f43483b = 1.0f;
                        long j10 = c8Var2.O0 + 1;
                        c8Var2.O0 = j10;
                        b8Var2.I = j10;
                        fi.u2 u2Var = b8Var2.f43515c;
                        u2Var.f22303v0 = true;
                        u2Var.P0(false);
                        c8Var2.performHapticFeedback(0);
                        c8Var2.f0();
                        return;
                    } else if (c8Var2.f43680q0 && (j3 = c8Var2.j(b8Var)) != null) {
                        c8Var2.S(j3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                c8 c8Var3 = this.f44564b;
                if (c8Var3.f43683r0 && c8Var3.f43664h0 != null) {
                    c8Var3.f43683r0 = false;
                    c8Var3.f43680q0 = true;
                    c8Var3.removeCallbacks(c8Var3.C1);
                    ((oa0) c8Var3.d.f17788b).X();
                    c8Var3.getParent().requestDisallowInterceptTouchEvent(true);
                    c8Var3.performHapticFeedback(4);
                    p7 j11 = c8Var3.j(c8Var3.f43664h0);
                    if (j11 != null) {
                        j11.o();
                        j11.animate().scaleX(0.94f).scaleY(0.94f).setDuration(100L).start();
                    }
                    c8Var3.f0();
                    return;
                }
                return;
        }
    }
}
