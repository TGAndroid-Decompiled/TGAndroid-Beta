package org.telegram.ui.Components;

import android.content.Context;
public final class km0 extends i30 {
    public final org.telegram.ui.kw f36901f0;

    public km0(org.telegram.ui.kw kwVar, ek0 ek0Var, Context context, int i7) {
        super(ek0Var, context, i7);
        this.f36901f0 = kwVar;
    }

    @Override
    public final void O(boolean z10) {
        super.O(z10);
        gm0 gm0Var = this.f36901f0.f39921v0;
        gm0Var.e(false, z10);
        gm0Var.d.setText(org.telegram.messenger.hd.N0(2131747974, null));
        gm0Var.f37962e.setVisibility(8);
    }
}
