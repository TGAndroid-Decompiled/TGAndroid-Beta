package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ji extends org.telegram.ui.ActionBar.p1 {
    public final ki f27779x;

    public ji(ki kiVar, ki kiVar2) {
        super(kiVar2);
        this.f27779x = kiVar;
    }

    @Override
    public final boolean b() {
        nz nzVar;
        xi xiVar = this.f27779x.B0;
        if (!xiVar.isDismissed() && xiVar.f32853s1) {
            pi piVar = xiVar.f32873y0;
            if (piVar == xiVar.m0 || piVar == xiVar.f32835n0 || xiVar.k1().m()) {
                pi piVar2 = xiVar.f32873y0;
                xn xnVar = xiVar.m0;
                if (piVar2 != xnVar || ((nzVar = xnVar.E) != null && nzVar.getVisibility() == 0)) {
                    pi piVar3 = xiVar.f32873y0;
                    xn xnVar2 = xiVar.f32835n0;
                    if (piVar3 == xnVar2) {
                        nz nzVar2 = xnVar2.E;
                        if (nzVar2 != null && nzVar2.getVisibility() == 0) {
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
        ki kiVar = this.f27779x;
        xi xiVar = kiVar.B0;
        xiVar.f32831l2 = f7;
        float f11 = xiVar.f32806d2;
        if (f11 > 0.0f) {
            xiVar.f32831l2 = com.google.android.gms.internal.vision.e2.z(1.0f, f10, f11 - xiVar.f32810e2, f7);
        }
        xiVar.X0.setTranslationY(xiVar.f32831l2);
        xiVar.f32795a1.setTranslationY(xiVar.f32831l2);
        org.telegram.ui.ActionBar.v0 v0Var = xiVar.f32809e1;
        if (v0Var != null) {
            v0Var.setTranslationY(xiVar.f32831l2);
        }
        org.telegram.ui.ActionBar.v0 v0Var2 = xiVar.f32802c1;
        if (v0Var2 != null) {
            v0Var2.setTranslationY(xiVar.f32795a1.getTranslationY());
        }
        ci.e4 e4Var = xiVar.f32805d1;
        if (e4Var != null) {
            e4Var.setTranslationY(xiVar.f32795a1.getTranslationY());
        }
        xiVar.f32813f1.setTranslationY(xiVar.f32831l2);
        xiVar.X1(0);
        xiVar.setCurrentPanTranslationY(xiVar.f32831l2);
        kiVar.invalidate();
        xiVar.D0.invalidate();
        xiVar.R1();
        pi piVar = xiVar.f32873y0;
        if (piVar != null) {
            piVar.k(xiVar.f32831l2);
        }
    }

    @Override
    public final void f() {
        boolean z10;
        int i10;
        xi xiVar = this.f27779x.B0;
        xiVar.U1(xiVar.f32873y0, 0);
        xiVar.f32803c2 = xiVar.f32799b2[0];
        xiVar.f32873y0.v();
        if ((xiVar.f32873y0 instanceof ei.r4) && !xiVar.D1) {
            z10 = ((org.telegram.ui.ActionBar.f3) xiVar).keyboardVisible;
            if (z10) {
                i10 = AndroidUtilities.dp(84.0f);
            } else {
                i10 = 0;
            }
            for (int i11 = 0; i11 < xiVar.f32869x0.size(); i11++) {
                ((ei.r4) xiVar.f32869x0.valueAt(i11)).setMeasureOffsetY(i10);
            }
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        ki kiVar = this.f27779x;
        xi xiVar = kiVar.B0;
        int i12 = xiVar.f32803c2;
        if (i12 > 0 && i12 != (i11 = xiVar.f32799b2[0]) && z10) {
            xiVar.f32806d2 = i12;
            xiVar.f32810e2 = i11;
        } else {
            xiVar.f32806d2 = -1.0f;
        }
        kiVar.invalidate();
        wh whVar = xiVar.f32870x1;
        if ((xiVar.f32873y0 instanceof ei.r4) && !xiVar.D1) {
            if (z10) {
                whVar.setVisibility(8);
            } else {
                whVar.setVisibility(0);
            }
        }
        xiVar.f32873y0.w(i10, z10);
    }
}
