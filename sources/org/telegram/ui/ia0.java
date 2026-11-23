package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class ia0 extends jg.r0 {
    public boolean f48710e0;
    public final qa0 f48711f0;

    public ia0(qa0 qa0Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.h6 h6Var, boolean z10, boolean z11) {
        super(context, i7, j3, false, h6Var, false, z10, z11);
        this.f48711f0 = qa0Var;
        this.f48710e0 = true;
    }

    @Override
    public final void J() {
        this.f48711f0.B0(null);
    }

    @Override
    public final void N(ArrayList arrayList) {
        int i7;
        qa0 qa0Var = this.f48711f0;
        org.telegram.messenger.gj gjVar = qa0Var.J0;
        if (gjVar != null && gjVar.C3()) {
            int i10 = 0;
            if (arrayList != null) {
                i7 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    ma0 ma0Var = (ma0) arrayList.get(i11);
                    if (ma0Var != null && !org.telegram.messenger.p10.C(ma0Var.f49831c)) {
                        i7++;
                    }
                }
            } else {
                i7 = 0;
            }
            if (this.f48710e0 && i7 == 1) {
                qa0Var.f51177q0 = ((ma0) arrayList.get(0)).f49829a;
            }
            this.f48710e0 = false;
            org.telegram.ui.ActionBar.g5 g5Var = qa0Var.W;
            if (i7 != 1) {
                i10 = 8;
            }
            g5Var.setVisibility(i10);
        }
        super.N(arrayList);
    }
}
