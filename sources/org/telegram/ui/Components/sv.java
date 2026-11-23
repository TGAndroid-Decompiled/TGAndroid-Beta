package org.telegram.ui.Components;

import android.content.Context;
public final class sv extends dy {
    public final qy I;

    public sv(qy qyVar, Context context) {
        super(qyVar, context, 1);
        this.I = qyVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.I.K.invalidate();
        }
    }
}
