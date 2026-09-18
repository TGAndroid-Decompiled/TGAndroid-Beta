package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class v extends s4.j {
    public final y F;

    public v(y yVar) {
        this.F = yVar;
    }

    @Override
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.F).containerView;
        viewGroup.invalidate();
    }
}
