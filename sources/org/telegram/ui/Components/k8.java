package org.telegram.ui.Components;

import android.app.Activity;
public final class k8 extends q8 {
    public final j8 H;

    public k8(r8 r8Var, Activity activity, j8 j8Var) {
        super(r8Var, activity);
        this.H = j8Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.H.invalidate();
    }
}
