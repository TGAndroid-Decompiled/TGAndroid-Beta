package org.telegram.ui.ActionBar;

import android.view.View;
public final class n implements r0.n, oi.n {
    public final r2 f22892a;

    public n(r2 r2Var) {
        this.f22892a = r2Var;
    }

    @Override
    public r0.k1 P0(View view, r0.k1 k1Var) {
        return this.f22892a.onInsetsInternal(view, k1Var);
    }

    @Override
    public int f() {
        r2 r2Var = this.f22892a;
        r2Var.getClass();
        return r2Var.getThemedColor(y6.f23300a7);
    }
}
