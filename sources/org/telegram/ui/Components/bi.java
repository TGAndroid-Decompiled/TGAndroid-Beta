package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class bi extends org.telegram.ui.ActionBar.r1 {
    public final ci f25605x;

    public bi(ci ciVar, ci ciVar2) {
        super(ciVar2);
        this.f25605x = ciVar;
    }

    @Override
    public final boolean b() {
        mz mzVar;
        mi miVar = this.f25605x.f25956y0;
        if (!miVar.isDismissed() && miVar.f29099p1) {
            ei eiVar = miVar.f29118v0;
            if (eiVar == miVar.f29081j0 || eiVar == miVar.f29084k0 || miVar.m1().m()) {
                ei eiVar2 = miVar.f29118v0;
                rn rnVar = miVar.f29081j0;
                if (eiVar2 != rnVar || ((mzVar = rnVar.B) != null && mzVar.getVisibility() == 0)) {
                    ei eiVar3 = miVar.f29118v0;
                    rn rnVar2 = miVar.f29084k0;
                    if (eiVar3 == rnVar2) {
                        mz mzVar2 = rnVar2.B;
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
    public final void e(float f10, float f11, boolean z4) {
        ci ciVar = this.f25605x;
        mi miVar = ciVar.f25956y0;
        miVar.f29080i2 = f10;
        float f12 = miVar.a2;
        if (f12 > 0.0f) {
            miVar.f29080i2 = e2.c.w(1.0f, f11, f12 - miVar.f29056b2, f10);
        }
        miVar.U0.setTranslationY(miVar.f29080i2);
        miVar.X0.setTranslationY(miVar.f29080i2);
        org.telegram.ui.ActionBar.w0 w0Var = miVar.f29055b1;
        if (w0Var != null) {
            w0Var.setTranslationY(miVar.f29080i2);
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = miVar.Z0;
        if (w0Var2 != null) {
            w0Var2.setTranslationY(miVar.X0.getTranslationY());
        }
        qh.e3 e3Var = miVar.f29052a1;
        if (e3Var != null) {
            e3Var.setTranslationY(miVar.X0.getTranslationY());
        }
        miVar.f29059c1.setTranslationY(miVar.f29080i2);
        miVar.a2(0);
        miVar.setCurrentPanTranslationY(miVar.f29080i2);
        ciVar.invalidate();
        miVar.A0.invalidate();
        miVar.U1();
        ei eiVar = miVar.f29118v0;
        if (eiVar != null) {
            eiVar.k(miVar.f29080i2);
        }
    }

    @Override
    public final void f() {
        boolean z4;
        int i10;
        mi miVar = this.f25605x.f25956y0;
        miVar.X1(miVar.f29118v0, 0);
        miVar.Z1 = miVar.Y1[0];
        miVar.f29118v0.v();
        if ((miVar.f29118v0 instanceof sh.n3) && !miVar.A1) {
            z4 = ((org.telegram.ui.ActionBar.h3) miVar).keyboardVisible;
            if (z4) {
                i10 = AndroidUtilities.dp(84.0f);
            } else {
                i10 = 0;
            }
            for (int i11 = 0; i11 < miVar.f29115u0.size(); i11++) {
                ((sh.n3) miVar.f29115u0.valueAt(i11)).setMeasureOffsetY(i10);
            }
        }
    }

    @Override
    public final void g(int i10, boolean z4) {
        int i11;
        ci ciVar = this.f25605x;
        mi miVar = ciVar.f25956y0;
        int i12 = miVar.Z1;
        if (i12 > 0 && i12 != (i11 = miVar.Y1[0]) && z4) {
            miVar.a2 = i12;
            miVar.f29056b2 = i11;
        } else {
            miVar.a2 = -1.0f;
        }
        ciVar.invalidate();
        mh mhVar = miVar.f29116u1;
        if ((miVar.f29118v0 instanceof sh.n3) && !miVar.A1) {
            if (z4) {
                mhVar.setVisibility(8);
            } else {
                mhVar.setVisibility(0);
            }
        }
        miVar.f29118v0.w(i10, z4);
    }
}
