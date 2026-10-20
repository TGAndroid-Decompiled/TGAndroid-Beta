package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class g41 extends s4.k {
    public final t41 F;

    public g41(t41 t41Var) {
        this.F = t41Var;
    }

    @Override
    public final void O() {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.F).containerView;
        viewGroup.invalidate();
    }

    @Override
    public final void P(s4.b1 b1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.F).containerView;
        viewGroup.invalidate();
    }
}
