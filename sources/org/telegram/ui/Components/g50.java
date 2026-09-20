package org.telegram.ui.Components;

import android.content.Context;
public final class g50 extends o50 {
    public final a60 d;

    public g50(a60 a60Var, Context context) {
        super(a60Var, context);
        this.d = a60Var;
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
