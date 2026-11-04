package org.telegram.ui.Components;

import android.content.Context;
public final class q30 extends y30 {
    public final k40 d;

    public q30(k40 k40Var, Context context) {
        super(k40Var, context);
        this.d = k40Var;
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
