package org.telegram.ui.Components;

import android.content.Context;
public final class k50 extends s50 {
    public final y50 d;

    public k50(y50 y50Var, Context context) {
        super(y50Var, context);
        this.d = y50Var;
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
