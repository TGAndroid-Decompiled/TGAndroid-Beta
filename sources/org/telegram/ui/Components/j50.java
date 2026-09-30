package org.telegram.ui.Components;

import android.content.Context;
public final class j50 extends r50 {
    public final e60 d;

    public j50(e60 e60Var, Context context) {
        super(e60Var, context);
        this.d = e60Var;
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
