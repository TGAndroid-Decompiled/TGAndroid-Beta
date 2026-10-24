package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class rq0 extends org.telegram.ui.ActionBar.o1 {
    public final sq0 f30259x;

    public rq0(sq0 sq0Var, sq0 sq0Var2) {
        super(sq0Var2);
        this.f30259x = sq0Var;
    }

    @Override
    public final boolean b() {
        hr0 hr0Var = this.f30259x.G0;
        if (!hr0Var.isDismissed() && hr0Var.Z) {
            return !hr0Var.d.m();
        }
        return false;
    }

    @Override
    public final void e(float r9, float r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rq0.e(float, float, boolean):void");
    }

    @Override
    public final void f() {
        hr0 hr0Var = this.f30259x.G0;
        mq0 mq0Var = hr0Var.d;
        if (mq0Var == null || !mq0Var.m()) {
            int i10 = hr0Var.O0;
            AndroidUtilities.dp(20.0f);
        }
        hr0Var.f27144s0 = false;
        int i11 = hr0Var.f27140q0;
        hr0Var.f27142r0 = i11;
        hr0Var.G.setTopGlowOffset(i11);
        hr0Var.f27120b.setTranslationY(hr0Var.f27140q0);
        hr0Var.R.setTranslationY(hr0Var.f27140q0);
        hr0Var.G.setTranslationY(0.0f);
        hr0Var.H.setTranslationY(0.0f);
        hr0Var.e1();
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        sq0 sq0Var = this.f30259x;
        hr0 hr0Var = sq0Var.G0;
        int i12 = hr0Var.f27142r0;
        int i13 = hr0Var.f27140q0;
        if (i12 != i13) {
            sq0Var.B0 = i12;
            sq0Var.C0 = i13;
            hr0Var.f27144s0 = true;
            hr0Var.f27140q0 = i12;
        } else {
            sq0Var.B0 = -1;
        }
        int i14 = sq0Var.f30612z0;
        int i15 = sq0Var.A0;
        if (i14 != i15) {
            sq0Var.D0 = 0;
            sq0Var.E0 = 0;
            hr0Var.f27144s0 = true;
            if (!z10) {
                sq0Var.E0 = 0 - (i14 - i15);
            } else {
                sq0Var.E0 = i14 - i15;
            }
            if (z10) {
                i11 = sq0Var.B0;
            } else {
                i11 = sq0Var.C0;
            }
            hr0Var.f27140q0 = i11;
        } else {
            sq0Var.D0 = -1;
        }
        hr0Var.G.setTopGlowOffset((int) (hr0Var.f27146u0 + hr0Var.f27140q0));
        hr0Var.f27120b.setTranslationY(hr0Var.f27146u0 + hr0Var.f27140q0);
        hr0Var.R.setTranslationY(hr0Var.f27146u0 + hr0Var.f27140q0);
        sq0Var.invalidate();
    }
}
