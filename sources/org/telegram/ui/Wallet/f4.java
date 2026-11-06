package org.telegram.ui.Wallet;

import org.telegram.messenger.hd;
import org.telegram.ui.Components.hc;
public final class f4 implements Runnable {
    public final int f42451a;
    public final y5 f42452b;

    public f4(y5 y5Var, int i7) {
        this.f42451a = i7;
        this.f42452b = y5Var;
    }

    @Override
    public final void run() {
        boolean z9;
        f0 f0Var;
        int i7 = this.f42451a;
        y5 y5Var = this.f42452b;
        switch (i7) {
            case 0:
                y5.e0(y5Var);
                return;
            case 1:
                y5Var.getClass();
                y5Var.presentFragment(new o8());
                return;
            case 2:
                y5Var.getClass();
                y5Var.presentFragment(new gi.f());
                return;
            case 3:
                c8 c8Var = y5Var.f43352j0;
                if (c8Var != null && (f0Var = y5Var.E0) != null) {
                    c8Var.Y(f0Var);
                }
                f0 f0Var2 = y5Var.E0;
                if (f0Var2 != null && !f0Var2.f42418a.isEmpty()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (y5Var.f43348f0 != z9) {
                    y5Var.L0(z9);
                }
                if (z9 && y5Var.F0) {
                    t8 t8Var = y5Var.f43351i0;
                    if (t8Var != null) {
                        t8Var.b(false);
                    }
                    if (!y5Var.f43348f0) {
                        y5Var.F0 = true;
                    } else {
                        y5Var.F0 = false;
                        y5Var.f43346e0 = 1;
                        fi.g1 g1Var = y5Var.f43358p0;
                        if (g1Var != null) {
                            g1Var.setPosition(1);
                        }
                    }
                }
                fi.w3 w3Var = y5Var.f34211a;
                if (w3Var != null && w3Var.f35167f3 != null) {
                    y5Var.X0(true);
                    return;
                }
                return;
            case 4:
                y5Var.s0(false);
                return;
            case 5:
                y5Var.E0();
                return;
            case 6:
                y5Var.D0();
                return;
            case 7:
                if (y5Var.R.isAttachedToWindow()) {
                    if (!y5Var.f34211a.canScrollVertically(-1)) {
                        y5Var.f34211a.f35166e3.h1(0, 0);
                    }
                    y5Var.R.requestLayout();
                    return;
                }
                return;
            case 8:
                y5Var.M0 = null;
                return;
            case 9:
                y5.h0(y5Var);
                return;
            case 10:
                y5Var.T0();
                return;
            case 11:
                hc.a0(y5Var).N(hd.M0(2131745862, null), hd.M0(2131751106, null)).j();
                return;
            case 12:
                y5Var.R.post(new f4(y5Var, 7));
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
