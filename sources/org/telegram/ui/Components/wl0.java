package org.telegram.ui.Components;

import android.content.Context;
public final class wl0 extends u20 {
    public final org.telegram.ui.iw f40016e0;

    public wl0(org.telegram.ui.iw iwVar, pj0 pj0Var, Context context, int i7) {
        super(pj0Var, context, i7);
        this.f40016e0 = iwVar;
    }

    @Override
    public final void O(boolean z9) {
        super.O(z9);
        sl0 sl0Var = this.f40016e0.f33606u0;
        sl0Var.e(false, z9);
        sl0Var.d.setText(org.telegram.messenger.id.M0(2131748167, null));
        sl0Var.f32368e.setVisibility(8);
    }
}
