package org.telegram.ui.Components;

import android.content.Context;
public final class rw extends yy {
    public final lz H;

    public rw(lz lzVar, Context context) {
        super(lzVar, context, 2);
        this.H = lzVar;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (getTranslationY() != f7) {
            super.setTranslationY(f7);
            this.H.f26241g0.invalidate();
        }
    }
}
