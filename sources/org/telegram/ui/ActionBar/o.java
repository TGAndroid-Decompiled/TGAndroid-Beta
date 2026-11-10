package org.telegram.ui.ActionBar;

import android.view.View;
public final class o implements r0.m, oi.n {
    public final f2 f28337a;

    public o(f2 f2Var) {
        this.f28337a = f2Var;
    }

    @Override
    public r0.k1 S0(View view, r0.k1 k1Var) {
        return this.f28337a.onInsetsInternal(view, k1Var);
    }

    @Override
    public int h() {
        f2 f2Var = this.f28337a;
        f2Var.getClass();
        return f2Var.getThemedColor(m6.f27834a7);
    }
}
