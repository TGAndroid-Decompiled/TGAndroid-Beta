package org.telegram.ui.Components;

import android.content.Context;
public final class zl0 extends q20 {
    public final org.telegram.ui.cw f41073f0;

    public zl0(org.telegram.ui.cw cwVar, tj0 tj0Var, Context context, int i3) {
        super(tj0Var, context, i3);
        this.f41073f0 = cwVar;
    }

    @Override
    public final void O(boolean z10) {
        super.O(z10);
        vl0 vl0Var = this.f41073f0.f34767v0;
        vl0Var.e(false, z10);
        vl0Var.d.setText(org.telegram.messenger.bd.M0(2131748175, null));
        vl0Var.f41128e.setVisibility(8);
    }
}
