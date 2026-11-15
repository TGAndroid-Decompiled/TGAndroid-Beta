package org.telegram.ui.Wallet;

import org.telegram.messenger.hd;
import org.telegram.ui.Components.cc;
public final class e4 implements Runnable {
    public final int f43791a;
    public final y5 f43792b;

    public e4(y5 y5Var, int i7) {
        this.f43791a = i7;
        this.f43792b = y5Var;
    }

    @Override
    public final void run() {
        boolean z10;
        d0 d0Var;
        int i7 = this.f43791a;
        y5 y5Var = this.f43792b;
        switch (i7) {
            case 0:
                y5Var.S.post(new e4(y5Var, 8));
                return;
            case 1:
                y5.e0(y5Var);
                return;
            case 2:
                y5Var.getClass();
                y5Var.presentFragment(new p8());
                return;
            case 3:
                y5Var.getClass();
                y5Var.presentFragment(new ii.f());
                return;
            case 4:
                c8 c8Var = y5Var.f44739k0;
                if (c8Var != null && (d0Var = y5Var.F0) != null) {
                    c8Var.Y(d0Var);
                }
                d0 d0Var2 = y5Var.F0;
                if (d0Var2 != null && !d0Var2.f43712a.isEmpty()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (y5Var.f44735g0 != z10) {
                    y5Var.M0(z10);
                }
                if (z10 && y5Var.G0) {
                    u8 u8Var = y5Var.f44738j0;
                    if (u8Var != null) {
                        u8Var.b(false);
                    }
                    if (!y5Var.f44735g0) {
                        y5Var.G0 = true;
                    } else {
                        y5Var.G0 = false;
                        y5Var.f44734f0 = 1;
                        hi.i1 i1Var = y5Var.f44745q0;
                        if (i1Var != null) {
                            i1Var.setPosition(1);
                        }
                    }
                }
                bi.v3 v3Var = y5Var.f38880a;
                if (v3Var != null && v3Var.f39892g3 != null) {
                    y5Var.Y0(true);
                    return;
                }
                return;
            case 5:
                y5Var.s0(false);
                return;
            case 6:
                y5Var.E0();
                return;
            case 7:
                y5Var.D0();
                return;
            case 8:
                if (y5Var.S.isAttachedToWindow()) {
                    if (!y5Var.f38880a.canScrollVertically(-1)) {
                        y5Var.f38880a.f39891f3.h1(0, 0);
                    }
                    y5Var.S.requestLayout();
                    return;
                }
                return;
            case 9:
                y5Var.N0 = null;
                return;
            case 10:
                y5.h0(y5Var);
                return;
            case 11:
                cc.a0(y5Var).N(hd.M0(2131745861, null), hd.M0(2131751105, null)).j();
                return;
            case 12:
                y5Var.U0();
                return;
            case 13:
                y5Var.D0();
                return;
            default:
                y5Var.D0();
                return;
        }
    }
}
