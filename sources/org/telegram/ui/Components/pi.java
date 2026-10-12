package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class pi extends org.telegram.ui.ActionBar.o1 {
    public final qi f29503x;

    public pi(qi qiVar, qi qiVar2) {
        super(qiVar2);
        this.f29503x = qiVar;
    }

    @Override
    public final boolean b() {
        d00 d00Var;
        aj ajVar = this.f29503x.B0;
        if ((!ajVar.isDismissed() || ajVar.f24399x0) && ajVar.f24392v1) {
            si siVar = ajVar.B0;
            if (siVar == ajVar.m0 || siVar == ajVar.f24365n0 || ajVar.o1().m()) {
                si siVar2 = ajVar.B0;
                no noVar = ajVar.m0;
                if (siVar2 != noVar || ((d00Var = noVar.E) != null && d00Var.getVisibility() == 0)) {
                    si siVar3 = ajVar.B0;
                    no noVar2 = ajVar.f24365n0;
                    if (siVar3 == noVar2) {
                        d00 d00Var2 = noVar2.E;
                        if (d00Var2 != null && d00Var2.getVisibility() == 0) {
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
        qi qiVar = this.f29503x;
        aj ajVar = qiVar.B0;
        ajVar.f24370o2 = f7;
        float f12 = ajVar.f24347g2;
        float f13 = 0.0f;
        if (f12 > 0.0f) {
            if (ajVar.B0 == ajVar.f24395w0 && !z10) {
                f11 = f10;
            } else {
                f11 = 1.0f - f10;
            }
            ajVar.f24370o2 = com.google.android.gms.internal.vision.e2.y(f12, ajVar.f24350h2, f11, f7);
        }
        ajVar.f24325a1.setTranslationY(ajVar.f24370o2);
        ajVar.f24335d1.setTranslationY(ajVar.f24370o2);
        org.telegram.ui.ActionBar.u0 u0Var = ajVar.f24349h1;
        if (u0Var != null) {
            u0Var.setTranslationY(ajVar.f24370o2);
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = ajVar.f24343f1;
        if (u0Var2 != null) {
            u0Var2.setTranslationY(ajVar.f24335d1.getTranslationY());
        }
        ci.d4 d4Var = ajVar.f24346g1;
        if (d4Var != null) {
            d4Var.setTranslationY(ajVar.f24335d1.getTranslationY());
        }
        ajVar.f24352i1.setTranslationY(ajVar.f24370o2);
        ajVar.e2(0);
        if (ajVar.B0 != ajVar.f24395w0) {
            f13 = ajVar.f24370o2;
        }
        ajVar.setCurrentPanTranslationY(f13);
        qiVar.invalidate();
        ajVar.G0.invalidate();
        ajVar.Y1();
        si siVar = ajVar.B0;
        if (siVar != null) {
            siVar.m(ajVar.f24370o2, f10);
        }
    }

    @Override
    public final void f() {
        boolean z10;
        int i10;
        aj ajVar = this.f29503x.B0;
        ajVar.b2(ajVar.B0, 0);
        ajVar.f24344f2 = ajVar.f24340e2[0];
        ajVar.B0.y();
        if ((ajVar.B0 instanceof ei.p4) && !ajVar.G1) {
            z10 = ((org.telegram.ui.ActionBar.e3) ajVar).keyboardVisible;
            if (z10) {
                i10 = AndroidUtilities.dp(84.0f);
            } else {
                i10 = 0;
            }
            for (int i11 = 0; i11 < ajVar.A0.size(); i11++) {
                ((ei.p4) ajVar.A0.valueAt(i11)).setMeasureOffsetY(i10);
            }
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        qi qiVar = this.f29503x;
        aj ajVar = qiVar.B0;
        int i12 = ajVar.f24344f2;
        if (i12 > 0 && i12 != (i11 = ajVar.f24340e2[0]) && (z10 || ajVar.B0 == ajVar.f24395w0)) {
            ajVar.f24347g2 = i12;
            ajVar.f24350h2 = i11;
        } else {
            ajVar.f24347g2 = -1.0f;
        }
        qiVar.invalidate();
        ci ciVar = ajVar.A1;
        if ((ajVar.B0 instanceof ei.p4) && !ajVar.G1) {
            if (z10) {
                ciVar.setVisibility(8);
            } else {
                ciVar.setVisibility(0);
            }
        }
        ajVar.B0.z(i10, z10);
    }
}
