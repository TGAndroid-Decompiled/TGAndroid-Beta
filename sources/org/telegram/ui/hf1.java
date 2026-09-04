package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class hf1 extends s4.s0 {
    public final int f36991a;
    public final eg1 f36992b;

    public hf1(eg1 eg1Var, int i10) {
        this.f36991a = i10;
        this.f36992b = eg1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        boolean z10;
        eg1 eg1Var;
        bh.f fVar;
        switch (this.f36991a) {
            case 0:
                eg1 eg1Var2 = this.f36992b;
                int L0 = eg1Var2.F.L0();
                if (L0 != -1) {
                    s4.c1 K = recyclerView.K(L0);
                    boolean z11 = false;
                    if (K != null) {
                        i12 = K.f45738a.getTop();
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
                this.f36992b.y0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (fVar = (eg1Var = this.f36992b).f36041f1) != null) {
                    fVar.f(i10, i11);
                    eg1Var.x0();
                    return;
                }
                return;
        }
    }
}
