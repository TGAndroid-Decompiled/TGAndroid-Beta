package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class cr0 extends org.telegram.ui.ActionBar.o1 {
    public final dr0 f24990x;

    public cr0(dr0 dr0Var, dr0 dr0Var2) {
        super(dr0Var2);
        this.f24990x = dr0Var;
    }

    @Override
    public final boolean b() {
        sr0 sr0Var = this.f24990x.H0;
        if (!sr0Var.isDismissed() && sr0Var.Y) {
            return !sr0Var.d.m();
        }
        return false;
    }

    @Override
    public final void e(float r9, float r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cr0.e(float, float, boolean):void");
    }

    @Override
    public final void f() {
        sr0 sr0Var = this.f24990x.H0;
        xq0 xq0Var = sr0Var.d;
        if (xq0Var == null || !xq0Var.m()) {
            int i10 = sr0Var.N0;
            AndroidUtilities.dp(20.0f);
        }
        sr0Var.f30654r0 = false;
        int i11 = sr0Var.f30651p0;
        sr0Var.f30652q0 = i11;
        sr0Var.F.setTopGlowOffset(i11);
        sr0Var.f30633b.setTranslationY(sr0Var.f30651p0);
        sr0Var.Q.setTranslationY(sr0Var.f30651p0);
        sr0Var.F.setTranslationY(0.0f);
        sr0Var.G.setTranslationY(0.0f);
        sr0Var.Z0();
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        dr0 dr0Var = this.f24990x;
        sr0 sr0Var = dr0Var.H0;
        int i12 = sr0Var.f30652q0;
        int i13 = sr0Var.f30651p0;
        if (i12 != i13) {
            dr0Var.B0 = i12;
            dr0Var.C0 = i13;
            sr0Var.f30654r0 = true;
            sr0Var.f30651p0 = i12;
        } else {
            dr0Var.B0 = -1;
        }
        int i14 = dr0Var.f25457z0;
        int i15 = dr0Var.A0;
        if (i14 != i15) {
            dr0Var.D0 = 0;
            dr0Var.E0 = 0;
            sr0Var.f30654r0 = true;
            if (!z10) {
                dr0Var.E0 = 0 - (i14 - i15);
            } else {
                dr0Var.E0 = i14 - i15;
            }
            if (z10) {
                i11 = dr0Var.B0;
            } else {
                i11 = dr0Var.C0;
            }
            sr0Var.f30651p0 = i11;
        } else {
            dr0Var.D0 = -1;
        }
        sr0Var.F.setTopGlowOffset((int) (sr0Var.f30657t0 + sr0Var.f30651p0));
        sr0Var.f30633b.setTranslationY(sr0Var.f30657t0 + sr0Var.f30651p0);
        sr0Var.Q.setTranslationY(sr0Var.f30657t0 + sr0Var.f30651p0);
        dr0Var.invalidate();
    }
}
