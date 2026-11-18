package org.telegram.ui.Components;

import android.content.Context;
public final class xv extends ey {
    public final ry I;

    public xv(ry ryVar, Context context) {
        super(ryVar, context, 2);
        this.I = ryVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.I.f39357h0.invalidate();
        }
    }
}
