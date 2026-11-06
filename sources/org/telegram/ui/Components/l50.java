package org.telegram.ui.Components;

import android.content.Context;
public final class l50 extends org.telegram.ui.Cells.z8 {
    public final m50 D;
    public final dt f35517x;
    public boolean f35518y;

    public l50(m50 m50Var, Context context) {
        super(context);
        this.D = m50Var;
        this.f35517x = new dt(this, 6);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        dt dtVar = this.f35517x;
        org.telegram.messenger.g0.r(dtVar);
        if (this.f35518y) {
            org.telegram.messenger.g0.i3(dtVar, 500L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.f35517x);
    }
}
