package org.telegram.ui;

import android.os.Build;
import androidx.recyclerview.widget.RecyclerView;
public final class a91 extends v4.s0 {
    public final int f43604a;
    public final v91 f43605b;

    public a91(v91 v91Var, int i7) {
        this.f43604a = i7;
        this.f43605b = v91Var;
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        int i11;
        boolean z9;
        v91 v91Var;
        dh.g gVar;
        switch (this.f43604a) {
            case 0:
                v91 v91Var2 = this.f43605b;
                int L0 = v91Var2.F.L0();
                if (L0 != -1) {
                    v4.d1 K = recyclerView.K(L0);
                    boolean z10 = false;
                    if (K != null) {
                        i11 = K.f56951a.getTop();
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
                    if (z9 || !v91Var2.K) {
                        z10 = true;
                    }
                    v91Var2.K0(z10, true);
                    return;
                }
                return;
            case 1:
                this.f43605b.C0();
                return;
            default:
                if (Build.VERSION.SDK_INT >= 31 && (gVar = (v91Var = this.f43605b).f50646g1) != null) {
                    gVar.f(i7, i10);
                    v91Var.B0();
                    return;
                }
                return;
        }
    }
}
