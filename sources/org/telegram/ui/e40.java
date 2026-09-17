package org.telegram.ui;

import android.view.ViewGroup;
public final class e40 extends org.telegram.ui.Components.ph0 {
    public final k60 f33278s1;

    public e40(k60 k60Var, LaunchActivity launchActivity, g50 g50Var, q50 q50Var, d40 d40Var) {
        super(launchActivity, g50Var, q50Var, d40Var);
        this.f33278s1 = k60Var;
    }

    @Override
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.f33278s1).containerView;
        viewGroup.invalidate();
    }
}
