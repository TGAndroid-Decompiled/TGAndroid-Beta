package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class oa1 implements oh.d, org.telegram.messenger.gp, r0.m, org.telegram.ui.Components.jk0 {
    public final pb1 f40217a;

    public oa1(pb1 pb1Var) {
        this.f40217a = pb1Var;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        int i10 = j1Var.f46132a.f(519).d;
        pb1 pb1Var = this.f40217a;
        pb1Var.f40581f1 = i10;
        lb1 lb1Var = pb1Var.f40603r0;
        if (lb1Var != null) {
            lb1Var.setPadding(0, 0, 0, i10);
        }
        ja1 ja1Var = pb1Var.f40594n;
        if (ja1Var != null) {
            ((TextView) ja1Var.d).setTranslationY((-pb1Var.f40581f1) - pb1Var.f40578e1);
        }
        pb1Var.h.setTranslationY(((-pb1Var.X0) - pb1Var.f40581f1) - pb1Var.f40578e1);
        pb1Var.E0();
        return r0.j1.f46131b;
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        return pb1.Y(this.f40217a, tL_error);
    }

    @Override
    public boolean mo16b(float f7, float f10, int i10, View view) {
        return pb1.a0(this.f40217a, view, f7);
    }

    @Override
    public void c(boolean z10, boolean z11) {
        pb1 pb1Var = this.f40217a;
        pb1Var.U0.i(pb1Var.R0.b(), z10, z11);
    }

    @Override
    public void p(float f7) {
    }

    @Override
    public void g() {
    }
}
