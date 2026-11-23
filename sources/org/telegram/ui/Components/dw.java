package org.telegram.ui.Components;

import android.content.Context;
public final class dw extends dy {
    public final qy I;

    public dw(qy qyVar, Context context) {
        super(qyVar, context, 0);
        this.I = qyVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.I.f39113y0.invalidate();
        }
    }
}
