package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class q41 extends s4.j {
    public final c51 F;

    public q41(c51 c51Var) {
        this.F = c51Var;
    }

    @Override
    public final void O() {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.F).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final void P(s4.d1 d1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.F).containerView;
        viewGroup.invalidate();
    }
}
