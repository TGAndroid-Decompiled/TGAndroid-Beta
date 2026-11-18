package org.telegram.ui.Components;

import android.content.Context;
public final class ma0 extends org.telegram.ui.Cells.q1 {
    public final org.telegram.ui.y7 f37427zd;

    public ma0(org.telegram.ui.y7 y7Var, Context context, int i7, h6.m mVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i7, false, mVar, i6Var);
        this.f37427zd = y7Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        ((oa0) this.f37427zd.d).f38047f.invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        oa0.b((oa0) this.f37427zd.d, this);
    }

    @Override
    public final void y3(org.telegram.messenger.fj fjVar, org.telegram.messenger.aj ajVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        super.y3(fjVar, ajVar, z10, z11, z12, z13);
        oa0.b((oa0) this.f37427zd.d, this);
    }

    @Override
    public final void invalidate(int i7, int i10, int i11, int i12) {
        super.invalidate(i7, i10, i11, i12);
        ((oa0) this.f37427zd.d).f38047f.invalidate();
    }
}
