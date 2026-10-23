package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
public final class ff0 extends org.telegram.ui.ActionBar.k {
    public final mf0 f26311v1;

    public ff0(mf0 mf0Var, Activity activity) {
        super(activity, null);
        this.f26311v1 = mf0Var;
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.h3) this.f26311v1).containerView;
        viewGroup.invalidate();
    }
}
