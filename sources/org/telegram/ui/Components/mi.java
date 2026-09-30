package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class mi extends org.telegram.ui.ActionBar.o1 {
    public final ni f26299x;

    public mi(ni niVar, ni niVar2) {
        super(niVar2);
        this.f26299x = niVar;
    }

    @Override
    public final boolean b() {
        nz nzVar;
        xi xiVar = this.f26299x.B0;
        if (!xiVar.isDismissed() && xiVar.f30311s1) {
            pi piVar = xiVar.f30331y0;
            if (piVar == xiVar.m0 || piVar == xiVar.f30293n0 || xiVar.m1().m()) {
                pi piVar2 = xiVar.f30331y0;
                xn xnVar = xiVar.m0;
                if (piVar2 != xnVar || ((nzVar = xnVar.E) != null && nzVar.getVisibility() == 0)) {
                    pi piVar3 = xiVar.f30331y0;
                    xn xnVar2 = xiVar.f30293n0;
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
        ni niVar = this.f26299x;
        xi xiVar = niVar.B0;
        xiVar.f30289l2 = f7;
        float f11 = xiVar.f30265d2;
        if (f11 > 0.0f) {
            xiVar.f30289l2 = com.google.android.gms.internal.vision.e2.z(1.0f, f10, f11 - xiVar.f30268e2, f7);
        }
        xiVar.X0.setTranslationY(xiVar.f30289l2);
        xiVar.f30254a1.setTranslationY(xiVar.f30289l2);
        org.telegram.ui.ActionBar.u0 u0Var = xiVar.f30267e1;
        if (u0Var != null) {
            u0Var.setTranslationY(xiVar.f30289l2);
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = xiVar.f30261c1;
        if (u0Var2 != null) {
            u0Var2.setTranslationY(xiVar.f30254a1.getTranslationY());
        }
        ci.e4 e4Var = xiVar.f30264d1;
        if (e4Var != null) {
            e4Var.setTranslationY(xiVar.f30254a1.getTranslationY());
        }
        xiVar.f30271f1.setTranslationY(xiVar.f30289l2);
        xiVar.a2(0);
        xiVar.setCurrentPanTranslationY(xiVar.f30289l2);
        niVar.invalidate();
        xiVar.D0.invalidate();
        xiVar.U1();
        pi piVar = xiVar.f30331y0;
        if (piVar != null) {
            piVar.k(xiVar.f30289l2);
        }
    }

    @Override
    public final void f() {
        boolean z10;
        int i10;
        xi xiVar = this.f26299x.B0;
        xiVar.X1(xiVar.f30331y0, 0);
        xiVar.f30262c2 = xiVar.f30258b2[0];
        xiVar.f30331y0.v();
        if ((xiVar.f30331y0 instanceof ei.q4) && !xiVar.D1) {
            z10 = ((org.telegram.ui.ActionBar.e3) xiVar).keyboardVisible;
            if (z10) {
                i10 = AndroidUtilities.dp(84.0f);
            } else {
                i10 = 0;
            }
            for (int i11 = 0; i11 < xiVar.f30327x0.size(); i11++) {
                ((ei.q4) xiVar.f30327x0.valueAt(i11)).setMeasureOffsetY(i10);
            }
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        ni niVar = this.f26299x;
        xi xiVar = niVar.B0;
        int i12 = xiVar.f30262c2;
        if (i12 > 0 && i12 != (i11 = xiVar.f30258b2[0]) && z10) {
            xiVar.f30265d2 = i12;
            xiVar.f30268e2 = i11;
        } else {
            xiVar.f30265d2 = -1.0f;
        }
        niVar.invalidate();
        zh zhVar = xiVar.f30328x1;
        if ((xiVar.f30331y0 instanceof ei.q4) && !xiVar.D1) {
            if (z10) {
                zhVar.setVisibility(8);
            } else {
                zhVar.setVisibility(0);
            }
        }
        xiVar.f30331y0.w(i10, z10);
    }
}
