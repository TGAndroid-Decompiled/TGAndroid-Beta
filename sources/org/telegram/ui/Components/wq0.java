package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class wq0 extends org.telegram.ui.ActionBar.p1 {
    public final xq0 f32658x;

    public wq0(xq0 xq0Var, xq0 xq0Var2) {
        super(xq0Var2);
        this.f32658x = xq0Var;
    }

    @Override
    public final boolean b() {
        mr0 mr0Var = this.f32658x.H0;
        if (!mr0Var.isDismissed() && mr0Var.Y) {
            return !mr0Var.d.m();
        }
        return false;
    }

    @Override
    public final void e(float r9, float r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wq0.e(float, float, boolean):void");
    }

    @Override
    public final void f() {
        mr0 mr0Var = this.f32658x.H0;
        rq0 rq0Var = mr0Var.d;
        if (rq0Var == null || !rq0Var.m()) {
            int i10 = mr0Var.N0;
            AndroidUtilities.dp(20.0f);
        }
        mr0Var.f28915r0 = false;
        int i11 = mr0Var.f28912p0;
        mr0Var.f28913q0 = i11;
        mr0Var.F.setTopGlowOffset(i11);
        mr0Var.f28894b.setTranslationY(mr0Var.f28912p0);
        mr0Var.Q.setTranslationY(mr0Var.f28912p0);
        mr0Var.F.setTranslationY(0.0f);
        mr0Var.G.setTranslationY(0.0f);
        mr0Var.Z0();
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        xq0 xq0Var = this.f32658x;
        mr0 mr0Var = xq0Var.H0;
        int i12 = mr0Var.f28913q0;
        int i13 = mr0Var.f28912p0;
        if (i12 != i13) {
            xq0Var.B0 = i12;
            xq0Var.C0 = i13;
            mr0Var.f28915r0 = true;
            mr0Var.f28912p0 = i12;
        } else {
            xq0Var.B0 = -1;
        }
        int i14 = xq0Var.f32995z0;
        int i15 = xq0Var.A0;
        if (i14 != i15) {
            xq0Var.D0 = 0;
            xq0Var.E0 = 0;
            mr0Var.f28915r0 = true;
            if (!z10) {
                xq0Var.E0 = 0 - (i14 - i15);
            } else {
                xq0Var.E0 = i14 - i15;
            }
            if (z10) {
                i11 = xq0Var.B0;
            } else {
                i11 = xq0Var.C0;
            }
            mr0Var.f28912p0 = i11;
        } else {
            xq0Var.D0 = -1;
        }
        mr0Var.F.setTopGlowOffset((int) (mr0Var.f28918t0 + mr0Var.f28912p0));
        mr0Var.f28894b.setTranslationY(mr0Var.f28918t0 + mr0Var.f28912p0);
        mr0Var.Q.setTranslationY(mr0Var.f28918t0 + mr0Var.f28912p0);
        xq0Var.invalidate();
    }
}
