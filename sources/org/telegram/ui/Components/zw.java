package org.telegram.ui.Components;

import android.content.Context;
public final class zw extends mz {
    public final a00 H;

    public zw(a00 a00Var, Context context) {
        super(a00Var, context, 1);
        this.H = a00Var;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.J.invalidate();
        }
    }
}
