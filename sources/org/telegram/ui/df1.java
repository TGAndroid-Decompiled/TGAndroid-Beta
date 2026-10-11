package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class df1 implements wh.c, MessagesController.ErrorDelegate, r0.n, org.telegram.ui.Components.jm0 {
    public final eg1 f37007a;

    public df1(eg1 eg1Var) {
        this.f37007a = eg1Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        int i10 = k1Var.f46867a.f(519).d;
        eg1 eg1Var = this.f37007a;
        eg1Var.f37324e1 = i10;
        ag1 ag1Var = eg1Var.f37346r0;
        if (ag1Var != null) {
            ag1Var.setPadding(0, 0, 0, i10);
        }
        uf1 uf1Var = eg1Var.f37340n;
        if (uf1Var != null) {
            uf1Var.f42546a.setTranslationY((-eg1Var.f37324e1) - eg1Var.f37321d1);
        }
        eg1Var.h.setTranslationY(((-eg1Var.X0) - eg1Var.f37324e1) - eg1Var.f37321d1);
        eg1Var.B0();
        return r0.k1.f46866b;
    }

    @Override
    public boolean mo17c(float f7, float f10, int i10, View view) {
        return eg1.W(this.f37007a, view, f7);
    }

    @Override
    public void g(boolean z10, boolean z11) {
        eg1 eg1Var = this.f37007a;
        eg1Var.U0.i(eg1Var.R0.c(), z10, z11);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return eg1.U(this.f37007a, tL_error);
    }

    @Override
    public void h() {
    }

    @Override
    public void q(float f7) {
    }
}
