package org.telegram.ui;

import android.view.ViewGroup;
public final class c40 extends org.telegram.ui.Components.bi0 {
    public final i60 f32635s1;

    public c40(i60 i60Var, LaunchActivity launchActivity, e50 e50Var, o50 o50Var, b40 b40Var) {
        super(launchActivity, e50Var, o50Var, b40Var);
        this.f32635s1 = i60Var;
    }

    @Override
    public final void invalidate() {
        ViewGroup viewGroup;
        super.invalidate();
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f32635s1).containerView;
        viewGroup.invalidate();
    }
}
