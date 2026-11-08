package org.telegram.ui.Components;

import android.content.Context;
public final class nv extends ux {
    public final hy H;

    public nv(hy hyVar, Context context) {
        super(hyVar, context, 2);
        this.H = hyVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.H.f34412g0.invalidate();
        }
    }
}
