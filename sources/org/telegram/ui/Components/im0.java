package org.telegram.ui.Components;

import android.content.Context;
public final class im0 extends f30 {
    public final org.telegram.ui.kw f36150f0;

    public im0(org.telegram.ui.kw kwVar, ck0 ck0Var, Context context, int i7) {
        super(ck0Var, context, i7);
        this.f36150f0 = kwVar;
    }

    @Override
    public final void O(boolean z10) {
        super.O(z10);
        em0 em0Var = this.f36150f0.f39201v0;
        em0Var.e(false, z10);
        em0Var.d.setText(org.telegram.messenger.gd.M0(2131747975, null));
        em0Var.f36896e.setVisibility(8);
    }
}
