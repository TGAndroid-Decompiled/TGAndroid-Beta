package org.telegram.ui.Components;

import android.app.Activity;
public final class l8 extends r8 {
    public final k8 G;

    public l8(s8 s8Var, Activity activity, k8 k8Var) {
        super(s8Var, activity);
        this.G = k8Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.G.invalidate();
    }
}
