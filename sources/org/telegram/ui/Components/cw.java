package org.telegram.ui.Components;

import android.content.Context;
public final class cw extends ry {
    public final fz D;

    public cw(fz fzVar, Context context) {
        super(fzVar, context, 1);
        this.D = fzVar;
    }

    @Override
    public final void setTranslationY(float f9) {
        if (f9 != getTranslationY()) {
            super.setTranslationY(f9);
            this.D.F.invalidate();
        }
    }
}
