package org.telegram.ui.Components;

import android.view.View;
public final class ao0 extends org.telegram.ui.ActionBar.h1 {
    public final bo0 f31959x;

    public ao0(bo0 bo0Var, bo0 bo0Var2) {
        super(bo0Var2);
        this.f31959x = bo0Var;
    }

    @Override
    public final boolean b() {
        oo0 oo0Var = this.f31959x.f32343q0;
        if (!oo0Var.J && oo0Var.R1) {
            return !oo0Var.f36886l1.m();
        }
        return false;
    }

    @Override
    public final void e(float f10, float f11, boolean z10) {
        bo0 bo0Var = this.f31959x;
        oo0 oo0Var = bo0Var.f32343q0;
        int i3 = oo0.R2;
        for (int i10 = 0; i10 < oo0Var.f28586b.getChildCount(); i10++) {
            View childAt = oo0Var.f28586b.getChildAt(i10);
            if (childAt != oo0Var.f36891o1 && childAt != oo0Var.f36901t1 && childAt != oo0Var.L1[1] && childAt != oo0Var.f36905v1 && childAt != oo0Var.k1 && childAt != oo0Var.V1 && childAt != oo0Var.f36889n1) {
                childAt.setTranslationY(f10);
            }
        }
        qn0 qn0Var = oo0Var.f36911y1;
        oo0Var.f36888m2 = f10;
        int i11 = bo0Var.f32339l0;
        if (i11 != -1) {
            if (!z10) {
                f11 = 1.0f - f11;
            }
            float f12 = 1.0f - f11;
            int i12 = bo0Var.m0;
            oo0Var.f36882i2 = (int) ((i12 * f11) + (i11 * f12));
            float f13 = ((i11 - i12) * f12) + f10;
            qn0Var.setTranslationY(f13);
            if (z10) {
                oo0Var.f36913z1.setTranslationY(f13);
            } else {
                oo0Var.f36913z1.setTranslationY(f13 + oo0Var.f36911y1.getPaddingTop());
            }
        } else {
            int i13 = bo0Var.f32340n0;
            if (i13 != -1) {
                float f14 = 1.0f - f11;
                int i14 = bo0Var.f32341o0;
                oo0Var.f36882i2 = (int) ((i14 * f11) + (i13 * f14));
                if (!z10) {
                    f14 = f11;
                }
                if (z10) {
                    qn0Var.setTranslationY(f10 - ((i13 - i14) * f11));
                } else {
                    qn0Var.setTranslationY(((i14 - i13) * f14) + f10);
                }
            }
        }
        oo0Var.f36911y1.setTopGlowOffset((int) (oo0Var.f36882i2 + oo0Var.f36888m2));
        oo0Var.f36883j1.setTranslationY(oo0Var.f36882i2 + oo0Var.f36888m2);
        oo0Var.J1.setTranslationY(oo0Var.f36882i2 + oo0Var.f36888m2);
        oo0Var.k1.invalidate();
        oo0Var.F0 = oo0Var.f36888m2;
        oo0Var.f28589c.invalidate();
        oo0Var.Z0();
        bo0Var.invalidate();
    }

    @Override
    public final void f() {
        oo0 oo0Var = this.f31959x.f32343q0;
        un0 un0Var = oo0Var.f36886l1;
        if (un0Var == null || !un0Var.m()) {
            int i3 = oo0Var.G2;
            org.telegram.messenger.g0.L(20.0f);
        }
        oo0Var.f36885k2 = false;
        int i10 = oo0Var.f36882i2;
        oo0Var.f36884j2 = i10;
        oo0Var.f36911y1.setTopGlowOffset(i10);
        oo0Var.f36883j1.setTranslationY(oo0Var.f36882i2);
        oo0Var.J1.setTranslationY(oo0Var.f36882i2);
        oo0Var.f36911y1.setTranslationY(0.0f);
        oo0Var.f36913z1.setTranslationY(0.0f);
        oo0Var.Z0();
    }

    @Override
    public final void g(int i3, boolean z10) {
        int i10;
        bo0 bo0Var = this.f31959x;
        oo0 oo0Var = bo0Var.f32343q0;
        int i11 = oo0Var.f36884j2;
        int i12 = oo0Var.f36882i2;
        if (i11 != i12) {
            bo0Var.f32339l0 = i11;
            bo0Var.m0 = i12;
            oo0Var.f36885k2 = true;
            oo0Var.f36882i2 = i11;
        } else {
            bo0Var.f32339l0 = -1;
        }
        int i13 = bo0Var.f32337j0;
        int i14 = bo0Var.f32338k0;
        if (i13 != i14) {
            bo0Var.f32340n0 = 0;
            bo0Var.f32341o0 = 0;
            oo0Var.f36885k2 = true;
            if (!z10) {
                bo0Var.f32341o0 = 0 - (i13 - i14);
            } else {
                bo0Var.f32341o0 = i13 - i14;
            }
            if (z10) {
                i10 = bo0Var.f32339l0;
            } else {
                i10 = bo0Var.m0;
            }
            oo0Var.f36882i2 = i10;
        } else {
            bo0Var.f32340n0 = -1;
        }
        oo0Var.f36911y1.setTopGlowOffset((int) (oo0Var.f36888m2 + oo0Var.f36882i2));
        oo0Var.f36883j1.setTranslationY(oo0Var.f36888m2 + oo0Var.f36882i2);
        oo0Var.J1.setTranslationY(oo0Var.f36888m2 + oo0Var.f36882i2);
        bo0Var.invalidate();
    }
}
