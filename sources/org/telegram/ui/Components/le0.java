package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
public final class le0 extends org.telegram.ui.ActionBar.k {
    public final se0 f26625q1;

    public le0(se0 se0Var, Activity activity) {
        super(activity, null);
        this.f26625q1 = se0Var;
    }

    @Override
    public final void setAlpha(float f10) {
        ViewGroup viewGroup;
        super.setAlpha(f10);
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.f26625q1).containerView;
        viewGroup.invalidate();
    }
}
