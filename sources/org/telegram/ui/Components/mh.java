package org.telegram.ui.Components;
public final class mh extends org.telegram.ui.ActionBar.h1 {
    public final oh f36153x;

    public mh(oh ohVar, oh ohVar2) {
        super(ohVar2);
        this.f36153x = ohVar;
    }

    @Override
    public final boolean b() {
        ey eyVar;
        bi biVar = this.f36153x.f36835l0;
        if ((!biVar.J || biVar.f32259p2) && biVar.f32253n3) {
            th thVar = biVar.f32275t2;
            if (thVar == biVar.f32223e2 || thVar == biVar.f32226f2 || biVar.a1().m()) {
                th thVar2 = biVar.f32275t2;
                an anVar = biVar.f32223e2;
                if (thVar2 != anVar || ((eyVar = anVar.F) != null && eyVar.getVisibility() == 0)) {
                    th thVar3 = biVar.f32275t2;
                    an anVar2 = biVar.f32226f2;
                    if (thVar3 == anVar2) {
                        ey eyVar2 = anVar2.F;
                        if (eyVar2 != null && eyVar2.getVisibility() == 0) {
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
        oh ohVar = this.f36153x;
        bi biVar = ohVar.f36835l0;
        biVar.f32231g4 = f10;
        float f13 = biVar.Y3;
        float f14 = 0.0f;
        if (f13 > 0.0f) {
            if (biVar.f32275t2 == biVar.f32255o2 && !z10) {
                f12 = f11;
            } else {
                f12 = 1.0f - f11;
            }
            biVar.f32231g4 = com.google.android.recaptcha.internal.a.y(f13, biVar.Z3, f12, f10);
        }
        biVar.S2.setTranslationY(biVar.f32231g4);
        biVar.V2.setTranslationY(biVar.f32231g4);
        org.telegram.ui.ActionBar.q0 q0Var = biVar.Z2;
        if (q0Var != null) {
            q0Var.setTranslationY(biVar.f32231g4);
        }
        org.telegram.ui.ActionBar.q0 q0Var2 = biVar.X2;
        if (q0Var2 != null) {
            q0Var2.setTranslationY(biVar.V2.getTranslationY());
        }
        gi.l3 l3Var = biVar.Y2;
        if (l3Var != null) {
            l3Var.setTranslationY(biVar.V2.getTranslationY());
        }
        biVar.f32213a3.setTranslationY(biVar.f32231g4);
        biVar.P1(0);
        if (biVar.f32275t2 != biVar.f32255o2) {
            f14 = biVar.f32231g4;
        }
        biVar.F0 = f14;
        biVar.f28589c.invalidate();
        ohVar.invalidate();
        biVar.f32295y2.invalidate();
        biVar.J1();
        th thVar = biVar.f32275t2;
        if (thVar != null) {
            thVar.n(biVar.f32231g4, f11);
        }
    }

    @Override
    public final void f() {
        int i3;
        bi biVar = this.f36153x.f36835l0;
        biVar.M1(biVar.f32275t2, 0);
        biVar.X3 = biVar.W3[0];
        biVar.f32275t2.y();
        if ((biVar.f32275t2 instanceof ii.d4) && !biVar.f32296y3) {
            if (biVar.d) {
                i3 = org.telegram.messenger.g0.L(84.0f);
            } else {
                i3 = 0;
            }
            for (int i10 = 0; i10 < biVar.f32271s2.size(); i10++) {
                ((ii.d4) biVar.f32271s2.valueAt(i10)).setMeasureOffsetY(i3);
            }
        }
    }

    @Override
    public final void g(int i3, boolean z10) {
        int i10;
        oh ohVar = this.f36153x;
        bi biVar = ohVar.f36835l0;
        int i11 = biVar.X3;
        if (i11 > 0 && i11 != (i10 = biVar.W3[0]) && (z10 || biVar.f32275t2 == biVar.f32255o2)) {
            biVar.Y3 = i11;
            biVar.Z3 = i10;
        } else {
            biVar.Y3 = -1.0f;
        }
        ohVar.invalidate();
        ah ahVar = biVar.f32272s3;
        if ((biVar.f32275t2 instanceof ii.d4) && !biVar.f32296y3) {
            if (z10) {
                ahVar.setVisibility(8);
            } else {
                ahVar.setVisibility(0);
            }
        }
        biVar.f32275t2.z(i3, z10);
    }
}
