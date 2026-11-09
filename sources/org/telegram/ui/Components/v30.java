package org.telegram.ui.Components;

import android.content.Context;
public final class v30 extends d40 {
    public final p40 d;

    public v30(p40 p40Var, Context context) {
        super(p40Var, context);
        this.d = p40Var;
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
