package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class v extends s4.l {
    public final y F;

    public v(y yVar) {
        this.F = yVar;
    }

    @Override
    public final void P(s4.e1 e1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.k3) this.F).containerView;
        viewGroup.invalidate();
    }
}
