package org.telegram.ui.Components;

import android.content.Context;
public final class f40 extends n40 {
    public final z40 d;

    public f40(z40 z40Var, Context context) {
        super(z40Var, context);
        this.d = z40Var;
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
