package org.telegram.ui.Components;

import android.content.Context;
public final class q50 extends z50 {
    public final f60 d;

    public q50(f60 f60Var, Context context) {
        super(f60Var, context);
        this.d = f60Var;
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
