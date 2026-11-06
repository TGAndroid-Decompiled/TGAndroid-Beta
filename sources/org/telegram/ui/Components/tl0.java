package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class tl0 extends vr {
    public final org.telegram.ui.fw f38379k0;

    public tl0(org.telegram.ui.fw fwVar, pj0 pj0Var, Context context, int i7, int i10) {
        super(pj0Var, context, i7, i10, false, null);
        this.f38379k0 = fwVar;
    }

    @Override
    public final void O(boolean z9) {
        boolean z10;
        ArrayList arrayList;
        super.O(z9);
        sl0 sl0Var = this.f38379k0.f33646n0;
        if (!this.f39653b0 && !this.f39654c0 && (arrayList = this.V) != null && arrayList.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        sl0Var.e(z10, z9);
        sl0Var.d.setText(org.telegram.messenger.hd.M0(2131748166, null));
        sl0Var.f31917e.setVisibility(8);
    }
}
