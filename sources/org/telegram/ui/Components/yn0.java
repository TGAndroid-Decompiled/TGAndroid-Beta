package org.telegram.ui.Components;

import android.view.View;
public final class yn0 extends org.telegram.ui.ActionBar.i1 {
    public final zn0 f40724x;

    public yn0(zn0 zn0Var, zn0 zn0Var2) {
        super(zn0Var2);
        this.f40724x = zn0Var;
    }

    @Override
    public final boolean b() {
        mo0 mo0Var = this.f40724x.f41109p0;
        if (!mo0Var.I && mo0Var.Q1) {
            return !mo0Var.f36047k1.m();
        }
        return false;
    }

    @Override
    public final void e(float f10, float f11, boolean z9) {
        zn0 zn0Var = this.f40724x;
        mo0 mo0Var = zn0Var.f41109p0;
        int i7 = mo0.Q2;
        for (int i10 = 0; i10 < mo0Var.f28619b.getChildCount(); i10++) {
            View childAt = mo0Var.f28619b.getChildAt(i10);
            if (childAt != mo0Var.n1 && childAt != mo0Var.f36061s1 && childAt != mo0Var.K1[1] && childAt != mo0Var.f36065u1 && childAt != mo0Var.f36045j1 && childAt != mo0Var.U1 && childAt != mo0Var.f36050m1) {
                childAt.setTranslationY(f10);
            }
        }
        on0 on0Var = mo0Var.f36071x1;
        mo0Var.f36049l2 = f10;
        int i11 = zn0Var.f41105k0;
        if (i11 != -1) {
            if (!z9) {
                f11 = 1.0f - f11;
            }
            float f12 = 1.0f - f11;
            int i12 = zn0Var.f41106l0;
            mo0Var.f36042h2 = (int) ((i12 * f11) + (i11 * f12));
            float f13 = ((i11 - i12) * f12) + f10;
            on0Var.setTranslationY(f13);
            if (z9) {
                mo0Var.f36073y1.setTranslationY(f13);
            } else {
                mo0Var.f36073y1.setTranslationY(f13 + mo0Var.f36071x1.getPaddingTop());
            }
        } else {
            int i13 = zn0Var.m0;
            if (i13 != -1) {
                float f14 = 1.0f - f11;
                int i14 = zn0Var.f41107n0;
                mo0Var.f36042h2 = (int) ((i14 * f11) + (i13 * f14));
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
        mo0Var.f36071x1.setTopGlowOffset((int) (mo0Var.f36042h2 + mo0Var.f36049l2));
        mo0Var.f36043i1.setTranslationY(mo0Var.f36042h2 + mo0Var.f36049l2);
        mo0Var.I1.setTranslationY(mo0Var.f36042h2 + mo0Var.f36049l2);
        mo0Var.f36045j1.invalidate();
        mo0Var.E0 = mo0Var.f36049l2;
        mo0Var.f28622c.invalidate();
        mo0Var.Z0();
        zn0Var.invalidate();
    }

    @Override
    public final void f() {
        mo0 mo0Var = this.f40724x.f41109p0;
        sn0 sn0Var = mo0Var.f36047k1;
        if (sn0Var == null || !sn0Var.m()) {
            int i7 = mo0Var.F2;
            org.telegram.messenger.g0.L(20.0f);
        }
        mo0Var.f36046j2 = false;
        int i10 = mo0Var.f36042h2;
        mo0Var.f36044i2 = i10;
        mo0Var.f36071x1.setTopGlowOffset(i10);
        mo0Var.f36043i1.setTranslationY(mo0Var.f36042h2);
        mo0Var.I1.setTranslationY(mo0Var.f36042h2);
        mo0Var.f36071x1.setTranslationY(0.0f);
        mo0Var.f36073y1.setTranslationY(0.0f);
        mo0Var.Z0();
    }

    @Override
    public final void g(int i7, boolean z9) {
        int i10;
        zn0 zn0Var = this.f40724x;
        mo0 mo0Var = zn0Var.f41109p0;
        int i11 = mo0Var.f36044i2;
        int i12 = mo0Var.f36042h2;
        if (i11 != i12) {
            zn0Var.f41105k0 = i11;
            zn0Var.f41106l0 = i12;
            mo0Var.f36046j2 = true;
            mo0Var.f36042h2 = i11;
        } else {
            zn0Var.f41105k0 = -1;
        }
        int i13 = zn0Var.f41103i0;
        int i14 = zn0Var.f41104j0;
        if (i13 != i14) {
            zn0Var.m0 = 0;
            zn0Var.f41107n0 = 0;
            mo0Var.f36046j2 = true;
            if (!z9) {
                zn0Var.f41107n0 = 0 - (i13 - i14);
            } else {
                zn0Var.f41107n0 = i13 - i14;
            }
            if (z9) {
                i10 = zn0Var.f41105k0;
            } else {
                i10 = zn0Var.f41106l0;
            }
            mo0Var.f36042h2 = i10;
        } else {
            zn0Var.m0 = -1;
        }
        mo0Var.f36071x1.setTopGlowOffset((int) (mo0Var.f36049l2 + mo0Var.f36042h2));
        mo0Var.f36043i1.setTranslationY(mo0Var.f36049l2 + mo0Var.f36042h2);
        mo0Var.I1.setTranslationY(mo0Var.f36049l2 + mo0Var.f36042h2);
        zn0Var.invalidate();
    }
}
