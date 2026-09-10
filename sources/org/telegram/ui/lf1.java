package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class lf1 extends s4.s0 {
    public final int f34707a;
    public final ig1 f34708b;

    public lf1(ig1 ig1Var, int i10) {
        this.f34707a = i10;
        this.f34708b = ig1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        boolean z10;
        ig1 ig1Var;
        zg.e eVar;
        switch (this.f34707a) {
            case 0:
                ig1 ig1Var2 = this.f34708b;
                int L0 = ig1Var2.F.L0();
                if (L0 != -1) {
                    s4.c1 K = recyclerView.K(L0);
                    boolean z11 = false;
                    if (K != null) {
                        i12 = K.f41610a.getTop();
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
                    ig1Var2.G0((z10 || !ig1Var2.K) ? true : true, true);
                    return;
                }
                return;
            case 1:
                this.f34708b.y0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (eVar = (ig1Var = this.f34708b).f33696f1) != null) {
                    eVar.f(i10, i11);
                    ig1Var.x0();
                    return;
                }
                return;
        }
    }
}
