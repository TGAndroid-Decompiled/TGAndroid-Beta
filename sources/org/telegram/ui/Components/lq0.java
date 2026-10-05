package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class lq0 extends org.telegram.ui.ActionBar.p1 {
    public final mq0 f28514x;

    public lq0(mq0 mq0Var, mq0 mq0Var2) {
        super(mq0Var2);
        this.f28514x = mq0Var;
    }

    @Override
    public final boolean b() {
        br0 br0Var = this.f28514x.H0;
        if (!br0Var.isDismissed() && br0Var.Y) {
            return !br0Var.d.m();
        }
        return false;
    }

    @Override
    public final void e(float r9, float r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.lq0.e(float, float, boolean):void");
    }

    @Override
    public final void f() {
        br0 br0Var = this.f28514x.H0;
        fq0 fq0Var = br0Var.d;
        if (fq0Var == null || !fq0Var.m()) {
            int i10 = br0Var.N0;
            AndroidUtilities.dp(20.0f);
        }
        br0Var.f25073r0 = false;
        int i11 = br0Var.f25070p0;
        br0Var.f25071q0 = i11;
        br0Var.F.setTopGlowOffset(i11);
        br0Var.f25052b.setTranslationY(br0Var.f25070p0);
        br0Var.Q.setTranslationY(br0Var.f25070p0);
        br0Var.F.setTranslationY(0.0f);
        br0Var.G.setTranslationY(0.0f);
        br0Var.V0();
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        mq0 mq0Var = this.f28514x;
        br0 br0Var = mq0Var.H0;
        int i12 = br0Var.f25071q0;
        int i13 = br0Var.f25070p0;
        if (i12 != i13) {
            mq0Var.B0 = i12;
            mq0Var.C0 = i13;
            br0Var.f25073r0 = true;
            br0Var.f25070p0 = i12;
        } else {
            mq0Var.B0 = -1;
        }
        int i14 = mq0Var.f28766z0;
        int i15 = mq0Var.A0;
        if (i14 != i15) {
            mq0Var.D0 = 0;
            mq0Var.E0 = 0;
            br0Var.f25073r0 = true;
            if (!z10) {
                mq0Var.E0 = 0 - (i14 - i15);
            } else {
                mq0Var.E0 = i14 - i15;
            }
            if (z10) {
                i11 = mq0Var.B0;
            } else {
                i11 = mq0Var.C0;
            }
            br0Var.f25070p0 = i11;
        } else {
            mq0Var.D0 = -1;
        }
        br0Var.F.setTopGlowOffset((int) (br0Var.f25076t0 + br0Var.f25070p0));
        br0Var.f25052b.setTranslationY(br0Var.f25076t0 + br0Var.f25070p0);
        br0Var.Q.setTranslationY(br0Var.f25076t0 + br0Var.f25070p0);
        mq0Var.invalidate();
    }
}
