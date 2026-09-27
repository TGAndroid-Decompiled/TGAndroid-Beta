package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
public final class se0 extends org.telegram.ui.ActionBar.l {
    public final ze0 f28229y1;

    public se0(ze0 ze0Var, Activity activity) {
        super(activity, null);
        this.f28229y1 = ze0Var;
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.g3) this.f28229y1).containerView;
        viewGroup.invalidate();
    }
}
