package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class ae1 extends s4.r0 {
    public final int f35662a;
    public final ye1 f35663b;

    public ae1(ye1 ye1Var, int i10) {
        this.f35662a = i10;
        this.f35663b = ye1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        boolean z10;
        ye1 ye1Var;
        bh.f fVar;
        switch (this.f35662a) {
            case 0:
                ye1 ye1Var2 = this.f35663b;
                int L0 = ye1Var2.F.L0();
                if (L0 != -1) {
                    s4.b1 K = recyclerView.K(L0);
                    boolean z11 = false;
                    if (K != null) {
                        i12 = K.f46343a.getTop();
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
                    if (z10 || !ye1Var2.K) {
                        z11 = true;
                    }
                    ye1Var2.F0(z11, true);
                    return;
                }
                return;
            case 1:
                this.f35663b.x0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (fVar = (ye1Var = this.f35663b).f43809g1) != null) {
                    fVar.f(i10, i11);
                    ye1Var.w0();
                    return;
                }
                return;
        }
    }
}
