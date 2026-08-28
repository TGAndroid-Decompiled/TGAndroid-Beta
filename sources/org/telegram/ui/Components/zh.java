package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class zh extends org.telegram.ui.ActionBar.q1 {
    public final ai f35309x;

    public zh(ai aiVar, ai aiVar2) {
        super(aiVar2);
        this.f35309x = aiVar;
    }

    @Override
    public final boolean b() {
        wy wyVar;
        ki kiVar = this.f35309x.f26820x0;
        if (!kiVar.isDismissed() && kiVar.f30141o1) {
            ci ciVar = kiVar.f30160u0;
            if (ciVar == kiVar.f30123i0 || ciVar == kiVar.f30126j0 || kiVar.m1().m()) {
                ci ciVar2 = kiVar.f30160u0;
                jn jnVar = kiVar.f30123i0;
                if (ciVar2 != jnVar || ((wyVar = jnVar.A) != null && wyVar.getVisibility() == 0)) {
                    ci ciVar3 = kiVar.f30160u0;
                    jn jnVar2 = kiVar.f30126j0;
                    if (ciVar3 == jnVar2) {
                        wy wyVar2 = jnVar2.A;
                        if (wyVar2 != null && wyVar2.getVisibility() == 0) {
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
    public final void e(float f10, float f11, boolean z10) {
        ai aiVar = this.f35309x;
        ki kiVar = aiVar.f26820x0;
        kiVar.f30122h2 = f10;
        float f12 = kiVar.Z1;
        if (f12 > 0.0f) {
            kiVar.f30122h2 = e2.c.z(1.0f, f11, f12 - kiVar.a2, f10);
        }
        kiVar.T0.setTranslationY(kiVar.f30122h2);
        kiVar.W0.setTranslationY(kiVar.f30122h2);
        org.telegram.ui.ActionBar.w0 w0Var = kiVar.f30097a1;
        if (w0Var != null) {
            w0Var.setTranslationY(kiVar.f30122h2);
        }
        org.telegram.ui.ActionBar.w0 w0Var2 = kiVar.Y0;
        if (w0Var2 != null) {
            w0Var2.setTranslationY(kiVar.W0.getTranslationY());
        }
        kh.x3 x3Var = kiVar.Z0;
        if (x3Var != null) {
            x3Var.setTranslationY(kiVar.W0.getTranslationY());
        }
        kiVar.f30100b1.setTranslationY(kiVar.f30122h2);
        kiVar.a2(0);
        kiVar.setCurrentPanTranslationY(kiVar.f30122h2);
        aiVar.invalidate();
        kiVar.f30178z0.invalidate();
        kiVar.U1();
        ci ciVar = kiVar.f30160u0;
        if (ciVar != null) {
            ciVar.k(kiVar.f30122h2);
        }
    }

    @Override
    public final void f() {
        boolean z10;
        int i9;
        ki kiVar = this.f35309x.f26820x0;
        kiVar.X1(kiVar.f30160u0, 0);
        kiVar.Y1 = kiVar.X1[0];
        kiVar.f30160u0.v();
        if ((kiVar.f30160u0 instanceof mh.g4) && !kiVar.f30179z1) {
            z10 = ((org.telegram.ui.ActionBar.f3) kiVar).keyboardVisible;
            if (z10) {
                i9 = AndroidUtilities.dp(84.0f);
            } else {
                i9 = 0;
            }
            for (int i10 = 0; i10 < kiVar.f30157t0.size(); i10++) {
                ((mh.g4) kiVar.f30157t0.valueAt(i10)).setMeasureOffsetY(i9);
            }
        }
    }

    @Override
    public final void g(int i9, boolean z10) {
        int i10;
        ai aiVar = this.f35309x;
        ki kiVar = aiVar.f26820x0;
        int i11 = kiVar.Y1;
        if (i11 > 0 && i11 != (i10 = kiVar.X1[0]) && z10) {
            kiVar.Z1 = i11;
            kiVar.a2 = i10;
        } else {
            kiVar.Z1 = -1.0f;
        }
        aiVar.invalidate();
        mh mhVar = kiVar.f30158t1;
        if ((kiVar.f30160u0 instanceof mh.g4) && !kiVar.f30179z1) {
            if (z10) {
                mhVar.setVisibility(8);
            } else {
                mhVar.setVisibility(0);
            }
        }
        kiVar.f30160u0.w(i9, z10);
    }
}
