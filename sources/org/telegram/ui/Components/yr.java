package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class yr extends f2.l {
    public final as F;

    public yr(as asVar) {
        this.F = asVar;
    }

    @Override
    public final void P(f2.n1 n1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.F).containerView;
        viewGroup.invalidate();
    }
}
