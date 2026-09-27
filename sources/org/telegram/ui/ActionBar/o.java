package org.telegram.ui.ActionBar;

import android.view.View;
public final class o implements r0.n, li.i {
    public final o2 f19677a;

    public o(o2 o2Var) {
        this.f19677a = o2Var;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        return this.f19677a.onInsetsInternal(view, l1Var);
    }

    @Override
    public int g() {
        o2 o2Var = this.f19677a;
        o2Var.getClass();
        return o2Var.getThemedColor(i6.f19001a7);
    }
}
