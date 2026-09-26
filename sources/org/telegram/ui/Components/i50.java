package org.telegram.ui.Components;

import android.content.Context;
public final class i50 extends q50 {
    public final d60 d;

    public i50(d60 d60Var, Context context) {
        super(d60Var, context);
        this.d = d60Var;
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
