package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;
public final class ob0 extends zf.h0 {
    public boolean m0;
    public final yb0 f40221n0;

    public ob0(yb0 yb0Var, Context context, int i10, long j10, org.telegram.ui.ActionBar.p6 p6Var, boolean z10, boolean z11) {
        super(context, i10, j10, false, p6Var, false, z10, z11);
        this.f40221n0 = yb0Var;
        this.m0 = true;
    }

    @Override
    public final void K() {
        this.f40221n0.C0(null);
    }

    @Override
    public final void O(ArrayList arrayList) {
        int i10;
        yb0 yb0Var = this.f40221n0;
        org.telegram.messenger.jj jjVar = yb0Var.J0;
        if (jjVar != null && jjVar.C3()) {
            int i11 = 0;
            if (arrayList != null) {
                i10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    sb0 sb0Var = (sb0) arrayList.get(i12);
                    if (sb0Var != null && !org.telegram.messenger.h20.B(sb0Var.f41462c)) {
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            if (this.m0 && i10 == 1) {
                yb0Var.f43802r0 = ((sb0) arrayList.get(0)).f41460a;
            }
            this.m0 = false;
            org.telegram.ui.ActionBar.p5 p5Var = yb0Var.X;
            if (i10 != 1) {
                i11 = 8;
            }
            p5Var.setVisibility(i11);
        }
        super.O(arrayList);
    }
}
