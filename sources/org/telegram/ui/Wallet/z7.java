package org.telegram.ui.Wallet;

import org.telegram.ui.vb0;
public final class z7 implements Runnable {
    public final int f35471a;
    public final h8 f35472b;

    public z7(h8 h8Var, int i10) {
        this.f35471a = i10;
        this.f35472b = h8Var;
    }

    @Override
    public final void run() {
        u7 j10;
        switch (this.f35471a) {
            case 0:
                h8 h8Var = this.f35472b;
                h8Var.f34674s0 = false;
                h8Var.f34649g0 = null;
                h8Var.f0();
                return;
            case 1:
                this.f35472b.Q();
                return;
            case 2:
                h8 h8Var2 = this.f35472b;
                g8 g8Var = h8Var2.f34649g0;
                if (g8Var != null && !h8Var2.m0) {
                    if (h8Var2.f34678u0) {
                        h8Var2.f34662n0 = true;
                        h8Var2.f34651h0 = g8Var;
                        h8Var2.B0 = Float.NaN;
                        h8Var2.E0 = Float.NaN;
                        h8Var2.C0 = 0.0f;
                        h8Var2.L0 = false;
                        h8Var2.D0 = g8Var.f34591i.f34507b;
                        g8Var.f34599q.a(0.0f);
                        g8 g8Var2 = h8Var2.f34649g0;
                        f8 f8Var = g8Var2.f34594l;
                        f8Var.d = 260.0f;
                        f8Var.e = 0.58f;
                        f8Var.f34507b = 1.0f;
                        long j11 = h8Var2.N0 + 1;
                        h8Var2.N0 = j11;
                        g8Var2.I = j11;
                        ag.c2 c2Var = g8Var2.f34586c;
                        c2Var.f14411u0 = true;
                        c2Var.P0(false);
                        h8Var2.performHapticFeedback(0);
                        h8Var2.f0();
                        return;
                    } else if (h8Var2.f34666p0 && (j10 = h8Var2.j(g8Var)) != null) {
                        h8Var2.S(j10);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                h8 h8Var3 = this.f35472b;
                if (h8Var3.f34668q0 && h8Var3.f34649g0 != null) {
                    h8Var3.f34668q0 = false;
                    h8Var3.f34666p0 = true;
                    h8Var3.removeCallbacks(h8Var3.B1);
                    ((vb0) h8Var3.d.f12706b).X();
                    h8Var3.getParent().requestDisallowInterceptTouchEvent(true);
                    h8Var3.performHapticFeedback(4);
                    u7 j12 = h8Var3.j(h8Var3.f34649g0);
                    if (j12 != null) {
                        j12.o();
                        j12.animate().scaleX(0.94f).scaleY(0.94f).setDuration(100L).start();
                    }
                    h8Var3.f0();
                    return;
                }
                return;
        }
    }
}
