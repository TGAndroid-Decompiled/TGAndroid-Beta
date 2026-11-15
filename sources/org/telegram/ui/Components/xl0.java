package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class xl0 extends bs {
    public final org.telegram.ui.hw f41716l0;

    public xl0(org.telegram.ui.hw hwVar, uj0 uj0Var, Context context, int i7, int i10) {
        super(uj0Var, context, i7, i10, false, null);
        this.f41716l0 = hwVar;
    }

    @Override
    public final void O(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        super.O(z10);
        wl0 wl0Var = this.f41716l0.f36049o0;
        if (!this.f33360c0 && !this.f33361d0 && (arrayList = this.W) != null && arrayList.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        wl0Var.e(z11, z10);
        wl0Var.d.setText(org.telegram.messenger.hd.M0(2131748167, null));
        wl0Var.f33709e.setVisibility(8);
    }
}
