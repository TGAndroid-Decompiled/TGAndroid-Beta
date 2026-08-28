package org.telegram.ui;

import android.view.ViewGroup;
public final class q20 extends f2.n {
    public final o50 F;

    public q20(o50 o50Var) {
        this.F = o50Var;
    }

    @Override
    public final void P(f2.q1 q1Var) {
        ViewGroup viewGroup;
        o50 o50Var = this.F;
        o50Var.M.invalidate();
        o50Var.W1.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) o50Var).containerView;
        viewGroup.invalidate();
        o50.I0(o50Var);
    }
}
