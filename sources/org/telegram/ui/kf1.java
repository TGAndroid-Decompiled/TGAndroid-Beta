package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class kf1 extends s4.t0 {
    public final int f39478a;
    public final hg1 f39479b;

    public kf1(hg1 hg1Var, int i10) {
        this.f39478a = i10;
        this.f39479b = hg1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        boolean z10;
        hg1 hg1Var;
        ah.h hVar;
        switch (this.f39478a) {
            case 0:
                hg1 hg1Var2 = this.f39479b;
                int L0 = hg1Var2.F.L0();
                if (L0 != -1) {
                    s4.d1 K = recyclerView.K(L0);
                    boolean z11 = false;
                    if (K != null) {
                        i12 = K.f47897a.getTop();
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
                    if (z10 || !hg1Var2.K) {
                        z11 = true;
                    }
                    hg1Var2.G0(z11, true);
                    return;
                }
                return;
            case 1:
                this.f39479b.y0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (hVar = (hg1Var = this.f39479b).f38392f1) != null) {
                    hVar.f(i10, i11);
                    hg1Var.x0();
                    return;
                }
                return;
        }
    }
}
