package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class yq0 extends org.telegram.ui.ActionBar.o1 {
    public final zq0 f33322x;

    public yq0(zq0 zq0Var, zq0 zq0Var2) {
        super(zq0Var2);
        this.f33322x = zq0Var;
    }

    @Override
    public final boolean b() {
        or0 or0Var = this.f33322x.H0;
        if (!or0Var.isDismissed() && or0Var.Y) {
            return !or0Var.d.m();
        }
        return false;
    }

    @Override
    public final void e(float r9, float r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yq0.e(float, float, boolean):void");
    }

    @Override
    public final void f() {
        or0 or0Var = this.f33322x.H0;
        tq0 tq0Var = or0Var.d;
        if (tq0Var == null || !tq0Var.m()) {
            int i10 = or0Var.N0;
            AndroidUtilities.dp(20.0f);
        }
        or0Var.f29497r0 = false;
        int i11 = or0Var.f29494p0;
        or0Var.f29495q0 = i11;
        or0Var.F.setTopGlowOffset(i11);
        or0Var.f29476b.setTranslationY(or0Var.f29494p0);
        or0Var.Q.setTranslationY(or0Var.f29494p0);
        or0Var.F.setTranslationY(0.0f);
        or0Var.G.setTranslationY(0.0f);
        or0Var.Z0();
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        zq0 zq0Var = this.f33322x;
        or0 or0Var = zq0Var.H0;
        int i12 = or0Var.f29495q0;
        int i13 = or0Var.f29494p0;
        if (i12 != i13) {
            zq0Var.B0 = i12;
            zq0Var.C0 = i13;
            or0Var.f29497r0 = true;
            or0Var.f29494p0 = i12;
        } else {
            zq0Var.B0 = -1;
        }
        int i14 = zq0Var.f33638z0;
        int i15 = zq0Var.A0;
        if (i14 != i15) {
            zq0Var.D0 = 0;
            zq0Var.E0 = 0;
            or0Var.f29497r0 = true;
            if (!z10) {
                zq0Var.E0 = 0 - (i14 - i15);
            } else {
                zq0Var.E0 = i14 - i15;
            }
            if (z10) {
                i11 = zq0Var.B0;
            } else {
                i11 = zq0Var.C0;
            }
            or0Var.f29494p0 = i11;
        } else {
            zq0Var.D0 = -1;
        }
        or0Var.F.setTopGlowOffset((int) (or0Var.f29500t0 + or0Var.f29494p0));
        or0Var.f29476b.setTranslationY(or0Var.f29500t0 + or0Var.f29494p0);
        or0Var.Q.setTranslationY(or0Var.f29500t0 + or0Var.f29494p0);
        zq0Var.invalidate();
    }
}
