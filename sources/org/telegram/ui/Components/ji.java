package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ji extends org.telegram.ui.ActionBar.p1 {
    public final ki f27852x;

    public ji(ki kiVar, ki kiVar2) {
        super(kiVar2);
        this.f27852x = kiVar;
    }

    @Override
    public final boolean b() {
        nz nzVar;
        xi xiVar = this.f27852x.B0;
        if (!xiVar.isDismissed() && xiVar.f32951s1) {
            pi piVar = xiVar.f32971y0;
            if (piVar == xiVar.m0 || piVar == xiVar.f32933n0 || xiVar.m1().m()) {
                pi piVar2 = xiVar.f32971y0;
                xn xnVar = xiVar.m0;
                if (piVar2 != xnVar || ((nzVar = xnVar.E) != null && nzVar.getVisibility() == 0)) {
                    pi piVar3 = xiVar.f32971y0;
                    xn xnVar2 = xiVar.f32933n0;
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
        ki kiVar = this.f27852x;
        xi xiVar = kiVar.B0;
        xiVar.f32929l2 = f7;
        float f11 = xiVar.f32904d2;
        if (f11 > 0.0f) {
            xiVar.f32929l2 = com.google.android.gms.internal.vision.e2.z(1.0f, f10, f11 - xiVar.f32908e2, f7);
        }
        xiVar.X0.setTranslationY(xiVar.f32929l2);
        xiVar.f32893a1.setTranslationY(xiVar.f32929l2);
        org.telegram.ui.ActionBar.v0 v0Var = xiVar.f32907e1;
        if (v0Var != null) {
            v0Var.setTranslationY(xiVar.f32929l2);
        }
        org.telegram.ui.ActionBar.v0 v0Var2 = xiVar.f32900c1;
        if (v0Var2 != null) {
            v0Var2.setTranslationY(xiVar.f32893a1.getTranslationY());
        }
        ci.e4 e4Var = xiVar.f32903d1;
        if (e4Var != null) {
            e4Var.setTranslationY(xiVar.f32893a1.getTranslationY());
        }
        xiVar.f32911f1.setTranslationY(xiVar.f32929l2);
        xiVar.Z1(0);
        xiVar.setCurrentPanTranslationY(xiVar.f32929l2);
        kiVar.invalidate();
        xiVar.D0.invalidate();
        xiVar.T1();
        pi piVar = xiVar.f32971y0;
        if (piVar != null) {
            piVar.k(xiVar.f32929l2);
        }
    }

    @Override
    public final void f() {
        boolean z10;
        int i10;
        xi xiVar = this.f27852x.B0;
        xiVar.W1(xiVar.f32971y0, 0);
        xiVar.f32901c2 = xiVar.f32897b2[0];
        xiVar.f32971y0.v();
        if ((xiVar.f32971y0 instanceof ei.r4) && !xiVar.D1) {
            z10 = ((org.telegram.ui.ActionBar.f3) xiVar).keyboardVisible;
            if (z10) {
                i10 = AndroidUtilities.dp(84.0f);
            } else {
                i10 = 0;
            }
            for (int i11 = 0; i11 < xiVar.f32967x0.size(); i11++) {
                ((ei.r4) xiVar.f32967x0.valueAt(i11)).setMeasureOffsetY(i10);
            }
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        ki kiVar = this.f27852x;
        xi xiVar = kiVar.B0;
        int i12 = xiVar.f32901c2;
        if (i12 > 0 && i12 != (i11 = xiVar.f32897b2[0]) && z10) {
            xiVar.f32904d2 = i12;
            xiVar.f32908e2 = i11;
        } else {
            xiVar.f32904d2 = -1.0f;
        }
        kiVar.invalidate();
        wh whVar = xiVar.f32968x1;
        if ((xiVar.f32971y0 instanceof ei.r4) && !xiVar.D1) {
            if (z10) {
                whVar.setVisibility(8);
            } else {
                whVar.setVisibility(0);
            }
        }
        xiVar.f32971y0.w(i10, z10);
    }
}
