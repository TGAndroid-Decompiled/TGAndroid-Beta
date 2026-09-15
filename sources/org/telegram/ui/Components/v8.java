package org.telegram.ui.Components;

import android.app.Activity;
public final class v8 extends b9 {
    public final u8 G;

    public v8(c9 c9Var, Activity activity, u8 u8Var) {
        super(c9Var, activity);
        this.G = u8Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.G.invalidate();
    }
}
