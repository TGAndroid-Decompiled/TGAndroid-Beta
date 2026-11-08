package org.telegram.ui.Components;

import android.content.Context;
public final class aa0 extends org.telegram.ui.Cells.q1 {
    public final org.telegram.ui.x7 f31762ld;

    public aa0(org.telegram.ui.x7 x7Var, Context context, int i7, h6.m mVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i7, false, mVar, f6Var);
        this.f31762ld = x7Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        ((ca0) this.f31762ld.d).f32527f.invalidate();
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        ca0.b((ca0) this.f31762ld.d, this);
    }

    @Override
    public final void w3(org.telegram.messenger.ij ijVar, org.telegram.messenger.dj djVar, boolean z9, boolean z10, boolean z11, boolean z12) {
        super.w3(ijVar, djVar, z9, z10, z11, z12);
        ca0.b((ca0) this.f31762ld.d, this);
    }

    @Override
    public final void invalidate(int i7, int i10, int i11, int i12) {
        super.invalidate(i7, i10, i11, i12);
        ((ca0) this.f31762ld.d).f32527f.invalidate();
    }
}
