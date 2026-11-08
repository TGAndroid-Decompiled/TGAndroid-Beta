package org.telegram.ui;

import android.content.Context;
public final class ng0 extends ah.o {
    public final int K;
    public boolean L;
    public final org.telegram.ui.Components.na M;

    public ng0(org.telegram.ui.Components.na naVar, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        super(context, f6Var);
        this.K = i7;
        this.M = naVar;
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.K) {
            case 0:
                super.onLayout(z9, i7, i10, i11, i12);
                qg0 qg0Var = (qg0) this.M;
                qg0Var.d2 = org.telegram.messenger.g0.L(64.0f) + getMeasuredHeight();
                qg0Var.f49226c2.G();
                boolean z10 = this.L;
                boolean z11 = qg0Var.d;
                if (z10 != z11) {
                    this.L = z11;
                    if (z11) {
                        org.telegram.ui.Components.pj0 pj0Var = qg0Var.f36277k1;
                        mi.m mVar = new mi.m(qg0Var.getContext(), 2, 0.6f);
                        mVar.f57212a = 1;
                        mVar.f20111p = org.telegram.messenger.g0.L(36.0f);
                        pj0Var.getLayoutManager().w0(mVar);
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                wg.f1 f1Var = (wg.f1) this.M;
                f1Var.f57734i2 = org.telegram.messenger.g0.L(64.0f) + getMeasuredHeight();
                f1Var.f57733h2.G();
                boolean z12 = this.L;
                boolean z13 = f1Var.d;
                if (z12 != z13) {
                    this.L = z13;
                    if (z13) {
                        org.telegram.ui.Components.pj0 pj0Var2 = f1Var.f36277k1;
                        mi.m mVar2 = new mi.m(f1Var.getContext(), 2, 0.6f);
                        mVar2.f57212a = 1;
                        mVar2.f20111p = org.telegram.messenger.g0.L(36.0f);
                        pj0Var2.getLayoutManager().w0(mVar2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
