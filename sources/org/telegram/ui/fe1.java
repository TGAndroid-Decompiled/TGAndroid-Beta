package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class fe1 extends s4.u0 {
    public final int f39344a;
    public final cf1 f39345b;

    public fe1(cf1 cf1Var, int i10) {
        this.f39344a = i10;
        this.f39345b = cf1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        boolean z10;
        cf1 cf1Var;
        ch.f fVar;
        switch (this.f39344a) {
            case 0:
                cf1 cf1Var2 = this.f39345b;
                int L0 = cf1Var2.F.L0();
                if (L0 != -1) {
                    s4.e1 K = recyclerView.K(L0);
                    boolean z11 = false;
                    if (K != null) {
                        i12 = K.f47773a.getTop();
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
                    if (z10 || !cf1Var2.K) {
                        z11 = true;
                    }
                    cf1Var2.G0(z11, true);
                    return;
                }
                return;
            case 1:
                this.f39345b.y0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (fVar = (cf1Var = this.f39345b).f38305g1) != null) {
                    fVar.f(i10, i11);
                    cf1Var.x0();
                    return;
                }
                return;
        }
    }
}
