package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class o21 extends f2.n {
    public final z21 F;

    public o21(z21 z21Var) {
        this.F = z21Var;
    }

    @Override
    public final void O() {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.F).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final void P(f2.q1 q1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.F).containerView;
        viewGroup.invalidate();
    }
}
