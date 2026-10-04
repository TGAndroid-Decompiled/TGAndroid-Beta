package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class bf1 extends s4.s0 {
    public final int f35083a;
    public final yf1 f35084b;

    public bf1(yf1 yf1Var, int i10) {
        this.f35083a = i10;
        this.f35084b = yf1Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        boolean z10;
        yf1 yf1Var;
        ah.i iVar;
        switch (this.f35083a) {
            case 0:
                yf1 yf1Var2 = this.f35084b;
                int L0 = yf1Var2.F.L0();
                if (L0 != -1) {
                    s4.c1 K = recyclerView.K(L0);
                    boolean z11 = false;
                    if (K != null) {
                        i12 = K.f46531a.getTop();
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
                    yf1Var2.G0((z10 || !yf1Var2.K) ? true : true, true);
                    return;
                }
                return;
            case 1:
                this.f35084b.y0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (iVar = (yf1Var = this.f35084b).f43186f1) != null) {
                    iVar.f(i10, i11);
                    yf1Var.x0();
                    return;
                }
                return;
        }
    }
}
