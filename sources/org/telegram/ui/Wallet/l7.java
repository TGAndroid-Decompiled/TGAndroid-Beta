package org.telegram.ui.Wallet;

import org.telegram.ui.lc0;
public final class l7 implements Runnable {
    public final int f34467a;
    public final t7 f34468b;

    public l7(t7 t7Var, int i10) {
        this.f34467a = i10;
        this.f34468b = t7Var;
    }

    @Override
    public final void run() {
        g7 j10;
        switch (this.f34467a) {
            case 0:
                t7 t7Var = this.f34468b;
                t7Var.f34952s0 = false;
                t7Var.f34927g0 = null;
                t7Var.f0();
                return;
            case 1:
                this.f34468b.Q();
                return;
            case 2:
                t7 t7Var2 = this.f34468b;
                s7 s7Var = t7Var2.f34927g0;
                if (s7Var != null && !t7Var2.m0) {
                    if (t7Var2.f34956u0) {
                        t7Var2.f34940n0 = true;
                        t7Var2.f34929h0 = s7Var;
                        t7Var2.B0 = Float.NaN;
                        t7Var2.E0 = Float.NaN;
                        t7Var2.C0 = 0.0f;
                        t7Var2.L0 = false;
                        t7Var2.D0 = s7Var.f34873i.f34810b;
                        s7Var.f34881q.a(0.0f);
                        s7 s7Var2 = t7Var2.f34927g0;
                        r7 r7Var = s7Var2.f34876l;
                        r7Var.d = 260.0f;
                        r7Var.e = 0.58f;
                        r7Var.f34810b = 1.0f;
                        long j11 = t7Var2.N0 + 1;
                        t7Var2.N0 = j11;
                        s7Var2.I = j11;
                        s7Var2.f34868c.setAllowStartLottieAnimation(true);
                        t7Var2.f34927g0.f34868c.startAnimation();
                        t7Var2.performHapticFeedback(0);
                        t7Var2.f0();
                        return;
                    } else if (t7Var2.f34944p0 && (j10 = t7Var2.j(s7Var)) != null) {
                        t7Var2.S(j10);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                t7 t7Var3 = this.f34468b;
                if (t7Var3.f34946q0 && t7Var3.f34927g0 != null) {
                    t7Var3.f34946q0 = false;
                    t7Var3.f34944p0 = true;
                    t7Var3.removeCallbacks(t7Var3.B1);
                    ((lc0) t7Var3.d.f17039b).Z();
                    t7Var3.getParent().requestDisallowInterceptTouchEvent(true);
                    t7Var3.performHapticFeedback(4);
                    g7 j12 = t7Var3.j(t7Var3.f34927g0);
                    if (j12 != null) {
                        j12.n();
                        j12.animate().scaleX(0.94f).scaleY(0.94f).setDuration(100L).start();
                    }
                    t7Var3.f0();
                    return;
                }
                return;
        }
    }
}
