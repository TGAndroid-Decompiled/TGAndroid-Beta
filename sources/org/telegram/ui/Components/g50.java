package org.telegram.ui.Components;

import android.content.Context;
public final class g50 extends p50 {
    public final w50 d;

    public g50(w50 w50Var, Context context) {
        super(w50Var, context);
        this.d = w50Var;
    }

    @Override
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.d.invalidate();
    }

    @Override
    public final void setRotationY(float f7) {
        super.setRotationY(f7);
        this.d.invalidate();
    }
}
