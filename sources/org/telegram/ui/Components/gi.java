package org.telegram.ui.Components;
public final class gi extends org.telegram.ui.ActionBar.i1 {
    public final hi f35579x;

    public gi(hi hiVar, hi hiVar2) {
        super(hiVar2);
        this.f35579x = hiVar;
    }

    @Override
    public final boolean b() {
        ty tyVar;
        ui uiVar = this.f35579x.f35904l0;
        if ((!uiVar.J || uiVar.f40424s2) && uiVar.f40417q3) {
            mi miVar = uiVar.f40440w2;
            if (miVar == uiVar.f40387h2 || miVar == uiVar.f40390i2 || uiVar.b1().m()) {
                mi miVar2 = uiVar.f40440w2;
                tn tnVar = uiVar.f40387h2;
                if (miVar2 != tnVar || ((tyVar = tnVar.F) != null && tyVar.getVisibility() == 0)) {
                    mi miVar3 = uiVar.f40440w2;
                    tn tnVar2 = uiVar.f40390i2;
                    if (miVar3 == tnVar2) {
                        ty tyVar2 = tnVar2.F;
                        if (tyVar2 != null && tyVar2.getVisibility() == 0) {
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
    public final void e(float f10, float f11, boolean z10) {
        float f12;
        hi hiVar = this.f35579x;
        ui uiVar = hiVar.f35904l0;
        uiVar.f40394j4 = f10;
        float f13 = uiVar.f40372b4;
        float f14 = 0.0f;
        if (f13 > 0.0f) {
            if (uiVar.f40440w2 == uiVar.f40420r2 && !z10) {
                f12 = f11;
            } else {
                f12 = 1.0f - f11;
            }
            uiVar.f40394j4 = com.google.android.gms.internal.vision.e2.z(f13, uiVar.f40375c4, f12, f10);
        }
        uiVar.V2.setTranslationY(uiVar.f40394j4);
        uiVar.Y2.setTranslationY(uiVar.f40394j4);
        org.telegram.ui.ActionBar.q0 q0Var = uiVar.f40374c3;
        if (q0Var != null) {
            q0Var.setTranslationY(uiVar.f40394j4);
        }
        org.telegram.ui.ActionBar.q0 q0Var2 = uiVar.f40368a3;
        if (q0Var2 != null) {
            q0Var2.setTranslationY(uiVar.Y2.getTranslationY());
        }
        hi.l3 l3Var = uiVar.f40371b3;
        if (l3Var != null) {
            l3Var.setTranslationY(uiVar.Y2.getTranslationY());
        }
        uiVar.f40376d3.setTranslationY(uiVar.f40394j4);
        uiVar.Q1(0);
        if (uiVar.f40440w2 != uiVar.f40420r2) {
            f14 = uiVar.f40394j4;
        }
        uiVar.F0 = f14;
        uiVar.f30179c.invalidate();
        hiVar.invalidate();
        uiVar.B2.invalidate();
        uiVar.K1();
        mi miVar = uiVar.f40440w2;
        if (miVar != null) {
            miVar.n(uiVar.f40394j4, f11);
        }
    }

    @Override
    public final void f() {
        int i7;
        ui uiVar = this.f35579x.f35904l0;
        uiVar.N1(uiVar.f40440w2, 0);
        uiVar.f40369a4 = uiVar.Z3[0];
        uiVar.f40440w2.y();
        if ((uiVar.f40440w2 instanceof ki.s3) && !uiVar.B3) {
            if (uiVar.d) {
                i7 = org.telegram.messenger.g0.L(84.0f);
            } else {
                i7 = 0;
            }
            for (int i10 = 0; i10 < uiVar.f40436v2.size(); i10++) {
                ((ki.s3) uiVar.f40436v2.valueAt(i10)).setMeasureOffsetY(i7);
            }
        }
    }

    @Override
    public final void g(int i7, boolean z10) {
        int i10;
        hi hiVar = this.f35579x;
        ui uiVar = hiVar.f35904l0;
        int i11 = uiVar.f40369a4;
        if (i11 > 0 && i11 != (i10 = uiVar.Z3[0]) && (z10 || uiVar.f40440w2 == uiVar.f40420r2)) {
            uiVar.f40372b4 = i11;
            uiVar.f40375c4 = i10;
        } else {
            uiVar.f40372b4 = -1.0f;
        }
        hiVar.invalidate();
        uh uhVar = uiVar.f40437v3;
        if ((uiVar.f40440w2 instanceof ki.s3) && !uiVar.B3) {
            if (z10) {
                uhVar.setVisibility(8);
            } else {
                uhVar.setVisibility(0);
            }
        }
        uiVar.f40440w2.z(i7, z10);
    }
}
