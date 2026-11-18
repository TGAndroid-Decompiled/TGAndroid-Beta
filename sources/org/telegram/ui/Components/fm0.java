package org.telegram.ui.Components;

import android.content.Context;
import java.util.ArrayList;
public final class fm0 extends is {
    public final org.telegram.ui.kw f35141l0;

    public fm0(org.telegram.ui.kw kwVar, ck0 ck0Var, Context context, int i7, int i10) {
        super(ck0Var, context, i7, i10, false, null);
        this.f35141l0 = kwVar;
    }

    @Override
    public final void O(boolean z10) {
        boolean z11;
        ArrayList arrayList;
        super.O(z10);
        em0 em0Var = this.f35141l0.f39194o0;
        if (!this.f36183c0 && !this.f36184d0 && (arrayList = this.W) != null && arrayList.isEmpty()) {
            z11 = false;
        } else {
            z11 = true;
        }
        em0Var.e(z11, z10);
        em0Var.d.setText(org.telegram.messenger.gd.M0(2131747975, null));
        em0Var.f36896e.setVisibility(8);
    }
}
