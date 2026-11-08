package org.telegram.ui.Components;

import android.content.Context;
public final class iv extends ux {
    public final hy H;

    public iv(hy hyVar, Context context) {
        super(hyVar, context, 1);
        this.H = hyVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.H.J.invalidate();
        }
    }
}
