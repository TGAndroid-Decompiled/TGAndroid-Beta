package org.telegram.ui.Components;

import android.view.View;
public final class zn0 extends org.telegram.ui.ActionBar.i1 {
    public final ao0 f41029x;

    public zn0(ao0 ao0Var, ao0 ao0Var2) {
        super(ao0Var2);
        this.f41029x = ao0Var;
    }

    @Override
    public final boolean b() {
        no0 no0Var = this.f41029x.f31934p0;
        if (!no0Var.I && no0Var.Q1) {
            return !no0Var.f36441k1.m();
        }
        return false;
    }

    @Override
    public final void e(float f10, float f11, boolean z9) {
        ao0 ao0Var = this.f41029x;
        no0 no0Var = ao0Var.f31934p0;
        int i7 = no0.Q2;
        for (int i10 = 0; i10 < no0Var.f28624b.getChildCount(); i10++) {
            View childAt = no0Var.f28624b.getChildAt(i10);
            if (childAt != no0Var.n1 && childAt != no0Var.f36455s1 && childAt != no0Var.K1[1] && childAt != no0Var.f36459u1 && childAt != no0Var.f36439j1 && childAt != no0Var.U1 && childAt != no0Var.f36444m1) {
                childAt.setTranslationY(f10);
            }
        }
        pn0 pn0Var = no0Var.f36465x1;
        no0Var.f36443l2 = f10;
        int i11 = ao0Var.f31930k0;
        if (i11 != -1) {
            if (!z9) {
                f11 = 1.0f - f11;
            }
            float f12 = 1.0f - f11;
            int i12 = ao0Var.f31931l0;
            no0Var.f36436h2 = (int) ((i12 * f11) + (i11 * f12));
            float f13 = ((i11 - i12) * f12) + f10;
            pn0Var.setTranslationY(f13);
            if (z9) {
                no0Var.f36467y1.setTranslationY(f13);
            } else {
                no0Var.f36467y1.setTranslationY(f13 + no0Var.f36465x1.getPaddingTop());
            }
        } else {
            int i13 = ao0Var.m0;
            if (i13 != -1) {
                float f14 = 1.0f - f11;
                int i14 = ao0Var.f31932n0;
                no0Var.f36436h2 = (int) ((i14 * f11) + (i13 * f14));
                if (!z9) {
                    f14 = f11;
                }
                if (z9) {
                    pn0Var.setTranslationY(f10 - ((i13 - i14) * f11));
                } else {
                    pn0Var.setTranslationY(((i14 - i13) * f14) + f10);
                }
            }
        }
        no0Var.f36465x1.setTopGlowOffset((int) (no0Var.f36436h2 + no0Var.f36443l2));
        no0Var.f36437i1.setTranslationY(no0Var.f36436h2 + no0Var.f36443l2);
        no0Var.I1.setTranslationY(no0Var.f36436h2 + no0Var.f36443l2);
        no0Var.f36439j1.invalidate();
        no0Var.E0 = no0Var.f36443l2;
        no0Var.f28627c.invalidate();
        no0Var.Z0();
        ao0Var.invalidate();
    }

    @Override
    public final void f() {
        no0 no0Var = this.f41029x.f31934p0;
        tn0 tn0Var = no0Var.f36441k1;
        if (tn0Var == null || !tn0Var.m()) {
            int i7 = no0Var.F2;
            org.telegram.messenger.g0.L(20.0f);
        }
        no0Var.f36440j2 = false;
        int i10 = no0Var.f36436h2;
        no0Var.f36438i2 = i10;
        no0Var.f36465x1.setTopGlowOffset(i10);
        no0Var.f36437i1.setTranslationY(no0Var.f36436h2);
        no0Var.I1.setTranslationY(no0Var.f36436h2);
        no0Var.f36465x1.setTranslationY(0.0f);
        no0Var.f36467y1.setTranslationY(0.0f);
        no0Var.Z0();
    }

    @Override
    public final void g(int i7, boolean z9) {
        int i10;
        ao0 ao0Var = this.f41029x;
        no0 no0Var = ao0Var.f31934p0;
        int i11 = no0Var.f36438i2;
        int i12 = no0Var.f36436h2;
        if (i11 != i12) {
            ao0Var.f31930k0 = i11;
            ao0Var.f31931l0 = i12;
            no0Var.f36440j2 = true;
            no0Var.f36436h2 = i11;
        } else {
            ao0Var.f31930k0 = -1;
        }
        int i13 = ao0Var.f31928i0;
        int i14 = ao0Var.f31929j0;
        if (i13 != i14) {
            ao0Var.m0 = 0;
            ao0Var.f31932n0 = 0;
            no0Var.f36440j2 = true;
            if (!z9) {
                ao0Var.f31932n0 = 0 - (i13 - i14);
            } else {
                ao0Var.f31932n0 = i13 - i14;
            }
            if (z9) {
                i10 = ao0Var.f31930k0;
            } else {
                i10 = ao0Var.f31931l0;
            }
            no0Var.f36436h2 = i10;
        } else {
            ao0Var.m0 = -1;
        }
        no0Var.f36465x1.setTopGlowOffset((int) (no0Var.f36443l2 + no0Var.f36436h2));
        no0Var.f36437i1.setTranslationY(no0Var.f36443l2 + no0Var.f36436h2);
        no0Var.I1.setTranslationY(no0Var.f36443l2 + no0Var.f36436h2);
        ao0Var.invalidate();
    }
}
