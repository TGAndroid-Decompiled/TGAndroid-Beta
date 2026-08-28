package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class bp0 extends org.telegram.ui.ActionBar.q1 {
    public final cp0 f27265x;

    public bp0(cp0 cp0Var, cp0 cp0Var2) {
        super(cp0Var2);
        this.f27265x = cp0Var;
    }

    @Override
    public final boolean b() {
        rp0 rp0Var = this.f27265x.D0;
        if (!rp0Var.isDismissed() && rp0Var.U) {
            return !rp0Var.d.m();
        }
        return false;
    }

    @Override
    public final void e(float r9, float r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bp0.e(float, float, boolean):void");
    }

    @Override
    public final void f() {
        rp0 rp0Var = this.f27265x.D0;
        vo0 vo0Var = rp0Var.d;
        if (vo0Var == null || !vo0Var.m()) {
            int i9 = rp0Var.J0;
            AndroidUtilities.dp(20.0f);
        }
        rp0Var.f32258n0 = false;
        int i10 = rp0Var.f32256l0;
        rp0Var.m0 = i10;
        rp0Var.B.setTopGlowOffset(i10);
        rp0Var.f32242b.setTranslationY(rp0Var.f32256l0);
        rp0Var.M.setTranslationY(rp0Var.f32256l0);
        rp0Var.B.setTranslationY(0.0f);
        rp0Var.C.setTranslationY(0.0f);
        rp0Var.Y0();
    }

    @Override
    public final void g(int i9, boolean z10) {
        int i10;
        cp0 cp0Var = this.f27265x;
        rp0 rp0Var = cp0Var.D0;
        int i11 = rp0Var.m0;
        int i12 = rp0Var.f32256l0;
        if (i11 != i12) {
            cp0Var.f27539x0 = i11;
            cp0Var.f27540y0 = i12;
            rp0Var.f32258n0 = true;
            rp0Var.f32256l0 = i11;
        } else {
            cp0Var.f27539x0 = -1;
        }
        int i13 = cp0Var.f27537v0;
        int i14 = cp0Var.f27538w0;
        if (i13 != i14) {
            cp0Var.f27541z0 = 0;
            cp0Var.A0 = 0;
            rp0Var.f32258n0 = true;
            if (!z10) {
                cp0Var.A0 = 0 - (i13 - i14);
            } else {
                cp0Var.A0 = i13 - i14;
            }
            if (z10) {
                i10 = cp0Var.f27539x0;
            } else {
                i10 = cp0Var.f27540y0;
            }
            rp0Var.f32256l0 = i10;
        } else {
            cp0Var.f27541z0 = -1;
        }
        rp0Var.B.setTopGlowOffset((int) (rp0Var.f32260p0 + rp0Var.f32256l0));
        rp0Var.f32242b.setTranslationY(rp0Var.f32260p0 + rp0Var.f32256l0);
        rp0Var.M.setTranslationY(rp0Var.f32260p0 + rp0Var.f32256l0);
        cp0Var.invalidate();
    }
}
