package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
public final class jf0 extends org.telegram.ui.ActionBar.k {
    public final qf0 f27709u1;

    public jf0(qf0 qf0Var, Activity activity) {
        super(activity, null);
        this.f27709u1 = qf0Var;
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f27709u1).containerView;
        viewGroup.invalidate();
    }
}
