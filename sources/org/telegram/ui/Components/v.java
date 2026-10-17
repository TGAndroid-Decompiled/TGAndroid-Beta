package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class v extends s4.k {
    public final y F;

    public v(y yVar) {
        this.F = yVar;
    }

    @Override
    public final void P(s4.b1 b1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.F).containerView;
        viewGroup.invalidate();
    }
}
