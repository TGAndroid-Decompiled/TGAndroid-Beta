package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class vp0 extends org.telegram.ui.ActionBar.r1 {
    public final wp0 f30065x;

    public vp0(wp0 wp0Var, wp0 wp0Var2) {
        super(wp0Var2);
        this.f30065x = wp0Var;
    }

    @Override
    public final boolean b() {
        lq0 lq0Var = this.f30065x.E0;
        if (!lq0Var.isDismissed() && lq0Var.V) {
            return !lq0Var.d.m();
        }
        return false;
    }

    @Override
    public final void e(float r9, float r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vp0.e(float, float, boolean):void");
    }

    @Override
    public final void f() {
        lq0 lq0Var = this.f30065x.E0;
        pp0 pp0Var = lq0Var.d;
        if (pp0Var == null || !pp0Var.m()) {
            int i10 = lq0Var.K0;
            AndroidUtilities.dp(20.0f);
        }
        lq0Var.f26859o0 = false;
        int i11 = lq0Var.m0;
        lq0Var.f26858n0 = i11;
        lq0Var.C.setTopGlowOffset(i11);
        lq0Var.f26843b.setTranslationY(lq0Var.m0);
        lq0Var.N.setTranslationY(lq0Var.m0);
        lq0Var.C.setTranslationY(0.0f);
        lq0Var.D.setTranslationY(0.0f);
        lq0Var.Y0();
    }

    @Override
    public final void g(int i10, boolean z4) {
        int i11;
        wp0 wp0Var = this.f30065x;
        lq0 lq0Var = wp0Var.E0;
        int i12 = lq0Var.f26858n0;
        int i13 = lq0Var.m0;
        if (i12 != i13) {
            wp0Var.f30404y0 = i12;
            wp0Var.f30405z0 = i13;
            lq0Var.f26859o0 = true;
            lq0Var.m0 = i12;
        } else {
            wp0Var.f30404y0 = -1;
        }
        int i14 = wp0Var.f30402w0;
        int i15 = wp0Var.f30403x0;
        if (i14 != i15) {
            wp0Var.A0 = 0;
            wp0Var.B0 = 0;
            lq0Var.f26859o0 = true;
            if (!z4) {
                wp0Var.B0 = 0 - (i14 - i15);
            } else {
                wp0Var.B0 = i14 - i15;
            }
            if (z4) {
                i11 = wp0Var.f30404y0;
            } else {
                i11 = wp0Var.f30405z0;
            }
            lq0Var.m0 = i11;
        } else {
            wp0Var.A0 = -1;
        }
        lq0Var.C.setTopGlowOffset((int) (lq0Var.f26861q0 + lq0Var.m0));
        lq0Var.f26843b.setTranslationY(lq0Var.f26861q0 + lq0Var.m0);
        lq0Var.N.setTranslationY(lq0Var.f26861q0 + lq0Var.m0);
        wp0Var.invalidate();
    }
}
