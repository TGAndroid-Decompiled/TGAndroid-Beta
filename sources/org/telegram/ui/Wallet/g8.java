package org.telegram.ui.Wallet;

import org.telegram.ui.pa0;
public final class g8 implements Runnable {
    public final int f44269a;
    public final r8 f44270b;

    public g8(r8 r8Var, int i7) {
        this.f44269a = i7;
        this.f44270b = r8Var;
    }

    @Override
    public final void run() {
        e8 j3;
        switch (this.f44269a) {
            case 0:
                r8 r8Var = this.f44270b;
                if (r8Var.f44921r0 && r8Var.f44902h0 != null) {
                    r8Var.f44921r0 = false;
                    r8Var.f44918q0 = true;
                    r8Var.removeCallbacks(r8Var.C1);
                    ((pa0) r8Var.d.f18180b).X();
                    r8Var.getParent().requestDisallowInterceptTouchEvent(true);
                    r8Var.performHapticFeedback(4);
                    e8 j10 = r8Var.j(r8Var.f44902h0);
                    if (j10 != null) {
                        j10.o();
                        j10.animate().scaleX(0.94f).scaleY(0.94f).setDuration(100L).start();
                    }
                    r8Var.f0();
                    return;
                }
                return;
            case 1:
                r8 r8Var2 = this.f44270b;
                r8Var2.f44926t0 = false;
                r8Var2.f44902h0 = null;
                r8Var2.f0();
                return;
            case 2:
                this.f44270b.Q();
                return;
            default:
                r8 r8Var3 = this.f44270b;
                q8 q8Var = r8Var3.f44902h0;
                if (q8Var != null && !r8Var3.f44913n0) {
                    if (r8Var3.f44930v0) {
                        r8Var3.f44914o0 = true;
                        r8Var3.f44904i0 = q8Var;
                        r8Var3.C0 = Float.NaN;
                        r8Var3.F0 = Float.NaN;
                        r8Var3.D0 = 0.0f;
                        r8Var3.M0 = false;
                        r8Var3.E0 = q8Var.f44836i.f44796b;
                        q8Var.f44844q.a(0.0f);
                        q8 q8Var2 = r8Var3.f44902h0;
                        p8 p8Var = q8Var2.f44839l;
                        p8Var.d = 260.0f;
                        p8Var.f44798e = 0.58f;
                        p8Var.f44796b = 1.0f;
                        long j11 = r8Var3.O0 + 1;
                        r8Var3.O0 = j11;
                        q8Var2.I = j11;
                        fi.s2 s2Var = q8Var2.f44830c;
                        s2Var.f22666v0 = true;
                        s2Var.P0(false);
                        r8Var3.performHapticFeedback(0);
                        r8Var3.f0();
                        return;
                    } else if (r8Var3.f44918q0 && (j3 = r8Var3.j(q8Var)) != null) {
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
