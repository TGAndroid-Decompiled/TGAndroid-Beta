package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class um0 extends gs {
    public final org.telegram.ui.kx f30994k0;

    public um0(org.telegram.ui.kx kxVar, tk0 tk0Var, Context context, int i10, int i11) {
        super(tk0Var, context, i10, i11, false, null);
        this.f30994k0 = kxVar;
    }

    @Override
    public final void O(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        super.O(z10);
        tm0 tm0Var = this.f30994k0.f26460n0;
        if (!this.f26506b0 && !this.f26507c0 && (arrayList = this.V) != null && arrayList.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        tm0Var.e(z11, z10);
        tm0Var.d.setText(org.telegram.messenger.cd.L0(2131748183, null));
        tm0Var.e.setVisibility(8);
    }
}
