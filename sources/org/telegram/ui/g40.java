package org.telegram.ui;

import android.view.ViewGroup;
public final class g40 extends org.telegram.ui.Components.pi0 {
    public final n60 f36302s1;

    public g40(n60 n60Var, LaunchActivity launchActivity, j50 j50Var, t50 t50Var, f40 f40Var) {
        super(launchActivity, j50Var, t50Var, f40Var);
        this.f36302s1 = n60Var;
    }

    @Override
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.f36302s1).containerView;
        viewGroup.invalidate();
    }
}
