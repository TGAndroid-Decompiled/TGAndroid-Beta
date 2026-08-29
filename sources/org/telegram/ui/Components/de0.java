package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
public final class de0 extends org.telegram.ui.ActionBar.l {
    public final ke0 f27751p1;

    public de0(ke0 ke0Var, Activity activity) {
        super(activity, null);
        this.f27751p1 = ke0Var;
    }

    @Override
    public final void setAlpha(float f9) {
        ViewGroup viewGroup;
        super.setAlpha(f9);
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f27751p1).containerView;
        viewGroup.invalidate();
    }
}
