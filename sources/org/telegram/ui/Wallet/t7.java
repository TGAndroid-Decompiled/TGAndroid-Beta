package org.telegram.ui.Wallet;

import org.telegram.ui.ka0;
public final class t7 implements Runnable {
    public final int f43204a;
    public final b8 f43205b;

    public t7(b8 b8Var, int i3) {
        this.f43204a = i3;
        this.f43205b = b8Var;
    }

    @Override
    public final void run() {
        o7 j10;
        switch (this.f43204a) {
            case 0:
                b8 b8Var = this.f43205b;
                b8Var.f42331t0 = false;
                b8Var.f42307h0 = null;
                b8Var.f0();
                return;
            case 1:
                this.f43205b.Q();
                return;
            case 2:
                b8 b8Var2 = this.f43205b;
                a8 a8Var = b8Var2.f42307h0;
                if (a8Var != null && !b8Var2.f42317n0) {
                    if (b8Var2.f42335v0) {
                        b8Var2.f42319o0 = true;
                        b8Var2.f42309i0 = a8Var;
                        b8Var2.C0 = Float.NaN;
                        b8Var2.F0 = Float.NaN;
                        b8Var2.D0 = 0.0f;
                        b8Var2.M0 = false;
                        b8Var2.E0 = a8Var.f42172i.f43512b;
                        a8Var.f42180q.a(0.0f);
                        a8 a8Var2 = b8Var2.f42307h0;
                        z7 z7Var = a8Var2.f42175l;
                        z7Var.d = 260.0f;
                        z7Var.f43514e = 0.58f;
                        z7Var.f43512b = 1.0f;
                        long j11 = b8Var2.O0 + 1;
                        b8Var2.O0 = j11;
                        a8Var2.I = j11;
                        ei.c3 c3Var = a8Var2.f42166c;
                        c3Var.f21274v0 = true;
                        c3Var.P0(false);
                        b8Var2.performHapticFeedback(0);
                        b8Var2.f0();
                        return;
                    } else if (b8Var2.f42323q0 && (j10 = b8Var2.j(a8Var)) != null) {
                        b8Var2.S(j10);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                b8 b8Var3 = this.f43205b;
                if (b8Var3.f42326r0 && b8Var3.f42307h0 != null) {
                    b8Var3.f42326r0 = false;
                    b8Var3.f42323q0 = true;
                    b8Var3.removeCallbacks(b8Var3.C1);
                    ((ka0) b8Var3.d.f19006b).X();
                    b8Var3.getParent().requestDisallowInterceptTouchEvent(true);
                    b8Var3.performHapticFeedback(4);
                    o7 j12 = b8Var3.j(b8Var3.f42307h0);
                    if (j12 != null) {
                        j12.o();
                        j12.animate().scaleX(0.94f).scaleY(0.94f).setDuration(100L).start();
                    }
                    b8Var3.f0();
                    return;
                }
                return;
        }
    }
}
