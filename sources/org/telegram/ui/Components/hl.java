package org.telegram.ui.Components;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
public final class hl extends v4.u0 {
    public final int f35922a;
    public final kl f35923b;

    public hl(kl klVar, int i7) {
        this.f35922a = i7;
        this.f35923b = klVar;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i7) {
        boolean z10;
        kj0 kj0Var;
        switch (this.f35922a) {
            case 0:
                kl klVar = this.f35923b;
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
                    si siVar = klVar.f36766b;
                    int i10 = siVar.f30224t0;
                    if (((siVar.Z3[0] - i10) - L) + i10 < org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() && (kj0Var = (kj0) b1Var.K(0)) != null) {
                        View view = kj0Var.f59123a;
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
                    kl klVar2 = this.f35923b;
                    if (klVar2.f36796d0 && klVar2.f36797e0) {
                        org.telegram.messenger.g0.v1(klVar2.f36766b.getCurrentFocus());
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void b(RecyclerView recyclerView, int i7, int i10) {
        switch (this.f35922a) {
            case 0:
                kl klVar = this.f35923b;
                klVar.i0();
                if (klVar.G != null) {
                    klVar.H += i10;
                }
                klVar.f36766b.N1(klVar, i10);
                return;
            default:
                return;
        }
    }
}
