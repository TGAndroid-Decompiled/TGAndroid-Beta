package org.telegram.ui.Components;

import android.view.ViewGroup;
public final class ls extends s4.k {
    public final ns F;

    public ls(ns nsVar) {
        this.F = nsVar;
    }

    @Override
    public final void P(s4.b1 b1Var) {
        ViewGroup viewGroup;
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.F).containerView;
        viewGroup.invalidate();
    }
}
