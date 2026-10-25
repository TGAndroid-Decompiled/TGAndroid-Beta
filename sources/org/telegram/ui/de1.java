package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class de1 extends s4.u0 {
    public final int f38847a;
    public final af1 f38848b;

    public de1(af1 af1Var, int i10) {
        this.f38847a = i10;
        this.f38848b = af1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        boolean z10;
        af1 af1Var;
        ch.f fVar;
        switch (this.f38847a) {
            case 0:
                af1 af1Var2 = this.f38848b;
                int L0 = af1Var2.F.L0();
                if (L0 != -1) {
                    s4.e1 K = recyclerView.K(L0);
                    boolean z11 = false;
                    if (K != null) {
                        i12 = K.f47735a.getTop();
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
                    if (z10 || !af1Var2.K) {
                        z11 = true;
                    }
                    af1Var2.G0(z11, true);
                    return;
                }
                return;
            case 1:
                this.f38848b.y0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (fVar = (af1Var = this.f38848b).f37748g1) != null) {
                    fVar.f(i10, i11);
                    af1Var.x0();
                    return;
                }
                return;
        }
    }
}
