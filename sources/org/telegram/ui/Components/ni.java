package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ni extends org.telegram.ui.ActionBar.r1 {
    public final oi f25528x;

    public ni(oi oiVar, oi oiVar2) {
        super(oiVar2);
        this.f25528x = oiVar;
    }

    @Override
    public final boolean b() {
        rz rzVar;
        yi yiVar = this.f25528x.B0;
        if (!yiVar.isDismissed() && yiVar.f29407s1) {
            qi qiVar = yiVar.f29427y0;
            if (qiVar == yiVar.m0 || qiVar == yiVar.f29389n0 || yiVar.m1().m()) {
                qi qiVar2 = yiVar.f29427y0;
                zn znVar = yiVar.m0;
                if (qiVar2 != znVar || ((rzVar = znVar.E) != null && rzVar.getVisibility() == 0)) {
                    qi qiVar3 = yiVar.f29427y0;
                    zn znVar2 = yiVar.f29389n0;
                    if (qiVar3 == znVar2) {
                        rz rzVar2 = znVar2.E;
                        if (rzVar2 != null && rzVar2.getVisibility() == 0) {
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
        oi oiVar = this.f25528x;
        yi yiVar = oiVar.B0;
        yiVar.f29385l2 = f7;
        float f11 = yiVar.f29361d2;
        if (f11 > 0.0f) {
            yiVar.f29385l2 = com.google.android.gms.internal.vision.e2.z(1.0f, f10, f11 - yiVar.f29364e2, f7);
        }
        yiVar.X0.setTranslationY(yiVar.f29385l2);
        yiVar.f29350a1.setTranslationY(yiVar.f29385l2);
        org.telegram.ui.ActionBar.w0 w0Var = yiVar.f29363e1;
        if (w0Var != null) {
            w0Var.setTranslationY(yiVar.f29385l2);
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = yiVar.f29357c1;
        if (w0Var2 != null) {
            w0Var2.setTranslationY(yiVar.f29350a1.getTranslationY());
        }
        bi.x4 x4Var = yiVar.f29360d1;
        if (x4Var != null) {
            x4Var.setTranslationY(yiVar.f29350a1.getTranslationY());
        }
        yiVar.f29367f1.setTranslationY(yiVar.f29385l2);
        yiVar.a2(0);
        yiVar.setCurrentPanTranslationY(yiVar.f29385l2);
        oiVar.invalidate();
        yiVar.D0.invalidate();
        yiVar.U1();
        qi qiVar = yiVar.f29427y0;
        if (qiVar != null) {
            qiVar.k(yiVar.f29385l2);
        }
    }

    @Override
    public final void f() {
        boolean z10;
        int i10;
        yi yiVar = this.f25528x.B0;
        yiVar.X1(yiVar.f29427y0, 0);
        yiVar.f29358c2 = yiVar.f29354b2[0];
        yiVar.f29427y0.v();
        if ((yiVar.f29427y0 instanceof di.u4) && !yiVar.D1) {
            z10 = ((org.telegram.ui.ActionBar.h3) yiVar).keyboardVisible;
            if (z10) {
                i10 = AndroidUtilities.dp(84.0f);
            } else {
                i10 = 0;
            }
            for (int i11 = 0; i11 < yiVar.f29423x0.size(); i11++) {
                ((di.u4) yiVar.f29423x0.valueAt(i11)).setMeasureOffsetY(i10);
            }
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        oi oiVar = this.f25528x;
        yi yiVar = oiVar.B0;
        int i12 = yiVar.f29358c2;
        if (i12 > 0 && i12 != (i11 = yiVar.f29354b2[0]) && z10) {
            yiVar.f29361d2 = i12;
            yiVar.f29364e2 = i11;
        } else {
            yiVar.f29361d2 = -1.0f;
        }
        oiVar.invalidate();
        ai aiVar = yiVar.f29424x1;
        if ((yiVar.f29427y0 instanceof di.u4) && !yiVar.D1) {
            if (z10) {
                aiVar.setVisibility(8);
            } else {
                aiVar.setVisibility(0);
            }
        }
        yiVar.f29427y0.w(i10, z10);
    }
}
