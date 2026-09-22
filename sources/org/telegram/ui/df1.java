package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class df1 implements wh.c, MessagesController.ErrorDelegate, r0.n, org.telegram.ui.Components.cl0 {
    public final eg1 f33015a;

    public df1(eg1 eg1Var) {
        this.f33015a = eg1Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = l1Var.f41851a.f(519).d;
        eg1 eg1Var = this.f33015a;
        eg1Var.f33303e1 = i10;
        ag1 ag1Var = eg1Var.f33325r0;
        if (ag1Var != null) {
            ag1Var.setPadding(0, 0, 0, i10);
        }
        uf1 uf1Var = eg1Var.f33319n;
        if (uf1Var != null) {
            uf1Var.f37967a.setTranslationY((-eg1Var.f33303e1) - eg1Var.f33301d1);
        }
        eg1Var.h.setTranslationY(((-eg1Var.X0) - eg1Var.f33303e1) - eg1Var.f33301d1);
        eg1Var.B0();
        return r0.l1.f41850b;
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        return eg1.W(this.f33015a, view, f7);
    }

    @Override
    public void h(boolean z10, boolean z11) {
        eg1 eg1Var = this.f33015a;
        eg1Var.U0.i(eg1Var.R0.c(), z10, z11);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return eg1.U(this.f33015a, tL_error);
    }

    @Override
    public void g() {
    }

    @Override
    public void q(float f7) {
    }
}
