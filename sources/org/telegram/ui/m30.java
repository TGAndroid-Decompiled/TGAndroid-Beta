package org.telegram.ui;

import android.view.ViewGroup;
public final class m30 extends org.telegram.ui.Components.ni0 {
    public final u50 f39432s1;

    public m30(u50 u50Var, LaunchActivity launchActivity, p40 p40Var, z40 z40Var, l30 l30Var) {
        super(launchActivity, p40Var, z40Var, l30Var);
        this.f39432s1 = u50Var;
    }

    @Override
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.f39432s1).containerView;
        viewGroup.invalidate();
    }
}
