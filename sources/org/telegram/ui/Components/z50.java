package org.telegram.ui.Components;

import android.content.Context;
public final class z50 extends org.telegram.ui.Cells.a9 {
    public final a60 E;
    public final ik f42687x;
    public boolean f42688y;

    public z50(a60 a60Var, Context context) {
        super(context);
        this.E = a60Var;
        this.f42687x = new ik(this, 9);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ik ikVar = this.f42687x;
        org.telegram.messenger.g0.r(ikVar);
        if (this.f42688y) {
            org.telegram.messenger.g0.h3(ikVar, 500L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.f42687x);
    }
}
