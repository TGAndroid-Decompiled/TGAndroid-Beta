package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class nq0 extends org.telegram.ui.ActionBar.o1 {
    public final oq0 f28821x;

    public nq0(oq0 oq0Var, oq0 oq0Var2) {
        super(oq0Var2);
        this.f28821x = oq0Var;
    }

    @Override
    public final boolean b() {
        dr0 dr0Var = this.f28821x.H0;
        if (!dr0Var.isDismissed() && dr0Var.Y) {
            return !dr0Var.d.m();
        }
        return false;
    }

    @Override
    public final void e(float r9, float r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nq0.e(float, float, boolean):void");
    }

    @Override
    public final void f() {
        dr0 dr0Var = this.f28821x.H0;
        iq0 iq0Var = dr0Var.d;
        if (iq0Var == null || !iq0Var.m()) {
            int i10 = dr0Var.N0;
            AndroidUtilities.dp(20.0f);
        }
        dr0Var.f25680r0 = false;
        int i11 = dr0Var.f25677p0;
        dr0Var.f25678q0 = i11;
        dr0Var.F.setTopGlowOffset(i11);
        dr0Var.f25660b.setTranslationY(dr0Var.f25677p0);
        dr0Var.Q.setTranslationY(dr0Var.f25677p0);
        dr0Var.F.setTranslationY(0.0f);
        dr0Var.G.setTranslationY(0.0f);
        dr0Var.Z0();
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        oq0 oq0Var = this.f28821x;
        dr0 dr0Var = oq0Var.H0;
        int i12 = dr0Var.f25678q0;
        int i13 = dr0Var.f25677p0;
        if (i12 != i13) {
            oq0Var.B0 = i12;
            oq0Var.C0 = i13;
            dr0Var.f25680r0 = true;
            dr0Var.f25677p0 = i12;
        } else {
            oq0Var.B0 = -1;
        }
        int i14 = oq0Var.f29058z0;
        int i15 = oq0Var.A0;
        if (i14 != i15) {
            oq0Var.D0 = 0;
            oq0Var.E0 = 0;
            dr0Var.f25680r0 = true;
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
            dr0Var.f25677p0 = i11;
        } else {
            oq0Var.D0 = -1;
        }
        dr0Var.F.setTopGlowOffset((int) (dr0Var.f25683t0 + dr0Var.f25677p0));
        dr0Var.f25660b.setTranslationY(dr0Var.f25683t0 + dr0Var.f25677p0);
        dr0Var.Q.setTranslationY(dr0Var.f25683t0 + dr0Var.f25677p0);
        oq0Var.invalidate();
    }
}
