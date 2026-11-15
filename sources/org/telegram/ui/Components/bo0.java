package org.telegram.ui.Components;

import android.view.View;
public final class bo0 extends org.telegram.ui.ActionBar.i1 {
    public final co0 f33333x;

    public bo0(co0 co0Var, co0 co0Var2) {
        super(co0Var2);
        this.f33333x = co0Var;
    }

    @Override
    public final boolean b() {
        po0 po0Var = this.f33333x.f33651q0;
        if (!po0Var.J && po0Var.U1) {
            return !po0Var.f38354o1.m();
        }
        return false;
    }

    @Override
    public final void e(float f10, float f11, boolean z10) {
        co0 co0Var = this.f33333x;
        po0 po0Var = co0Var.f33651q0;
        int i7 = po0.U2;
        for (int i10 = 0; i10 < po0Var.f29682b.getChildCount(); i10++) {
            View childAt = po0Var.f29682b.getChildAt(i10);
            if (childAt != po0Var.f38360r1 && childAt != po0Var.f38370w1 && childAt != po0Var.O1[1] && childAt != po0Var.f38374y1 && childAt != po0Var.n1 && childAt != po0Var.Y1 && childAt != po0Var.f38358q1) {
                childAt.setTranslationY(f10);
            }
        }
        rn0 rn0Var = po0Var.B1;
        po0Var.f38357p2 = f10;
        int i11 = co0Var.f33647l0;
        if (i11 != -1) {
            if (!z10) {
                f11 = 1.0f - f11;
            }
            float f12 = 1.0f - f11;
            int i12 = co0Var.m0;
            po0Var.f38350l2 = (int) ((i12 * f11) + (i11 * f12));
            float f13 = ((i11 - i12) * f12) + f10;
            rn0Var.setTranslationY(f13);
            if (z10) {
                po0Var.C1.setTranslationY(f13);
            } else {
                po0Var.C1.setTranslationY(f13 + po0Var.B1.getPaddingTop());
            }
        } else {
            int i13 = co0Var.f33648n0;
            if (i13 != -1) {
                float f14 = 1.0f - f11;
                int i14 = co0Var.f33649o0;
                po0Var.f38350l2 = (int) ((i14 * f11) + (i13 * f14));
                if (!z10) {
                    f14 = f11;
                }
                if (z10) {
                    rn0Var.setTranslationY(f10 - ((i13 - i14) * f11));
                } else {
                    rn0Var.setTranslationY(((i14 - i13) * f14) + f10);
                }
            }
        }
        po0Var.B1.setTopGlowOffset((int) (po0Var.f38350l2 + po0Var.f38357p2));
        po0Var.f38351m1.setTranslationY(po0Var.f38350l2 + po0Var.f38357p2);
        po0Var.M1.setTranslationY(po0Var.f38350l2 + po0Var.f38357p2);
        po0Var.n1.invalidate();
        po0Var.F0 = po0Var.f38357p2;
        po0Var.f29685c.invalidate();
        po0Var.Z0();
        co0Var.invalidate();
    }

    @Override
    public final void f() {
        po0 po0Var = this.f33333x.f33651q0;
        vn0 vn0Var = po0Var.f38354o1;
        if (vn0Var == null || !vn0Var.m()) {
            int i7 = po0Var.J2;
            org.telegram.messenger.g0.L(20.0f);
        }
        po0Var.f38353n2 = false;
        int i10 = po0Var.f38350l2;
        po0Var.f38352m2 = i10;
        po0Var.B1.setTopGlowOffset(i10);
        po0Var.f38351m1.setTranslationY(po0Var.f38350l2);
        po0Var.M1.setTranslationY(po0Var.f38350l2);
        po0Var.B1.setTranslationY(0.0f);
        po0Var.C1.setTranslationY(0.0f);
        po0Var.Z0();
    }

    @Override
    public final void g(int i7, boolean z10) {
        int i10;
        co0 co0Var = this.f33333x;
        po0 po0Var = co0Var.f33651q0;
        int i11 = po0Var.f38352m2;
        int i12 = po0Var.f38350l2;
        if (i11 != i12) {
            co0Var.f33647l0 = i11;
            co0Var.m0 = i12;
            po0Var.f38353n2 = true;
            po0Var.f38350l2 = i11;
        } else {
            co0Var.f33647l0 = -1;
        }
        int i13 = co0Var.f33645j0;
        int i14 = co0Var.f33646k0;
        if (i13 != i14) {
            co0Var.f33648n0 = 0;
            co0Var.f33649o0 = 0;
            po0Var.f38353n2 = true;
            if (!z10) {
                co0Var.f33649o0 = 0 - (i13 - i14);
            } else {
                co0Var.f33649o0 = i13 - i14;
            }
            if (z10) {
                i10 = co0Var.f33647l0;
            } else {
                i10 = co0Var.m0;
            }
            po0Var.f38350l2 = i10;
        } else {
            co0Var.f33648n0 = -1;
        }
        po0Var.B1.setTopGlowOffset((int) (po0Var.f38357p2 + po0Var.f38350l2));
        po0Var.f38351m1.setTranslationY(po0Var.f38357p2 + po0Var.f38350l2);
        po0Var.M1.setTranslationY(po0Var.f38357p2 + po0Var.f38350l2);
        co0Var.invalidate();
    }
}
