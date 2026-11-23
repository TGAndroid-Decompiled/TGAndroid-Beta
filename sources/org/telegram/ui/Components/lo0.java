package org.telegram.ui.Components;

import android.view.View;
public final class lo0 extends org.telegram.ui.ActionBar.i1 {
    public final mo0 f37188x;

    public lo0(mo0 mo0Var, mo0 mo0Var2) {
        super(mo0Var2);
        this.f37188x = mo0Var;
    }

    @Override
    public final boolean b() {
        zo0 zo0Var = this.f37188x.f37515q0;
        if (!zo0Var.J && zo0Var.U1) {
            return !zo0Var.f42984o1.m();
        }
        return false;
    }

    @Override
    public final void e(float f10, float f11, boolean z10) {
        mo0 mo0Var = this.f37188x;
        zo0 zo0Var = mo0Var.f37515q0;
        int i7 = zo0.U2;
        for (int i10 = 0; i10 < zo0Var.f30226b.getChildCount(); i10++) {
            View childAt = zo0Var.f30226b.getChildAt(i10);
            if (childAt != zo0Var.f42990r1 && childAt != zo0Var.f43000w1 && childAt != zo0Var.O1[1] && childAt != zo0Var.f43004y1 && childAt != zo0Var.n1 && childAt != zo0Var.Y1 && childAt != zo0Var.f42988q1) {
                childAt.setTranslationY(f10);
            }
        }
        bo0 bo0Var = zo0Var.B1;
        zo0Var.f42987p2 = f10;
        int i11 = mo0Var.f37511l0;
        if (i11 != -1) {
            if (!z10) {
                f11 = 1.0f - f11;
            }
            float f12 = 1.0f - f11;
            int i12 = mo0Var.m0;
            zo0Var.f42980l2 = (int) ((i12 * f11) + (i11 * f12));
            float f13 = ((i11 - i12) * f12) + f10;
            bo0Var.setTranslationY(f13);
            if (z10) {
                zo0Var.C1.setTranslationY(f13);
            } else {
                zo0Var.C1.setTranslationY(f13 + zo0Var.B1.getPaddingTop());
            }
        } else {
            int i13 = mo0Var.f37512n0;
            if (i13 != -1) {
                float f14 = 1.0f - f11;
                int i14 = mo0Var.f37513o0;
                zo0Var.f42980l2 = (int) ((i14 * f11) + (i13 * f14));
                if (!z10) {
                    f14 = f11;
                }
                if (z10) {
                    bo0Var.setTranslationY(f10 - ((i13 - i14) * f11));
                } else {
                    bo0Var.setTranslationY(((i14 - i13) * f14) + f10);
                }
            }
        }
        zo0Var.B1.setTopGlowOffset((int) (zo0Var.f42980l2 + zo0Var.f42987p2));
        zo0Var.f42981m1.setTranslationY(zo0Var.f42980l2 + zo0Var.f42987p2);
        zo0Var.M1.setTranslationY(zo0Var.f42980l2 + zo0Var.f42987p2);
        zo0Var.n1.invalidate();
        zo0Var.F0 = zo0Var.f42987p2;
        zo0Var.f30229c.invalidate();
        zo0Var.a1();
        mo0Var.invalidate();
    }

    @Override
    public final void f() {
        zo0 zo0Var = this.f37188x.f37515q0;
        fo0 fo0Var = zo0Var.f42984o1;
        if (fo0Var == null || !fo0Var.m()) {
            int i7 = zo0Var.J2;
            org.telegram.messenger.g0.L(20.0f);
        }
        zo0Var.f42983n2 = false;
        int i10 = zo0Var.f42980l2;
        zo0Var.f42982m2 = i10;
        zo0Var.B1.setTopGlowOffset(i10);
        zo0Var.f42981m1.setTranslationY(zo0Var.f42980l2);
        zo0Var.M1.setTranslationY(zo0Var.f42980l2);
        zo0Var.B1.setTranslationY(0.0f);
        zo0Var.C1.setTranslationY(0.0f);
        zo0Var.a1();
    }

    @Override
    public final void g(int i7, boolean z10) {
        int i10;
        mo0 mo0Var = this.f37188x;
        zo0 zo0Var = mo0Var.f37515q0;
        int i11 = zo0Var.f42982m2;
        int i12 = zo0Var.f42980l2;
        if (i11 != i12) {
            mo0Var.f37511l0 = i11;
            mo0Var.m0 = i12;
            zo0Var.f42983n2 = true;
            zo0Var.f42980l2 = i11;
        } else {
            mo0Var.f37511l0 = -1;
        }
        int i13 = mo0Var.f37509j0;
        int i14 = mo0Var.f37510k0;
        if (i13 != i14) {
            mo0Var.f37512n0 = 0;
            mo0Var.f37513o0 = 0;
            zo0Var.f42983n2 = true;
            if (!z10) {
                mo0Var.f37513o0 = 0 - (i13 - i14);
            } else {
                mo0Var.f37513o0 = i13 - i14;
            }
            if (z10) {
                i10 = mo0Var.f37511l0;
            } else {
                i10 = mo0Var.m0;
            }
            zo0Var.f42980l2 = i10;
        } else {
            mo0Var.f37512n0 = -1;
        }
        zo0Var.B1.setTopGlowOffset((int) (zo0Var.f42987p2 + zo0Var.f42980l2));
        zo0Var.f42981m1.setTranslationY(zo0Var.f42987p2 + zo0Var.f42980l2);
        zo0Var.M1.setTranslationY(zo0Var.f42987p2 + zo0Var.f42980l2);
        mo0Var.invalidate();
    }
}
