package org.telegram.ui.Wallet;

import org.telegram.ui.oa0;
public final class u7 implements Runnable {
    public final int f43212a;
    public final c8 f43213b;

    public u7(c8 c8Var, int i7) {
        this.f43212a = i7;
        this.f43213b = c8Var;
    }

    @Override
    public final void run() {
        p7 j3;
        switch (this.f43212a) {
            case 0:
                c8 c8Var = this.f43213b;
                c8Var.f42291s0 = false;
                c8Var.f42267g0 = null;
                c8Var.f0();
                return;
            case 1:
                this.f43213b.Q();
                return;
            case 2:
                c8 c8Var2 = this.f43213b;
                b8 b8Var = c8Var2.f42267g0;
                if (b8Var != null && !c8Var2.m0) {
                    if (c8Var2.f42295u0) {
                        c8Var2.f42280n0 = true;
                        c8Var2.f42269h0 = b8Var;
                        c8Var2.B0 = Float.NaN;
                        c8Var2.E0 = Float.NaN;
                        c8Var2.C0 = 0.0f;
                        c8Var2.L0 = false;
                        c8Var2.D0 = b8Var.f42161i.f42105b;
                        b8Var.f42169q.a(0.0f);
                        b8 b8Var2 = c8Var2.f42267g0;
                        a8 a8Var = b8Var2.f42164l;
                        a8Var.d = 260.0f;
                        a8Var.f42107e = 0.58f;
                        a8Var.f42105b = 1.0f;
                        long j10 = c8Var2.N0 + 1;
                        c8Var2.N0 = j10;
                        b8Var2.I = j10;
                        di.z2 z2Var = b8Var2.f42155c;
                        z2Var.f21219u0 = true;
                        z2Var.P0(false);
                        c8Var2.performHapticFeedback(0);
                        c8Var2.f0();
                        return;
                    } else if (c8Var2.f42283p0 && (j3 = c8Var2.j(b8Var)) != null) {
                        c8Var2.S(j3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                c8 c8Var3 = this.f43213b;
                if (c8Var3.f42285q0 && c8Var3.f42267g0 != null) {
                    c8Var3.f42285q0 = false;
                    c8Var3.f42283p0 = true;
                    c8Var3.removeCallbacks(c8Var3.B1);
                    ((oa0) c8Var3.d.f19608a).X();
                    c8Var3.getParent().requestDisallowInterceptTouchEvent(true);
                    c8Var3.performHapticFeedback(4);
                    p7 j11 = c8Var3.j(c8Var3.f42267g0);
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
