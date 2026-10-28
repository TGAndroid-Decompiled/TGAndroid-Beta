package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class xq0 extends org.telegram.ui.ActionBar.q1 {
    public final yq0 f34835x;

    public xq0(yq0 yq0Var, yq0 yq0Var2) {
        super(yq0Var2);
        this.f34835x = yq0Var;
    }

    @Override
    public final boolean b() {
        nr0 nr0Var = this.f34835x.f35153v0;
        if (!nr0Var.isDismissed() && nr0Var.Z) {
            return !nr0Var.d.m();
        }
        return false;
    }

    @Override
    public final void e(float r9, float r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xq0.e(float, float, boolean):void");
    }

    @Override
    public final void f() {
        nr0 nr0Var = this.f34835x.f35153v0;
        sq0 sq0Var = nr0Var.d;
        if (sq0Var == null || !sq0Var.m()) {
            int i10 = nr0Var.O0;
            AndroidUtilities.dp(20.0f);
        }
        nr0Var.f31053s0 = false;
        int i11 = nr0Var.f31049q0;
        nr0Var.f31051r0 = i11;
        nr0Var.G.setTopGlowOffset(i11);
        nr0Var.f31031b.setTranslationY(nr0Var.f31049q0);
        nr0Var.R.setTranslationY(nr0Var.f31049q0);
        nr0Var.G.setTranslationY(0.0f);
        nr0Var.H.setTranslationY(0.0f);
        nr0Var.b1();
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        yq0 yq0Var = this.f34835x;
        nr0 nr0Var = yq0Var.f35153v0;
        int i12 = nr0Var.f31051r0;
        int i13 = nr0Var.f31049q0;
        if (i12 != i13) {
            yq0Var.f35148q0 = i12;
            yq0Var.f35149r0 = i13;
            nr0Var.f31053s0 = true;
            nr0Var.f31049q0 = i12;
        } else {
            yq0Var.f35148q0 = -1;
        }
        int i14 = yq0Var.f35146o0;
        int i15 = yq0Var.f35147p0;
        if (i14 != i15) {
            yq0Var.f35150s0 = 0;
            yq0Var.f35151t0 = 0;
            nr0Var.f31053s0 = true;
            if (!z10) {
                yq0Var.f35151t0 = 0 - (i14 - i15);
            } else {
                yq0Var.f35151t0 = i14 - i15;
            }
            if (z10) {
                i11 = yq0Var.f35148q0;
            } else {
                i11 = yq0Var.f35149r0;
            }
            nr0Var.f31049q0 = i11;
        } else {
            yq0Var.f35150s0 = -1;
        }
        nr0Var.G.setTopGlowOffset((int) (nr0Var.f31055u0 + nr0Var.f31049q0));
        nr0Var.f31031b.setTranslationY(nr0Var.f31055u0 + nr0Var.f31049q0);
        nr0Var.R.setTranslationY(nr0Var.f31055u0 + nr0Var.f31049q0);
        yq0Var.invalidate();
    }
}
