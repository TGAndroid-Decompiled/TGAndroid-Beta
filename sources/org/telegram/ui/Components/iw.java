package org.telegram.ui.Components;

import android.content.Context;
public final class iw extends ry {
    public final fz D;

    public iw(fz fzVar, Context context) {
        super(fzVar, context, 2);
        this.D = fzVar;
    }

    @Override
    public final void setTranslationY(float f9) {
        if (getTranslationY() != f9) {
            super.setTranslationY(f9);
            this.D.f28582c0.invalidate();
        }
    }
}
