package org.telegram.ui.Components;

import android.content.Context;
public final class sa0 extends org.telegram.ui.Cells.q1 {
    public final org.telegram.ui.x7 f30253hd;

    public sa0(org.telegram.ui.x7 x7Var, Context context, int i10, li.k kVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, i10, false, kVar, p6Var);
        this.f30253hd = x7Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        ((ua0) this.f30253hd.d).f30916f.invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ua0.b((ua0) this.f30253hd.d, this);
    }

    @Override
    public final void s3(org.telegram.messenger.kj kjVar, org.telegram.messenger.fj fjVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        super.s3(kjVar, fjVar, z10, z11, z12, z13);
        ua0.b((ua0) this.f30253hd.d, this);
    }

    @Override
    public final void invalidate(int i10, int i11, int i12, int i13) {
        super.invalidate(i10, i11, i12, i13);
        ((ua0) this.f30253hd.d).f30916f.invalidate();
    }
}
