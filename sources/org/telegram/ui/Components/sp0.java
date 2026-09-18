package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class sp0 extends org.telegram.ui.ActionBar.q1 {
    public final tp0 f27907x;

    public sp0(tp0 tp0Var, tp0 tp0Var2) {
        super(tp0Var2);
        this.f27907x = tp0Var;
    }

    @Override
    public final boolean b() {
        iq0 iq0Var = this.f27907x.H0;
        if (!iq0Var.isDismissed() && iq0Var.Y) {
            return !iq0Var.d.m();
        }
        return false;
    }

    @Override
    public final void e(float r9, float r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sp0.e(float, float, boolean):void");
    }

    @Override
    public final void f() {
        iq0 iq0Var = this.f27907x.H0;
        np0 np0Var = iq0Var.d;
        if (np0Var == null || !np0Var.m()) {
            int i10 = iq0Var.N0;
            AndroidUtilities.dp(20.0f);
        }
        iq0Var.f25008r0 = false;
        int i11 = iq0Var.f25005p0;
        iq0Var.f25006q0 = i11;
        iq0Var.F.setTopGlowOffset(i11);
        iq0Var.f24988b.setTranslationY(iq0Var.f25005p0);
        iq0Var.Q.setTranslationY(iq0Var.f25005p0);
        iq0Var.F.setTranslationY(0.0f);
        iq0Var.G.setTranslationY(0.0f);
        iq0Var.Y0();
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        tp0 tp0Var = this.f27907x;
        iq0 iq0Var = tp0Var.H0;
        int i12 = iq0Var.f25006q0;
        int i13 = iq0Var.f25005p0;
        if (i12 != i13) {
            tp0Var.B0 = i12;
            tp0Var.C0 = i13;
            iq0Var.f25008r0 = true;
            iq0Var.f25005p0 = i12;
        } else {
            tp0Var.B0 = -1;
        }
        int i14 = tp0Var.f28184z0;
        int i15 = tp0Var.A0;
        if (i14 != i15) {
            tp0Var.D0 = 0;
            tp0Var.E0 = 0;
            iq0Var.f25008r0 = true;
            if (!z10) {
                tp0Var.E0 = 0 - (i14 - i15);
            } else {
                tp0Var.E0 = i14 - i15;
            }
            if (z10) {
                i11 = tp0Var.B0;
            } else {
                i11 = tp0Var.C0;
            }
            iq0Var.f25005p0 = i11;
        } else {
            tp0Var.D0 = -1;
        }
        iq0Var.F.setTopGlowOffset((int) (iq0Var.f25011t0 + iq0Var.f25005p0));
        iq0Var.f24988b.setTranslationY(iq0Var.f25011t0 + iq0Var.f25005p0);
        iq0Var.Q.setTranslationY(iq0Var.f25011t0 + iq0Var.f25005p0);
        tp0Var.invalidate();
    }
}
