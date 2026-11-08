package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class b91 extends v4.s0 {
    public final int f44231a;
    public final w91 f44232b;

    public b91(w91 w91Var, int i7) {
        this.f44231a = i7;
        this.f44232b = w91Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int i11;
        boolean z9;
        w91 w91Var;
        dh.g gVar;
        switch (this.f44231a) {
            case 0:
                w91 w91Var2 = this.f44232b;
                int L0 = w91Var2.F.L0();
                if (L0 != -1) {
                    v4.d1 K = recyclerView.K(L0);
                    boolean z10 = false;
                    if (K != null) {
                        i11 = K.f57044a.getTop();
                    } else {
                        i11 = 0;
                    }
                    if (L0 == 0) {
                        int i12 = 0 - i11;
                        if (i11 < 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        Math.abs(i12);
                    } else if (L0 > 0) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (z9 || !w91Var2.K) {
                        z10 = true;
                    }
                    w91Var2.K0(z10, true);
                    return;
                }
                return;
            case 1:
                this.f44232b.C0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (gVar = (w91Var = this.f44232b).f51010g1) != null) {
                    gVar.f(i7, i10);
                    w91Var.B0();
                    return;
                }
                return;
        }
    }
}
