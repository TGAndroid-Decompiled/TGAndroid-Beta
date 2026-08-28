package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class v extends f2.n {
    public final y F;

    public v(y yVar) {
        this.F = yVar;
    }

    @Override
    public final void P(f2.q1 q1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.F).containerView;
        viewGroup.invalidate();
    }
}
