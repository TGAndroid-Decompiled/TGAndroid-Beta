package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class rp0 extends org.telegram.ui.ActionBar.p1 {
    public final sp0 f30098x;

    public rp0(sp0 sp0Var, sp0 sp0Var2) {
        super(sp0Var2);
        this.f30098x = sp0Var;
    }

    @Override
    public final boolean b() {
        hq0 hq0Var = this.f30098x.H0;
        if (!hq0Var.isDismissed() && hq0Var.Y) {
            return !hq0Var.d.m();
        }
        return false;
    }

    @Override
    public final void e(float r9, float r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rp0.e(float, float, boolean):void");
    }

    @Override
    public final void f() {
        hq0 hq0Var = this.f30098x.H0;
        mp0 mp0Var = hq0Var.d;
        if (mp0Var == null || !mp0Var.m()) {
            int i10 = hq0Var.N0;
            AndroidUtilities.dp(20.0f);
        }
        hq0Var.f26836r0 = false;
        int i11 = hq0Var.f26833p0;
        hq0Var.f26834q0 = i11;
        hq0Var.F.setTopGlowOffset(i11);
        hq0Var.f26815b.setTranslationY(hq0Var.f26833p0);
        hq0Var.Q.setTranslationY(hq0Var.f26833p0);
        hq0Var.F.setTranslationY(0.0f);
        hq0Var.G.setTranslationY(0.0f);
        hq0Var.Y0();
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        sp0 sp0Var = this.f30098x;
        hq0 hq0Var = sp0Var.H0;
        int i12 = hq0Var.f26834q0;
        int i13 = hq0Var.f26833p0;
        if (i12 != i13) {
            sp0Var.B0 = i12;
            sp0Var.C0 = i13;
            hq0Var.f26836r0 = true;
            hq0Var.f26833p0 = i12;
        } else {
            sp0Var.B0 = -1;
        }
        int i14 = sp0Var.f30418z0;
        int i15 = sp0Var.A0;
        if (i14 != i15) {
            sp0Var.D0 = 0;
            sp0Var.E0 = 0;
            hq0Var.f26836r0 = true;
            if (!z10) {
                sp0Var.E0 = 0 - (i14 - i15);
            } else {
                sp0Var.E0 = i14 - i15;
            }
            if (z10) {
                i11 = sp0Var.B0;
            } else {
                i11 = sp0Var.C0;
            }
            hq0Var.f26833p0 = i11;
        } else {
            sp0Var.D0 = -1;
        }
        hq0Var.F.setTopGlowOffset((int) (hq0Var.f26839t0 + hq0Var.f26833p0));
        hq0Var.f26815b.setTranslationY(hq0Var.f26839t0 + hq0Var.f26833p0);
        hq0Var.Q.setTranslationY(hq0Var.f26839t0 + hq0Var.f26833p0);
        sp0Var.invalidate();
    }
}
