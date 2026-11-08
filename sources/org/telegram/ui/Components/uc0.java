package org.telegram.ui.Components;

import android.app.Activity;
public final class uc0 extends org.telegram.ui.ActionBar.k {
    public final ad0 F1;

    public uc0(ad0 ad0Var, Activity activity) {
        super(activity, null);
        this.F1 = ad0Var;
    }

    @Override
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        this.F1.f28619b.invalidate();
    }
}
