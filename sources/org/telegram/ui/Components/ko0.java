package org.telegram.ui.Components;

import android.view.View;
public final class ko0 extends org.telegram.ui.ActionBar.j1 {
    public final lo0 f36836x;

    public ko0(lo0 lo0Var, lo0 lo0Var2) {
        super(lo0Var2);
        this.f36836x = lo0Var;
    }

    @Override
    public final boolean b() {
        yo0 yo0Var = this.f36836x.f37167q0;
        if (!yo0Var.J && yo0Var.U1) {
            return !yo0Var.f42567o1.m();
        }
        return false;
    }

    @Override
    public final void e(float f10, float f11, boolean z10) {
        lo0 lo0Var = this.f36836x;
        yo0 yo0Var = lo0Var.f37167q0;
        int i7 = yo0.U2;
        for (int i10 = 0; i10 < yo0Var.f30192b.getChildCount(); i10++) {
            View childAt = yo0Var.f30192b.getChildAt(i10);
            if (childAt != yo0Var.f42573r1 && childAt != yo0Var.f42583w1 && childAt != yo0Var.O1[1] && childAt != yo0Var.f42587y1 && childAt != yo0Var.n1 && childAt != yo0Var.Y1 && childAt != yo0Var.f42571q1) {
                childAt.setTranslationY(f10);
            }
        }
        ao0 ao0Var = yo0Var.B1;
        yo0Var.f42570p2 = f10;
        int i11 = lo0Var.f37163l0;
        if (i11 != -1) {
            if (!z10) {
                f11 = 1.0f - f11;
            }
            float f12 = 1.0f - f11;
            int i12 = lo0Var.m0;
            yo0Var.f42563l2 = (int) ((i12 * f11) + (i11 * f12));
            float f13 = ((i11 - i12) * f12) + f10;
            ao0Var.setTranslationY(f13);
            if (z10) {
                yo0Var.C1.setTranslationY(f13);
            } else {
                yo0Var.C1.setTranslationY(f13 + yo0Var.B1.getPaddingTop());
            }
        } else {
            int i13 = lo0Var.f37164n0;
            if (i13 != -1) {
                float f14 = 1.0f - f11;
                int i14 = lo0Var.f37165o0;
                yo0Var.f42563l2 = (int) ((i14 * f11) + (i13 * f14));
                if (!z10) {
                    f14 = f11;
                }
                if (z10) {
                    ao0Var.setTranslationY(f10 - ((i13 - i14) * f11));
                } else {
                    ao0Var.setTranslationY(((i14 - i13) * f14) + f10);
                }
            }
        }
        yo0Var.B1.setTopGlowOffset((int) (yo0Var.f42563l2 + yo0Var.f42570p2));
        yo0Var.f42564m1.setTranslationY(yo0Var.f42563l2 + yo0Var.f42570p2);
        yo0Var.M1.setTranslationY(yo0Var.f42563l2 + yo0Var.f42570p2);
        yo0Var.n1.invalidate();
        yo0Var.F0 = yo0Var.f42570p2;
        yo0Var.f30195c.invalidate();
        yo0Var.a1();
        lo0Var.invalidate();
    }

    @Override
    public final void f() {
        yo0 yo0Var = this.f36836x.f37167q0;
        eo0 eo0Var = yo0Var.f42567o1;
        if (eo0Var == null || !eo0Var.m()) {
            int i7 = yo0Var.J2;
            org.telegram.messenger.g0.L(20.0f);
        }
        yo0Var.f42566n2 = false;
        int i10 = yo0Var.f42563l2;
        yo0Var.f42565m2 = i10;
        yo0Var.B1.setTopGlowOffset(i10);
        yo0Var.f42564m1.setTranslationY(yo0Var.f42563l2);
        yo0Var.M1.setTranslationY(yo0Var.f42563l2);
        yo0Var.B1.setTranslationY(0.0f);
        yo0Var.C1.setTranslationY(0.0f);
        yo0Var.a1();
    }

    @Override
    public final void g(int i7, boolean z10) {
        int i10;
        lo0 lo0Var = this.f36836x;
        yo0 yo0Var = lo0Var.f37167q0;
        int i11 = yo0Var.f42565m2;
        int i12 = yo0Var.f42563l2;
        if (i11 != i12) {
            lo0Var.f37163l0 = i11;
            lo0Var.m0 = i12;
            yo0Var.f42566n2 = true;
            yo0Var.f42563l2 = i11;
        } else {
            lo0Var.f37163l0 = -1;
        }
        int i13 = lo0Var.f37161j0;
        int i14 = lo0Var.f37162k0;
        if (i13 != i14) {
            lo0Var.f37164n0 = 0;
            lo0Var.f37165o0 = 0;
            yo0Var.f42566n2 = true;
            if (!z10) {
                lo0Var.f37165o0 = 0 - (i13 - i14);
            } else {
                lo0Var.f37165o0 = i13 - i14;
            }
            if (z10) {
                i10 = lo0Var.f37163l0;
            } else {
                i10 = lo0Var.m0;
            }
            yo0Var.f42563l2 = i10;
        } else {
            lo0Var.f37164n0 = -1;
        }
        yo0Var.B1.setTopGlowOffset((int) (yo0Var.f42570p2 + yo0Var.f42563l2));
        yo0Var.f42564m1.setTranslationY(yo0Var.f42570p2 + yo0Var.f42563l2);
        yo0Var.M1.setTranslationY(yo0Var.f42570p2 + yo0Var.f42563l2);
        lo0Var.invalidate();
    }
}
