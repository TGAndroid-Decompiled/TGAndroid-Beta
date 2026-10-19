package org.telegram.ui;

import android.view.ViewGroup;
public final class e30 extends s4.k {
    public final q50 F;

    public e30(q50 q50Var) {
        this.F = q50Var;
    }

    @Override
    public final void P(s4.b1 b1Var) {
        ViewGroup viewGroup;
        q50 q50Var = this.F;
        q50Var.Q.invalidate();
        q50Var.a2.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) q50Var).containerView;
        viewGroup.invalidate();
        q50.K0(q50Var);
    }
}
