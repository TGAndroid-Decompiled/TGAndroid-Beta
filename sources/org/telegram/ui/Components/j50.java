package org.telegram.ui.Components;

import android.content.Context;
public final class j50 extends r50 {
    public final x50 d;

    public j50(x50 x50Var, Context context) {
        super(x50Var, context);
        this.d = x50Var;
    }

    @Override
    public final void setAlpha(float f10) {
        super.setAlpha(f10);
        this.d.invalidate();
    }

    @Override
    public final void setRotationY(float f10) {
        super.setRotationY(f10);
        this.d.invalidate();
    }
}
