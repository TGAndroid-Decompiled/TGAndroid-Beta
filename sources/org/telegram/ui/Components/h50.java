package org.telegram.ui.Components;

import android.content.Context;
public final class h50 extends q50 {
    public final x50 d;

    public h50(x50 x50Var, Context context) {
        super(x50Var, context);
        this.d = x50Var;
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
