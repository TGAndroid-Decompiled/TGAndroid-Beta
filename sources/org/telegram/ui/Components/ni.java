package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ni extends org.telegram.ui.ActionBar.o1 {
    public final oi f29168x;

    public ni(oi oiVar, oi oiVar2) {
        super(oiVar2);
        this.f29168x = oiVar;
    }

    @Override
    public final boolean b() {
        b00 b00Var;
        yi yiVar = this.f29168x.B0;
        if ((!yiVar.isDismissed() || yiVar.f33346x0) && yiVar.f33339v1) {
            qi qiVar = yiVar.B0;
            if (qiVar == yiVar.m0 || qiVar == yiVar.f33312n0 || yiVar.o1().m()) {
                qi qiVar2 = yiVar.B0;
                lo loVar = yiVar.m0;
                if (qiVar2 != loVar || ((b00Var = loVar.E) != null && b00Var.getVisibility() == 0)) {
                    qi qiVar3 = yiVar.B0;
                    lo loVar2 = yiVar.f33312n0;
                    if (qiVar3 == loVar2) {
                        b00 b00Var2 = loVar2.E;
                        if (b00Var2 != null && b00Var2.getVisibility() == 0) {
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
        oi oiVar = this.f29168x;
        yi yiVar = oiVar.B0;
        yiVar.f33317o2 = f7;
        float f12 = yiVar.f33294g2;
        float f13 = 0.0f;
        if (f12 > 0.0f) {
            if (yiVar.B0 == yiVar.f33342w0 && !z10) {
                f11 = f10;
            } else {
                f11 = 1.0f - f10;
            }
            yiVar.f33317o2 = com.google.android.gms.internal.vision.e2.y(f12, yiVar.f33297h2, f11, f7);
        }
        yiVar.f33272a1.setTranslationY(yiVar.f33317o2);
        yiVar.f33282d1.setTranslationY(yiVar.f33317o2);
        org.telegram.ui.ActionBar.u0 u0Var = yiVar.f33296h1;
        if (u0Var != null) {
            u0Var.setTranslationY(yiVar.f33317o2);
        }
        org.telegram.ui.ActionBar.u0 u0Var2 = yiVar.f33290f1;
        if (u0Var2 != null) {
            u0Var2.setTranslationY(yiVar.f33282d1.getTranslationY());
        }
        ci.d4 d4Var = yiVar.f33293g1;
        if (d4Var != null) {
            d4Var.setTranslationY(yiVar.f33282d1.getTranslationY());
        }
        yiVar.f33299i1.setTranslationY(yiVar.f33317o2);
        yiVar.e2(0);
        if (yiVar.B0 != yiVar.f33342w0) {
            f13 = yiVar.f33317o2;
        }
        yiVar.setCurrentPanTranslationY(f13);
        oiVar.invalidate();
        yiVar.G0.invalidate();
        yiVar.Y1();
        qi qiVar = yiVar.B0;
        if (qiVar != null) {
            qiVar.m(yiVar.f33317o2, f10);
        }
    }

    @Override
    public final void f() {
        boolean z10;
        int i10;
        yi yiVar = this.f29168x.B0;
        yiVar.b2(yiVar.B0, 0);
        yiVar.f33291f2 = yiVar.f33287e2[0];
        yiVar.B0.y();
        if ((yiVar.B0 instanceof ei.p4) && !yiVar.G1) {
            z10 = ((org.telegram.ui.ActionBar.e3) yiVar).keyboardVisible;
            if (z10) {
                i10 = AndroidUtilities.dp(84.0f);
            } else {
                i10 = 0;
            }
            for (int i11 = 0; i11 < yiVar.A0.size(); i11++) {
                ((ei.p4) yiVar.A0.valueAt(i11)).setMeasureOffsetY(i10);
            }
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        oi oiVar = this.f29168x;
        yi yiVar = oiVar.B0;
        int i12 = yiVar.f33291f2;
        if (i12 > 0 && i12 != (i11 = yiVar.f33287e2[0]) && (z10 || yiVar.B0 == yiVar.f33342w0)) {
            yiVar.f33294g2 = i12;
            yiVar.f33297h2 = i11;
        } else {
            yiVar.f33294g2 = -1.0f;
        }
        oiVar.invalidate();
        ai aiVar = yiVar.A1;
        if ((yiVar.B0 instanceof ei.p4) && !yiVar.G1) {
            if (z10) {
                aiVar.setVisibility(8);
            } else {
                aiVar.setVisibility(0);
            }
        }
        yiVar.B0.z(i10, z10);
    }
}
