package org.telegram.ui.Components;

import android.content.Context;
public final class g50 extends o50 {
    public final c60 d;

    public g50(c60 c60Var, Context context) {
        super(c60Var, context);
        this.d = c60Var;
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
