package org.telegram.ui.ActionBar;

import android.view.View;
public final class n implements r0.m, ri.n {
    public final e2 f29395a;

    public n(e2 e2Var) {
        this.f29395a = e2Var;
    }

    @Override
    public r0.k1 M0(View view, r0.k1 k1Var) {
        return this.f29395a.onInsetsInternal(view, k1Var);
    }

    @Override
    public int e() {
        e2 e2Var = this.f29395a;
        e2Var.getClass();
        return e2Var.getThemedColor(j6.f28792a7);
    }
}
