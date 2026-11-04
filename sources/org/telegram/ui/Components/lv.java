package org.telegram.ui.Components;

import android.content.Context;
public final class lv extends rx {
    public final ey I;

    public lv(ey eyVar, Context context) {
        super(eyVar, context, 2);
        this.I = eyVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.I.f33542h0.invalidate();
        }
    }
}
