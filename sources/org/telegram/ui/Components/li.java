package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class li extends org.telegram.ui.ActionBar.o1 {
    public final mi f26084x;

    public li(mi miVar, mi miVar2) {
        super(miVar2);
        this.f26084x = miVar;
    }

    @Override
    public final boolean b() {
        mz mzVar;
        wi wiVar = this.f26084x.B0;
        if (!wiVar.isDismissed() && wiVar.f30061s1) {
            oi oiVar = wiVar.f30081y0;
            if (oiVar == wiVar.m0 || oiVar == wiVar.f30043n0 || wiVar.m1().m()) {
                oi oiVar2 = wiVar.f30081y0;
                wn wnVar = wiVar.m0;
                if (oiVar2 != wnVar || ((mzVar = wnVar.E) != null && mzVar.getVisibility() == 0)) {
                    oi oiVar3 = wiVar.f30081y0;
                    wn wnVar2 = wiVar.f30043n0;
                    if (oiVar3 == wnVar2) {
                        mz mzVar2 = wnVar2.E;
                        if (mzVar2 != null && mzVar2.getVisibility() == 0) {
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
        mi miVar = this.f26084x;
        wi wiVar = miVar.B0;
        wiVar.f30039l2 = f7;
        float f11 = wiVar.f30015d2;
        if (f11 > 0.0f) {
            wiVar.f30039l2 = com.google.android.gms.internal.vision.e2.z(1.0f, f10, f11 - wiVar.f30018e2, f7);
        }
        wiVar.X0.setTranslationY(wiVar.f30039l2);
        wiVar.f30004a1.setTranslationY(wiVar.f30039l2);
        org.telegram.ui.ActionBar.u0 u0Var = wiVar.f30017e1;
        if (u0Var != null) {
            u0Var.setTranslationY(wiVar.f30039l2);
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = wiVar.f30011c1;
        if (u0Var2 != null) {
            u0Var2.setTranslationY(wiVar.f30004a1.getTranslationY());
        }
        ci.e4 e4Var = wiVar.f30014d1;
        if (e4Var != null) {
            e4Var.setTranslationY(wiVar.f30004a1.getTranslationY());
        }
        wiVar.f30021f1.setTranslationY(wiVar.f30039l2);
        wiVar.a2(0);
        wiVar.setCurrentPanTranslationY(wiVar.f30039l2);
        miVar.invalidate();
        wiVar.D0.invalidate();
        wiVar.U1();
        oi oiVar = wiVar.f30081y0;
        if (oiVar != null) {
            oiVar.k(wiVar.f30039l2);
        }
    }

    @Override
    public final void f() {
        boolean z10;
        int i10;
        wi wiVar = this.f26084x.B0;
        wiVar.X1(wiVar.f30081y0, 0);
        wiVar.f30012c2 = wiVar.f30008b2[0];
        wiVar.f30081y0.v();
        if ((wiVar.f30081y0 instanceof ei.q4) && !wiVar.D1) {
            z10 = ((org.telegram.ui.ActionBar.e3) wiVar).keyboardVisible;
            if (z10) {
                i10 = AndroidUtilities.dp(84.0f);
            } else {
                i10 = 0;
            }
            for (int i11 = 0; i11 < wiVar.f30077x0.size(); i11++) {
                ((ei.q4) wiVar.f30077x0.valueAt(i11)).setMeasureOffsetY(i10);
            }
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        mi miVar = this.f26084x;
        wi wiVar = miVar.B0;
        int i12 = wiVar.f30012c2;
        if (i12 > 0 && i12 != (i11 = wiVar.f30008b2[0]) && z10) {
            wiVar.f30015d2 = i12;
            wiVar.f30018e2 = i11;
        } else {
            wiVar.f30015d2 = -1.0f;
        }
        miVar.invalidate();
        yh yhVar = wiVar.f30078x1;
        if ((wiVar.f30081y0 instanceof ei.q4) && !wiVar.D1) {
            if (z10) {
                yhVar.setVisibility(8);
            } else {
                yhVar.setVisibility(0);
            }
        }
        wiVar.f30081y0.w(i10, z10);
    }
}
