package org.telegram.ui.Components;

import android.content.Context;
public final class w50 extends org.telegram.ui.Cells.z8 {
    public final x50 E;
    public final rc f41518x;
    public boolean f41519y;

    public w50(x50 x50Var, Context context) {
        super(context);
        this.E = x50Var;
        this.f41518x = new rc(this, 10);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rc rcVar = this.f41518x;
        org.telegram.messenger.g0.r(rcVar);
        if (this.f41519y) {
            org.telegram.messenger.g0.h3(rcVar, 500L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.f41518x);
    }
}
