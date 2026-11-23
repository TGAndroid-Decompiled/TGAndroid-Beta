package org.telegram.ui.Components;
public final class fi extends org.telegram.ui.ActionBar.i1 {
    public final gi f35139x;

    public fi(gi giVar, gi giVar2) {
        super(giVar2);
        this.f35139x = giVar;
    }

    @Override
    public final boolean b() {
        qy qyVar;
        ti tiVar = this.f35139x.f35439l0;
        if ((!tiVar.J || tiVar.f40013s2) && tiVar.f40006q3) {
            li liVar = tiVar.f40029w2;
            if (liVar == tiVar.f39976h2 || liVar == tiVar.f39979i2 || tiVar.b1().m()) {
                li liVar2 = tiVar.f40029w2;
                qn qnVar = tiVar.f39976h2;
                if (liVar2 != qnVar || ((qyVar = qnVar.F) != null && qyVar.getVisibility() == 0)) {
                    li liVar3 = tiVar.f40029w2;
                    qn qnVar2 = tiVar.f39979i2;
                    if (liVar3 == qnVar2) {
                        qy qyVar2 = qnVar2.F;
                        if (qyVar2 != null && qyVar2.getVisibility() == 0) {
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
        gi giVar = this.f35139x;
        ti tiVar = giVar.f35439l0;
        tiVar.f39983j4 = f10;
        float f13 = tiVar.f39961b4;
        float f14 = 0.0f;
        if (f13 > 0.0f) {
            if (tiVar.f40029w2 == tiVar.f40009r2 && !z10) {
                f12 = f11;
            } else {
                f12 = 1.0f - f11;
            }
            tiVar.f39983j4 = com.google.android.gms.internal.vision.e2.z(f13, tiVar.f39964c4, f12, f10);
        }
        tiVar.V2.setTranslationY(tiVar.f39983j4);
        tiVar.Y2.setTranslationY(tiVar.f39983j4);
        org.telegram.ui.ActionBar.q0 q0Var = tiVar.f39963c3;
        if (q0Var != null) {
            q0Var.setTranslationY(tiVar.f39983j4);
        }
        org.telegram.ui.ActionBar.q0 q0Var2 = tiVar.f39957a3;
        if (q0Var2 != null) {
            q0Var2.setTranslationY(tiVar.Y2.getTranslationY());
        }
        hi.u3 u3Var = tiVar.f39960b3;
        if (u3Var != null) {
            u3Var.setTranslationY(tiVar.Y2.getTranslationY());
        }
        tiVar.f39965d3.setTranslationY(tiVar.f39983j4);
        tiVar.Q1(0);
        if (tiVar.f40029w2 != tiVar.f40009r2) {
            f14 = tiVar.f39983j4;
        }
        tiVar.F0 = f14;
        tiVar.f30229c.invalidate();
        giVar.invalidate();
        tiVar.B2.invalidate();
        tiVar.K1();
        li liVar = tiVar.f40029w2;
        if (liVar != null) {
            liVar.n(tiVar.f39983j4, f11);
        }
    }

    @Override
    public final void f() {
        int i7;
        ti tiVar = this.f35139x.f35439l0;
        tiVar.N1(tiVar.f40029w2, 0);
        tiVar.f39958a4 = tiVar.Z3[0];
        tiVar.f40029w2.y();
        if ((tiVar.f40029w2 instanceof ki.t3) && !tiVar.B3) {
            if (tiVar.d) {
                i7 = org.telegram.messenger.g0.L(84.0f);
            } else {
                i7 = 0;
            }
            for (int i10 = 0; i10 < tiVar.f40025v2.size(); i10++) {
                ((ki.t3) tiVar.f40025v2.valueAt(i10)).setMeasureOffsetY(i7);
            }
        }
    }

    @Override
    public final void g(int i7, boolean z10) {
        int i10;
        gi giVar = this.f35139x;
        ti tiVar = giVar.f35439l0;
        int i11 = tiVar.f39958a4;
        if (i11 > 0 && i11 != (i10 = tiVar.Z3[0]) && (z10 || tiVar.f40029w2 == tiVar.f40009r2)) {
            tiVar.f39961b4 = i11;
            tiVar.f39964c4 = i10;
        } else {
            tiVar.f39961b4 = -1.0f;
        }
        giVar.invalidate();
        th thVar = tiVar.f40026v3;
        if ((tiVar.f40029w2 instanceof ki.t3) && !tiVar.B3) {
            if (z10) {
                thVar.setVisibility(8);
            } else {
                thVar.setVisibility(0);
            }
        }
        tiVar.f40029w2.z(i7, z10);
    }
}
