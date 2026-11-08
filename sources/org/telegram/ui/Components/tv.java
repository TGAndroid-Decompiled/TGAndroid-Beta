package org.telegram.ui.Components;

import android.content.Context;
public final class tv extends ux {
    public final hy H;

    public tv(hy hyVar, Context context) {
        super(hyVar, context, 0);
        this.H = hyVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.H.f34465x0.invalidate();
        }
    }
}
