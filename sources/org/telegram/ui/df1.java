package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class df1 implements xh.c, MessagesController.ErrorDelegate, r0.n, org.telegram.ui.Components.cl0 {
    public final eg1 f35809a;

    public df1(eg1 eg1Var) {
        this.f35809a = eg1Var;
    }

    @Override
    public r0.l1 T0(View view, r0.l1 l1Var) {
        int i10 = l1Var.f44739a.f(519).d;
        eg1 eg1Var = this.f35809a;
        eg1Var.f36065e1 = i10;
        ag1 ag1Var = eg1Var.f36087r0;
        if (ag1Var != null) {
            ag1Var.setPadding(0, 0, 0, i10);
        }
        uf1 uf1Var = eg1Var.f36081n;
        if (uf1Var != null) {
            uf1Var.f41112a.setTranslationY((-eg1Var.f36065e1) - eg1Var.f36062d1);
        }
        eg1Var.h.setTranslationY(((-eg1Var.X0) - eg1Var.f36065e1) - eg1Var.f36062d1);
        eg1Var.B0();
        return r0.l1.f44738b;
    }

    @Override
    public boolean mo18d(float f7, float f10, int i10, View view) {
        return eg1.W(this.f35809a, view, f7);
    }

    @Override
    public void f(boolean z10, boolean z11) {
        eg1 eg1Var = this.f35809a;
        eg1Var.U0.i(eg1Var.R0.c(), z10, z11);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return eg1.U(this.f35809a, tL_error);
    }

    @Override
    public void h() {
    }

    @Override
    public void q(float f7) {
    }
}
