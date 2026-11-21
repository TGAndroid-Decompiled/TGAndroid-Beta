package org.telegram.ui.Wallet;

import org.telegram.ui.pa0;
public final class g8 implements Runnable {
    public final int f44309a;
    public final r8 f44310b;

    public g8(r8 r8Var, int i7) {
        this.f44309a = i7;
        this.f44310b = r8Var;
    }

    @Override
    public final void run() {
        e8 j3;
        switch (this.f44309a) {
            case 0:
                r8 r8Var = this.f44310b;
                if (r8Var.f44961r0 && r8Var.f44942h0 != null) {
                    r8Var.f44961r0 = false;
                    r8Var.f44958q0 = true;
                    r8Var.removeCallbacks(r8Var.C1);
                    ((pa0) r8Var.d.f18211b).X();
                    r8Var.getParent().requestDisallowInterceptTouchEvent(true);
                    r8Var.performHapticFeedback(4);
                    e8 j10 = r8Var.j(r8Var.f44942h0);
                    if (j10 != null) {
                        j10.o();
                        j10.animate().scaleX(0.94f).scaleY(0.94f).setDuration(100L).start();
                    }
                    r8Var.f0();
                    return;
                }
                return;
            case 1:
                r8 r8Var2 = this.f44310b;
                r8Var2.f44966t0 = false;
                r8Var2.f44942h0 = null;
                r8Var2.f0();
                return;
            case 2:
                this.f44310b.Q();
                return;
            default:
                r8 r8Var3 = this.f44310b;
                q8 q8Var = r8Var3.f44942h0;
                if (q8Var != null && !r8Var3.f44953n0) {
                    if (r8Var3.f44970v0) {
                        r8Var3.f44954o0 = true;
                        r8Var3.f44944i0 = q8Var;
                        r8Var3.C0 = Float.NaN;
                        r8Var3.F0 = Float.NaN;
                        r8Var3.D0 = 0.0f;
                        r8Var3.M0 = false;
                        r8Var3.E0 = q8Var.f44876i.f44836b;
                        q8Var.f44884q.a(0.0f);
                        q8 q8Var2 = r8Var3.f44942h0;
                        p8 p8Var = q8Var2.f44879l;
                        p8Var.d = 260.0f;
                        p8Var.f44838e = 0.58f;
                        p8Var.f44836b = 1.0f;
                        long j11 = r8Var3.O0 + 1;
                        r8Var3.O0 = j11;
                        q8Var2.I = j11;
                        fi.s2 s2Var = q8Var2.f44870c;
                        s2Var.f22694v0 = true;
                        s2Var.P0(false);
                        r8Var3.performHapticFeedback(0);
                        r8Var3.f0();
                        return;
                    } else if (r8Var3.f44958q0 && (j3 = r8Var3.j(q8Var)) != null) {
                        r8Var3.S(j3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
