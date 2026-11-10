package org.telegram.ui.Wallet;

import org.telegram.messenger.id;
import org.telegram.ui.Components.gc;
public final class f4 implements Runnable {
    public final int f42496a;
    public final z5 f42497b;

    public f4(z5 z5Var, int i7) {
        this.f42496a = i7;
        this.f42497b = z5Var;
    }

    @Override
    public final void run() {
        boolean z9;
        d0 d0Var;
        int i7 = this.f42496a;
        z5 z5Var = this.f42497b;
        switch (i7) {
            case 0:
                z5Var.R.post(new f4(z5Var, 8));
                return;
            case 1:
                z5.e0(z5Var);
                return;
            case 2:
                z5Var.getClass();
                z5Var.presentFragment(new p8());
                return;
            case 3:
                z5Var.getClass();
                z5Var.presentFragment(new gi.f());
                return;
            case 4:
                d8 d8Var = z5Var.f43455j0;
                if (d8Var != null && (d0Var = z5Var.E0) != null) {
                    d8Var.Y(d0Var);
                }
                d0 d0Var2 = z5Var.E0;
                if (d0Var2 != null && !d0Var2.f42269a.isEmpty()) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z5Var.f43451f0 != z9) {
                    z5Var.M0(z9);
                }
                if (z9 && z5Var.F0) {
                    u8 u8Var = z5Var.f43454i0;
                    if (u8Var != null) {
                        u8Var.b(false);
                    }
                    if (!z5Var.f43451f0) {
                        z5Var.F0 = true;
                    } else {
                        z5Var.F0 = false;
                        z5Var.f43449e0 = 1;
                        fi.g1 g1Var = z5Var.f43461p0;
                        if (g1Var != null) {
                            g1Var.setPosition(1);
                        }
                    }
                }
                fi.w3 w3Var = z5Var.f36518a;
                if (w3Var != null && w3Var.f37496f3 != null) {
                    z5Var.Y0(true);
                    return;
                }
                return;
            case 5:
                z5Var.s0(false);
                return;
            case 6:
                z5Var.E0();
                return;
            case 7:
                z5Var.D0();
                return;
            case 8:
                if (z5Var.R.isAttachedToWindow()) {
                    if (!z5Var.f36518a.canScrollVertically(-1)) {
                        z5Var.f36518a.f37495e3.h1(0, 0);
                    }
                    z5Var.R.requestLayout();
                    return;
                }
                return;
            case 9:
                z5Var.M0 = null;
                return;
            case 10:
                z5.h0(z5Var);
                return;
            case 11:
                gc.a0(z5Var).N(id.M0(2131745861, null), id.M0(2131751105, null)).j();
                return;
            case 12:
                z5Var.U0();
                return;
            case 13:
                z5Var.D0();
                return;
            default:
                z5Var.D0();
                return;
        }
    }
}
