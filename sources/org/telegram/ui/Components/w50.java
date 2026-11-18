package org.telegram.ui.Components;

import android.content.Context;
public final class w50 extends org.telegram.ui.Cells.a9 {
    public final x50 E;
    public final gk f41568x;
    public boolean f41569y;

    public w50(x50 x50Var, Context context) {
        super(context);
        this.E = x50Var;
        this.f41568x = new gk(this, 9);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gk gkVar = this.f41568x;
        org.telegram.messenger.g0.r(gkVar);
        if (this.f41569y) {
            org.telegram.messenger.g0.h3(gkVar, 500L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.f41568x);
    }
}
