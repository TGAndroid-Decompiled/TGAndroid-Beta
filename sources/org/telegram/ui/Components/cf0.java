package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
public final class cf0 extends org.telegram.ui.ActionBar.k {
    public final jf0 f25188u1;

    public cf0(jf0 jf0Var, Activity activity) {
        super(activity, null);
        this.f25188u1 = jf0Var;
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f25188u1).containerView;
        viewGroup.invalidate();
    }
}
