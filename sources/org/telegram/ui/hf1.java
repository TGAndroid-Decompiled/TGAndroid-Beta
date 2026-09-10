package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class hf1 implements vh.d, MessagesController.ErrorDelegate, r0.n, org.telegram.ui.Components.ml0 {
    public final ig1 f33382a;

    public hf1(ig1 ig1Var) {
        this.f33382a = ig1Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = l1Var.f41074a.f(519).d;
        ig1 ig1Var = this.f33382a;
        ig1Var.f33693e1 = i10;
        eg1 eg1Var = ig1Var.f33715r0;
        if (eg1Var != null) {
            eg1Var.setPadding(0, 0, 0, i10);
        }
        yf1 yf1Var = ig1Var.f33709n;
        if (yf1Var != null) {
            yf1Var.f38992a.setTranslationY((-ig1Var.f33693e1) - ig1Var.f33691d1);
        }
        ig1Var.h.setTranslationY(((-ig1Var.X0) - ig1Var.f33693e1) - ig1Var.f33691d1);
        ig1Var.B0();
        return r0.l1.f41073b;
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        return ig1.W(this.f33382a, view, f7);
    }

    @Override
    public void g(boolean z10, boolean z11) {
        ig1 ig1Var = this.f33382a;
        ig1Var.U0.i(ig1Var.R0.c(), z10, z11);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return ig1.U(this.f33382a, tL_error);
    }

    @Override
    public void h() {
    }

    @Override
    public void p(float f7) {
    }
}
