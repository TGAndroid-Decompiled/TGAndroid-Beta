package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class ja0 extends jg.r0 {
    public boolean f46903d0;
    public final ra0 f46904e0;

    public ja0(ra0 ra0Var, Context context, int i7, long j3, org.telegram.ui.ActionBar.g6 g6Var, boolean z9, boolean z10) {
        super(context, i7, j3, false, g6Var, false, z9, z10);
        this.f46904e0 = ra0Var;
        this.f46903d0 = true;
    }

    @Override
    public final void J() {
        this.f46904e0.B0(null);
    }

    @Override
    public final void N(ArrayList arrayList) {
        int i7;
        ra0 ra0Var = this.f46904e0;
        org.telegram.messenger.ij ijVar = ra0Var.D0;
        if (ijVar != null && ijVar.C3()) {
            int i10 = 0;
            if (arrayList != null) {
                i7 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    na0 na0Var = (na0) arrayList.get(i11);
                    if (na0Var != null && !org.telegram.messenger.t10.B(na0Var.f48141c)) {
                        i7++;
                    }
                }
            } else {
                i7 = 0;
            }
            if (this.f46903d0 && i7 == 1) {
                ra0Var.f49378p0 = ((na0) arrayList.get(0)).f48139a;
            }
            this.f46903d0 = false;
            org.telegram.ui.ActionBar.f5 f5Var = ra0Var.V;
            if (i7 != 1) {
                i10 = 8;
            }
            f5Var.setVisibility(i10);
        }
        super.N(arrayList);
    }
}
