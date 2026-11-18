package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
public final class mm0 extends ks {
    public final org.telegram.ui.cx f37584g0;
    public final org.telegram.ui.kw f37585h0;

    public mm0(org.telegram.ui.kw kwVar, ck0 ck0Var, Context context, int i7, int i10, org.telegram.ui.cx cxVar) {
        super(ck0Var, context, i7, i10);
        this.f37585h0 = kwVar;
        this.f37584g0 = cxVar;
    }

    @Override
    public final void O(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        super.O(z10);
        em0 em0Var = this.f37585h0.f39190j0;
        if (!this.Z && !this.f36867a0 && (arrayList = this.S) != null && arrayList.isEmpty() && (arrayList2 = this.T) != null && arrayList2.isEmpty() && (arrayList3 = this.V) != null && arrayList3.isEmpty() && (arrayList4 = this.U) != null && arrayList4.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        em0Var.e(z11, z10);
        if (TextUtils.isEmpty(this.f36871e0)) {
            em0Var.d.setText(org.telegram.messenger.gd.M0(2131748039, null));
            em0Var.f36896e.setVisibility(0);
            em0Var.f36896e.setText(org.telegram.messenger.gd.M0(2131748040, null));
            return;
        }
        em0Var.d.setText(org.telegram.messenger.gd.M0(2131747975, null));
        em0Var.f36896e.setVisibility(8);
    }
}
