package org.telegram.ui.ActionBar;

import android.view.View;
public final class n implements r0.m, ri.n {
    public final h2 f29269a;

    public n(h2 h2Var) {
        this.f29269a = h2Var;
    }

    @Override
    public r0.l1 P0(View view, r0.l1 l1Var) {
        return this.f29269a.onInsetsInternal(view, l1Var);
    }

    @Override
    public int e() {
        h2 h2Var = this.f29269a;
        h2Var.getClass();
        return h2Var.getThemedColor(n6.f29337a7);
    }
}
