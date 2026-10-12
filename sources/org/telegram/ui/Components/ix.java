package org.telegram.ui.Components;

import android.content.Context;
public final class ix extends pz {
    public final d00 H;

    public ix(d00 d00Var, Context context) {
        super(d00Var, context, 2);
        this.H = d00Var;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.H.f25093g0.invalidate();
        }
    }
}
