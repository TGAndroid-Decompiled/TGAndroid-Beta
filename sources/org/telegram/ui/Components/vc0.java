package org.telegram.ui.Components;

import android.app.Activity;
public final class vc0 extends org.telegram.ui.ActionBar.k {
    public final bd0 G1;

    public vc0(bd0 bd0Var, Activity activity) {
        super(activity, null);
        this.G1 = bd0Var;
    }

    @Override
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        this.G1.f29682b.invalidate();
    }
}
