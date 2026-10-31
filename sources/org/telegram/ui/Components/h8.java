package org.telegram.ui.Components;

import android.app.Activity;
public final class h8 extends n8 {
    public final g8 G;

    public h8(o8 o8Var, Activity activity, g8 g8Var) {
        super(o8Var, activity);
        this.G = g8Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.G.invalidate();
    }
}
