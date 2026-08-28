package org.telegram.ui.Components;

import android.content.Context;
public final class q40 extends y40 {
    public final f50 d;

    public q40(f50 f50Var, Context context) {
        super(f50Var, context);
        this.d = f50Var;
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
