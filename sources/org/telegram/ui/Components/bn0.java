package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
public final class bn0 extends is {
    public final org.telegram.ui.ay f24842f0;
    public final org.telegram.ui.kx f24843g0;

    public bn0(org.telegram.ui.kx kxVar, tk0 tk0Var, Context context, int i10, int i11, org.telegram.ui.ay ayVar) {
        super(tk0Var, context, i10, i11);
        this.f24843g0 = kxVar;
        this.f24842f0 = ayVar;
    }

    @Override
    public final void O(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.O(z10);
        tm0 tm0Var = this.f24843g0.f26456i0;
        if (!this.Y && !this.Z && (arrayList = this.R) != null && arrayList.isEmpty() && (arrayList2 = this.S) != null && arrayList2.isEmpty() && (arrayList3 = this.U) != null && arrayList3.isEmpty() && (arrayList4 = this.T) != null && arrayList4.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        tm0Var.e(z11, z10);
        if (TextUtils.isEmpty(this.f27075d0)) {
            tm0Var.d.setText(org.telegram.messenger.cd.L0(2131748248, null));
            tm0Var.e.setVisibility(0);
            tm0Var.e.setText(org.telegram.messenger.cd.L0(2131748249, null));
            return;
        }
        tm0Var.d.setText(org.telegram.messenger.cd.L0(2131748183, null));
        tm0Var.e.setVisibility(8);
    }
}
