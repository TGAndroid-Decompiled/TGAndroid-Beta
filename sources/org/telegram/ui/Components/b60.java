package org.telegram.ui.Components;

import android.content.Context;
public final class b60 extends org.telegram.ui.Cells.b9 {
    public final c60 D;
    public final ew f24663x;
    public boolean f24664y;

    public b60(c60 c60Var, Context context) {
        super(context);
        this.D = c60Var;
        this.f24663x = new ew(this, 4);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ew ewVar = this.f24663x;
        org.telegram.messenger.i0.r(ewVar);
        if (this.f24664y) {
            org.telegram.messenger.i0.h3(ewVar, 500L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.i0.r(this.f24663x);
    }
}
