package org.telegram.ui.Wallet;

import org.telegram.messenger.hd;
import org.telegram.ui.Components.lc;
public final class q4 implements Runnable {
    public final int f44863a;
    public final n6 f44864b;

    public q4(n6 n6Var, int i7) {
        this.f44863a = i7;
        this.f44864b = n6Var;
    }

    @Override
    public final void run() {
        boolean z10;
        l0 l0Var;
        int i7 = this.f44863a;
        n6 n6Var = this.f44864b;
        switch (i7) {
            case 0:
                r8 r8Var = n6Var.f44677k0;
                if (r8Var != null && (l0Var = n6Var.H0) != null) {
                    r8Var.Y(l0Var);
                }
                l0 l0Var2 = n6Var.H0;
                if (l0Var2 != null && !l0Var2.f44504a.isEmpty()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (n6Var.f44673g0 != z10) {
                    n6Var.Q0(z10);
                }
                if (z10 && n6Var.I0) {
                    j9 j9Var = n6Var.f44676j0;
                    if (j9Var != null) {
                        j9Var.b(false);
                    }
                    if (!n6Var.f44673g0) {
                        n6Var.I0 = true;
                    } else {
                        n6Var.I0 = false;
                        n6Var.f44672f0 = 1;
                        hi.i1 i1Var = n6Var.f44687s0;
                        if (i1Var != null) {
                            i1Var.setPosition(1);
                        }
                    }
                }
                bi.f6 f6Var = n6Var.f34681a;
                if (f6Var != null && f6Var.f35789g3 != null) {
                    n6Var.c1(true);
                    return;
                }
                return;
            case 1:
                n6Var.t0(false);
                return;
            case 2:
                n6Var.I0();
                return;
            case 3:
                n6Var.H0();
                return;
            case 4:
                if (n6Var.S.isAttachedToWindow()) {
                    if (!n6Var.f34681a.canScrollVertically(-1)) {
                        n6Var.f34681a.f35788f3.h1(0, 0);
                    }
                    n6Var.S.requestLayout();
                    return;
                }
                return;
            case 5:
                n6.g0(n6Var);
                return;
            case 6:
                n6Var.Y0();
                return;
            case 7:
                n6Var.Q0 = null;
                return;
            case 8:
                n6Var.S.post(new q4(n6Var, 4));
                return;
            case 9:
                lc.b0(n6Var).N(hd.N0(2131745665, null), hd.N0(2131751093, null)).j();
                return;
            case 10:
                n6.j0(n6Var);
                return;
            case 11:
                n6Var.getClass();
                n6Var.presentFragment(new d9());
                return;
            case 12:
                n6Var.getClass();
                n6Var.presentFragment(new ii.t());
                return;
            case 13:
                n6Var.H0();
                return;
            default:
                n6Var.H0();
                return;
        }
    }
}
