package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class nq0 extends org.telegram.ui.ActionBar.o1 {
    public final oq0 f28830x;

    public nq0(oq0 oq0Var, oq0 oq0Var2) {
        super(oq0Var2);
        this.f28830x = oq0Var;
    }

    @Override
    public final boolean b() {
        er0 er0Var = this.f28830x.H0;
        if (!er0Var.isDismissed() && er0Var.Z) {
            return !er0Var.d.m();
        }
        return false;
    }

    @Override
    public final void e(float r9, float r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nq0.e(float, float, boolean):void");
    }

    @Override
    public final void f() {
        er0 er0Var = this.f28830x.H0;
        iq0 iq0Var = er0Var.d;
        if (iq0Var == null || !iq0Var.m()) {
            int i10 = er0Var.O0;
            AndroidUtilities.dp(20.0f);
        }
        er0Var.f25999s0 = false;
        int i11 = er0Var.f25995q0;
        er0Var.f25997r0 = i11;
        er0Var.G.setTopGlowOffset(i11);
        er0Var.f25977b.setTranslationY(er0Var.f25995q0);
        er0Var.R.setTranslationY(er0Var.f25995q0);
        er0Var.G.setTranslationY(0.0f);
        er0Var.H.setTranslationY(0.0f);
        er0Var.a1();
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        oq0 oq0Var = this.f28830x;
        er0 er0Var = oq0Var.H0;
        int i12 = er0Var.f25997r0;
        int i13 = er0Var.f25995q0;
        if (i12 != i13) {
            oq0Var.B0 = i12;
            oq0Var.C0 = i13;
            er0Var.f25999s0 = true;
            er0Var.f25995q0 = i12;
        } else {
            oq0Var.B0 = -1;
        }
        int i14 = oq0Var.f29077z0;
        int i15 = oq0Var.A0;
        if (i14 != i15) {
            oq0Var.D0 = 0;
            oq0Var.E0 = 0;
            er0Var.f25999s0 = true;
            if (!z10) {
                oq0Var.E0 = 0 - (i14 - i15);
            } else {
                oq0Var.E0 = i14 - i15;
            }
            if (z10) {
                i11 = oq0Var.B0;
            } else {
                i11 = oq0Var.C0;
            }
            er0Var.f25995q0 = i11;
        } else {
            oq0Var.D0 = -1;
        }
        er0Var.G.setTopGlowOffset((int) (er0Var.f26001u0 + er0Var.f25995q0));
        er0Var.f25977b.setTranslationY(er0Var.f26001u0 + er0Var.f25995q0);
        er0Var.R.setTranslationY(er0Var.f26001u0 + er0Var.f25995q0);
        oq0Var.invalidate();
    }
}
