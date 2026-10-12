package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class tq0 extends org.telegram.ui.ActionBar.o1 {
    public final uq0 f29479x;

    public tq0(uq0 uq0Var, uq0 uq0Var2) {
        super(uq0Var2);
        this.f29479x = uq0Var;
    }

    @Override
    public final boolean b() {
        jr0 jr0Var = this.f29479x.H0;
        if (!jr0Var.isDismissed() && jr0Var.Y) {
            return !jr0Var.d.m();
        }
        return false;
    }

    @Override
    public final void e(float r9, float r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tq0.e(float, float, boolean):void");
    }

    @Override
    public final void f() {
        jr0 jr0Var = this.f29479x.H0;
        oq0 oq0Var = jr0Var.d;
        if (oq0Var == null || !oq0Var.m()) {
            int i10 = jr0Var.N0;
            AndroidUtilities.dp(20.0f);
        }
        jr0Var.f26478r0 = false;
        int i11 = jr0Var.f26475p0;
        jr0Var.f26476q0 = i11;
        jr0Var.F.setTopGlowOffset(i11);
        jr0Var.f26458b.setTranslationY(jr0Var.f26475p0);
        jr0Var.Q.setTranslationY(jr0Var.f26475p0);
        jr0Var.F.setTranslationY(0.0f);
        jr0Var.G.setTranslationY(0.0f);
        jr0Var.Z0();
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        uq0 uq0Var = this.f29479x;
        jr0 jr0Var = uq0Var.H0;
        int i12 = jr0Var.f26476q0;
        int i13 = jr0Var.f26475p0;
        if (i12 != i13) {
            uq0Var.B0 = i12;
            uq0Var.C0 = i13;
            jr0Var.f26478r0 = true;
            jr0Var.f26475p0 = i12;
        } else {
            uq0Var.B0 = -1;
        }
        int i14 = uq0Var.f29754z0;
        int i15 = uq0Var.A0;
        if (i14 != i15) {
            uq0Var.D0 = 0;
            uq0Var.E0 = 0;
            jr0Var.f26478r0 = true;
            if (!z10) {
                uq0Var.E0 = 0 - (i14 - i15);
            } else {
                uq0Var.E0 = i14 - i15;
            }
            if (z10) {
                i11 = uq0Var.B0;
            } else {
                i11 = uq0Var.C0;
            }
            jr0Var.f26475p0 = i11;
        } else {
            uq0Var.D0 = -1;
        }
        jr0Var.F.setTopGlowOffset((int) (jr0Var.f26481t0 + jr0Var.f26475p0));
        jr0Var.f26458b.setTranslationY(jr0Var.f26481t0 + jr0Var.f26475p0);
        jr0Var.Q.setTranslationY(jr0Var.f26481t0 + jr0Var.f26475p0);
        uq0Var.invalidate();
    }
}
