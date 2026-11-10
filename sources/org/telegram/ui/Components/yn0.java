package org.telegram.ui.Components;

import android.view.View;
public final class yn0 extends org.telegram.ui.ActionBar.i1 {
    public final zn0 f40625x;

    public yn0(zn0 zn0Var, zn0 zn0Var2) {
        super(zn0Var2);
        this.f40625x = zn0Var;
    }

    @Override
    public final boolean b() {
        mo0 mo0Var = this.f40625x.f41076p0;
        if (!mo0Var.I && mo0Var.T1) {
            return !mo0Var.n1.m();
        }
        return false;
    }

    @Override
    public final void e(float f10, float f11, boolean z9) {
        zn0 zn0Var = this.f40625x;
        mo0 mo0Var = zn0Var.f41076p0;
        int i7 = mo0.T2;
        for (int i10 = 0; i10 < mo0Var.f28672b.getChildCount(); i10++) {
            View childAt = mo0Var.f28672b.getChildAt(i10);
            if (childAt != mo0Var.f36045q1 && childAt != mo0Var.f36055v1 && childAt != mo0Var.N1[1] && childAt != mo0Var.f36059x1 && childAt != mo0Var.f36038m1 && childAt != mo0Var.X1 && childAt != mo0Var.f36043p1) {
                childAt.setTranslationY(f10);
            }
        }
        on0 on0Var = mo0Var.A1;
        mo0Var.f36042o2 = f10;
        int i11 = zn0Var.f41072k0;
        if (i11 != -1) {
            if (!z9) {
                f11 = 1.0f - f11;
            }
            float f12 = 1.0f - f11;
            int i12 = zn0Var.f41073l0;
            mo0Var.f36036k2 = (int) ((i12 * f11) + (i11 * f12));
            float f13 = ((i11 - i12) * f12) + f10;
            on0Var.setTranslationY(f13);
            if (z9) {
                mo0Var.B1.setTranslationY(f13);
            } else {
                mo0Var.B1.setTranslationY(f13 + mo0Var.A1.getPaddingTop());
            }
        } else {
            int i13 = zn0Var.m0;
            if (i13 != -1) {
                float f14 = 1.0f - f11;
                int i14 = zn0Var.f41074n0;
                mo0Var.f36036k2 = (int) ((i14 * f11) + (i13 * f14));
                if (!z9) {
                    f14 = f11;
                }
                if (z9) {
                    on0Var.setTranslationY(f10 - ((i13 - i14) * f11));
                } else {
                    on0Var.setTranslationY(((i14 - i13) * f14) + f10);
                }
            }
        }
        mo0Var.A1.setTopGlowOffset((int) (mo0Var.f36036k2 + mo0Var.f36042o2));
        mo0Var.l1.setTranslationY(mo0Var.f36036k2 + mo0Var.f36042o2);
        mo0Var.L1.setTranslationY(mo0Var.f36036k2 + mo0Var.f36042o2);
        mo0Var.f36038m1.invalidate();
        mo0Var.E0 = mo0Var.f36042o2;
        mo0Var.f28675c.invalidate();
        mo0Var.Z0();
        zn0Var.invalidate();
    }

    @Override
    public final void f() {
        mo0 mo0Var = this.f40625x.f41076p0;
        sn0 sn0Var = mo0Var.n1;
        if (sn0Var == null || !sn0Var.m()) {
            int i7 = mo0Var.I2;
            org.telegram.messenger.g0.L(20.0f);
        }
        mo0Var.f36039m2 = false;
        int i10 = mo0Var.f36036k2;
        mo0Var.f36037l2 = i10;
        mo0Var.A1.setTopGlowOffset(i10);
        mo0Var.l1.setTranslationY(mo0Var.f36036k2);
        mo0Var.L1.setTranslationY(mo0Var.f36036k2);
        mo0Var.A1.setTranslationY(0.0f);
        mo0Var.B1.setTranslationY(0.0f);
        mo0Var.Z0();
    }

    @Override
    public final void g(int i7, boolean z9) {
        int i10;
        zn0 zn0Var = this.f40625x;
        mo0 mo0Var = zn0Var.f41076p0;
        int i11 = mo0Var.f36037l2;
        int i12 = mo0Var.f36036k2;
        if (i11 != i12) {
            zn0Var.f41072k0 = i11;
            zn0Var.f41073l0 = i12;
            mo0Var.f36039m2 = true;
            mo0Var.f36036k2 = i11;
        } else {
            zn0Var.f41072k0 = -1;
        }
        int i13 = zn0Var.f41070i0;
        int i14 = zn0Var.f41071j0;
        if (i13 != i14) {
            zn0Var.m0 = 0;
            zn0Var.f41074n0 = 0;
            mo0Var.f36039m2 = true;
            if (!z9) {
                zn0Var.f41074n0 = 0 - (i13 - i14);
            } else {
                zn0Var.f41074n0 = i13 - i14;
            }
            if (z9) {
                i10 = zn0Var.f41072k0;
            } else {
                i10 = zn0Var.f41073l0;
            }
            mo0Var.f36036k2 = i10;
        } else {
            zn0Var.m0 = -1;
        }
        mo0Var.A1.setTopGlowOffset((int) (mo0Var.f36042o2 + mo0Var.f36036k2));
        mo0Var.l1.setTranslationY(mo0Var.f36042o2 + mo0Var.f36036k2);
        mo0Var.L1.setTranslationY(mo0Var.f36042o2 + mo0Var.f36036k2);
        zn0Var.invalidate();
    }
}
