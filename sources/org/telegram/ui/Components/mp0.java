package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class mp0 extends org.telegram.ui.ActionBar.q1 {
    public final np0 f30751x;

    public mp0(np0 np0Var, np0 np0Var2) {
        super(np0Var2);
        this.f30751x = np0Var;
    }

    @Override
    public final boolean b() {
        dq0 dq0Var = this.f30751x.D0;
        if (!dq0Var.isDismissed() && dq0Var.U) {
            return !dq0Var.d.m();
        }
        return false;
    }

    @Override
    public final void e(float r9, float r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.mp0.e(float, float, boolean):void");
    }

    @Override
    public final void f() {
        dq0 dq0Var = this.f30751x.D0;
        gp0 gp0Var = dq0Var.d;
        if (gp0Var == null || !gp0Var.m()) {
            int i10 = dq0Var.J0;
            AndroidUtilities.dp(20.0f);
        }
        dq0Var.f27844n0 = false;
        int i11 = dq0Var.f27842l0;
        dq0Var.m0 = i11;
        dq0Var.B.setTopGlowOffset(i11);
        dq0Var.f27828b.setTranslationY(dq0Var.f27842l0);
        dq0Var.M.setTranslationY(dq0Var.f27842l0);
        dq0Var.B.setTranslationY(0.0f);
        dq0Var.C.setTranslationY(0.0f);
        dq0Var.Y0();
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        np0 np0Var = this.f30751x;
        dq0 dq0Var = np0Var.D0;
        int i12 = dq0Var.m0;
        int i13 = dq0Var.f27842l0;
        if (i12 != i13) {
            np0Var.f31115x0 = i12;
            np0Var.f31116y0 = i13;
            dq0Var.f27844n0 = true;
            dq0Var.f27842l0 = i12;
        } else {
            np0Var.f31115x0 = -1;
        }
        int i14 = np0Var.f31113v0;
        int i15 = np0Var.f31114w0;
        if (i14 != i15) {
            np0Var.f31117z0 = 0;
            np0Var.A0 = 0;
            dq0Var.f27844n0 = true;
            if (!z10) {
                np0Var.A0 = 0 - (i14 - i15);
            } else {
                np0Var.A0 = i14 - i15;
            }
            if (z10) {
                i11 = np0Var.f31115x0;
            } else {
                i11 = np0Var.f31116y0;
            }
            dq0Var.f27842l0 = i11;
        } else {
            np0Var.f31117z0 = -1;
        }
        dq0Var.B.setTopGlowOffset((int) (dq0Var.f27846p0 + dq0Var.f27842l0));
        dq0Var.f27828b.setTranslationY(dq0Var.f27846p0 + dq0Var.f27842l0);
        dq0Var.M.setTranslationY(dq0Var.f27846p0 + dq0Var.f27842l0);
        np0Var.invalidate();
    }
}
