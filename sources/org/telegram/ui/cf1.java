package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class cf1 implements wh.c, MessagesController.ErrorDelegate, r0.n, org.telegram.ui.Components.cl0 {
    public final dg1 f32775a;

    public cf1(dg1 dg1Var) {
        this.f32775a = dg1Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = l1Var.f41855a.f(519).d;
        dg1 dg1Var = this.f32775a;
        dg1Var.f33024e1 = i10;
        zf1 zf1Var = dg1Var.f33046r0;
        if (zf1Var != null) {
            zf1Var.setPadding(0, 0, 0, i10);
        }
        tf1 tf1Var = dg1Var.f33040n;
        if (tf1Var != null) {
            tf1Var.f37668a.setTranslationY((-dg1Var.f33024e1) - dg1Var.f33022d1);
        }
        dg1Var.h.setTranslationY(((-dg1Var.X0) - dg1Var.f33024e1) - dg1Var.f33022d1);
        dg1Var.B0();
        return r0.l1.f41854b;
    }

    @Override
    public boolean mo18c(float f7, float f10, int i10, View view) {
        return dg1.W(this.f32775a, view, f7);
    }

    @Override
    public void h(boolean z10, boolean z11) {
        dg1 dg1Var = this.f32775a;
        dg1Var.U0.i(dg1Var.R0.c(), z10, z11);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return dg1.U(this.f32775a, tL_error);
    }

    @Override
    public void g() {
    }

    @Override
    public void q(float f7) {
    }
}
