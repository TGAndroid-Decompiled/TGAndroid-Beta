package org.telegram.ui.ActionBar;

import android.view.View;
public final class n implements r0.m, pi.n {
    public final d2 f28351a;

    public n(d2 d2Var) {
        this.f28351a = d2Var;
    }

    @Override
    public r0.k1 R0(View view, r0.k1 k1Var) {
        return this.f28351a.onInsetsInternal(view, k1Var);
    }

    @Override
    public int e() {
        d2 d2Var = this.f28351a;
        d2Var.getClass();
        return d2Var.getThemedColor(k6.f27824a7);
    }
}
