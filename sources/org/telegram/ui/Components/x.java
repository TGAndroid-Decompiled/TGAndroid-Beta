package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class x extends f2.l {
    public final a0 F;

    public x(a0 a0Var) {
        this.F = a0Var;
    }

    @Override
    public final void P(f2.n1 n1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.F).containerView;
        viewGroup.invalidate();
    }
}
