package org.telegram.ui.Components;

import android.content.Context;
public final class mx extends nz {
    public final b00 H;

    public mx(b00 b00Var, Context context) {
        super(b00Var, context, 0);
        this.H = b00Var;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.f24729x0.invalidate();
        }
    }
}
