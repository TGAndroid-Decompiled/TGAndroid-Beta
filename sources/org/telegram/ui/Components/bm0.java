package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
public final class bm0 extends xr {
    public final org.telegram.ui.yw f32282f0;
    public final org.telegram.ui.hw f32283g0;

    public bm0(org.telegram.ui.hw hwVar, qj0 qj0Var, Context context, int i7, int i10, org.telegram.ui.yw ywVar) {
        super(qj0Var, context, i7, i10);
        this.f32283g0 = hwVar;
        this.f32282f0 = ywVar;
    }

    @Override
    public final void O(boolean z9) {
        boolean z10;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.O(z9);
        tl0 tl0Var = this.f32283g0.f34000i0;
        if (!this.Y && !this.Z && (arrayList = this.R) != null && arrayList.isEmpty() && (arrayList2 = this.S) != null && arrayList2.isEmpty() && (arrayList3 = this.U) != null && arrayList3.isEmpty() && (arrayList4 = this.T) != null && arrayList4.isEmpty()) {
            z10 = false;
        } else {
            z10 = true;
        }
        tl0Var.e(z10, z9);
        if (TextUtils.isEmpty(this.f40472d0)) {
            tl0Var.d.setText(org.telegram.messenger.id.M0(2131748231, null));
            tl0Var.f32768e.setVisibility(0);
            tl0Var.f32768e.setText(org.telegram.messenger.id.M0(2131748232, null));
            return;
        }
        tl0Var.d.setText(org.telegram.messenger.id.M0(2131748167, null));
        tl0Var.f32768e.setVisibility(8);
    }
}
