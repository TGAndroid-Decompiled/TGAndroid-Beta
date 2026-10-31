package org.telegram.ui.Components;

import android.view.View;
public final class ap0 extends org.telegram.ui.ActionBar.m1 {
    public final bp0 f24444x;

    public ap0(bp0 bp0Var, bp0 bp0Var2) {
        super(bp0Var2);
        this.f24444x = bp0Var;
    }

    @Override
    public final boolean b() {
        op0 op0Var = this.f24444x.f24865p0;
        if (!op0Var.I && op0Var.Q1) {
            return !op0Var.f29124k1.m();
        }
        return false;
    }

    @Override
    public final void e(float f7, float f10, boolean z10) {
        bp0 bp0Var = this.f24444x;
        op0 op0Var = bp0Var.f24865p0;
        int i10 = op0.Q2;
        for (int i11 = 0; i11 < op0Var.f21586b.getChildCount(); i11++) {
            View childAt = op0Var.f21586b.getChildAt(i11);
            if (childAt != op0Var.f29129n1 && childAt != op0Var.f29139s1 && childAt != op0Var.K1[1] && childAt != op0Var.f29143u1 && childAt != op0Var.f29122j1 && childAt != op0Var.U1 && childAt != op0Var.f29127m1) {
                childAt.setTranslationY(f7);
            }
        }
        oo0 oo0Var = op0Var.f29149x1;
        op0Var.f29126l2 = f7;
        int i12 = bp0Var.f24861k0;
        if (i12 != -1) {
            if (!z10) {
                f10 = 1.0f - f10;
            }
            float f11 = 1.0f - f10;
            int i13 = bp0Var.f24862l0;
            op0Var.f29119h2 = (int) ((i13 * f10) + (i12 * f11));
            float f12 = ((i12 - i13) * f11) + f7;
            oo0Var.setTranslationY(f12);
            if (z10) {
                op0Var.f29151y1.setTranslationY(f12);
            } else {
                op0Var.f29151y1.setTranslationY(f12 + op0Var.f29149x1.getPaddingTop());
            }
        } else {
            int i14 = bp0Var.m0;
            if (i14 != -1) {
                float f13 = 1.0f - f10;
                int i15 = bp0Var.f24863n0;
                op0Var.f29119h2 = (int) ((i15 * f10) + (i14 * f13));
                if (!z10) {
                    f13 = f10;
                }
                if (z10) {
                    oo0Var.setTranslationY(f7 - ((i14 - i15) * f10));
                } else {
                    oo0Var.setTranslationY(((i15 - i14) * f13) + f7);
                }
            }
        }
        op0Var.f29149x1.setTopGlowOffset((int) (op0Var.f29119h2 + op0Var.f29126l2));
        op0Var.f29120i1.setTranslationY(op0Var.f29119h2 + op0Var.f29126l2);
        op0Var.I1.setTranslationY(op0Var.f29119h2 + op0Var.f29126l2);
        op0Var.f29122j1.invalidate();
        op0Var.E0 = op0Var.f29126l2;
        op0Var.f21589c.invalidate();
        op0Var.Z0();
        bp0Var.invalidate();
    }

    @Override
    public final void f() {
        op0 op0Var = this.f24444x.f24865p0;
        to0 to0Var = op0Var.f29124k1;
        if (to0Var == null || !to0Var.m()) {
            int i10 = op0Var.F2;
            org.telegram.messenger.i0.L(20.0f);
        }
        op0Var.f29123j2 = false;
        int i11 = op0Var.f29119h2;
        op0Var.f29121i2 = i11;
        op0Var.f29149x1.setTopGlowOffset(i11);
        op0Var.f29120i1.setTranslationY(op0Var.f29119h2);
        op0Var.I1.setTranslationY(op0Var.f29119h2);
        op0Var.f29149x1.setTranslationY(0.0f);
        op0Var.f29151y1.setTranslationY(0.0f);
        op0Var.Z0();
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        bp0 bp0Var = this.f24444x;
        op0 op0Var = bp0Var.f24865p0;
        int i12 = op0Var.f29121i2;
        int i13 = op0Var.f29119h2;
        if (i12 != i13) {
            bp0Var.f24861k0 = i12;
            bp0Var.f24862l0 = i13;
            op0Var.f29123j2 = true;
            op0Var.f29119h2 = i12;
        } else {
            bp0Var.f24861k0 = -1;
        }
        int i14 = bp0Var.f24859i0;
        int i15 = bp0Var.f24860j0;
        if (i14 != i15) {
            bp0Var.m0 = 0;
            bp0Var.f24863n0 = 0;
            op0Var.f29123j2 = true;
            if (!z10) {
                bp0Var.f24863n0 = 0 - (i14 - i15);
            } else {
                bp0Var.f24863n0 = i14 - i15;
            }
            if (z10) {
                i11 = bp0Var.f24861k0;
            } else {
                i11 = bp0Var.f24862l0;
            }
            op0Var.f29119h2 = i11;
        } else {
            bp0Var.m0 = -1;
        }
        op0Var.f29149x1.setTopGlowOffset((int) (op0Var.f29126l2 + op0Var.f29119h2));
        op0Var.f29120i1.setTranslationY(op0Var.f29126l2 + op0Var.f29119h2);
        op0Var.I1.setTranslationY(op0Var.f29126l2 + op0Var.f29119h2);
        bp0Var.invalidate();
    }
}
