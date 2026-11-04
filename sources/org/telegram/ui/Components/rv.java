package org.telegram.ui.Components;

import android.content.Context;
public final class rv extends rx {
    public final ey I;

    public rv(ey eyVar, Context context) {
        super(eyVar, context, 0);
        this.I = eyVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.I.f33596y0.invalidate();
        }
    }
}
