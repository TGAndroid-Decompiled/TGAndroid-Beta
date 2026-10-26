package org.telegram.ui;

import android.view.ViewGroup;
public final class o30 extends org.telegram.ui.Components.ni0 {
    public final v50 f42084s1;

    public o30(v50 v50Var, LaunchActivity launchActivity, r40 r40Var, b50 b50Var, n30 n30Var) {
        super(launchActivity, r40Var, b50Var, n30Var);
        this.f42084s1 = v50Var;
    }

    @Override
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.k3) this.f42084s1).containerView;
        viewGroup.invalidate();
    }
}
