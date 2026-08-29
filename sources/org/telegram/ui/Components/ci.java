package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class ci extends org.telegram.ui.ActionBar.q1 {
    public final di f27487x;

    public ci(di diVar, di diVar2) {
        super(diVar2);
        this.f27487x = diVar;
    }

    @Override
    public final boolean b() {
        fz fzVar;
        ni niVar = this.f27487x.f27773x0;
        if (!niVar.isDismissed() && niVar.f31032o1) {
            fi fiVar = niVar.f31051u0;
            if (fiVar == niVar.f31014i0 || fiVar == niVar.f31017j0 || niVar.m1().m()) {
                fi fiVar2 = niVar.f31051u0;
                on onVar = niVar.f31014i0;
                if (fiVar2 != onVar || ((fzVar = onVar.A) != null && fzVar.getVisibility() == 0)) {
                    fi fiVar3 = niVar.f31051u0;
                    on onVar2 = niVar.f31017j0;
                    if (fiVar3 == onVar2) {
                        fz fzVar2 = onVar2.A;
                        if (fzVar2 != null && fzVar2.getVisibility() == 0) {
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
    public final void e(float f9, float f10, boolean z10) {
        di diVar = this.f27487x;
        ni niVar = diVar.f27773x0;
        niVar.f31013h2 = f9;
        float f11 = niVar.Z1;
        if (f11 > 0.0f) {
            niVar.f31013h2 = com.google.android.recaptcha.internal.a.z(1.0f, f10, f11 - niVar.a2, f9);
        }
        niVar.T0.setTranslationY(niVar.f31013h2);
        niVar.W0.setTranslationY(niVar.f31013h2);
        org.telegram.ui.ActionBar.w0 w0Var = niVar.f30988a1;
        if (w0Var != null) {
            w0Var.setTranslationY(niVar.f31013h2);
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = niVar.Y0;
        if (w0Var2 != null) {
            w0Var2.setTranslationY(niVar.W0.getTranslationY());
        }
        nh.t3 t3Var = niVar.Z0;
        if (t3Var != null) {
            t3Var.setTranslationY(niVar.W0.getTranslationY());
        }
        niVar.f30991b1.setTranslationY(niVar.f31013h2);
        niVar.a2(0);
        niVar.setCurrentPanTranslationY(niVar.f31013h2);
        diVar.invalidate();
        niVar.f31069z0.invalidate();
        niVar.U1();
        fi fiVar = niVar.f31051u0;
        if (fiVar != null) {
            fiVar.k(niVar.f31013h2);
        }
    }

    @Override
    public final void f() {
        boolean z10;
        int i10;
        ni niVar = this.f27487x.f27773x0;
        niVar.X1(niVar.f31051u0, 0);
        niVar.Y1 = niVar.X1[0];
        niVar.f31051u0.v();
        if ((niVar.f31051u0 instanceof ph.n3) && !niVar.f31070z1) {
            z10 = ((org.telegram.ui.ActionBar.f3) niVar).keyboardVisible;
            if (z10) {
                i10 = AndroidUtilities.dp(84.0f);
            } else {
                i10 = 0;
            }
            for (int i11 = 0; i11 < niVar.f31048t0.size(); i11++) {
                ((ph.n3) niVar.f31048t0.valueAt(i11)).setMeasureOffsetY(i10);
            }
        }
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        di diVar = this.f27487x;
        ni niVar = diVar.f27773x0;
        int i12 = niVar.Y1;
        if (i12 > 0 && i12 != (i11 = niVar.X1[0]) && z10) {
            niVar.Z1 = i12;
            niVar.a2 = i11;
        } else {
            niVar.Z1 = -1.0f;
        }
        diVar.invalidate();
        ph phVar = niVar.f31049t1;
        if ((niVar.f31051u0 instanceof ph.n3) && !niVar.f31070z1) {
            if (z10) {
                phVar.setVisibility(8);
            } else {
                phVar.setVisibility(0);
            }
        }
        niVar.f31051u0.w(i10, z10);
    }
}
