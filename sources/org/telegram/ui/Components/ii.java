package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ii extends org.telegram.ui.ActionBar.o1 {
    public final ji f27252x;

    public ii(ji jiVar, ji jiVar2) {
        super(jiVar2);
        this.f27252x = jiVar;
    }

    @Override
    public final boolean b() {
        tz tzVar;
        ti tiVar = this.f27252x.B0;
        if ((!tiVar.isDismissed() || tiVar.f30591x0) && tiVar.f30584v1) {
            li liVar = tiVar.B0;
            if (liVar == tiVar.m0 || liVar == tiVar.f30557n0 || tiVar.o1().m()) {
                li liVar2 = tiVar.B0;
                fo foVar = tiVar.m0;
                if (liVar2 != foVar || ((tzVar = foVar.E) != null && tzVar.getVisibility() == 0)) {
                    li liVar3 = tiVar.B0;
                    fo foVar2 = tiVar.f30557n0;
                    if (liVar3 == foVar2) {
                        tz tzVar2 = foVar2.E;
                        if (tzVar2 != null && tzVar2.getVisibility() == 0) {
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
        ji jiVar = this.f27252x;
        ti tiVar = jiVar.B0;
        tiVar.f30562o2 = f7;
        float f12 = tiVar.f30539g2;
        float f13 = 0.0f;
        if (f12 > 0.0f) {
            if (tiVar.B0 == tiVar.f30587w0 && !z10) {
                f11 = f10;
            } else {
                f11 = 1.0f - f10;
            }
            tiVar.f30562o2 = com.google.android.gms.internal.play_billing.k3.y(f12, tiVar.f30542h2, f11, f7);
        }
        tiVar.f30518a1.setTranslationY(tiVar.f30562o2);
        tiVar.f30528d1.setTranslationY(tiVar.f30562o2);
        org.telegram.ui.ActionBar.u0 u0Var = tiVar.f30541h1;
        if (u0Var != null) {
            u0Var.setTranslationY(tiVar.f30562o2);
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = tiVar.f30535f1;
        if (u0Var2 != null) {
            u0Var2.setTranslationY(tiVar.f30528d1.getTranslationY());
        }
        ei.x3 x3Var = tiVar.f30538g1;
        if (x3Var != null) {
            x3Var.setTranslationY(tiVar.f30528d1.getTranslationY());
        }
        tiVar.f30544i1.setTranslationY(tiVar.f30562o2);
        tiVar.e2(0);
        if (tiVar.B0 != tiVar.f30587w0) {
            f13 = tiVar.f30562o2;
        }
        tiVar.setCurrentPanTranslationY(f13);
        jiVar.invalidate();
        tiVar.G0.invalidate();
        tiVar.Y1();
        li liVar = tiVar.B0;
        if (liVar != null) {
            liVar.m(tiVar.f30562o2, f10);
        }
    }

    @Override
    public final void f() {
        boolean z10;
        int i10;
        ti tiVar = this.f27252x.B0;
        tiVar.b2(tiVar.B0, 0);
        tiVar.f30536f2 = tiVar.f30532e2[0];
        tiVar.B0.y();
        if ((tiVar.B0 instanceof gi.f4) && !tiVar.G1) {
            z10 = ((org.telegram.ui.ActionBar.f3) tiVar).keyboardVisible;
            if (z10) {
                i10 = AndroidUtilities.dp(84.0f);
            } else {
                i10 = 0;
            }
            for (int i11 = 0; i11 < tiVar.A0.size(); i11++) {
                ((gi.f4) tiVar.A0.valueAt(i11)).setMeasureOffsetY(i10);
            }
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        ji jiVar = this.f27252x;
        ti tiVar = jiVar.B0;
        int i12 = tiVar.f30536f2;
        if (i12 > 0 && i12 != (i11 = tiVar.f30532e2[0]) && (z10 || tiVar.B0 == tiVar.f30587w0)) {
            tiVar.f30539g2 = i12;
            tiVar.f30542h2 = i11;
        } else {
            tiVar.f30539g2 = -1.0f;
        }
        jiVar.invalidate();
        wh whVar = tiVar.A1;
        if ((tiVar.B0 instanceof gi.f4) && !tiVar.G1) {
            if (z10) {
                whVar.setVisibility(8);
            } else {
                whVar.setVisibility(0);
            }
        }
        tiVar.B0.z(i10, z10);
    }
}
