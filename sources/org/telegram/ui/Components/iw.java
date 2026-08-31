package org.telegram.ui.Components;

import android.content.Context;
public final class iw extends yy {
    public final mz E;

    public iw(mz mzVar, Context context) {
        super(mzVar, context, 1);
        this.E = mzVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.E.G.invalidate();
        }
    }
}
