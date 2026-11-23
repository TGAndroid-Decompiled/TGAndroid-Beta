package org.telegram.ui.Wallet;

import org.telegram.ui.oa0;
public final class h8 implements Runnable {
    public final int f44441a;
    public final s8 f44442b;

    public h8(s8 s8Var, int i7) {
        this.f44441a = i7;
        this.f44442b = s8Var;
    }

    @Override
    public final void run() {
        f8 j3;
        switch (this.f44441a) {
            case 0:
                s8 s8Var = this.f44442b;
                if (s8Var.f45093r0 && s8Var.f45074h0 != null) {
                    s8Var.f45093r0 = false;
                    s8Var.f45090q0 = true;
                    s8Var.removeCallbacks(s8Var.C1);
                    ((oa0) s8Var.d.f17464b).X();
                    s8Var.getParent().requestDisallowInterceptTouchEvent(true);
                    s8Var.performHapticFeedback(4);
                    f8 j10 = s8Var.j(s8Var.f45074h0);
                    if (j10 != null) {
                        j10.o();
                        j10.animate().scaleX(0.94f).scaleY(0.94f).setDuration(100L).start();
                    }
                    s8Var.f0();
                    return;
                }
                return;
            case 1:
                s8 s8Var2 = this.f44442b;
                s8Var2.f45098t0 = false;
                s8Var2.f45074h0 = null;
                s8Var2.f0();
                return;
            case 2:
                this.f44442b.Q();
                return;
            default:
                s8 s8Var3 = this.f44442b;
                r8 r8Var = s8Var3.f45074h0;
                if (r8Var != null && !s8Var3.f45085n0) {
                    if (s8Var3.f45102v0) {
                        s8Var3.f45086o0 = true;
                        s8Var3.f45076i0 = r8Var;
                        s8Var3.C0 = Float.NaN;
                        s8Var3.F0 = Float.NaN;
                        s8Var3.D0 = 0.0f;
                        s8Var3.M0 = false;
                        s8Var3.E0 = r8Var.f45008i.f44968b;
                        r8Var.f45016q.a(0.0f);
                        r8 r8Var2 = s8Var3.f45074h0;
                        q8 q8Var = r8Var2.f45011l;
                        q8Var.d = 260.0f;
                        q8Var.f44970e = 0.58f;
                        q8Var.f44968b = 1.0f;
                        long j11 = s8Var3.O0 + 1;
                        s8Var3.O0 = j11;
                        r8Var2.I = j11;
                        fi.s2 s2Var = r8Var2.f45002c;
                        s2Var.f22764v0 = true;
                        s2Var.Q0(false);
                        s8Var3.performHapticFeedback(0);
                        s8Var3.f0();
                        return;
                    } else if (s8Var3.f45090q0 && (j3 = s8Var3.j(r8Var)) != null) {
                        s8Var3.S(j3);
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
