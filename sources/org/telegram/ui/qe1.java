package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class qe1 implements jh.d, MessagesController.ErrorDelegate, r0.o, org.telegram.ui.Components.kl0 {
    public final sf1 f37400a;

    public qe1(sf1 sf1Var) {
        this.f37400a = sf1Var;
    }

    @Override
    public r0.m1 M0(View view, r0.m1 m1Var) {
        int i10 = m1Var.f43154a.f(519).d;
        sf1 sf1Var = this.f37400a;
        sf1Var.f38180b1 = i10;
        of1 of1Var = sf1Var.f38203o0;
        if (of1Var != null) {
            of1Var.setPadding(0, 0, 0, i10);
        }
        if1 if1Var = sf1Var.f38201n;
        if (if1Var != null) {
            if1Var.f34921a.setTranslationY((-sf1Var.f38180b1) - sf1Var.f38177a1);
        }
        sf1Var.h.setTranslationY(((-sf1Var.U0) - sf1Var.f38180b1) - sf1Var.f38177a1);
        sf1Var.B0();
        return r0.m1.f43153b;
    }

    @Override
    public boolean mo17c(float f10, float f11, int i10, View view) {
        return sf1.W(this.f37400a, view, f10);
    }

    @Override
    public void g(boolean z4, boolean z10) {
        sf1 sf1Var = this.f37400a;
        sf1Var.R0.i(sf1Var.O0.c(), z4, z10);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return sf1.U(this.f37400a, tL_error);
    }

    @Override
    public void h() {
    }

    @Override
    public void p(float f10) {
    }
}
