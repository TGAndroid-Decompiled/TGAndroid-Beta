package org.telegram.ui.Wallet;

import org.telegram.ui.qc0;
public final class l7 implements Runnable {
    public final int f34778a;
    public final t7 f34779b;

    public l7(t7 t7Var, int i10) {
        this.f34778a = i10;
        this.f34779b = t7Var;
    }

    @Override
    public final void run() {
        g7 j10;
        switch (this.f34778a) {
            case 0:
                t7 t7Var = this.f34779b;
                t7Var.f35259s0 = false;
                t7Var.f35234g0 = null;
                t7Var.f0();
                return;
            case 1:
                this.f34779b.Q();
                return;
            case 2:
                t7 t7Var2 = this.f34779b;
                s7 s7Var = t7Var2.f35234g0;
                if (s7Var != null && !t7Var2.m0) {
                    if (t7Var2.f35263u0) {
                        t7Var2.f35247n0 = true;
                        t7Var2.f35236h0 = s7Var;
                        t7Var2.B0 = Float.NaN;
                        t7Var2.E0 = Float.NaN;
                        t7Var2.C0 = 0.0f;
                        t7Var2.L0 = false;
                        t7Var2.D0 = s7Var.f35162i.f35110b;
                        s7Var.f35170q.a(0.0f);
                        s7 s7Var2 = t7Var2.f35234g0;
                        r7 r7Var = s7Var2.f35165l;
                        r7Var.d = 260.0f;
                        r7Var.e = 0.58f;
                        r7Var.f35110b = 1.0f;
                        long j11 = t7Var2.N0 + 1;
                        t7Var2.N0 = j11;
                        s7Var2.I = j11;
                        s7Var2.f35157c.setAllowStartLottieAnimation(true);
                        t7Var2.f35234g0.f35157c.startAnimation();
                        t7Var2.performHapticFeedback(0);
                        t7Var2.f0();
                        return;
                    } else if (t7Var2.f35251p0 && (j10 = t7Var2.j(s7Var)) != null) {
                        t7Var2.S(j10);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                t7 t7Var3 = this.f34779b;
                if (t7Var3.f35253q0 && t7Var3.f35234g0 != null) {
                    t7Var3.f35253q0 = false;
                    t7Var3.f35251p0 = true;
                    t7Var3.removeCallbacks(t7Var3.B1);
                    ((qc0) t7Var3.d.f17036b).Y();
                    t7Var3.getParent().requestDisallowInterceptTouchEvent(true);
                    t7Var3.performHapticFeedback(4);
                    g7 j12 = t7Var3.j(t7Var3.f35234g0);
                    if (j12 != null) {
                        j12.o();
                        j12.animate().scaleX(0.94f).scaleY(0.94f).setDuration(100L).start();
                    }
                    t7Var3.f0();
                    return;
                }
                return;
        }
    }
}
