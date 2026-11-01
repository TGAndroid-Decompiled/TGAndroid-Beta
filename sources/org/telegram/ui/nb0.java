package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class nb0 extends zf.h0 {
    public boolean m0;
    public final xb0 f39795n0;

    public nb0(xb0 xb0Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, boolean z11) {
        super(context, i10, j10, false, p6Var, false, z10, z11);
        this.f39795n0 = xb0Var;
        this.m0 = true;
    }

    @Override
    public final void K() {
        this.f39795n0.D0(null);
    }

    @Override
    public final void O(ArrayList arrayList) {
        int i10;
        xb0 xb0Var = this.f39795n0;
        org.telegram.messenger.kj kjVar = xb0Var.J0;
        if (kjVar != null && kjVar.C3()) {
            int i11 = 0;
            if (arrayList != null) {
                i10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    rb0 rb0Var = (rb0) arrayList.get(i12);
                    if (rb0Var != null && !org.telegram.messenger.i20.B(rb0Var.f41031c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.m0 && i10 == 1) {
                xb0Var.f43322r0 = ((rb0) arrayList.get(0)).f41029a;
            }
            this.m0 = false;
            org.telegram.ui.ActionBar.p5 p5Var = xb0Var.X;
            if (i10 != 1) {
                i11 = 8;
            }
            p5Var.setVisibility(i11);
        }
        super.O(arrayList);
    }
}
