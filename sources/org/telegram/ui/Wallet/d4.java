package org.telegram.ui.Wallet;

import org.telegram.messenger.bd;
import org.telegram.ui.Components.fc;
public final class d4 implements Runnable {
    public final int f42425a;
    public final w5 f42426b;

    public d4(w5 w5Var, int i3) {
        this.f42425a = i3;
        this.f42426b = w5Var;
    }

    @Override
    public final void run() {
        boolean z10;
        c0 c0Var;
        int i3 = this.f42425a;
        w5 w5Var = this.f42426b;
        switch (i3) {
            case 0:
                w5.e0(w5Var);
                return;
            case 1:
                w5Var.getClass();
                w5Var.presentFragment(new n8());
                return;
            case 2:
                w5Var.getClass();
                w5Var.presentFragment(new hi.g());
                return;
            case 3:
                b8 b8Var = w5Var.f43331k0;
                if (b8Var != null && (c0Var = w5Var.F0) != null) {
                    b8Var.Y(c0Var);
                }
                c0 c0Var2 = w5Var.F0;
                if (c0Var2 != null && !c0Var2.f42360a.isEmpty()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (w5Var.f43327g0 != z10) {
                    w5Var.L0(z10);
                }
                if (z10 && w5Var.G0) {
                    s8 s8Var = w5Var.f43330j0;
                    if (s8Var != null) {
                        s8Var.b(false);
                    }
                    if (!w5Var.f43327g0) {
                        w5Var.G0 = true;
                    } else {
                        w5Var.G0 = false;
                        w5Var.f43326f0 = 1;
                        gi.g1 g1Var = w5Var.f43337q0;
                        if (g1Var != null) {
                            g1Var.setPosition(1);
                        }
                    }
                }
                ai.h4 h4Var = w5Var.f34298a;
                if (h4Var != null && h4Var.f35594g3 != null) {
                    w5Var.X0(true);
                    return;
                }
                return;
            case 4:
                w5Var.s0(false);
                return;
            case 5:
                w5Var.E0();
                return;
            case 6:
                w5Var.D0();
                return;
            case 7:
                if (w5Var.S.isAttachedToWindow()) {
                    if (!w5Var.f34298a.canScrollVertically(-1)) {
                        w5Var.f34298a.f35593f3.h1(0, 0);
                    }
                    w5Var.S.requestLayout();
                    return;
                }
                return;
            case 8:
                w5Var.N0 = null;
                return;
            case 9:
                w5.h0(w5Var);
                return;
            case 10:
                w5Var.T0();
                return;
            case 11:
                fc.a0(w5Var).N(bd.M0(2131745871, null), bd.M0(2131751106, null)).j();
                return;
            case 12:
                w5Var.S.post(new d4(w5Var, 7));
                return;
            case 13:
                w5Var.D0();
                return;
            default:
                w5Var.D0();
                return;
        }
    }
}
