package org.telegram.ui.Wallet;

import org.telegram.ui.pa0;
public final class g8 implements Runnable {
    public final int f44313a;
    public final r8 f44314b;

    public g8(r8 r8Var, int i7) {
        this.f44313a = i7;
        this.f44314b = r8Var;
    }

    @Override
    public final void run() {
        e8 j3;
        switch (this.f44313a) {
            case 0:
                r8 r8Var = this.f44314b;
                if (r8Var.f44965r0 && r8Var.f44946h0 != null) {
                    r8Var.f44965r0 = false;
                    r8Var.f44962q0 = true;
                    r8Var.removeCallbacks(r8Var.C1);
                    ((pa0) r8Var.d.f18214b).X();
                    r8Var.getParent().requestDisallowInterceptTouchEvent(true);
                    r8Var.performHapticFeedback(4);
                    e8 j10 = r8Var.j(r8Var.f44946h0);
                    if (j10 != null) {
                        j10.o();
                        j10.animate().scaleX(0.94f).scaleY(0.94f).setDuration(100L).start();
                    }
                    r8Var.f0();
                    return;
                }
                return;
            case 1:
                r8 r8Var2 = this.f44314b;
                r8Var2.f44970t0 = false;
                r8Var2.f44946h0 = null;
                r8Var2.f0();
                return;
            case 2:
                this.f44314b.Q();
                return;
            default:
                r8 r8Var3 = this.f44314b;
                q8 q8Var = r8Var3.f44946h0;
                if (q8Var != null && !r8Var3.f44957n0) {
                    if (r8Var3.f44974v0) {
                        r8Var3.f44958o0 = true;
                        r8Var3.f44948i0 = q8Var;
                        r8Var3.C0 = Float.NaN;
                        r8Var3.F0 = Float.NaN;
                        r8Var3.D0 = 0.0f;
                        r8Var3.M0 = false;
                        r8Var3.E0 = q8Var.f44880i.f44840b;
                        q8Var.f44888q.a(0.0f);
                        q8 q8Var2 = r8Var3.f44946h0;
                        p8 p8Var = q8Var2.f44883l;
                        p8Var.d = 260.0f;
                        p8Var.f44842e = 0.58f;
                        p8Var.f44840b = 1.0f;
                        long j11 = r8Var3.O0 + 1;
                        r8Var3.O0 = j11;
                        q8Var2.I = j11;
                        fi.s2 s2Var = q8Var2.f44874c;
                        s2Var.f22697v0 = true;
                        s2Var.P0(false);
                        r8Var3.performHapticFeedback(0);
                        r8Var3.f0();
                        return;
                    } else if (r8Var3.f44962q0 && (j3 = r8Var3.j(q8Var)) != null) {
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
