package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class wp0 extends org.telegram.ui.ActionBar.r1 {
    public final xp0 f32836x;

    public wp0(xp0 xp0Var, xp0 xp0Var2) {
        super(xp0Var2);
        this.f32836x = xp0Var;
    }

    @Override
    public final boolean b() {
        mq0 mq0Var = this.f32836x.E0;
        if (!mq0Var.isDismissed() && mq0Var.V) {
            return !mq0Var.d.m();
        }
        return false;
    }

    @Override
    public final void e(float r9, float r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wp0.e(float, float, boolean):void");
    }

    @Override
    public final void f() {
        mq0 mq0Var = this.f32836x.E0;
        qp0 qp0Var = mq0Var.d;
        if (qp0Var == null || !qp0Var.m()) {
            int i10 = mq0Var.K0;
            AndroidUtilities.dp(20.0f);
        }
        mq0Var.f29214o0 = false;
        int i11 = mq0Var.m0;
        mq0Var.f29213n0 = i11;
        mq0Var.C.setTopGlowOffset(i11);
        mq0Var.f29197b.setTranslationY(mq0Var.m0);
        mq0Var.N.setTranslationY(mq0Var.m0);
        mq0Var.C.setTranslationY(0.0f);
        mq0Var.D.setTranslationY(0.0f);
        mq0Var.Y0();
    }

    @Override
    public final void g(int i10, boolean z4) {
        int i11;
        xp0 xp0Var = this.f32836x;
        mq0 mq0Var = xp0Var.E0;
        int i12 = mq0Var.f29213n0;
        int i13 = mq0Var.m0;
        if (i12 != i13) {
            xp0Var.f33151y0 = i12;
            xp0Var.f33152z0 = i13;
            mq0Var.f29214o0 = true;
            mq0Var.m0 = i12;
        } else {
            xp0Var.f33151y0 = -1;
        }
        int i14 = xp0Var.f33149w0;
        int i15 = xp0Var.f33150x0;
        if (i14 != i15) {
            xp0Var.A0 = 0;
            xp0Var.B0 = 0;
            mq0Var.f29214o0 = true;
            if (!z4) {
                xp0Var.B0 = 0 - (i14 - i15);
            } else {
                xp0Var.B0 = i14 - i15;
            }
            if (z4) {
                i11 = xp0Var.f33151y0;
            } else {
                i11 = xp0Var.f33152z0;
            }
            mq0Var.m0 = i11;
        } else {
            xp0Var.A0 = -1;
        }
        mq0Var.C.setTopGlowOffset((int) (mq0Var.f29216q0 + mq0Var.m0));
        mq0Var.f29197b.setTranslationY(mq0Var.f29216q0 + mq0Var.m0);
        mq0Var.N.setTranslationY(mq0Var.f29216q0 + mq0Var.m0);
        xp0Var.invalidate();
    }
}
