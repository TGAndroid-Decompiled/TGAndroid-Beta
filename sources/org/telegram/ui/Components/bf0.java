package org.telegram.ui.Components;

import android.app.Activity;
import android.view.ViewGroup;
public final class bf0 extends org.telegram.ui.ActionBar.k {
    public final if0 f24967u1;

    public bf0(if0 if0Var, Activity activity) {
        super(activity, null);
        this.f24967u1 = if0Var;
    }

    @Override
    public final void setAlpha(float f7) {
        ViewGroup viewGroup;
        super.setAlpha(f7);
        viewGroup = ((org.telegram.ui.ActionBar.f3) this.f24967u1).containerView;
        viewGroup.invalidate();
    }
}
