package org.telegram.ui.Components;

import android.content.Context;
public final class m40 extends t40 {
    public final e50 d;

    public m40(e50 e50Var, Context context) {
        super(e50Var, context);
        this.d = e50Var;
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
