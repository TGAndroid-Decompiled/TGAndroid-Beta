package org.telegram.ui.ActionBar;

import android.view.View;
public final class n implements r0.m, ri.n {
    public final g2 f29342a;

    public n(g2 g2Var) {
        this.f29342a = g2Var;
    }

    @Override
    public int j() {
        g2 g2Var = this.f29342a;
        g2Var.getClass();
        return g2Var.getThemedColor(n6.f29394a7);
    }

    @Override
    public r0.l1 l1(View view, r0.l1 l1Var) {
        return this.f29342a.onInsetsInternal(view, l1Var);
    }
}
