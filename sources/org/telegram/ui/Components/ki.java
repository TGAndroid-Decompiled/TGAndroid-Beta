package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ki extends org.telegram.ui.ActionBar.p1 {
    public final li f27830x;

    public ki(li liVar, li liVar2) {
        super(liVar2);
        this.f27830x = liVar;
    }

    @Override
    public final boolean b() {
        kz kzVar;
        vi viVar = this.f27830x.B0;
        if (!viVar.isDismissed() && viVar.f31321s1) {
            ni niVar = viVar.f31341y0;
            if (niVar == viVar.m0 || niVar == viVar.f31303n0 || viVar.m1().m()) {
                ni niVar2 = viVar.f31341y0;
                tn tnVar = viVar.m0;
                if (niVar2 != tnVar || ((kzVar = tnVar.E) != null && kzVar.getVisibility() == 0)) {
                    ni niVar3 = viVar.f31341y0;
                    tn tnVar2 = viVar.f31303n0;
                    if (niVar3 == tnVar2) {
                        kz kzVar2 = tnVar2.E;
                        if (kzVar2 != null && kzVar2.getVisibility() == 0) {
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
        li liVar = this.f27830x;
        vi viVar = liVar.B0;
        viVar.f31299l2 = f7;
        float f11 = viVar.f31274d2;
        if (f11 > 0.0f) {
            viVar.f31299l2 = com.google.android.gms.internal.vision.e2.z(1.0f, f10, f11 - viVar.f31278e2, f7);
        }
        viVar.X0.setTranslationY(viVar.f31299l2);
        viVar.f31263a1.setTranslationY(viVar.f31299l2);
        org.telegram.ui.ActionBar.v0 v0Var = viVar.f31277e1;
        if (v0Var != null) {
            v0Var.setTranslationY(viVar.f31299l2);
        }
        org.telegram.ui.ActionBar.v0 v0Var2 = viVar.f31270c1;
        if (v0Var2 != null) {
            v0Var2.setTranslationY(viVar.f31263a1.getTranslationY());
        }
        di.f4 f4Var = viVar.f31273d1;
        if (f4Var != null) {
            f4Var.setTranslationY(viVar.f31263a1.getTranslationY());
        }
        viVar.f31281f1.setTranslationY(viVar.f31299l2);
        viVar.a2(0);
        viVar.setCurrentPanTranslationY(viVar.f31299l2);
        liVar.invalidate();
        viVar.D0.invalidate();
        viVar.U1();
        ni niVar = viVar.f31341y0;
        if (niVar != null) {
            niVar.k(viVar.f31299l2);
        }
    }

    @Override
    public final void f() {
        boolean z10;
        int i10;
        vi viVar = this.f27830x.B0;
        viVar.X1(viVar.f31341y0, 0);
        viVar.f31271c2 = viVar.f31267b2[0];
        viVar.f31341y0.v();
        if ((viVar.f31341y0 instanceof fi.r4) && !viVar.D1) {
            z10 = ((org.telegram.ui.ActionBar.f3) viVar).keyboardVisible;
            if (z10) {
                i10 = AndroidUtilities.dp(84.0f);
            } else {
                i10 = 0;
            }
            for (int i11 = 0; i11 < viVar.f31337x0.size(); i11++) {
                ((fi.r4) viVar.f31337x0.valueAt(i11)).setMeasureOffsetY(i10);
            }
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        li liVar = this.f27830x;
        vi viVar = liVar.B0;
        int i12 = viVar.f31271c2;
        if (i12 > 0 && i12 != (i11 = viVar.f31267b2[0]) && z10) {
            viVar.f31274d2 = i12;
            viVar.f31278e2 = i11;
        } else {
            viVar.f31274d2 = -1.0f;
        }
        liVar.invalidate();
        xh xhVar = viVar.f31338x1;
        if ((viVar.f31341y0 instanceof fi.r4) && !viVar.D1) {
            if (z10) {
                xhVar.setVisibility(8);
            } else {
                xhVar.setVisibility(0);
            }
        }
        viVar.f31341y0.w(i10, z10);
    }
}
