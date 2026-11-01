package org.telegram.ui.ActionBar;

import android.view.View;
public final class o implements r0.m, ei.o {
    public final k2 f20618a;

    public o(k2 k2Var) {
        this.f20618a = k2Var;
    }

    @Override
    public r0.j1 R0(View view, r0.j1 j1Var) {
        return this.f20618a.onInsetsInternal(view, j1Var);
    }

    @Override
    public int c() {
        k2 k2Var = this.f20618a;
        k2Var.getClass();
        return k2Var.getThemedColor(t6.f20873a7);
    }
}
