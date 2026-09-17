package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ef1 implements wh.c, MessagesController.ErrorDelegate, r0.n, org.telegram.ui.Components.dl0 {
    public final fg1 f33388a;

    public ef1(fg1 fg1Var) {
        this.f33388a = fg1Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = l1Var.f41877a.f(519).d;
        fg1 fg1Var = this.f33388a;
        fg1Var.f33648e1 = i10;
        bg1 bg1Var = fg1Var.f33670r0;
        if (bg1Var != null) {
            bg1Var.setPadding(0, 0, 0, i10);
        }
        vf1 vf1Var = fg1Var.f33664n;
        if (vf1Var != null) {
            vf1Var.f38410a.setTranslationY((-fg1Var.f33648e1) - fg1Var.f33646d1);
        }
        fg1Var.h.setTranslationY(((-fg1Var.X0) - fg1Var.f33648e1) - fg1Var.f33646d1);
        fg1Var.B0();
        return r0.l1.f41876b;
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        return fg1.W(this.f33388a, view, f7);
    }

    @Override
    public void h(boolean z10, boolean z11) {
        fg1 fg1Var = this.f33388a;
        fg1Var.U0.i(fg1Var.R0.c(), z10, z11);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return fg1.U(this.f33388a, tL_error);
    }

    @Override
    public void g() {
    }

    @Override
    public void q(float f7) {
    }
}
