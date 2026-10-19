package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class qd1 implements xh.c, MessagesController.ErrorDelegate, r0.n, org.telegram.ui.Components.zl0 {
    public final re1 f40551a;

    public qd1(re1 re1Var) {
        this.f40551a = re1Var;
    }

    @Override
    public r0.k1 B0(View view, r0.k1 k1Var) {
        int i10 = k1Var.f44825a.f(519).d;
        re1 re1Var = this.f40551a;
        re1Var.f41162e1 = i10;
        ne1 ne1Var = re1Var.f41184r0;
        if (ne1Var != null) {
            ne1Var.setPadding(0, 0, 0, i10);
        }
        he1 he1Var = re1Var.f41178n;
        if (he1Var != null) {
            he1Var.f37606a.setTranslationY((-re1Var.f41162e1) - re1Var.f41160d1);
        }
        re1Var.h.setTranslationY(((-re1Var.X0) - re1Var.f41162e1) - re1Var.f41160d1);
        re1Var.B0();
        return r0.k1.f44824b;
    }

    @Override
    public boolean mo17d(float f7, float f10, int i10, View view) {
        return re1.W(this.f40551a, view, f7);
    }

    @Override
    public void f(boolean z10, boolean z11) {
        re1 re1Var = this.f40551a;
        re1Var.U0.i(re1Var.R0.c(), z10, z11);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return re1.U(this.f40551a, tL_error);
    }

    @Override
    public void h() {
    }

    @Override
    public void o(float f7) {
    }
}
