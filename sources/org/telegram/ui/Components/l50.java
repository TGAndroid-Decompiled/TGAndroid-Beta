package org.telegram.ui.Components;

import android.content.Context;
public final class l50 extends t50 {
    public final z50 d;

    public l50(z50 z50Var, Context context) {
        super(z50Var, context);
        this.d = z50Var;
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
