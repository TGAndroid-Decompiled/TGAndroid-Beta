package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class ie1 implements jh.d, MessagesController.ErrorDelegate, r0.o, org.telegram.ui.Components.ll0 {
    public final kf1 f35106a;

    public ie1(kf1 kf1Var) {
        this.f35106a = kf1Var;
    }

    @Override
    public r0.m1 N0(View view, r0.m1 m1Var) {
        int i10 = m1Var.f43130a.f(519).d;
        kf1 kf1Var = this.f35106a;
        kf1Var.f35673b1 = i10;
        gf1 gf1Var = kf1Var.f35696o0;
        if (gf1Var != null) {
            gf1Var.setPadding(0, 0, 0, i10);
        }
        af1 af1Var = kf1Var.f35694n;
        if (af1Var != null) {
            af1Var.f32575a.setTranslationY((-kf1Var.f35673b1) - kf1Var.f35670a1);
        }
        kf1Var.h.setTranslationY(((-kf1Var.U0) - kf1Var.f35673b1) - kf1Var.f35670a1);
        kf1Var.B0();
        return r0.m1.f43129b;
    }

    @Override
    public boolean mo18c(float f10, float f11, int i10, View view) {
        return kf1.W(this.f35106a, view, f10);
    }

    @Override
    public void g(boolean z4, boolean z10) {
        kf1 kf1Var = this.f35106a;
        kf1Var.R0.i(kf1Var.O0.c(), z4, z10);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return kf1.U(this.f35106a, tL_error);
    }

    @Override
    public void h() {
    }

    @Override
    public void p(float f10) {
    }
}
