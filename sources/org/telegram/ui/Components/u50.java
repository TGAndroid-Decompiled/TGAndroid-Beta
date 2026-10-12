package org.telegram.ui.Components;

import android.content.Context;
public final class u50 extends c60 {
    public final p60 d;

    public u50(p60 p60Var, Context context) {
        super(p60Var, context);
        this.d = p60Var;
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
