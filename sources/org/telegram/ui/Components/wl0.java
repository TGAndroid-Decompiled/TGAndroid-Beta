package org.telegram.ui.Components;

import android.content.Context;
public final class wl0 extends u20 {
    public final org.telegram.ui.fw f40051e0;

    public wl0(org.telegram.ui.fw fwVar, pj0 pj0Var, Context context, int i7) {
        super(pj0Var, context, i7);
        this.f40051e0 = fwVar;
    }

    @Override
    public final void O(boolean z9) {
        super.O(z9);
        sl0 sl0Var = this.f40051e0.f33607u0;
        sl0Var.e(false, z9);
        sl0Var.d.setText(org.telegram.messenger.hd.M0(2131748166, null));
        sl0Var.f31925e.setVisibility(8);
    }
}
