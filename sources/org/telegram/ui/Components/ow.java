package org.telegram.ui.Components;

import android.content.Context;
public final class ow extends ry {
    public final fz D;

    public ow(fz fzVar, Context context) {
        super(fzVar, context, 0);
        this.D = fzVar;
    }

    @Override
    public final void setTranslationY(float f9) {
        if (f9 != getTranslationY()) {
            super.setTranslationY(f9);
            this.D.f28636t0.invalidate();
        }
    }
}
