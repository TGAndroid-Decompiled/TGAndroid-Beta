package org.telegram.ui.Components;

import android.content.Context;
public final class b60 extends k60 {
    public final w60 d;

    public b60(w60 w60Var, Context context) {
        super(w60Var, context);
        this.d = w60Var;
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
