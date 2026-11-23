package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class hl extends v4.u0 {
    public final int f35761a;
    public final kl f35762b;

    public hl(kl klVar, int i7) {
        this.f35761a = i7;
        this.f35762b = klVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        boolean z10;
        mj0 mj0Var;
        switch (this.f35761a) {
            case 0:
                kl klVar = this.f35762b;
                di.b1 b1Var = klVar.M;
                if (i7 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                klVar.I = z10;
                if (!z10 && klVar.G != null) {
                    klVar.G = null;
                }
                if (i7 == 0) {
                    int L = org.telegram.messenger.g0.L(13.0f);
                    ti tiVar = klVar.f37135b;
                    int i10 = tiVar.f30260t0;
                    if (((tiVar.Z3[0] - i10) - L) + i10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (mj0Var = (mj0) b1Var.K(0)) != null) {
                        View view = mj0Var.f59245a;
                        if (view.getTop() > 0) {
                            b1Var.w0(0, view.getTop(), null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                if (i7 == 1) {
                    kl klVar2 = this.f35762b;
                    if (klVar2.f36775d0 && klVar2.f36776e0) {
                        org.telegram.messenger.g0.v1(klVar2.f37135b.getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f35761a) {
            case 0:
                kl klVar = this.f35762b;
                klVar.i0();
                if (klVar.G != null) {
                    klVar.H += i10;
                }
                klVar.f37135b.N1(klVar, i10);
                return;
            default:
                return;
        }
    }
}
