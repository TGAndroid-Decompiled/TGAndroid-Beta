package org.telegram.ui.Components;

import android.content.Context;
public final class l50 extends org.telegram.ui.Cells.z8 {
    public final m50 D;
    public final et f35535x;
    public boolean f35536y;

    public l50(m50 m50Var, Context context) {
        super(context);
        this.D = m50Var;
        this.f35535x = new et(this, 6);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        et etVar = this.f35535x;
        org.telegram.messenger.g0.r(etVar);
        if (this.f35536y) {
            org.telegram.messenger.g0.i3(etVar, 500L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.f35535x);
    }
}
