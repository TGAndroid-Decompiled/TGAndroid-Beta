package org.telegram.ui.ActionBar;

import android.view.View;
public final class n implements r0.n, li.k {
    public final n2 f21404a;

    public n(n2 n2Var) {
        this.f21404a = n2Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return this.f21404a.onInsetsInternal(view, l1Var);
    }

    @Override
    public int f() {
        n2 n2Var = this.f21404a;
        n2Var.getClass();
        return n2Var.getThemedColor(i6.f20766a7);
    }
}
