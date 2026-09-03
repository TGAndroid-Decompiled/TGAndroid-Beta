package org.telegram.ui.Components;

import android.content.Context;
public final class uw extends yy {
    public final mz E;

    public uw(mz mzVar, Context context) {
        super(mzVar, context, 0);
        this.E = mzVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.E.f29330u0.invalidate();
        }
    }
}
