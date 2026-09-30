package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class hq0 extends org.telegram.ui.ActionBar.o1 {
    public final iq0 f24930x;

    public hq0(iq0 iq0Var, iq0 iq0Var2) {
        super(iq0Var2);
        this.f24930x = iq0Var;
    }

    @Override
    public final boolean b() {
        xq0 xq0Var = this.f24930x.H0;
        if (!xq0Var.isDismissed() && xq0Var.Y) {
            return !xq0Var.d.m();
        }
        return false;
    }

    @Override
    public final void e(float r9, float r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hq0.e(float, float, boolean):void");
    }

    @Override
    public final void f() {
        xq0 xq0Var = this.f24930x.H0;
        cq0 cq0Var = xq0Var.d;
        if (cq0Var == null || !cq0Var.m()) {
            int i10 = xq0Var.N0;
            AndroidUtilities.dp(20.0f);
        }
        xq0Var.f30475r0 = false;
        int i11 = xq0Var.f30472p0;
        xq0Var.f30473q0 = i11;
        xq0Var.F.setTopGlowOffset(i11);
        xq0Var.f30455b.setTranslationY(xq0Var.f30472p0);
        xq0Var.Q.setTranslationY(xq0Var.f30472p0);
        xq0Var.F.setTranslationY(0.0f);
        xq0Var.G.setTranslationY(0.0f);
        xq0Var.Y0();
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        iq0 iq0Var = this.f24930x;
        xq0 xq0Var = iq0Var.H0;
        int i12 = xq0Var.f30473q0;
        int i13 = xq0Var.f30472p0;
        if (i12 != i13) {
            iq0Var.B0 = i12;
            iq0Var.C0 = i13;
            xq0Var.f30475r0 = true;
            xq0Var.f30472p0 = i12;
        } else {
            iq0Var.B0 = -1;
        }
        int i14 = iq0Var.f25169z0;
        int i15 = iq0Var.A0;
        if (i14 != i15) {
            iq0Var.D0 = 0;
            iq0Var.E0 = 0;
            xq0Var.f30475r0 = true;
            if (!z10) {
                iq0Var.E0 = 0 - (i14 - i15);
            } else {
                iq0Var.E0 = i14 - i15;
            }
            if (z10) {
                i11 = iq0Var.B0;
            } else {
                i11 = iq0Var.C0;
            }
            xq0Var.f30472p0 = i11;
        } else {
            iq0Var.D0 = -1;
        }
        xq0Var.F.setTopGlowOffset((int) (xq0Var.f30478t0 + xq0Var.f30472p0));
        xq0Var.f30455b.setTranslationY(xq0Var.f30478t0 + xq0Var.f30472p0);
        xq0Var.Q.setTranslationY(xq0Var.f30478t0 + xq0Var.f30472p0);
        iq0Var.invalidate();
    }
}
