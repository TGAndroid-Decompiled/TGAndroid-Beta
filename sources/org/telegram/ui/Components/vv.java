package org.telegram.ui.Components;

import android.content.Context;

public final class vv extends ky {
    public final yy D;

    public vv(yy yyVar, Context context) {
        super(yyVar, context, 1);
        this.D = yyVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.D.F.invalidate();
        }
    }
}
