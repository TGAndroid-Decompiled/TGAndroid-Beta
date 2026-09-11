package org.telegram.ui.Components;

import android.app.Activity;
public final class y8 extends e9 {
    public final x8 G;

    public y8(f9 f9Var, Activity activity, x8 x8Var) {
        super(f9Var, activity);
        this.G = x8Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.G.invalidate();
    }
}
