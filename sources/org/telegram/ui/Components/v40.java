package org.telegram.ui.Components;

import android.content.Context;

public final class v40 extends d50 {
    public final k50 d;

    public v40(k50 k50Var, Context context) {
        super(k50Var, context);
        this.d = k50Var;
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
