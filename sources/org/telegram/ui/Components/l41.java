package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class l41 extends s4.k {
    public final x41 F;

    public l41(x41 x41Var) {
        this.F = x41Var;
    }

    @Override
    public final void O() {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.F).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final void P(s4.b1 b1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.F).containerView;
        viewGroup.invalidate();
    }
}
