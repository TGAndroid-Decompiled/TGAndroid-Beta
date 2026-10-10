package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class if1 extends s4.t0 {
    public final int f38672a;
    public final fg1 f38673b;

    public if1(fg1 fg1Var, int i10) {
        this.f38672a = i10;
        this.f38673b = fg1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        boolean z10;
        fg1 fg1Var;
        ah.h hVar;
        switch (this.f38672a) {
            case 0:
                fg1 fg1Var2 = this.f38673b;
                int L0 = fg1Var2.F.L0();
                if (L0 != -1) {
                    s4.d1 K = recyclerView.K(L0);
                    boolean z11 = false;
                    if (K != null) {
                        i12 = K.f47702a.getTop();
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
                    if (z10 || !fg1Var2.K) {
                        z11 = true;
                    }
                    fg1Var2.G0(z11, true);
                    return;
                }
                return;
            case 1:
                this.f38673b.y0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (hVar = (fg1Var = this.f38673b).f37618f1) != null) {
                    hVar.f(i10, i11);
                    fg1Var.x0();
                    return;
                }
                return;
        }
    }
}
