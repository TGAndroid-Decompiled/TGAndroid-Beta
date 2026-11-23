package org.telegram.ui.Components;

import android.content.Context;
public final class uv extends gy {
    public final ty I;

    public uv(ty tyVar, Context context) {
        super(tyVar, context, 1);
        this.I = tyVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.I.K.invalidate();
        }
    }
}
