package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class r extends f2.l {
    public final s F;

    public r(s sVar) {
        this.F = sVar;
    }

    @Override
    public final void P(f2.n1 n1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.F).containerView;
        viewGroup.invalidate();
    }
}
