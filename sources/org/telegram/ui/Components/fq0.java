package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class fq0 extends org.telegram.ui.ActionBar.p1 {
    public final gq0 f24202x;

    public fq0(gq0 gq0Var, gq0 gq0Var2) {
        super(gq0Var2);
        this.f24202x = gq0Var;
    }

    @Override
    public final boolean b() {
        vq0 vq0Var = this.f24202x.H0;
        if (!vq0Var.isDismissed() && vq0Var.Y) {
            return !vq0Var.d.m();
        }
        return false;
    }

    @Override
    public final void e(float r9, float r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.fq0.e(float, float, boolean):void");
    }

    @Override
    public final void f() {
        vq0 vq0Var = this.f24202x.H0;
        aq0 aq0Var = vq0Var.d;
        if (aq0Var == null || !aq0Var.m()) {
            int i10 = vq0Var.N0;
            AndroidUtilities.dp(20.0f);
        }
        vq0Var.f29733r0 = false;
        int i11 = vq0Var.f29730p0;
        vq0Var.f29731q0 = i11;
        vq0Var.F.setTopGlowOffset(i11);
        vq0Var.f29713b.setTranslationY(vq0Var.f29730p0);
        vq0Var.Q.setTranslationY(vq0Var.f29730p0);
        vq0Var.F.setTranslationY(0.0f);
        vq0Var.G.setTranslationY(0.0f);
        vq0Var.Y0();
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        gq0 gq0Var = this.f24202x;
        vq0 vq0Var = gq0Var.H0;
        int i12 = vq0Var.f29731q0;
        int i13 = vq0Var.f29730p0;
        if (i12 != i13) {
            gq0Var.B0 = i12;
            gq0Var.C0 = i13;
            vq0Var.f29733r0 = true;
            vq0Var.f29730p0 = i12;
        } else {
            gq0Var.B0 = -1;
        }
        int i14 = gq0Var.f24473z0;
        int i15 = gq0Var.A0;
        if (i14 != i15) {
            gq0Var.D0 = 0;
            gq0Var.E0 = 0;
            vq0Var.f29733r0 = true;
            if (!z10) {
                gq0Var.E0 = 0 - (i14 - i15);
            } else {
                gq0Var.E0 = i14 - i15;
            }
            if (z10) {
                i11 = gq0Var.B0;
            } else {
                i11 = gq0Var.C0;
            }
            vq0Var.f29730p0 = i11;
        } else {
            gq0Var.D0 = -1;
        }
        vq0Var.F.setTopGlowOffset((int) (vq0Var.f29736t0 + vq0Var.f29730p0));
        vq0Var.f29713b.setTranslationY(vq0Var.f29736t0 + vq0Var.f29730p0);
        vq0Var.Q.setTranslationY(vq0Var.f29736t0 + vq0Var.f29730p0);
        gq0Var.invalidate();
    }
}
