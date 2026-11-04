package org.telegram.ui.Components;

import android.content.Context;
public final class gv extends rx {
    public final ey I;

    public gv(ey eyVar, Context context) {
        super(eyVar, context, 1);
        this.I = eyVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.I.K.invalidate();
        }
    }
}
