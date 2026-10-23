package org.telegram.ui.Components;

import android.content.Context;
public final class q50 extends z50 {
    public final n60 d;

    public q50(n60 n60Var, Context context) {
        super(n60Var, context);
        this.d = n60Var;
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
