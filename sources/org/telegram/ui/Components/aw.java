package org.telegram.ui.Components;

import android.content.Context;
public final class aw extends gy {
    public final ty I;

    public aw(ty tyVar, Context context) {
        super(tyVar, context, 2);
        this.I = tyVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.I.f40103h0.invalidate();
        }
    }
}
