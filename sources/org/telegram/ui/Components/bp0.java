package org.telegram.ui.Components;

import android.view.View;
public final class bp0 extends org.telegram.ui.ActionBar.m1 {
    public final cp0 f24908x;

    public bp0(cp0 cp0Var, cp0 cp0Var2) {
        super(cp0Var2);
        this.f24908x = cp0Var;
    }

    @Override
    public final boolean b() {
        pp0 pp0Var = this.f24908x.f25209p0;
        if (!pp0Var.I && pp0Var.Q1) {
            return !pp0Var.f29479k1.m();
        }
        return false;
    }

    @Override
    public final void e(float f7, float f10, boolean z10) {
        cp0 cp0Var = this.f24908x;
        pp0 pp0Var = cp0Var.f25209p0;
        int i10 = pp0.Q2;
        for (int i11 = 0; i11 < pp0Var.f21587b.getChildCount(); i11++) {
            View childAt = pp0Var.f21587b.getChildAt(i11);
            if (childAt != pp0Var.f29484n1 && childAt != pp0Var.f29494s1 && childAt != pp0Var.K1[1] && childAt != pp0Var.f29498u1 && childAt != pp0Var.f29477j1 && childAt != pp0Var.U1 && childAt != pp0Var.f29482m1) {
                childAt.setTranslationY(f7);
            }
        }
        po0 po0Var = pp0Var.f29504x1;
        pp0Var.f29481l2 = f7;
        int i12 = cp0Var.f25205k0;
        if (i12 != -1) {
            if (!z10) {
                f10 = 1.0f - f10;
            }
            float f11 = 1.0f - f10;
            int i13 = cp0Var.f25206l0;
            pp0Var.f29474h2 = (int) ((i13 * f10) + (i12 * f11));
            float f12 = ((i12 - i13) * f11) + f7;
            po0Var.setTranslationY(f12);
            if (z10) {
                pp0Var.f29506y1.setTranslationY(f12);
            } else {
                pp0Var.f29506y1.setTranslationY(f12 + pp0Var.f29504x1.getPaddingTop());
            }
        } else {
            int i14 = cp0Var.m0;
            if (i14 != -1) {
                float f13 = 1.0f - f10;
                int i15 = cp0Var.f25207n0;
                pp0Var.f29474h2 = (int) ((i15 * f10) + (i14 * f13));
                if (!z10) {
                    f13 = f10;
                }
                if (z10) {
                    po0Var.setTranslationY(f7 - ((i14 - i15) * f10));
                } else {
                    po0Var.setTranslationY(((i15 - i14) * f13) + f7);
                }
            }
        }
        pp0Var.f29504x1.setTopGlowOffset((int) (pp0Var.f29474h2 + pp0Var.f29481l2));
        pp0Var.f29475i1.setTranslationY(pp0Var.f29474h2 + pp0Var.f29481l2);
        pp0Var.I1.setTranslationY(pp0Var.f29474h2 + pp0Var.f29481l2);
        pp0Var.f29477j1.invalidate();
        pp0Var.E0 = pp0Var.f29481l2;
        pp0Var.f21590c.invalidate();
        pp0Var.Z0();
        cp0Var.invalidate();
    }

    @Override
    public final void f() {
        pp0 pp0Var = this.f24908x.f25209p0;
        uo0 uo0Var = pp0Var.f29479k1;
        if (uo0Var == null || !uo0Var.m()) {
            int i10 = pp0Var.F2;
            org.telegram.messenger.i0.L(20.0f);
        }
        pp0Var.f29478j2 = false;
        int i11 = pp0Var.f29474h2;
        pp0Var.f29476i2 = i11;
        pp0Var.f29504x1.setTopGlowOffset(i11);
        pp0Var.f29475i1.setTranslationY(pp0Var.f29474h2);
        pp0Var.I1.setTranslationY(pp0Var.f29474h2);
        pp0Var.f29504x1.setTranslationY(0.0f);
        pp0Var.f29506y1.setTranslationY(0.0f);
        pp0Var.Z0();
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        cp0 cp0Var = this.f24908x;
        pp0 pp0Var = cp0Var.f25209p0;
        int i12 = pp0Var.f29476i2;
        int i13 = pp0Var.f29474h2;
        if (i12 != i13) {
            cp0Var.f25205k0 = i12;
            cp0Var.f25206l0 = i13;
            pp0Var.f29478j2 = true;
            pp0Var.f29474h2 = i12;
        } else {
            cp0Var.f25205k0 = -1;
        }
        int i14 = cp0Var.f25203i0;
        int i15 = cp0Var.f25204j0;
        if (i14 != i15) {
            cp0Var.m0 = 0;
            cp0Var.f25207n0 = 0;
            pp0Var.f29478j2 = true;
            if (!z10) {
                cp0Var.f25207n0 = 0 - (i14 - i15);
            } else {
                cp0Var.f25207n0 = i14 - i15;
            }
            if (z10) {
                i11 = cp0Var.f25205k0;
            } else {
                i11 = cp0Var.f25206l0;
            }
            pp0Var.f29474h2 = i11;
        } else {
            cp0Var.m0 = -1;
        }
        pp0Var.f29504x1.setTopGlowOffset((int) (pp0Var.f29481l2 + pp0Var.f29474h2));
        pp0Var.f29475i1.setTranslationY(pp0Var.f29481l2 + pp0Var.f29474h2);
        pp0Var.I1.setTranslationY(pp0Var.f29481l2 + pp0Var.f29474h2);
        cp0Var.invalidate();
    }
}
