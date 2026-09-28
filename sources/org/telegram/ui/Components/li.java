package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class li extends org.telegram.ui.ActionBar.o1 {
    public final mi f26009x;

    public li(mi miVar, mi miVar2) {
        super(miVar2);
        this.f26009x = miVar;
    }

    @Override
    public final boolean b() {
        mz mzVar;
        wi wiVar = this.f26009x.B0;
        if (!wiVar.isDismissed() && wiVar.f29983s1) {
            oi oiVar = wiVar.f30003y0;
            if (oiVar == wiVar.m0 || oiVar == wiVar.f29965n0 || wiVar.m1().m()) {
                oi oiVar2 = wiVar.f30003y0;
                wn wnVar = wiVar.m0;
                if (oiVar2 != wnVar || ((mzVar = wnVar.E) != null && mzVar.getVisibility() == 0)) {
                    oi oiVar3 = wiVar.f30003y0;
                    wn wnVar2 = wiVar.f29965n0;
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
        mi miVar = this.f26009x;
        wi wiVar = miVar.B0;
        wiVar.f29961l2 = f7;
        float f11 = wiVar.f29937d2;
        if (f11 > 0.0f) {
            wiVar.f29961l2 = com.google.android.gms.internal.vision.e2.z(1.0f, f10, f11 - wiVar.f29940e2, f7);
        }
        wiVar.X0.setTranslationY(wiVar.f29961l2);
        wiVar.f29926a1.setTranslationY(wiVar.f29961l2);
        org.telegram.ui.ActionBar.u0 u0Var = wiVar.f29939e1;
        if (u0Var != null) {
            u0Var.setTranslationY(wiVar.f29961l2);
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = wiVar.f29933c1;
        if (u0Var2 != null) {
            u0Var2.setTranslationY(wiVar.f29926a1.getTranslationY());
        }
        ci.e4 e4Var = wiVar.f29936d1;
        if (e4Var != null) {
            e4Var.setTranslationY(wiVar.f29926a1.getTranslationY());
        }
        wiVar.f29943f1.setTranslationY(wiVar.f29961l2);
        wiVar.a2(0);
        wiVar.setCurrentPanTranslationY(wiVar.f29961l2);
        miVar.invalidate();
        wiVar.D0.invalidate();
        wiVar.U1();
        oi oiVar = wiVar.f30003y0;
        if (oiVar != null) {
            oiVar.k(wiVar.f29961l2);
        }
    }

    @Override
    public final void f() {
        boolean z10;
        int i10;
        wi wiVar = this.f26009x.B0;
        wiVar.X1(wiVar.f30003y0, 0);
        wiVar.f29934c2 = wiVar.f29930b2[0];
        wiVar.f30003y0.v();
        if ((wiVar.f30003y0 instanceof ei.q4) && !wiVar.D1) {
            z10 = ((org.telegram.ui.ActionBar.e3) wiVar).keyboardVisible;
            if (z10) {
                i10 = AndroidUtilities.dp(84.0f);
            } else {
                i10 = 0;
            }
            for (int i11 = 0; i11 < wiVar.f29999x0.size(); i11++) {
                ((ei.q4) wiVar.f29999x0.valueAt(i11)).setMeasureOffsetY(i10);
            }
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        mi miVar = this.f26009x;
        wi wiVar = miVar.B0;
        int i12 = wiVar.f29934c2;
        if (i12 > 0 && i12 != (i11 = wiVar.f29930b2[0]) && z10) {
            wiVar.f29937d2 = i12;
            wiVar.f29940e2 = i11;
        } else {
            wiVar.f29937d2 = -1.0f;
        }
        miVar.invalidate();
        yh yhVar = wiVar.f30000x1;
        if ((wiVar.f30003y0 instanceof ei.q4) && !wiVar.D1) {
            if (z10) {
                yhVar.setVisibility(8);
            } else {
                yhVar.setVisibility(0);
            }
        }
        wiVar.f30003y0.w(i10, z10);
    }
}
