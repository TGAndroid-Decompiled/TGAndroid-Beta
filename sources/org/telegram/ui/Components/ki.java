package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ki extends org.telegram.ui.ActionBar.p1 {
    public final li f25800x;

    public ki(li liVar, li liVar2) {
        super(liVar2);
        this.f25800x = liVar;
    }

    @Override
    public final boolean b() {
        kz kzVar;
        vi viVar = this.f25800x.B0;
        if (!viVar.isDismissed() && viVar.f29139s1) {
            ni niVar = viVar.f29159y0;
            if (niVar == viVar.m0 || niVar == viVar.f29121n0 || viVar.m1().m()) {
                ni niVar2 = viVar.f29159y0;
                un unVar = viVar.m0;
                if (niVar2 != unVar || ((kzVar = unVar.E) != null && kzVar.getVisibility() == 0)) {
                    ni niVar3 = viVar.f29159y0;
                    un unVar2 = viVar.f29121n0;
                    if (niVar3 == unVar2) {
                        kz kzVar2 = unVar2.E;
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
        li liVar = this.f25800x;
        vi viVar = liVar.B0;
        viVar.f29117l2 = f7;
        float f11 = viVar.f29093d2;
        if (f11 > 0.0f) {
            viVar.f29117l2 = com.google.android.gms.internal.vision.e2.z(1.0f, f10, f11 - viVar.f29096e2, f7);
        }
        viVar.X0.setTranslationY(viVar.f29117l2);
        viVar.f29082a1.setTranslationY(viVar.f29117l2);
        org.telegram.ui.ActionBar.v0 v0Var = viVar.f29095e1;
        if (v0Var != null) {
            v0Var.setTranslationY(viVar.f29117l2);
        }
        org.telegram.ui.ActionBar.v0 v0Var2 = viVar.f29089c1;
        if (v0Var2 != null) {
            v0Var2.setTranslationY(viVar.f29082a1.getTranslationY());
        }
        ci.f4 f4Var = viVar.f29092d1;
        if (f4Var != null) {
            f4Var.setTranslationY(viVar.f29082a1.getTranslationY());
        }
        viVar.f29099f1.setTranslationY(viVar.f29117l2);
        viVar.a2(0);
        viVar.setCurrentPanTranslationY(viVar.f29117l2);
        liVar.invalidate();
        viVar.D0.invalidate();
        viVar.U1();
        ni niVar = viVar.f29159y0;
        if (niVar != null) {
            niVar.k(viVar.f29117l2);
        }
    }

    @Override
    public final void f() {
        boolean z10;
        int i10;
        vi viVar = this.f25800x.B0;
        viVar.X1(viVar.f29159y0, 0);
        viVar.f29090c2 = viVar.f29086b2[0];
        viVar.f29159y0.v();
        if ((viVar.f29159y0 instanceof ei.q4) && !viVar.D1) {
            z10 = ((org.telegram.ui.ActionBar.f3) viVar).keyboardVisible;
            if (z10) {
                i10 = AndroidUtilities.dp(84.0f);
            } else {
                i10 = 0;
            }
            for (int i11 = 0; i11 < viVar.f29155x0.size(); i11++) {
                ((ei.q4) viVar.f29155x0.valueAt(i11)).setMeasureOffsetY(i10);
            }
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        li liVar = this.f25800x;
        vi viVar = liVar.B0;
        int i12 = viVar.f29090c2;
        if (i12 > 0 && i12 != (i11 = viVar.f29086b2[0]) && z10) {
            viVar.f29093d2 = i12;
            viVar.f29096e2 = i11;
        } else {
            viVar.f29093d2 = -1.0f;
        }
        liVar.invalidate();
        xh xhVar = viVar.f29156x1;
        if ((viVar.f29159y0 instanceof ei.q4) && !viVar.D1) {
            if (z10) {
                xhVar.setVisibility(8);
            } else {
                xhVar.setVisibility(0);
            }
        }
        viVar.f29159y0.w(i10, z10);
    }
}
