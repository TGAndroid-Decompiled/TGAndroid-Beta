package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class vs extends s4.j {
    public final xs F;

    public vs(xs xsVar) {
        this.F = xsVar;
    }

    @Override
    public final void P(s4.d1 d1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.F).containerView;
        viewGroup.invalidate();
    }
}
