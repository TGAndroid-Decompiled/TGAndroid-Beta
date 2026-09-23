package org.telegram.ui.Components;

import android.app.Activity;
public final class x8 extends d9 {
    public final w8 G;

    public x8(e9 e9Var, Activity activity, w8 w8Var) {
        super(e9Var, activity);
        this.G = w8Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.G.invalidate();
    }
}
