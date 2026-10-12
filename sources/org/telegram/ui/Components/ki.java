package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ki extends org.telegram.ui.ActionBar.o1 {
    public final li f26707x;

    public ki(li liVar, li liVar2) {
        super(liVar2);
        this.f26707x = liVar;
    }

    @Override
    public final boolean b() {
        wz wzVar;
        vi viVar = this.f26707x.B0;
        if ((!viVar.isDismissed() || viVar.f30058x0) && viVar.f30051v1) {
            ni niVar = viVar.B0;
            if (niVar == viVar.m0 || niVar == viVar.f30024n0 || viVar.o1().m()) {
                ni niVar2 = viVar.B0;
                io ioVar = viVar.m0;
                if (niVar2 != ioVar || ((wzVar = ioVar.E) != null && wzVar.getVisibility() == 0)) {
                    ni niVar3 = viVar.B0;
                    io ioVar2 = viVar.f30024n0;
                    if (niVar3 == ioVar2) {
                        wz wzVar2 = ioVar2.E;
                        if (wzVar2 != null && wzVar2.getVisibility() == 0) {
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
        li liVar = this.f26707x;
        vi viVar = liVar.B0;
        viVar.f30029o2 = f7;
        float f12 = viVar.f30006g2;
        float f13 = 0.0f;
        if (f12 > 0.0f) {
            if (viVar.B0 == viVar.f30054w0 && !z10) {
                f11 = f10;
            } else {
                f11 = 1.0f - f10;
            }
            viVar.f30029o2 = com.google.android.gms.internal.play_billing.k3.y(f12, viVar.f30009h2, f11, f7);
        }
        viVar.f29985a1.setTranslationY(viVar.f30029o2);
        viVar.f29995d1.setTranslationY(viVar.f30029o2);
        org.telegram.ui.ActionBar.u0 u0Var = viVar.f30008h1;
        if (u0Var != null) {
            u0Var.setTranslationY(viVar.f30029o2);
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = viVar.f30002f1;
        if (u0Var2 != null) {
            u0Var2.setTranslationY(viVar.f29995d1.getTranslationY());
        }
        di.d4 d4Var = viVar.f30005g1;
        if (d4Var != null) {
            d4Var.setTranslationY(viVar.f29995d1.getTranslationY());
        }
        viVar.f30011i1.setTranslationY(viVar.f30029o2);
        viVar.e2(0);
        if (viVar.B0 != viVar.f30054w0) {
            f13 = viVar.f30029o2;
        }
        viVar.setCurrentPanTranslationY(f13);
        liVar.invalidate();
        viVar.G0.invalidate();
        viVar.Y1();
        ni niVar = viVar.B0;
        if (niVar != null) {
            niVar.m(viVar.f30029o2, f10);
        }
    }

    @Override
    public final void f() {
        boolean z10;
        int i10;
        vi viVar = this.f26707x.B0;
        viVar.b2(viVar.B0, 0);
        viVar.f30003f2 = viVar.f29999e2[0];
        viVar.B0.y();
        if ((viVar.B0 instanceof fi.q4) && !viVar.G1) {
            z10 = ((org.telegram.ui.ActionBar.e3) viVar).keyboardVisible;
            if (z10) {
                i10 = AndroidUtilities.dp(84.0f);
            } else {
                i10 = 0;
            }
            for (int i11 = 0; i11 < viVar.A0.size(); i11++) {
                ((fi.q4) viVar.A0.valueAt(i11)).setMeasureOffsetY(i10);
            }
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        li liVar = this.f26707x;
        vi viVar = liVar.B0;
        int i12 = viVar.f30003f2;
        if (i12 > 0 && i12 != (i11 = viVar.f29999e2[0]) && (z10 || viVar.B0 == viVar.f30054w0)) {
            viVar.f30006g2 = i12;
            viVar.f30009h2 = i11;
        } else {
            viVar.f30006g2 = -1.0f;
        }
        liVar.invalidate();
        xh xhVar = viVar.A1;
        if ((viVar.B0 instanceof fi.q4) && !viVar.G1) {
            if (z10) {
                xhVar.setVisibility(8);
            } else {
                xhVar.setVisibility(0);
            }
        }
        viVar.B0.z(i10, z10);
    }
}
