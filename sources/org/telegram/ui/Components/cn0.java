package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
public final class cn0 extends is {
    public final org.telegram.ui.zx f25188f0;
    public final org.telegram.ui.jx f25189g0;

    public cn0(org.telegram.ui.jx jxVar, uk0 uk0Var, Context context, int i10, int i11, org.telegram.ui.zx zxVar) {
        super(uk0Var, context, i10, i11);
        this.f25189g0 = jxVar;
        this.f25188f0 = zxVar;
    }

    @Override
    public final void O(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.O(z10);
        um0 um0Var = this.f25189g0.f26877i0;
        if (!this.Y && !this.Z && (arrayList = this.R) != null && arrayList.isEmpty() && (arrayList2 = this.S) != null && arrayList2.isEmpty() && (arrayList3 = this.U) != null && arrayList3.isEmpty() && (arrayList4 = this.T) != null && arrayList4.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        um0Var.e(z11, z10);
        if (TextUtils.isEmpty(this.f27164d0)) {
            um0Var.d.setText(org.telegram.messenger.dd.L0(2131748248, null));
            um0Var.e.setVisibility(0);
            um0Var.e.setText(org.telegram.messenger.dd.L0(2131748249, null));
            return;
        }
        um0Var.d.setText(org.telegram.messenger.dd.L0(2131748183, null));
        um0Var.e.setVisibility(8);
    }
}
