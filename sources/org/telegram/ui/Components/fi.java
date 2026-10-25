package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class fi extends org.telegram.ui.ActionBar.q1 {
    public final gi f28191x;

    public fi(gi giVar, gi giVar2) {
        super(giVar2);
        this.f28191x = giVar;
    }

    @Override
    public final boolean b() {
        sz szVar;
        ti tiVar = this.f28191x.f28576q0;
        if ((!tiVar.isDismissed() || tiVar.f33075x0) && tiVar.f33068v1) {
            li liVar = tiVar.B0;
            if (liVar == tiVar.m0 || liVar == tiVar.f33041n0 || tiVar.r1().m()) {
                li liVar2 = tiVar.B0;
                go goVar = tiVar.m0;
                if (liVar2 != goVar || ((szVar = goVar.E) != null && szVar.getVisibility() == 0)) {
                    li liVar3 = tiVar.B0;
                    go goVar2 = tiVar.f33041n0;
                    if (liVar3 == goVar2) {
                        sz szVar2 = goVar2.E;
                        if (szVar2 != null && szVar2.getVisibility() == 0) {
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
        gi giVar = this.f28191x;
        ti tiVar = giVar.f28576q0;
        tiVar.f33046o2 = f7;
        float f12 = tiVar.f33023g2;
        float f13 = 0.0f;
        if (f12 > 0.0f) {
            if (tiVar.B0 == tiVar.f33071w0 && !z10) {
                f11 = f10;
            } else {
                f11 = 1.0f - f10;
            }
            tiVar.f33046o2 = c3.h0.z(f12, tiVar.f33026h2, f11, f7);
        }
        tiVar.f33002a1.setTranslationY(tiVar.f33046o2);
        tiVar.f33012d1.setTranslationY(tiVar.f33046o2);
        org.telegram.ui.ActionBar.w0 w0Var = tiVar.f33025h1;
        if (w0Var != null) {
            w0Var.setTranslationY(tiVar.f33046o2);
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = tiVar.f33019f1;
        if (w0Var2 != null) {
            w0Var2.setTranslationY(tiVar.f33012d1.getTranslationY());
        }
        fi.v3 v3Var = tiVar.f33022g1;
        if (v3Var != null) {
            v3Var.setTranslationY(tiVar.f33012d1.getTranslationY());
        }
        tiVar.f33028i1.setTranslationY(tiVar.f33046o2);
        tiVar.h2(0);
        if (tiVar.B0 != tiVar.f33071w0) {
            f13 = tiVar.f33046o2;
        }
        tiVar.setCurrentPanTranslationY(f13);
        giVar.invalidate();
        tiVar.G0.invalidate();
        tiVar.b2();
        li liVar = tiVar.B0;
        if (liVar != null) {
            liVar.m(tiVar.f33046o2, f10);
        }
    }

    @Override
    public final void f() {
        boolean z10;
        int i10;
        ti tiVar = this.f28191x.f28576q0;
        tiVar.e2(tiVar.B0, 0);
        tiVar.f33020f2 = tiVar.f33016e2[0];
        tiVar.B0.x();
        if ((tiVar.B0 instanceof hi.o4) && !tiVar.G1) {
            z10 = ((org.telegram.ui.ActionBar.k3) tiVar).keyboardVisible;
            if (z10) {
                i10 = AndroidUtilities.dp(84.0f);
            } else {
                i10 = 0;
            }
            for (int i11 = 0; i11 < tiVar.A0.size(); i11++) {
                ((hi.o4) tiVar.A0.valueAt(i11)).setMeasureOffsetY(i10);
            }
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        gi giVar = this.f28191x;
        ti tiVar = giVar.f28576q0;
        int i12 = tiVar.f33020f2;
        if (i12 > 0 && i12 != (i11 = tiVar.f33016e2[0]) && (z10 || tiVar.B0 == tiVar.f33071w0)) {
            tiVar.f33023g2 = i12;
            tiVar.f33026h2 = i11;
        } else {
            tiVar.f33023g2 = -1.0f;
        }
        giVar.invalidate();
        th thVar = tiVar.A1;
        if ((tiVar.B0 instanceof hi.o4) && !tiVar.G1) {
            if (z10) {
                thVar.setVisibility(8);
            } else {
                thVar.setVisibility(0);
            }
        }
        tiVar.B0.y(i10, z10);
    }
}
