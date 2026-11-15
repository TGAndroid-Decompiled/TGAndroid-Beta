package org.telegram.ui;

import android.content.Context;
public final class ng0 extends ah.o {
    public final int L;
    public boolean M;
    public final org.telegram.ui.Components.ja N;

    public ng0(org.telegram.ui.Components.ja jaVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        super(context, e6Var);
        this.L = i7;
        this.N = jaVar;
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.L) {
            case 0:
                super.onLayout(z10, i7, i10, i11, i12);
                qg0 qg0Var = (qg0) this.N;
                qg0Var.f50604h2 = org.telegram.messenger.g0.L(64.0f) + getMeasuredHeight();
                qg0Var.f50603g2.G();
                boolean z11 = this.M;
                boolean z12 = qg0Var.d;
                if (z11 != z12) {
                    this.M = z12;
                    if (z12) {
                        org.telegram.ui.Components.uj0 uj0Var = qg0Var.f35931o1;
                        pi.l lVar = new pi.l(qg0Var.getContext(), 2, 0.6f);
                        lVar.f58480a = 1;
                        lVar.f55123p = org.telegram.messenger.g0.L(36.0f);
                        uj0Var.getLayoutManager().w0(lVar);
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                wg.c1 c1Var = (wg.c1) this.N;
                c1Var.f59155m2 = org.telegram.messenger.g0.L(64.0f) + getMeasuredHeight();
                c1Var.f59154l2.G();
                boolean z13 = this.M;
                boolean z14 = c1Var.d;
                if (z13 != z14) {
                    this.M = z14;
                    if (z14) {
                        org.telegram.ui.Components.uj0 uj0Var2 = c1Var.f35931o1;
                        pi.l lVar2 = new pi.l(c1Var.getContext(), 2, 0.6f);
                        lVar2.f58480a = 1;
                        lVar2.f55123p = org.telegram.messenger.g0.L(36.0f);
                        uj0Var2.getLayoutManager().w0(lVar2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
