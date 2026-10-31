package org.telegram.ui.Wallet;

import org.telegram.messenger.cd;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ii;
import org.telegram.ui.hk;
public final class f4 implements Runnable {
    public final int f34498a;
    public final b6 f34499b;

    public f4(b6 b6Var, int i10) {
        this.f34498a = i10;
        this.f34499b = b6Var;
    }

    @Override
    public final void run() {
        boolean z10;
        c0 c0Var;
        int i10 = this.f34498a;
        b6 b6Var = this.f34499b;
        switch (i10) {
            case 0:
                b6.d0(b6Var);
                return;
            case 1:
                b6Var.getClass();
                b6Var.presentFragment(new t8());
                return;
            case 2:
                b6Var.getClass();
                b6Var.presentFragment(new wh.g());
                return;
            case 3:
                h8 h8Var = b6Var.f34251j0;
                if (h8Var != null && (c0Var = b6Var.E0) != null) {
                    h8Var.Y(c0Var);
                }
                c0 c0Var2 = b6Var.E0;
                if (c0Var2 != null && !c0Var2.f34296a.isEmpty()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (b6Var.f34247f0 != z10) {
                    b6Var.K0(z10);
                }
                if (z10 && b6Var.F0) {
                    y8 y8Var = b6Var.f34250i0;
                    if (y8Var != null) {
                        y8Var.b(false);
                    }
                    if (!b6Var.f34247f0) {
                        b6Var.F0 = true;
                    } else {
                        b6Var.F0 = false;
                        b6Var.f34245e0 = 1;
                        hk hkVar = b6Var.f34257p0;
                        if (hkVar != null) {
                            hkVar.setPosition(1);
                        }
                    }
                }
                ii iiVar = b6Var.f29837a;
                if (iiVar != null && iiVar.f30819f3 != null) {
                    b6Var.W0(true);
                    return;
                }
                return;
            case 4:
                b6Var.r0(false);
                return;
            case 5:
                b6Var.D0();
                return;
            case 6:
                b6Var.C0();
                return;
            case 7:
                if (b6Var.R.isAttachedToWindow()) {
                    if (!b6Var.f29837a.canScrollVertically(-1)) {
                        b6Var.f29837a.f30818e3.h1(0, 0);
                    }
                    b6Var.R.requestLayout();
                    return;
                }
                return;
            case 8:
                b6Var.M0 = null;
                return;
            case 9:
                b6.g0(b6Var);
                return;
            case 10:
                b6Var.S0();
                return;
            case 11:
                cc.a0(b6Var).N(cd.L0(2131745878, null), cd.L0(2131751106, null)).j();
                return;
            case 12:
                b6Var.R.post(new f4(b6Var, 7));
                return;
            case 13:
                b6Var.C0();
                return;
            default:
                b6Var.C0();
                return;
        }
    }
}
