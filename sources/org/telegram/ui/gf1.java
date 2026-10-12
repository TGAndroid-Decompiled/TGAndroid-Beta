package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class gf1 implements wh.c, MessagesController.ErrorDelegate, r0.n, org.telegram.ui.Components.nm0 {
    public final hg1 f38037a;

    public gf1(hg1 hg1Var) {
        this.f38037a = hg1Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        int i10 = k1Var.f46992a.f(519).d;
        hg1 hg1Var = this.f38037a;
        hg1Var.f38389e1 = i10;
        dg1 dg1Var = hg1Var.f38411r0;
        if (dg1Var != null) {
            dg1Var.setPadding(0, 0, 0, i10);
        }
        xf1 xf1Var = hg1Var.f38405n;
        if (xf1Var != null) {
            xf1Var.f43926a.setTranslationY((-hg1Var.f38389e1) - hg1Var.f38386d1);
        }
        hg1Var.h.setTranslationY(((-hg1Var.X0) - hg1Var.f38389e1) - hg1Var.f38386d1);
        hg1Var.B0();
        return r0.k1.f46991b;
    }

    @Override
    public boolean mo17c(float f7, float f10, int i10, View view) {
        return hg1.W(this.f38037a, view, f7);
    }

    @Override
    public void g(boolean z10, boolean z11) {
        hg1 hg1Var = this.f38037a;
        hg1Var.U0.i(hg1Var.R0.c(), z10, z11);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return hg1.U(this.f38037a, tL_error);
    }

    @Override
    public void h() {
    }

    @Override
    public void q(float f7) {
    }
}
