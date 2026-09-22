package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class hf1 extends s4.s0 {
    public final int f34253a;
    public final eg1 f34254b;

    public hf1(eg1 eg1Var, int i10) {
        this.f34253a = i10;
        this.f34254b = eg1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        boolean z10;
        eg1 eg1Var;
        ah.h hVar;
        switch (this.f34253a) {
            case 0:
                eg1 eg1Var2 = this.f34254b;
                int L0 = eg1Var2.F.L0();
                if (L0 != -1) {
                    s4.c1 K = recyclerView.K(L0);
                    boolean z11 = false;
                    if (K != null) {
                        i12 = K.f42671a.getTop();
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
                    eg1Var2.G0((z10 || !eg1Var2.K) ? true : true, true);
                    return;
                }
                return;
            case 1:
                this.f34254b.y0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (hVar = (eg1Var = this.f34254b).f33306f1) != null) {
                    hVar.f(i10, i11);
                    eg1Var.x0();
                    return;
                }
                return;
        }
    }
}
