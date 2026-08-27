package org.telegram.ui.Components;

import android.content.Context;

public final class hw extends ky {
    public final yy D;

    public hw(yy yyVar, Context context) {
        super(yyVar, context, 0);
        this.D = yyVar;
    }

    @Override
    public final void setTranslationY(float f10) {
        if (f10 != getTranslationY()) {
            super.setTranslationY(f10);
            this.D.f35038t0.invalidate();
        }
    }
}
