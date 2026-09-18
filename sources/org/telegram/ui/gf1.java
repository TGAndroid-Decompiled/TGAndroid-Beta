package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class gf1 extends s4.s0 {
    public final int f33831a;
    public final dg1 f33832b;

    public gf1(dg1 dg1Var, int i10) {
        this.f33831a = i10;
        this.f33832b = dg1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        boolean z10;
        dg1 dg1Var;
        ah.i iVar;
        switch (this.f33831a) {
            case 0:
                dg1 dg1Var2 = this.f33832b;
                int L0 = dg1Var2.F.L0();
                if (L0 != -1) {
                    s4.c1 L = recyclerView.L(L0);
                    boolean z11 = false;
                    if (L != null) {
                        i12 = L.f42929a.getTop();
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
                this.f33832b.y0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (iVar = (dg1Var = this.f33832b).f32985f1) != null) {
                    iVar.f(i10, i11);
                    dg1Var.x0();
                    return;
                }
                return;
        }
    }
}
