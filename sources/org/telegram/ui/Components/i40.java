package org.telegram.ui.Components;

import android.content.Context;
public final class i40 extends q40 {
    public final c50 d;

    public i40(c50 c50Var, Context context) {
        super(c50Var, context);
        this.d = c50Var;
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
