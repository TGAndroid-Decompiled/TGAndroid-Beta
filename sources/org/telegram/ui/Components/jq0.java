package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class jq0 extends org.telegram.ui.ActionBar.p1 {
    public final kq0 f27876x;

    public jq0(kq0 kq0Var, kq0 kq0Var2) {
        super(kq0Var2);
        this.f27876x = kq0Var;
    }

    @Override
    public final boolean b() {
        zq0 zq0Var = this.f27876x.H0;
        if (!zq0Var.isDismissed() && zq0Var.Y) {
            return !zq0Var.d.m();
        }
        return false;
    }

    @Override
    public final void e(float r9, float r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.jq0.e(float, float, boolean):void");
    }

    @Override
    public final void f() {
        zq0 zq0Var = this.f27876x.H0;
        eq0 eq0Var = zq0Var.d;
        if (eq0Var == null || !eq0Var.m()) {
            int i10 = zq0Var.N0;
            AndroidUtilities.dp(20.0f);
        }
        zq0Var.f33618r0 = false;
        int i11 = zq0Var.f33615p0;
        zq0Var.f33616q0 = i11;
        zq0Var.F.setTopGlowOffset(i11);
        zq0Var.f33597b.setTranslationY(zq0Var.f33615p0);
        zq0Var.Q.setTranslationY(zq0Var.f33615p0);
        zq0Var.F.setTranslationY(0.0f);
        zq0Var.G.setTranslationY(0.0f);
        zq0Var.V0();
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        kq0 kq0Var = this.f27876x;
        zq0 zq0Var = kq0Var.H0;
        int i12 = zq0Var.f33616q0;
        int i13 = zq0Var.f33615p0;
        if (i12 != i13) {
            kq0Var.B0 = i12;
            kq0Var.C0 = i13;
            zq0Var.f33618r0 = true;
            zq0Var.f33615p0 = i12;
        } else {
            kq0Var.B0 = -1;
        }
        int i14 = kq0Var.f28184z0;
        int i15 = kq0Var.A0;
        if (i14 != i15) {
            kq0Var.D0 = 0;
            kq0Var.E0 = 0;
            zq0Var.f33618r0 = true;
            if (!z10) {
                kq0Var.E0 = 0 - (i14 - i15);
            } else {
                kq0Var.E0 = i14 - i15;
            }
            if (z10) {
                i11 = kq0Var.B0;
            } else {
                i11 = kq0Var.C0;
            }
            zq0Var.f33615p0 = i11;
        } else {
            kq0Var.D0 = -1;
        }
        zq0Var.F.setTopGlowOffset((int) (zq0Var.f33621t0 + zq0Var.f33615p0));
        zq0Var.f33597b.setTranslationY(zq0Var.f33621t0 + zq0Var.f33615p0);
        zq0Var.Q.setTranslationY(zq0Var.f33621t0 + zq0Var.f33615p0);
        kq0Var.invalidate();
    }
}
