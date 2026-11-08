package org.telegram.ui.Wallet;

import org.telegram.messenger.id;
import org.telegram.ui.Components.hc;
public final class e4 implements Runnable {
    public final int f42443a;
    public final x5 f42444b;

    public e4(x5 x5Var, int i7) {
        this.f42443a = i7;
        this.f42444b = x5Var;
    }

    @Override
    public final void run() {
        boolean z9;
        e0 e0Var;
        int i7 = this.f42443a;
        x5 x5Var = this.f42444b;
        switch (i7) {
            case 0:
                x5.e0(x5Var);
                return;
            case 1:
                x5Var.getClass();
                x5Var.presentFragment(new n8());
                return;
            case 2:
                x5Var.getClass();
                x5Var.presentFragment(new gi.f());
                return;
            case 3:
                b8 b8Var = x5Var.f43342j0;
                if (b8Var != null && (e0Var = x5Var.E0) != null) {
                    b8Var.Y(e0Var);
                }
                e0 e0Var2 = x5Var.E0;
                if (e0Var2 != null && !e0Var2.f42410a.isEmpty()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (x5Var.f43338f0 != z9) {
                    x5Var.L0(z9);
                }
                if (z9 && x5Var.F0) {
                    s8 s8Var = x5Var.f43341i0;
                    if (s8Var != null) {
                        s8Var.b(false);
                    }
                    if (!x5Var.f43338f0) {
                        x5Var.F0 = true;
                    } else {
                        x5Var.F0 = false;
                        x5Var.f43336e0 = 1;
                        fi.g1 g1Var = x5Var.f43348p0;
                        if (g1Var != null) {
                            g1Var.setPosition(1);
                        }
                    }
                }
                fi.w3 w3Var = x5Var.f36243a;
                if (w3Var != null && w3Var.f37190f3 != null) {
                    x5Var.X0(true);
                    return;
                }
                return;
            case 4:
                x5Var.s0(false);
                return;
            case 5:
                x5Var.E0();
                return;
            case 6:
                x5Var.D0();
                return;
            case 7:
                if (x5Var.R.isAttachedToWindow()) {
                    if (!x5Var.f36243a.canScrollVertically(-1)) {
                        x5Var.f36243a.f37189e3.h1(0, 0);
                    }
                    x5Var.R.requestLayout();
                    return;
                }
                return;
            case 8:
                x5Var.M0 = null;
                return;
            case 9:
                x5.h0(x5Var);
                return;
            case 10:
                x5Var.T0();
                return;
            case 11:
                hc.a0(x5Var).N(id.M0(2131745864, null), id.M0(2131751106, null)).j();
                return;
            case 12:
                x5Var.R.post(new e4(x5Var, 7));
                return;
            case 13:
                x5Var.D0();
                return;
            default:
                x5Var.D0();
                return;
        }
    }
}
