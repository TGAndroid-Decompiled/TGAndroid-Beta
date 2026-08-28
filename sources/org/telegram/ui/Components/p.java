package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class p extends f2.n {
    public final q F;

    public p(q qVar) {
        this.F = qVar;
    }

    @Override
    public final void P(f2.q1 q1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.F).containerView;
        viewGroup.invalidate();
    }
}
