package org.telegram.ui.Components;

import android.content.Context;
public final class z50 extends h60 {
    public final u60 d;

    public z50(u60 u60Var, Context context) {
        super(u60Var, context);
        this.d = u60Var;
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
