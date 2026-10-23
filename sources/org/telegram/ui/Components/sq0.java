package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;
public final class sq0 extends org.telegram.ui.ActionBar.o1 {
    public final tq0 f30539x;

    public sq0(tq0 tq0Var, tq0 tq0Var2) {
        super(tq0Var2);
        this.f30539x = tq0Var;
    }

    @Override
    public final boolean b() {
        ir0 ir0Var = this.f30539x.G0;
        if (!ir0Var.isDismissed() && ir0Var.Z) {
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
        ir0 ir0Var = this.f30539x.G0;
        nq0 nq0Var = ir0Var.d;
        if (nq0Var == null || !nq0Var.m()) {
            int i10 = ir0Var.O0;
            AndroidUtilities.dp(20.0f);
        }
        ir0Var.f27432s0 = false;
        int i11 = ir0Var.f27428q0;
        ir0Var.f27430r0 = i11;
        ir0Var.G.setTopGlowOffset(i11);
        ir0Var.f27408b.setTranslationY(ir0Var.f27428q0);
        ir0Var.R.setTranslationY(ir0Var.f27428q0);
        ir0Var.G.setTranslationY(0.0f);
        ir0Var.H.setTranslationY(0.0f);
        ir0Var.e1();
    }

    @Override
    public final void g(int i10, boolean z10) {
        int i11;
        tq0 tq0Var = this.f30539x;
        ir0 ir0Var = tq0Var.G0;
        int i12 = ir0Var.f27430r0;
        int i13 = ir0Var.f27428q0;
        if (i12 != i13) {
            tq0Var.B0 = i12;
            tq0Var.C0 = i13;
            ir0Var.f27432s0 = true;
            ir0Var.f27428q0 = i12;
        } else {
            tq0Var.B0 = -1;
        }
        int i14 = tq0Var.f30892z0;
        int i15 = tq0Var.A0;
        if (i14 != i15) {
            tq0Var.D0 = 0;
            tq0Var.E0 = 0;
            ir0Var.f27432s0 = true;
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
            ir0Var.f27428q0 = i11;
        } else {
            tq0Var.D0 = -1;
        }
        ir0Var.G.setTopGlowOffset((int) (ir0Var.f27434u0 + ir0Var.f27428q0));
        ir0Var.f27408b.setTranslationY(ir0Var.f27434u0 + ir0Var.f27428q0);
        ir0Var.R.setTranslationY(ir0Var.f27434u0 + ir0Var.f27428q0);
        tq0Var.invalidate();
    }
}
