package org.telegram.ui.Components;

import android.app.Activity;
public final class m8 extends s8 {
    public final l8 G;

    public m8(t8 t8Var, Activity activity, l8 l8Var) {
        super(t8Var, activity);
        this.G = l8Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.G.invalidate();
    }
}
