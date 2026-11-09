package org.telegram.ui.Components;

import android.app.Activity;
public final class vc0 extends org.telegram.ui.ActionBar.k {
    public final bd0 F1;

    public vc0(bd0 bd0Var, Activity activity) {
        super(activity, null);
        this.F1 = bd0Var;
    }

    @Override
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        this.F1.f28624b.invalidate();
    }
}
