package org.telegram.ui.Components;
public final class ph extends org.telegram.ui.ActionBar.i1 {
    public final qh f37021x;

    public ph(qh qhVar, qh qhVar2) {
        super(qhVar2);
        this.f37021x = qhVar;
    }

    @Override
    public final boolean b() {
        gy gyVar;
        di diVar = this.f37021x.f37416k0;
        if ((!diVar.I || diVar.f32927o2) && diVar.f32921m3) {
            vh vhVar = diVar.f32942s2;
            if (vhVar == diVar.d2 || vhVar == diVar.f32893e2 || diVar.a1().m()) {
                vh vhVar2 = diVar.f32942s2;
                bn bnVar = diVar.d2;
                if (vhVar2 != bnVar || ((gyVar = bnVar.E) != null && gyVar.getVisibility() == 0)) {
                    vh vhVar3 = diVar.f32942s2;
                    bn bnVar2 = diVar.f32893e2;
                    if (vhVar3 == bnVar2) {
                        gy gyVar2 = bnVar2.E;
                        if (gyVar2 != null && gyVar2.getVisibility() == 0) {
                            return false;
                        }
                        return true;
                    }
                } else {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void e(float f10, float f11, boolean z9) {
        float f12;
        qh qhVar = this.f37021x;
        di diVar = qhVar.f37416k0;
        diVar.f32898f4 = f10;
        float f13 = diVar.X3;
        float f14 = 0.0f;
        if (f13 > 0.0f) {
            if (diVar.f32942s2 == diVar.f32923n2 && !z9) {
                f12 = f11;
            } else {
                f12 = 1.0f - f11;
            }
            diVar.f32898f4 = com.google.android.recaptcha.internal.a.z(f13, diVar.Y3, f12, f10);
        }
        diVar.R2.setTranslationY(diVar.f32898f4);
        diVar.U2.setTranslationY(diVar.f32898f4);
        org.telegram.ui.ActionBar.r0 r0Var = diVar.Y2;
        if (r0Var != null) {
            r0Var.setTranslationY(diVar.f32898f4);
        }
        org.telegram.ui.ActionBar.r0 r0Var2 = diVar.W2;
        if (r0Var2 != null) {
            r0Var2.setTranslationY(diVar.U2.getTranslationY());
        }
        fi.m3 m3Var = diVar.X2;
        if (m3Var != null) {
            m3Var.setTranslationY(diVar.U2.getTranslationY());
        }
        diVar.Z2.setTranslationY(diVar.f32898f4);
        diVar.P1(0);
        if (diVar.f32942s2 != diVar.f32923n2) {
            f14 = diVar.f32898f4;
        }
        diVar.E0 = f14;
        diVar.f28618c.invalidate();
        qhVar.invalidate();
        diVar.f32962x2.invalidate();
        diVar.J1();
        vh vhVar = diVar.f32942s2;
        if (vhVar != null) {
            vhVar.n(diVar.f32898f4, f11);
        }
    }

    @Override
    public final void f() {
        int i7;
        di diVar = this.f37021x.f37416k0;
        diVar.M1(diVar.f32942s2, 0);
        diVar.W3 = diVar.V3[0];
        diVar.f32942s2.y();
        if ((diVar.f32942s2 instanceof hi.c4) && !diVar.f32963x3) {
            if (diVar.d) {
                i7 = org.telegram.messenger.g0.L(84.0f);
            } else {
                i7 = 0;
            }
            for (int i10 = 0; i10 < diVar.f32938r2.size(); i10++) {
                ((hi.c4) diVar.f32938r2.valueAt(i10)).setMeasureOffsetY(i7);
            }
        }
    }

    @Override
    public final void g(int i7, boolean z9) {
        int i10;
        qh qhVar = this.f37021x;
        di diVar = qhVar.f37416k0;
        int i11 = diVar.W3;
        if (i11 > 0 && i11 != (i10 = diVar.V3[0]) && (z9 || diVar.f32942s2 == diVar.f32923n2)) {
            diVar.X3 = i11;
            diVar.Y3 = i10;
        } else {
            diVar.X3 = -1.0f;
        }
        qhVar.invalidate();
        dh dhVar = diVar.f32939r3;
        if ((diVar.f32942s2 instanceof hi.c4) && !diVar.f32963x3) {
            if (z9) {
                dhVar.setVisibility(8);
            } else {
                dhVar.setVisibility(0);
            }
        }
        diVar.f32942s2.z(i7, z9);
    }
}
