package org.telegram.ui.Components;

import android.content.Context;
public final class o50 extends x50 {
    public final l60 d;

    public o50(l60 l60Var, Context context) {
        super(l60Var, context);
        this.d = l60Var;
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
