package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class r41 extends s4.l {
    public final f51 F;

    public r41(f51 f51Var) {
        this.F = f51Var;
    }

    @Override
    public final void O() {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.k3) this.F).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final void P(s4.e1 e1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.k3) this.F).containerView;
        viewGroup.invalidate();
    }
}
