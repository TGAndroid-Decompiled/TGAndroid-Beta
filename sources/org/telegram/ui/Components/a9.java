package org.telegram.ui.Components;

import android.app.Activity;
public final class a9 extends g9 {
    public final z8 G;

    public a9(h9 h9Var, Activity activity, z8 z8Var) {
        super(h9Var, activity);
        this.G = z8Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.G.invalidate();
    }
}
