package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class gf1 extends s4.s0 {
    public final int f33894a;
    public final dg1 f33895b;

    public gf1(dg1 dg1Var, int i10) {
        this.f33894a = i10;
        this.f33895b = dg1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        boolean z10;
        dg1 dg1Var;
        ah.h hVar;
        switch (this.f33894a) {
            case 0:
                dg1 dg1Var2 = this.f33895b;
                int L0 = dg1Var2.F.L0();
                if (L0 != -1) {
                    s4.c1 K = recyclerView.K(L0);
                    boolean z11 = false;
                    if (K != null) {
                        i12 = K.f42675a.getTop();
                    } else {
                        i12 = 0;
                    }
                    if (L0 == 0) {
                        int i13 = 0 - i12;
                        if (i12 < 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Math.abs(i13);
                    } else if (L0 > 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    dg1Var2.G0((z10 || !dg1Var2.K) ? true : true, true);
                    return;
                }
                return;
            case 1:
                this.f33895b.y0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (hVar = (dg1Var = this.f33895b).f33027f1) != null) {
                    hVar.f(i10, i11);
                    dg1Var.x0();
                    return;
                }
                return;
        }
    }
}
