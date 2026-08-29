package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class ae1 extends f2.a1 {
    public final int f36531a;
    public final ze1 f36532b;

    public ae1(ze1 ze1Var, int i10) {
        this.f36531a = i10;
        this.f36532b = ze1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        boolean z10;
        ze1 ze1Var;
        lg.e eVar;
        switch (this.f36531a) {
            case 0:
                ze1 ze1Var2 = this.f36532b;
                int L0 = ze1Var2.B.L0();
                if (L0 != -1) {
                    f2.n1 K = recyclerView.K(L0);
                    boolean z11 = false;
                    if (K != null) {
                        i12 = K.f6432a.getTop();
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
                    ze1Var2.G0((z10 || !ze1Var2.G) ? true : true, true);
                    return;
                }
                return;
            case 1:
                this.f36532b.y0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (eVar = (ze1Var = this.f36532b).f45160b1) != null) {
                    eVar.f(i10, i11);
                    ze1Var.x0();
                    return;
                }
                return;
        }
    }
}
