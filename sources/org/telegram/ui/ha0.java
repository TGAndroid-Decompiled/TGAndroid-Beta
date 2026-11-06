package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class ha0 extends jg.r0 {
    public boolean f46311d0;
    public final pa0 f46312e0;

    public ha0(pa0 pa0Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.f6 f6Var, boolean z9, boolean z10) {
        super(context, i7, j3, false, f6Var, false, z9, z10);
        this.f46312e0 = pa0Var;
        this.f46311d0 = true;
    }

    @Override
    public final void J() {
        this.f46312e0.B0(null);
    }

    @Override
    public final void N(ArrayList arrayList) {
        int i7;
        pa0 pa0Var = this.f46312e0;
        org.telegram.messenger.ij ijVar = pa0Var.D0;
        if (ijVar != null && ijVar.D3()) {
            int i10 = 0;
            if (arrayList != null) {
                i7 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    la0 la0Var = (la0) arrayList.get(i11);
                    if (la0Var != null && !org.telegram.messenger.t10.B(la0Var.f47495c)) {
                        i7++;
                    }
                }
            } else {
                i7 = 0;
            }
            if (this.f46311d0 && i7 == 1) {
                pa0Var.f48749p0 = ((la0) arrayList.get(0)).f47493a;
            }
            this.f46311d0 = false;
            org.telegram.ui.ActionBar.f5 f5Var = pa0Var.V;
            if (i7 != 1) {
                i10 = 8;
            }
            f5Var.setVisibility(i10);
        }
        super.N(arrayList);
    }
}
