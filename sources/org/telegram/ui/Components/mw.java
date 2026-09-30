package org.telegram.ui.Components;

import android.content.Context;
public final class mw extends az {
    public final nz H;

    public mw(nz nzVar, Context context) {
        super(nzVar, context, 1);
        this.H = nzVar;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.J.invalidate();
        }
    }
}
