package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class gq0 extends org.telegram.ui.ActionBar.p1 {
    public final hq0 f24605x;

    public gq0(hq0 hq0Var, hq0 hq0Var2) {
        super(hq0Var2);
        this.f24605x = hq0Var;
    }

    @Override
    public final boolean b() {
        wq0 wq0Var = this.f24605x.H0;
        if (!wq0Var.isDismissed() && wq0Var.Y) {
            return !wq0Var.d.m();
        }
        return false;
    }

    @Override
    public final void e(float r9, float r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gq0.e(float, float, boolean):void");
    }

    @Override
    public final void f() {
        wq0 wq0Var = this.f24605x.H0;
        bq0 bq0Var = wq0Var.d;
        if (bq0Var == null || !bq0Var.m()) {
            int i10 = wq0Var.N0;
            AndroidUtilities.dp(20.0f);
        }
        wq0Var.f30118r0 = false;
        int i11 = wq0Var.f30115p0;
        wq0Var.f30116q0 = i11;
        wq0Var.F.setTopGlowOffset(i11);
        wq0Var.f30098b.setTranslationY(wq0Var.f30115p0);
        wq0Var.Q.setTranslationY(wq0Var.f30115p0);
        wq0Var.F.setTranslationY(0.0f);
        wq0Var.G.setTranslationY(0.0f);
        wq0Var.Y0();
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        hq0 hq0Var = this.f24605x;
        wq0 wq0Var = hq0Var.H0;
        int i12 = wq0Var.f30116q0;
        int i13 = wq0Var.f30115p0;
        if (i12 != i13) {
            hq0Var.B0 = i12;
            hq0Var.C0 = i13;
            wq0Var.f30118r0 = true;
            wq0Var.f30115p0 = i12;
        } else {
            hq0Var.B0 = -1;
        }
        int i14 = hq0Var.f24869z0;
        int i15 = hq0Var.A0;
        if (i14 != i15) {
            hq0Var.D0 = 0;
            hq0Var.E0 = 0;
            wq0Var.f30118r0 = true;
            if (!z10) {
                hq0Var.E0 = 0 - (i14 - i15);
            } else {
                hq0Var.E0 = i14 - i15;
            }
            if (z10) {
                i11 = hq0Var.B0;
            } else {
                i11 = hq0Var.C0;
            }
            wq0Var.f30115p0 = i11;
        } else {
            hq0Var.D0 = -1;
        }
        wq0Var.F.setTopGlowOffset((int) (wq0Var.f30121t0 + wq0Var.f30115p0));
        wq0Var.f30098b.setTranslationY(wq0Var.f30121t0 + wq0Var.f30115p0);
        wq0Var.Q.setTranslationY(wq0Var.f30121t0 + wq0Var.f30115p0);
        hq0Var.invalidate();
    }
}
