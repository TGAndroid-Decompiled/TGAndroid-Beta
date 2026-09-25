package org.telegram.ui.Components;

import android.content.Context;
public final class xw extends yy {
    public final lz H;

    public xw(lz lzVar, Context context) {
        super(lzVar, context, 0);
        this.H = lzVar;
    }

    @Override
    public final void setTranslationY(float f7) {
        if (f7 != getTranslationY()) {
            super.setTranslationY(f7);
            this.H.f26303x0.invalidate();
        }
    }
}
