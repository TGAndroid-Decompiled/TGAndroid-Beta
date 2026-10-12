package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class kf1 implements xh.c, MessagesController.ErrorDelegate, r0.o, org.telegram.ui.Components.dm0 {
    public final lg1 f37643a;

    public kf1(lg1 lg1Var) {
        this.f37643a = lg1Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int i10 = l1Var.f43741a.f(519).d;
        lg1 lg1Var = this.f37643a;
        lg1Var.f37969e1 = i10;
        hg1 hg1Var = lg1Var.f37991r0;
        if (hg1Var != null) {
            hg1Var.setPadding(0, 0, 0, i10);
        }
        bg1 bg1Var = lg1Var.f37985n;
        if (bg1Var != null) {
            bg1Var.f34536a.setTranslationY((-lg1Var.f37969e1) - lg1Var.f37967d1);
        }
        lg1Var.h.setTranslationY(((-lg1Var.X0) - lg1Var.f37969e1) - lg1Var.f37967d1);
        lg1Var.B0();
        return r0.l1.f43740b;
    }

    @Override
    public boolean mo17d(float f7, float f10, int i10, View view) {
        return lg1.W(this.f37643a, view, f7);
    }

    @Override
    public void f(boolean z10, boolean z11) {
        lg1 lg1Var = this.f37643a;
        lg1Var.U0.i(lg1Var.R0.c(), z10, z11);
    }

    @Override
    public boolean run(TLRPC.TL_error tL_error) {
        return lg1.U(this.f37643a, tL_error);
    }

    @Override
    public void h() {
    }

    @Override
    public void q(float f7) {
    }
}
