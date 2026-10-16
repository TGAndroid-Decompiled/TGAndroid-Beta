package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class jf1 implements xh.c, MessagesController.ErrorDelegate, r0.n, org.telegram.ui.Components.dm0 {
    public final kg1 f37047a;

    public jf1(kg1 kg1Var) {
        this.f37047a = kg1Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = l1Var.f43497a.f(519).d;
        kg1 kg1Var = this.f37047a;
        kg1Var.f37392e1 = i10;
        gg1 gg1Var = kg1Var.f37414r0;
        if (gg1Var != null) {
            gg1Var.setPadding(0, 0, 0, i10);
        }
        ag1 ag1Var = kg1Var.f37408n;
        if (ag1Var != null) {
            ag1Var.f33899a.setTranslationY((-kg1Var.f37392e1) - kg1Var.f37390d1);
        }
        kg1Var.h.setTranslationY(((-kg1Var.X0) - kg1Var.f37392e1) - kg1Var.f37390d1);
        kg1Var.B0();
        return r0.l1.f43496b;
    }

    @Override
    public boolean mo17d(float f7, float f10, int i10, View view) {
        return kg1.W(this.f37047a, view, f7);
    }

    @Override
    public void f(boolean z10, boolean z11) {
        kg1 kg1Var = this.f37047a;
        kg1Var.U0.i(kg1Var.R0.c(), z10, z11);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return kg1.U(this.f37047a, tL_error);
    }

    @Override
    public void h() {
    }

    @Override
    public void q(float f7) {
    }
}
