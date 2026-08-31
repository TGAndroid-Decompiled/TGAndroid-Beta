package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class le1 implements kh.d, MessagesController.ErrorDelegate, r0.o, org.telegram.ui.Components.ml0 {
    public final mf1 f38722a;

    public le1(mf1 mf1Var) {
        this.f38722a = mf1Var;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        int i10 = m1Var.f46452a.f(519).d;
        mf1 mf1Var = this.f38722a;
        mf1Var.f39107b1 = i10;
        if1 if1Var = mf1Var.f39131o0;
        if (if1Var != null) {
            if1Var.setPadding(0, 0, 0, i10);
        }
        cf1 cf1Var = mf1Var.f39129n;
        if (cf1Var != null) {
            cf1Var.f35795a.setTranslationY((-mf1Var.f39107b1) - mf1Var.f39104a1);
        }
        mf1Var.h.setTranslationY(((-mf1Var.U0) - mf1Var.f39107b1) - mf1Var.f39104a1);
        mf1Var.B0();
        return r0.m1.f46451b;
    }

    @Override
    public boolean mo17c(float f10, float f11, int i10, View view) {
        return mf1.W(this.f38722a, view, f10);
    }

    @Override
    public void g(boolean z4, boolean z10) {
        mf1 mf1Var = this.f38722a;
        mf1Var.R0.i(mf1Var.O0.c(), z4, z10);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return mf1.U(this.f38722a, tL_error);
    }

    @Override
    public void h() {
    }

    @Override
    public void p(float f10) {
    }
}
