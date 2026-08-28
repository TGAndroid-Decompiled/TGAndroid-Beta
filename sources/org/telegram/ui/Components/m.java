package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class m extends f2.n {
    public final e0 F;

    public m(e0 e0Var) {
        this.F = e0Var;
    }

    @Override
    public final void P(f2.q1 q1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.F).containerView;
        viewGroup.invalidate();
    }
}
