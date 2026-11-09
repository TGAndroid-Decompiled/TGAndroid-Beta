package org.telegram.ui.ActionBar;

import android.view.View;
public final class n implements r0.m, oi.n {
    public final f2 f28314a;

    public n(f2 f2Var) {
        this.f28314a = f2Var;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        return this.f28314a.onInsetsInternal(view, k1Var);
    }

    @Override
    public int h() {
        f2 f2Var = this.f28314a;
        f2Var.getClass();
        return f2Var.getThemedColor(l6.f27809a7);
    }
}
