package org.telegram.ui;

import android.view.ViewGroup;
public final class a40 extends org.telegram.ui.Components.vi0 {
    public final g60 f35875s1;

    public a40(g60 g60Var, LaunchActivity launchActivity, c50 c50Var, m50 m50Var, z30 z30Var) {
        super(launchActivity, c50Var, m50Var, z30Var);
        this.f35875s1 = g60Var;
    }

    @Override
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.f35875s1).containerView;
        viewGroup.invalidate();
    }
}
