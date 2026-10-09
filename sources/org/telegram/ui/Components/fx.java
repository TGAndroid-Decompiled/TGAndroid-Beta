package org.telegram.ui.Components;

import android.content.Context;
public final class fx extends mz {
    public final a00 H;

    public fx(a00 a00Var, Context context) {
        super(a00Var, context, 2);
        this.H = a00Var;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.H.f24414g0.invalidate();
        }
    }
}
