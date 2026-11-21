package org.telegram.ui.Components;

import android.content.Context;
public final class lm0 extends i30 {
    public final org.telegram.ui.kw f37238f0;

    public lm0(org.telegram.ui.kw kwVar, ek0 ek0Var, Context context, int i7) {
        super(ek0Var, context, i7);
        this.f37238f0 = kwVar;
    }

    @Override
    public final void O(boolean z10) {
        super.O(z10);
        hm0 hm0Var = this.f37238f0.f40526v0;
        hm0Var.e(false, z10);
        hm0Var.d.setText(org.telegram.messenger.gd.N0(2131747974, null));
        hm0Var.f37991e.setVisibility(8);
    }
}
