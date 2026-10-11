package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class xq0 extends org.telegram.ui.ActionBar.o1 {
    public final yq0 f33051x;

    public xq0(yq0 yq0Var, yq0 yq0Var2) {
        super(yq0Var2);
        this.f33051x = yq0Var;
    }

    @Override
    public final boolean b() {
        nr0 nr0Var = this.f33051x.H0;
        if (!nr0Var.isDismissed() && nr0Var.Y) {
            return !nr0Var.d.m();
        }
        return false;
    }

    @Override
    public final void e(float r9, float r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xq0.e(float, float, boolean):void");
    }

    @Override
    public final void f() {
        nr0 nr0Var = this.f33051x.H0;
        sq0 sq0Var = nr0Var.d;
        if (sq0Var == null || !sq0Var.m()) {
            int i10 = nr0Var.N0;
            AndroidUtilities.dp(20.0f);
        }
        nr0Var.f29254r0 = false;
        int i11 = nr0Var.f29251p0;
        nr0Var.f29252q0 = i11;
        nr0Var.F.setTopGlowOffset(i11);
        nr0Var.f29233b.setTranslationY(nr0Var.f29251p0);
        nr0Var.Q.setTranslationY(nr0Var.f29251p0);
        nr0Var.F.setTranslationY(0.0f);
        nr0Var.G.setTranslationY(0.0f);
        nr0Var.Z0();
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        yq0 yq0Var = this.f33051x;
        nr0 nr0Var = yq0Var.H0;
        int i12 = nr0Var.f29252q0;
        int i13 = nr0Var.f29251p0;
        if (i12 != i13) {
            yq0Var.B0 = i12;
            yq0Var.C0 = i13;
            nr0Var.f29254r0 = true;
            nr0Var.f29251p0 = i12;
        } else {
            yq0Var.B0 = -1;
        }
        int i14 = yq0Var.f33447z0;
        int i15 = yq0Var.A0;
        if (i14 != i15) {
            yq0Var.D0 = 0;
            yq0Var.E0 = 0;
            nr0Var.f29254r0 = true;
            if (!z10) {
                yq0Var.E0 = 0 - (i14 - i15);
            } else {
                yq0Var.E0 = i14 - i15;
            }
            if (z10) {
                i11 = yq0Var.B0;
            } else {
                i11 = yq0Var.C0;
            }
            nr0Var.f29251p0 = i11;
        } else {
            yq0Var.D0 = -1;
        }
        nr0Var.F.setTopGlowOffset((int) (nr0Var.f29257t0 + nr0Var.f29251p0));
        nr0Var.f29233b.setTranslationY(nr0Var.f29257t0 + nr0Var.f29251p0);
        nr0Var.Q.setTranslationY(nr0Var.f29257t0 + nr0Var.f29251p0);
        yq0Var.invalidate();
    }
}
