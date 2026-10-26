package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
public final class cf0 extends org.telegram.ui.ActionBar.k {
    public final jf0 f27139x1;

    public cf0(jf0 jf0Var, Activity activity) {
        super(activity, null);
        this.f27139x1 = jf0Var;
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.k3) this.f27139x1).containerView;
        viewGroup.invalidate();
    }
}
