package org.telegram.ui.Components;

import android.app.Activity;
public final class z8 extends f9 {
    public final y8 G;

    public z8(g9 g9Var, Activity activity, y8 y8Var) {
        super(g9Var, activity);
        this.G = y8Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.G.invalidate();
    }
}
