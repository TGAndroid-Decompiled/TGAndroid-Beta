package org.telegram.ui.Components;

import android.content.Context;
public final class xl0 extends v20 {
    public final org.telegram.ui.hw f40431e0;

    public xl0(org.telegram.ui.hw hwVar, qj0 qj0Var, Context context, int i7) {
        super(qj0Var, context, i7);
        this.f40431e0 = hwVar;
    }

    @Override
    public final void O(boolean z9) {
        super.O(z9);
        tl0 tl0Var = this.f40431e0.f34011u0;
        tl0Var.e(false, z9);
        tl0Var.d.setText(org.telegram.messenger.id.M0(2131748167, null));
        tl0Var.f32768e.setVisibility(8);
    }
}
