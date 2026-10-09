package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class ts extends s4.j {
    public final vs F;

    public ts(vs vsVar) {
        this.F = vsVar;
    }

    @Override
    public final void P(s4.d1 d1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.F).containerView;
        viewGroup.invalidate();
    }
}
