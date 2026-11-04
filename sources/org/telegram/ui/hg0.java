package org.telegram.ui;

import android.content.Context;
public final class hg0 extends bh.m {
    public final int L;
    public boolean M;
    public final org.telegram.ui.Components.ma N;

    public hg0(org.telegram.ui.Components.ma maVar, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(context, e6Var);
        this.L = i3;
        this.N = maVar;
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.L) {
            case 0:
                super.onLayout(z10, i3, i10, i11, i12);
                kg0 kg0Var = (kg0) this.N;
                kg0Var.f46927e2 = org.telegram.messenger.g0.L(64.0f) + getMeasuredHeight();
                kg0Var.f46926d2.G();
                boolean z11 = this.M;
                boolean z12 = kg0Var.d;
                if (z11 != z12) {
                    this.M = z12;
                    if (z12) {
                        org.telegram.ui.Components.tj0 tj0Var = kg0Var.f36102l1;
                        ni.m mVar = new ni.m(kg0Var.getContext(), 2, 0.6f);
                        mVar.f55704a = 1;
                        mVar.f20461p = org.telegram.messenger.g0.L(36.0f);
                        tj0Var.getLayoutManager().w0(mVar);
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                xg.e1 e1Var = (xg.e1) this.N;
                e1Var.f58681j2 = org.telegram.messenger.g0.L(64.0f) + getMeasuredHeight();
                e1Var.f58680i2.G();
                boolean z13 = this.M;
                boolean z14 = e1Var.d;
                if (z13 != z14) {
                    this.M = z14;
                    if (z14) {
                        org.telegram.ui.Components.tj0 tj0Var2 = e1Var.f36102l1;
                        ni.m mVar2 = new ni.m(e1Var.getContext(), 2, 0.6f);
                        mVar2.f55704a = 1;
                        mVar2.f20461p = org.telegram.messenger.g0.L(36.0f);
                        tj0Var2.getLayoutManager().w0(mVar2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
