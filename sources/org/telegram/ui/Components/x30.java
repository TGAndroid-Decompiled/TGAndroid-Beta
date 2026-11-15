package org.telegram.ui.Components;

import android.content.Context;
public final class x30 extends f40 {
    public final r40 d;

    public x30(r40 r40Var, Context context) {
        super(r40Var, context);
        this.d = r40Var;
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
