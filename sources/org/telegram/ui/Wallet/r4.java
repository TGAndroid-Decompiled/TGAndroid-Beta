package org.telegram.ui.Wallet;

import org.telegram.messenger.gd;
import org.telegram.ui.Components.kc;
public final class r4 implements Runnable {
    public final int f44991a;
    public final o6 f44992b;

    public r4(o6 o6Var, int i7) {
        this.f44991a = i7;
        this.f44992b = o6Var;
    }

    @Override
    public final void run() {
        boolean z10;
        m0 m0Var;
        int i7 = this.f44991a;
        o6 o6Var = this.f44992b;
        switch (i7) {
            case 0:
                s8 s8Var = o6Var.f44805k0;
                if (s8Var != null && (m0Var = o6Var.H0) != null) {
                    s8Var.Y(m0Var);
                }
                m0 m0Var2 = o6Var.H0;
                if (m0Var2 != null && !m0Var2.f44629a.isEmpty()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (o6Var.f44801g0 != z10) {
                    o6Var.Q0(z10);
                }
                if (z10 && o6Var.I0) {
                    k9 k9Var = o6Var.f44804j0;
                    if (k9Var != null) {
                        k9Var.b(false);
                    }
                    if (!o6Var.f44801g0) {
                        o6Var.I0 = true;
                    } else {
                        o6Var.I0 = false;
                        o6Var.f44800f0 = 1;
                        hi.q1 q1Var = o6Var.f44815s0;
                        if (q1Var != null) {
                            q1Var.setPosition(1);
                        }
                    }
                }
                bi.i6 i6Var = o6Var.f34213a;
                if (i6Var != null && i6Var.f35323g3 != null) {
                    o6Var.c1(true);
                    return;
                }
                return;
            case 1:
                o6Var.t0(false);
                return;
            case 2:
                o6Var.I0();
                return;
            case 3:
                o6Var.H0();
                return;
            case 4:
                if (o6Var.S.isAttachedToWindow()) {
                    if (!o6Var.f34213a.canScrollVertically(-1)) {
                        o6Var.f34213a.f35322f3.h1(0, 0);
                    }
                    o6Var.S.requestLayout();
                    return;
                }
                return;
            case 5:
                o6.g0(o6Var);
                return;
            case 6:
                o6Var.Y0();
                return;
            case 7:
                o6Var.Q0 = null;
                return;
            case 8:
                o6Var.S.post(new r4(o6Var, 4));
                return;
            case 9:
                kc.b0(o6Var).N(gd.N0(2131745665, null), gd.N0(2131751093, null)).j();
                return;
            case 10:
                o6.j0(o6Var);
                return;
            case 11:
                o6Var.getClass();
                o6Var.presentFragment(new e9());
                return;
            case 12:
                o6Var.getClass();
                o6Var.presentFragment(new ii.t());
                return;
            case 13:
                o6Var.H0();
                return;
            default:
                o6Var.H0();
                return;
        }
    }
}
