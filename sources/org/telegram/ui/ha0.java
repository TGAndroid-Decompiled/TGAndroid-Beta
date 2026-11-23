package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class ha0 extends jg.r0 {
    public boolean f48516e0;
    public final pa0 f48517f0;

    public ha0(pa0 pa0Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.i6 i6Var, boolean z10, boolean z11) {
        super(context, i7, j3, false, i6Var, false, z10, z11);
        this.f48517f0 = pa0Var;
        this.f48516e0 = true;
    }

    @Override
    public final void J() {
        this.f48517f0.B0(null);
    }

    @Override
    public final void N(ArrayList arrayList) {
        int i7;
        pa0 pa0Var = this.f48517f0;
        org.telegram.messenger.fj fjVar = pa0Var.J0;
        if (fjVar != null && fjVar.C3()) {
            int i10 = 0;
            if (arrayList != null) {
                i7 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    la0 la0Var = (la0) arrayList.get(i11);
                    if (la0Var != null && !org.telegram.messenger.n10.C(la0Var.f49673c)) {
                        i7++;
                    }
                }
            } else {
                i7 = 0;
            }
            if (this.f48516e0 && i7 == 1) {
                pa0Var.f50939q0 = ((la0) arrayList.get(0)).f49671a;
            }
            this.f48516e0 = false;
            org.telegram.ui.ActionBar.g5 g5Var = pa0Var.W;
            if (i7 != 1) {
                i10 = 8;
            }
            g5Var.setVisibility(i10);
        }
        super.N(arrayList);
    }
}
