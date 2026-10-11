package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
public final class lf0 extends org.telegram.ui.ActionBar.k {
    public final sf0 f28333u1;

    public lf0(sf0 sf0Var, Activity activity) {
        super(activity, null);
        this.f28333u1 = sf0Var;
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.f28333u1).containerView;
        viewGroup.invalidate();
    }
}
