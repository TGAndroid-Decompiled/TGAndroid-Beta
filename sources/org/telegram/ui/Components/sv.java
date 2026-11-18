package org.telegram.ui.Components;

import android.content.Context;
public final class sv extends ey {
    public final ry I;

    public sv(ry ryVar, Context context) {
        super(ryVar, context, 1);
        this.I = ryVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.I.K.invalidate();
        }
    }
}
