package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class sq0 extends org.telegram.ui.ActionBar.o1 {
    public final tq0 f28882x;

    public sq0(tq0 tq0Var, tq0 tq0Var2) {
        super(tq0Var2);
        this.f28882x = tq0Var;
    }

    @Override
    public final boolean b() {
        ir0 ir0Var = this.f28882x.H0;
        if (!ir0Var.isDismissed() && ir0Var.Y) {
            return !ir0Var.d.m();
        }
        return false;
    }

    @Override
    public final void e(float r9, float r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sq0.e(float, float, boolean):void");
    }

    @Override
    public final void f() {
        ir0 ir0Var = this.f28882x.H0;
        nq0 nq0Var = ir0Var.d;
        if (nq0Var == null || !nq0Var.m()) {
            int i10 = ir0Var.N0;
            AndroidUtilities.dp(20.0f);
        }
        ir0Var.f25761r0 = false;
        int i11 = ir0Var.f25758p0;
        ir0Var.f25759q0 = i11;
        ir0Var.F.setTopGlowOffset(i11);
        ir0Var.f25741b.setTranslationY(ir0Var.f25758p0);
        ir0Var.Q.setTranslationY(ir0Var.f25758p0);
        ir0Var.F.setTranslationY(0.0f);
        ir0Var.G.setTranslationY(0.0f);
        ir0Var.Z0();
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        tq0 tq0Var = this.f28882x;
        ir0 ir0Var = tq0Var.H0;
        int i12 = ir0Var.f25759q0;
        int i13 = ir0Var.f25758p0;
        if (i12 != i13) {
            tq0Var.B0 = i12;
            tq0Var.C0 = i13;
            ir0Var.f25761r0 = true;
            ir0Var.f25758p0 = i12;
        } else {
            tq0Var.B0 = -1;
        }
        int i14 = tq0Var.f29181z0;
        int i15 = tq0Var.A0;
        if (i14 != i15) {
            tq0Var.D0 = 0;
            tq0Var.E0 = 0;
            ir0Var.f25761r0 = true;
            if (!z10) {
                tq0Var.E0 = 0 - (i14 - i15);
            } else {
                tq0Var.E0 = i14 - i15;
            }
            if (z10) {
                i11 = tq0Var.B0;
            } else {
                i11 = tq0Var.C0;
            }
            ir0Var.f25758p0 = i11;
        } else {
            tq0Var.D0 = -1;
        }
        ir0Var.F.setTopGlowOffset((int) (ir0Var.f25764t0 + ir0Var.f25758p0));
        ir0Var.f25741b.setTranslationY(ir0Var.f25764t0 + ir0Var.f25758p0);
        ir0Var.Q.setTranslationY(ir0Var.f25764t0 + ir0Var.f25758p0);
        tq0Var.invalidate();
    }
}
