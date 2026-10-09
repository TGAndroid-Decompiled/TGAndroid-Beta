package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class p41 extends s4.j {
    public final b51 F;

    public p41(b51 b51Var) {
        this.F = b51Var;
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
