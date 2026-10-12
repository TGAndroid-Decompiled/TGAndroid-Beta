package org.telegram.ui.Components;

import android.content.Context;
public final class ox extends pz {
    public final d00 H;

    public ox(d00 d00Var, Context context) {
        super(d00Var, context, 0);
        this.H = d00Var;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.f25139x0.invalidate();
        }
    }
}
