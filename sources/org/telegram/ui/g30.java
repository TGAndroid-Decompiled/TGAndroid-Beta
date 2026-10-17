package org.telegram.ui;

import android.view.ViewGroup;
public final class g30 extends s4.k {
    public final s50 F;

    public g30(s50 s50Var) {
        this.F = s50Var;
    }

    @Override
    public final void P(s4.b1 b1Var) {
        ViewGroup viewGroup;
        s50 s50Var = this.F;
        s50Var.Q.invalidate();
        s50Var.a2.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) s50Var).containerView;
        viewGroup.invalidate();
        s50.K0(s50Var);
    }
}
