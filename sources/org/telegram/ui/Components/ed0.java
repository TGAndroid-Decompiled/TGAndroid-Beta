package org.telegram.ui.Components;

import android.app.Activity;
public final class ed0 extends org.telegram.ui.ActionBar.k {
    public final kd0 G1;

    public ed0(kd0 kd0Var, Activity activity) {
        super(activity, null);
        this.G1 = kd0Var;
    }

    @Override
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        this.G1.f30226b.invalidate();
    }
}
