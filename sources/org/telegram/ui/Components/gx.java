package org.telegram.ui.Components;

import android.content.Context;
public final class gx extends nz {
    public final b00 H;

    public gx(b00 b00Var, Context context) {
        super(b00Var, context, 2);
        this.H = b00Var;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.H.f24675g0.invalidate();
        }
    }
}
