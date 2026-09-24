package org.telegram.ui.Components;

import android.content.Context;
public final class lw extends yy {
    public final lz H;

    public lw(lz lzVar, Context context) {
        super(lzVar, context, 1);
        this.H = lzVar;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.J.invalidate();
        }
    }
}
