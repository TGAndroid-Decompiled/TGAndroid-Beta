package org.telegram.ui.Components;

import android.content.Context;

public final class bw extends ky {
    public final yy D;

    public bw(yy yyVar, Context context) {
        super(yyVar, context, 2);
        this.D = yyVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            this.D.f34984c0.invalidate();
        }
    }
}
