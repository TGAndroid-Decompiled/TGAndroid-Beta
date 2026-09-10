package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class w extends s4.j {
    public final z F;

    public w(z zVar) {
        this.F = zVar;
    }

    @Override
    public final void P(s4.c1 c1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.F).containerView;
        viewGroup.invalidate();
    }
}
