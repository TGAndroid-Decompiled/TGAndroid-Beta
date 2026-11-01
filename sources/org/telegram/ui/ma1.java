package org.telegram.ui;

import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
public final class ma1 implements oh.d, org.telegram.messenger.hp, r0.m, org.telegram.ui.Components.kk0 {
    public final nb1 f39492a;

    public ma1(nb1 nb1Var) {
        this.f39492a = nb1Var;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        int i10 = j1Var.f46143a.f(519).d;
        nb1 nb1Var = this.f39492a;
        nb1Var.f39812f1 = i10;
        jb1 jb1Var = nb1Var.f39834r0;
        if (jb1Var != null) {
            jb1Var.setPadding(0, 0, 0, i10);
        }
        ha1 ha1Var = nb1Var.f39825n;
        if (ha1Var != null) {
            ((TextView) ha1Var.d).setTranslationY((-nb1Var.f39812f1) - nb1Var.f39809e1);
        }
        nb1Var.h.setTranslationY(((-nb1Var.X0) - nb1Var.f39812f1) - nb1Var.f39809e1);
        nb1Var.F0();
        return r0.j1.f46142b;
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        return nb1.Z(this.f39492a, tL_error);
    }

    @Override
    public boolean mo16b(float f7, float f10, int i10, View view) {
        return nb1.b0(this.f39492a, view, f7);
    }

    @Override
    public void c(boolean z10, boolean z11) {
        nb1 nb1Var = this.f39492a;
        nb1Var.U0.i(nb1Var.R0.b(), z10, z11);
    }

    @Override
    public void p(float f7) {
    }

    @Override
    public void g() {
    }
}
