package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ef1 implements wh.c, MessagesController.ErrorDelegate, r0.n, org.telegram.ui.Components.hm0 {
    public final fg1 f37251a;

    public ef1(fg1 fg1Var) {
        this.f37251a = fg1Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        int i10 = k1Var.f46775a.f(519).d;
        fg1 fg1Var = this.f37251a;
        fg1Var.f37569e1 = i10;
        bg1 bg1Var = fg1Var.f37591r0;
        if (bg1Var != null) {
            bg1Var.setPadding(0, 0, 0, i10);
        }
        vf1 vf1Var = fg1Var.f37585n;
        if (vf1Var != null) {
            vf1Var.f42843a.setTranslationY((-fg1Var.f37569e1) - fg1Var.f37566d1);
        }
        fg1Var.h.setTranslationY(((-fg1Var.X0) - fg1Var.f37569e1) - fg1Var.f37566d1);
        fg1Var.B0();
        return r0.k1.f46774b;
    }

    @Override
    public boolean mo17c(float f7, float f10, int i10, View view) {
        return fg1.W(this.f37251a, view, f7);
    }

    @Override
    public void g(boolean z10, boolean z11) {
        fg1 fg1Var = this.f37251a;
        fg1Var.U0.i(fg1Var.R0.c(), z10, z11);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return fg1.U(this.f37251a, tL_error);
    }

    @Override
    public void h() {
    }

    @Override
    public void q(float f7) {
    }
}
