package org.telegram.ui.Components;

import android.content.Context;
public final class oa0 extends org.telegram.ui.Cells.r1 {
    public final org.telegram.ui.y7 f38162zd;

    public oa0(org.telegram.ui.y7 y7Var, Context context, int i7, h6.m mVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, i7, false, mVar, h6Var);
        this.f38162zd = y7Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        ((qa0) this.f38162zd.d).f38866f.invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        qa0.b((qa0) this.f38162zd.d, this);
    }

    @Override
    public final void y3(org.telegram.messenger.fj fjVar, org.telegram.messenger.aj ajVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        super.y3(fjVar, ajVar, z10, z11, z12, z13);
        qa0.b((qa0) this.f38162zd.d, this);
    }

    @Override
    public final void invalidate(int i7, int i10, int i11, int i12) {
        super.invalidate(i7, i10, i11, i12);
        ((qa0) this.f38162zd.d).f38866f.invalidate();
    }
}
