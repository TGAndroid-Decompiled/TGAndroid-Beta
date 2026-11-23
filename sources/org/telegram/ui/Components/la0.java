package org.telegram.ui.Components;

import android.content.Context;
public final class la0 extends org.telegram.ui.Cells.r1 {
    public final org.telegram.ui.z7 f37100zd;

    public la0(org.telegram.ui.z7 z7Var, Context context, int i7, h6.m mVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i7, false, mVar, i6Var);
        this.f37100zd = z7Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        ((na0) this.f37100zd.d).f37744f.invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        super.onLayout(z10, i7, i10, i11, i12);
        na0.b((na0) this.f37100zd.d, this);
    }

    @Override
    public final void y3(org.telegram.messenger.fj fjVar, org.telegram.messenger.aj ajVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        super.y3(fjVar, ajVar, z10, z11, z12, z13);
        na0.b((na0) this.f37100zd.d, this);
    }

    @Override
    public final void invalidate(int i7, int i10, int i11, int i12) {
        super.invalidate(i7, i10, i11, i12);
        ((na0) this.f37100zd.d).f37744f.invalidate();
    }
}
