package org.telegram.ui;

import android.content.Context;
public final class qg0 extends ah.o {
    public final int L;
    public boolean M;
    public final org.telegram.ui.Components.ra N;

    public qg0(org.telegram.ui.Components.ra raVar, Context context, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        super(context, i6Var);
        this.L = i7;
        this.N = raVar;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.L) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                tg0 tg0Var = (tg0) this.N;
                tg0Var.f52397h2 = org.telegram.messenger.g0.L(64.0f) + getMeasuredHeight();
                tg0Var.f52396g2.G();
                boolean z11 = this.M;
                boolean z12 = tg0Var.d;
                if (z11 != z12) {
                    this.M = z12;
                    if (z12) {
                        org.telegram.ui.Components.ek0 ek0Var = tg0Var.f39246o1;
                        pi.l lVar = new pi.l(tg0Var.getContext(), 2, 0.6f);
                        lVar.f59190a = 1;
                        lVar.f55822p = org.telegram.messenger.g0.L(36.0f);
                        ek0Var.getLayoutManager().w0(lVar);
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                wg.d1 d1Var = (wg.d1) this.N;
                d1Var.f59858l2 = org.telegram.messenger.g0.L(64.0f) + getMeasuredHeight();
                d1Var.f59857k2.G();
                boolean z13 = this.M;
                boolean z14 = d1Var.d;
                if (z13 != z14) {
                    this.M = z14;
                    if (z14) {
                        org.telegram.ui.Components.ek0 ek0Var2 = d1Var.f39246o1;
                        pi.l lVar2 = new pi.l(d1Var.getContext(), 2, 0.6f);
                        lVar2.f59190a = 1;
                        lVar2.f55822p = org.telegram.messenger.g0.L(36.0f);
                        ek0Var2.getLayoutManager().w0(lVar2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
