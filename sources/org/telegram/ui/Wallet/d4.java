package org.telegram.ui.Wallet;

import org.telegram.messenger.id;
import org.telegram.ui.Components.hc;
public final class d4 implements Runnable {
    public final int f42361a;
    public final w5 f42362b;

    public d4(w5 w5Var, int i7) {
        this.f42361a = i7;
        this.f42362b = w5Var;
    }

    @Override
    public final void run() {
        boolean z9;
        d0 d0Var;
        int i7 = this.f42361a;
        w5 w5Var = this.f42362b;
        switch (i7) {
            case 0:
                w5.e0(w5Var);
                return;
            case 1:
                w5Var.getClass();
                w5Var.presentFragment(new m8());
                return;
            case 2:
                w5Var.getClass();
                w5Var.presentFragment(new gi.f());
                return;
            case 3:
                a8 a8Var = w5Var.f43260j0;
                if (a8Var != null && (d0Var = w5Var.E0) != null) {
                    a8Var.Y(d0Var);
                }
                d0 d0Var2 = w5Var.E0;
                if (d0Var2 != null && !d0Var2.f42328a.isEmpty()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (w5Var.f43256f0 != z9) {
                    w5Var.L0(z9);
                }
                if (z9 && w5Var.F0) {
                    r8 r8Var = w5Var.f43259i0;
                    if (r8Var != null) {
                        r8Var.b(false);
                    }
                    if (!w5Var.f43256f0) {
                        w5Var.F0 = true;
                    } else {
                        w5Var.F0 = false;
                        w5Var.f43254e0 = 1;
                        fi.g1 g1Var = w5Var.f43266p0;
                        if (g1Var != null) {
                            g1Var.setPosition(1);
                        }
                    }
                }
                fi.w3 w3Var = w5Var.f36649a;
                if (w3Var != null && w3Var.f37556f3 != null) {
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
                if (w5Var.R.isAttachedToWindow()) {
                    if (!w5Var.f36649a.canScrollVertically(-1)) {
                        w5Var.f36649a.f37555e3.h1(0, 0);
                    }
                    w5Var.R.requestLayout();
                    return;
                }
                return;
            case 8:
                w5Var.M0 = null;
                return;
            case 9:
                w5.h0(w5Var);
                return;
            case 10:
                w5Var.T0();
                return;
            case 11:
                hc.a0(w5Var).N(id.M0(2131745861, null), id.M0(2131751105, null)).j();
                return;
            case 12:
                w5Var.R.post(new d4(w5Var, 7));
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
