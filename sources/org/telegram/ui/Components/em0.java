package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
public final class em0 extends ds {
    public final org.telegram.ui.yw f34374g0;
    public final org.telegram.ui.hw f34375h0;

    public em0(org.telegram.ui.hw hwVar, uj0 uj0Var, Context context, int i7, int i10, org.telegram.ui.yw ywVar) {
        super(uj0Var, context, i7, i10);
        this.f34375h0 = hwVar;
        this.f34374g0 = ywVar;
    }

    @Override
    public final void O(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.O(z10);
        wl0 wl0Var = this.f34375h0.f36055j0;
        if (!this.Z && !this.f34056a0 && (arrayList = this.S) != null && arrayList.isEmpty() && (arrayList2 = this.T) != null && arrayList2.isEmpty() && (arrayList3 = this.V) != null && arrayList3.isEmpty() && (arrayList4 = this.U) != null && arrayList4.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        wl0Var.e(z11, z10);
        if (TextUtils.isEmpty(this.f34060e0)) {
            wl0Var.d.setText(org.telegram.messenger.hd.M0(2131748231, null));
            wl0Var.f33707e.setVisibility(0);
            wl0Var.f33707e.setText(org.telegram.messenger.hd.M0(2131748232, null));
            return;
        }
        wl0Var.d.setText(org.telegram.messenger.hd.M0(2131748167, null));
        wl0Var.f33707e.setVisibility(8);
    }
}
