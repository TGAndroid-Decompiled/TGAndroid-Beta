package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
public final class nf0 extends org.telegram.ui.ActionBar.k {
    public final uf0 f28794u1;

    public nf0(uf0 uf0Var, Activity activity) {
        super(activity, null);
        this.f28794u1 = uf0Var;
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.f28794u1).containerView;
        viewGroup.invalidate();
    }
}
