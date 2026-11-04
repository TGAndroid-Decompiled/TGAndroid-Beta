package org.telegram.ui.Components;

import android.app.Activity;
public final class pc0 extends org.telegram.ui.ActionBar.k {
    public final vc0 G1;

    public pc0(vc0 vc0Var, Activity activity) {
        super(activity, null);
        this.G1 = vc0Var;
    }

    @Override
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        this.G1.f28586b.invalidate();
    }
}
