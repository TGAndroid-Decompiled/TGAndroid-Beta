package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class be1 implements yh.c, MessagesController.ErrorDelegate, r0.n, org.telegram.ui.Components.dm0 {
    public final cf1 f38021a;

    public be1(cf1 cf1Var) {
        this.f38021a = cf1Var;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        int i10 = k1Var.f47153a.f(519).d;
        cf1 cf1Var = this.f38021a;
        cf1Var.f38303f1 = i10;
        ye1 ye1Var = cf1Var.f38325r0;
        if (ye1Var != null) {
            ye1Var.setPadding(0, 0, 0, i10);
        }
        se1 se1Var = cf1Var.f38316n;
        if (se1Var != null) {
            se1Var.f43310a.setTranslationY((-cf1Var.f38303f1) - cf1Var.f38300e1);
        }
        cf1Var.h.setTranslationY(((-cf1Var.X0) - cf1Var.f38303f1) - cf1Var.f38300e1);
        cf1Var.B0();
        return r0.k1.f47152b;
    }

    @Override
    public void d(boolean z10, boolean z11) {
        cf1 cf1Var = this.f38021a;
        cf1Var.U0.i(cf1Var.R0.b(), z10, z11);
    }

    @Override
    public boolean mo17e(float f7, float f10, int i10, View view) {
        return cf1.X(this.f38021a, view, f7);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return cf1.V(this.f38021a, tL_error);
    }

    @Override
    public void g() {
    }

    @Override
    public void o(float f7) {
    }
}
