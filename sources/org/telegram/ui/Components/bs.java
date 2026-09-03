package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class bs extends f2.l {
    public final ds F;

    public bs(ds dsVar) {
        this.F = dsVar;
    }

    @Override
    public final void P(f2.l1 l1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.F).containerView;
        viewGroup.invalidate();
    }
}
