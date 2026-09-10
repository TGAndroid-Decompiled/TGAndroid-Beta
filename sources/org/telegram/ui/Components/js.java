package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class js extends s4.j {
    public final ls F;

    public js(ls lsVar) {
        this.F = lsVar;
    }

    @Override
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.F).containerView;
        viewGroup.invalidate();
    }
}
