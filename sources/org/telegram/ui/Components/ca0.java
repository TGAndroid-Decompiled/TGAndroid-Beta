package org.telegram.ui.Components;

import android.content.Context;
public final class ca0 extends org.telegram.ui.Cells.q1 {
    public final org.telegram.ui.y7 f33533zd;

    public ca0(org.telegram.ui.y7 y7Var, Context context, int i7, h6.m mVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i7, false, mVar, e6Var);
        this.f33533zd = y7Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        ((ea0) this.f33533zd.d).f34262f.invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        ea0.b((ea0) this.f33533zd.d, this);
    }

    @Override
    public final void x3(org.telegram.messenger.gj gjVar, org.telegram.messenger.bj bjVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        super.x3(gjVar, bjVar, z10, z11, z12, z13);
        ea0.b((ea0) this.f33533zd.d, this);
    }

    @Override
    public final void invalidate(int i7, int i10, int i11, int i12) {
        super.invalidate(i7, i10, i11, i12);
        ((ea0) this.f33533zd.d).f34262f.invalidate();
    }
}
