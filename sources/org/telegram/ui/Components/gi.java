package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class gi extends org.telegram.ui.ActionBar.o1 {
    public final hi f26696x;

    public gi(hi hiVar, hi hiVar2) {
        super(hiVar2);
        this.f26696x = hiVar;
    }

    @Override
    public final boolean b() {
        rz rzVar;
        ri riVar = this.f26696x.B0;
        if ((!riVar.isDismissed() || riVar.f30203x0) && riVar.f30196v1) {
            ji jiVar = riVar.B0;
            if (jiVar == riVar.m0 || jiVar == riVar.f30169n0 || riVar.r1().m()) {
                ji jiVar2 = riVar.B0;
                co coVar = riVar.m0;
                if (jiVar2 != coVar || ((rzVar = coVar.E) != null && rzVar.getVisibility() == 0)) {
                    ji jiVar3 = riVar.B0;
                    co coVar2 = riVar.f30169n0;
                    if (jiVar3 == coVar2) {
                        rz rzVar2 = coVar2.E;
                        if (rzVar2 != null && rzVar2.getVisibility() == 0) {
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
    public final void e(float f7, float f10, boolean z10) {
        float f11;
        hi hiVar = this.f26696x;
        ri riVar = hiVar.B0;
        riVar.f30174o2 = f7;
        float f12 = riVar.f30151g2;
        float f13 = 0.0f;
        if (f12 > 0.0f) {
            if (riVar.B0 == riVar.f30199w0 && !z10) {
                f11 = f10;
            } else {
                f11 = 1.0f - f10;
            }
            riVar.f30174o2 = com.google.android.gms.internal.play_billing.k3.y(f12, riVar.f30154h2, f11, f7);
        }
        riVar.f30130a1.setTranslationY(riVar.f30174o2);
        riVar.f30140d1.setTranslationY(riVar.f30174o2);
        org.telegram.ui.ActionBar.u0 u0Var = riVar.f30153h1;
        if (u0Var != null) {
            u0Var.setTranslationY(riVar.f30174o2);
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = riVar.f30147f1;
        if (u0Var2 != null) {
            u0Var2.setTranslationY(riVar.f30140d1.getTranslationY());
        }
        ei.x3 x3Var = riVar.f30150g1;
        if (x3Var != null) {
            x3Var.setTranslationY(riVar.f30140d1.getTranslationY());
        }
        riVar.f30156i1.setTranslationY(riVar.f30174o2);
        riVar.i2(0);
        if (riVar.B0 != riVar.f30199w0) {
            f13 = riVar.f30174o2;
        }
        riVar.setCurrentPanTranslationY(f13);
        hiVar.invalidate();
        riVar.G0.invalidate();
        riVar.c2();
        ji jiVar = riVar.B0;
        if (jiVar != null) {
            jiVar.m(riVar.f30174o2, f10);
        }
    }

    @Override
    public final void f() {
        boolean z10;
        int i10;
        ri riVar = this.f26696x.B0;
        riVar.f2(riVar.B0, 0);
        riVar.f30148f2 = riVar.f30144e2[0];
        riVar.B0.y();
        if ((riVar.B0 instanceof gi.f4) && !riVar.G1) {
            z10 = ((org.telegram.ui.ActionBar.h3) riVar).keyboardVisible;
            if (z10) {
                i10 = AndroidUtilities.dp(84.0f);
            } else {
                i10 = 0;
            }
            for (int i11 = 0; i11 < riVar.A0.size(); i11++) {
                ((gi.f4) riVar.A0.valueAt(i11)).setMeasureOffsetY(i10);
            }
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        hi hiVar = this.f26696x;
        ri riVar = hiVar.B0;
        int i12 = riVar.f30148f2;
        if (i12 > 0 && i12 != (i11 = riVar.f30144e2[0]) && (z10 || riVar.B0 == riVar.f30199w0)) {
            riVar.f30151g2 = i12;
            riVar.f30154h2 = i11;
        } else {
            riVar.f30151g2 = -1.0f;
        }
        hiVar.invalidate();
        uh uhVar = riVar.A1;
        if ((riVar.B0 instanceof gi.f4) && !riVar.G1) {
            if (z10) {
                uhVar.setVisibility(8);
            } else {
                uhVar.setVisibility(0);
            }
        }
        riVar.B0.z(i10, z10);
    }
}
