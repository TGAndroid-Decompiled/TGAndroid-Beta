package org.telegram.ui.Components;

import android.content.Context;
public final class m50 extends org.telegram.ui.Cells.z8 {
    public final n50 D;
    public final et f35959x;
    public boolean f35960y;

    public m50(n50 n50Var, Context context) {
        super(context);
        this.D = n50Var;
        this.f35959x = new et(this, 6);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        et etVar = this.f35959x;
        org.telegram.messenger.g0.r(etVar);
        if (this.f35960y) {
            org.telegram.messenger.g0.i3(etVar, 500L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.f35959x);
    }
}
