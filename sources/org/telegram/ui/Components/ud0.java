package org.telegram.ui.Components;

import android.app.Activity;

public final class ud0 extends org.telegram.ui.ActionBar.k {

    public final be0 f33063p1;

    public ud0(be0 be0Var, Activity activity) {
        super(activity, null);
        this.f33063p1 = be0Var;
    }

    @Override
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        ((org.telegram.ui.ActionBar.e3) this.f33063p1).containerView.invalidate();
    }
}
