package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
public final class se0 extends org.telegram.ui.ActionBar.k {
    public final ze0 f28235t1;

    public se0(ze0 ze0Var, Activity activity) {
        super(activity, null);
        this.f28235t1 = ze0Var;
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.e3) this.f28235t1).containerView;
        viewGroup.invalidate();
    }
}
