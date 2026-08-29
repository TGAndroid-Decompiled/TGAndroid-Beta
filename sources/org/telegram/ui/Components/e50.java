package org.telegram.ui.Components;

import android.content.Context;
public final class e50 extends m50 {
    public final s50 d;

    public e50(s50 s50Var, Context context) {
        super(s50Var, context);
        this.d = s50Var;
    }

    @Override
    public final void setAlpha(float f9) {
        super.setAlpha(f9);
        this.d.invalidate();
    }

    @Override
    public final void setRotationY(float f9) {
        super.setRotationY(f9);
        this.d.invalidate();
    }
}
