package org.telegram.ui.Components;

import android.content.Context;
public final class q50 extends z50 {
    public final m60 d;

    public q50(m60 m60Var, Context context) {
        super(m60Var, context);
        this.d = m60Var;
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
