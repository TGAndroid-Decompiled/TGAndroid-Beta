package org.telegram.ui.Components;

import android.content.Context;
public final class s50 extends b60 {
    public final o60 d;

    public s50(o60 o60Var, Context context) {
        super(o60Var, context);
        this.d = o60Var;
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
