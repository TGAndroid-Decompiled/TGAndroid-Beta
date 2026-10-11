package org.telegram.ui.Components;

import android.content.Context;
public final class z50 extends h60 {
    public final t60 d;

    public z50(t60 t60Var, Context context) {
        super(t60Var, context);
        this.d = t60Var;
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
