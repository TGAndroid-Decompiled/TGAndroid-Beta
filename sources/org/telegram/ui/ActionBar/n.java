package org.telegram.ui.ActionBar;

import android.view.View;
public final class n implements r0.m, ri.n {
    public final g2 f29771a;

    public n(g2 g2Var) {
        this.f29771a = g2Var;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        return this.f29771a.onInsetsInternal(view, l1Var);
    }

    @Override
    public int e() {
        g2 g2Var = this.f29771a;
        g2Var.getClass();
        return g2Var.getThemedColor(m6.f29290a7);
    }
}
