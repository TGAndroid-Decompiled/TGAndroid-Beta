package org.telegram.ui.Components;

import android.content.Context;
public final class rw extends fz {
    public final sz H;

    public rw(sz szVar, Context context) {
        super(szVar, context, 1);
        this.H = szVar;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.J.invalidate();
        }
    }
}
