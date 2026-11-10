package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class ka0 extends jg.r0 {
    public boolean f47241d0;
    public final sa0 f47242e0;

    public ka0(sa0 sa0Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var, boolean z9, boolean z10) {
        super(context, i7, j3, false, h6Var, false, z9, z10);
        this.f47242e0 = sa0Var;
        this.f47241d0 = true;
    }

    @Override
    public final void J() {
        this.f47242e0.B0(null);
    }

    @Override
    public final void N(ArrayList arrayList) {
        int i7;
        sa0 sa0Var = this.f47242e0;
        org.telegram.messenger.ij ijVar = sa0Var.D0;
        if (ijVar != null && ijVar.C3()) {
            int i10 = 0;
            if (arrayList != null) {
                i7 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    oa0 oa0Var = (oa0) arrayList.get(i11);
                    if (oa0Var != null && !org.telegram.messenger.t10.B(oa0Var.f48480c)) {
                        i7++;
                    }
                }
            } else {
                i7 = 0;
            }
            if (this.f47241d0 && i7 == 1) {
                sa0Var.f49787p0 = ((oa0) arrayList.get(0)).f48478a;
            }
            this.f47241d0 = false;
            org.telegram.ui.ActionBar.g5 g5Var = sa0Var.V;
            if (i7 != 1) {
                i10 = 8;
            }
            g5Var.setVisibility(i10);
        }
        super.N(arrayList);
    }
}
