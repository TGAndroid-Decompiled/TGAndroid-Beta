package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class eq0 extends org.telegram.ui.ActionBar.o1 {
    public final fq0 f23986x;

    public eq0(fq0 fq0Var, fq0 fq0Var2) {
        super(fq0Var2);
        this.f23986x = fq0Var;
    }

    @Override
    public final boolean b() {
        uq0 uq0Var = this.f23986x.H0;
        if (!uq0Var.isDismissed() && uq0Var.Y) {
            return !uq0Var.d.m();
        }
        return false;
    }

    @Override
    public final void e(float r9, float r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.eq0.e(float, float, boolean):void");
    }

    @Override
    public final void f() {
        uq0 uq0Var = this.f23986x.H0;
        zp0 zp0Var = uq0Var.d;
        if (zp0Var == null || !zp0Var.m()) {
            int i10 = uq0Var.N0;
            AndroidUtilities.dp(20.0f);
        }
        uq0Var.f28895r0 = false;
        int i11 = uq0Var.f28892p0;
        uq0Var.f28893q0 = i11;
        uq0Var.F.setTopGlowOffset(i11);
        uq0Var.f28875b.setTranslationY(uq0Var.f28892p0);
        uq0Var.Q.setTranslationY(uq0Var.f28892p0);
        uq0Var.F.setTranslationY(0.0f);
        uq0Var.G.setTranslationY(0.0f);
        uq0Var.Y0();
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        fq0 fq0Var = this.f23986x;
        uq0 uq0Var = fq0Var.H0;
        int i12 = uq0Var.f28893q0;
        int i13 = uq0Var.f28892p0;
        if (i12 != i13) {
            fq0Var.B0 = i12;
            fq0Var.C0 = i13;
            uq0Var.f28895r0 = true;
            uq0Var.f28892p0 = i12;
        } else {
            fq0Var.B0 = -1;
        }
        int i14 = fq0Var.f24260z0;
        int i15 = fq0Var.A0;
        if (i14 != i15) {
            fq0Var.D0 = 0;
            fq0Var.E0 = 0;
            uq0Var.f28895r0 = true;
            if (!z10) {
                fq0Var.E0 = 0 - (i14 - i15);
            } else {
                fq0Var.E0 = i14 - i15;
            }
            if (z10) {
                i11 = fq0Var.B0;
            } else {
                i11 = fq0Var.C0;
            }
            uq0Var.f28892p0 = i11;
        } else {
            fq0Var.D0 = -1;
        }
        uq0Var.F.setTopGlowOffset((int) (uq0Var.f28898t0 + uq0Var.f28892p0));
        uq0Var.f28875b.setTranslationY(uq0Var.f28898t0 + uq0Var.f28892p0);
        uq0Var.Q.setTranslationY(uq0Var.f28898t0 + uq0Var.f28892p0);
        fq0Var.invalidate();
    }
}
