package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class nf1 extends s4.r0 {
    public final int f38386a;
    public final kg1 f38387b;

    public nf1(kg1 kg1Var, int i10) {
        this.f38386a = i10;
        this.f38387b = kg1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        boolean z10;
        kg1 kg1Var;
        bh.f fVar;
        switch (this.f38386a) {
            case 0:
                kg1 kg1Var2 = this.f38387b;
                int L0 = kg1Var2.F.L0();
                if (L0 != -1) {
                    s4.b1 K = recyclerView.K(L0);
                    boolean z11 = false;
                    if (K != null) {
                        i12 = K.f44838a.getTop();
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
                    if (z10 || !kg1Var2.K) {
                        z11 = true;
                    }
                    kg1Var2.G0(z11, true);
                    return;
                }
                return;
            case 1:
                this.f38387b.y0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (fVar = (kg1Var = this.f38387b).f37395f1) != null) {
                    fVar.f(i10, i11);
                    kg1Var.x0();
                    return;
                }
                return;
        }
    }
}
