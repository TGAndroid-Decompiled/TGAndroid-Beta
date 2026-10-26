package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class wq0 extends org.telegram.ui.ActionBar.q1 {
    public final xq0 f34522x;

    public wq0(xq0 xq0Var, xq0 xq0Var2) {
        super(xq0Var2);
        this.f34522x = xq0Var;
    }

    @Override
    public final boolean b() {
        mr0 mr0Var = this.f34522x.f34806v0;
        if (!mr0Var.isDismissed() && mr0Var.Z) {
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
        mr0 mr0Var = this.f34522x.f34806v0;
        rq0 rq0Var = mr0Var.d;
        if (rq0Var == null || !rq0Var.m()) {
            int i10 = mr0Var.O0;
            AndroidUtilities.dp(20.0f);
        }
        mr0Var.f30722s0 = false;
        int i11 = mr0Var.f30718q0;
        mr0Var.f30720r0 = i11;
        mr0Var.G.setTopGlowOffset(i11);
        mr0Var.f30700b.setTranslationY(mr0Var.f30718q0);
        mr0Var.R.setTranslationY(mr0Var.f30718q0);
        mr0Var.G.setTranslationY(0.0f);
        mr0Var.H.setTranslationY(0.0f);
        mr0Var.b1();
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        xq0 xq0Var = this.f34522x;
        mr0 mr0Var = xq0Var.f34806v0;
        int i12 = mr0Var.f30720r0;
        int i13 = mr0Var.f30718q0;
        if (i12 != i13) {
            xq0Var.f34801q0 = i12;
            xq0Var.f34802r0 = i13;
            mr0Var.f30722s0 = true;
            mr0Var.f30718q0 = i12;
        } else {
            xq0Var.f34801q0 = -1;
        }
        int i14 = xq0Var.f34799o0;
        int i15 = xq0Var.f34800p0;
        if (i14 != i15) {
            xq0Var.f34803s0 = 0;
            xq0Var.f34804t0 = 0;
            mr0Var.f30722s0 = true;
            if (!z10) {
                xq0Var.f34804t0 = 0 - (i14 - i15);
            } else {
                xq0Var.f34804t0 = i14 - i15;
            }
            if (z10) {
                i11 = xq0Var.f34801q0;
            } else {
                i11 = xq0Var.f34802r0;
            }
            mr0Var.f30718q0 = i11;
        } else {
            xq0Var.f34803s0 = -1;
        }
        mr0Var.G.setTopGlowOffset((int) (mr0Var.f30724u0 + mr0Var.f30718q0));
        mr0Var.f30700b.setTranslationY(mr0Var.f30724u0 + mr0Var.f30718q0);
        mr0Var.R.setTranslationY(mr0Var.f30724u0 + mr0Var.f30718q0);
        xq0Var.invalidate();
    }
}
