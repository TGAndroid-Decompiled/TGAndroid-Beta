package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
public final class ue0 extends org.telegram.ui.ActionBar.k {
    public final bf0 f31423v1;

    public ue0(bf0 bf0Var, Activity activity) {
        super(activity, null);
        this.f31423v1 = bf0Var;
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f31423v1).containerView;
        viewGroup.invalidate();
    }
}
