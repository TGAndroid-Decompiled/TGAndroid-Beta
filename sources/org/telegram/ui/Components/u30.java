package org.telegram.ui.Components;

import android.content.Context;
public final class u30 extends c40 {
    public final o40 d;

    public u30(o40 o40Var, Context context) {
        super(o40Var, context);
        this.d = o40Var;
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
