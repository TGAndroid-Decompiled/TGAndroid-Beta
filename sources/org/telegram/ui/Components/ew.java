package org.telegram.ui.Components;

import android.content.Context;
public final class ew extends ey {
    public final ry I;

    public ew(ry ryVar, Context context) {
        super(ryVar, context, 0);
        this.I = ryVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.I.f39411y0.invalidate();
        }
    }
}
