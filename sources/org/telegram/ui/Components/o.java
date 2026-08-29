package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class o extends f2.l {
    public final g0 F;

    public o(g0 g0Var) {
        this.F = g0Var;
    }

    @Override
    public final void P(f2.n1 n1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.F).containerView;
        viewGroup.invalidate();
    }
}
