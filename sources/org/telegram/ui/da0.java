package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class da0 extends kg.o0 {
    public boolean f44610e0;
    public final la0 f44611f0;

    public da0(la0 la0Var, Context context, int i3, long j10, org.telegram.ui.ActionBar.e6 e6Var, boolean z10, boolean z11) {
        super(context, i3, j10, false, e6Var, false, z10, z11);
        this.f44611f0 = la0Var;
        this.f44610e0 = true;
    }

    @Override
    public final void J() {
        this.f44611f0.B0(null);
    }

    @Override
    public final void N(ArrayList arrayList) {
        int i3;
        la0 la0Var = this.f44611f0;
        org.telegram.messenger.zi ziVar = la0Var.E0;
        if (ziVar != null && ziVar.D3()) {
            int i10 = 0;
            if (arrayList != null) {
                i3 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ha0 ha0Var = (ha0) arrayList.get(i11);
                    if (ha0Var != null && !org.telegram.messenger.l10.B(ha0Var.f45882c)) {
                        i3++;
                    }
                }
            } else {
                i3 = 0;
            }
            if (this.f44610e0 && i3 == 1) {
                la0Var.f47260q0 = ((ha0) arrayList.get(0)).f45880a;
            }
            this.f44610e0 = false;
            org.telegram.ui.ActionBar.f5 f5Var = la0Var.W;
            if (i3 != 1) {
                i10 = 8;
            }
            f5Var.setVisibility(i10);
        }
        super.N(arrayList);
    }
}
