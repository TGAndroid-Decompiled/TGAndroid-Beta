package org.telegram.ui.Components;

import android.content.Context;
public final class v90 extends org.telegram.ui.Cells.q1 {
    public final org.telegram.ui.y7 f39055kd;

    public v90(org.telegram.ui.y7 y7Var, Context context, int i3, k4.j jVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i3, false, jVar, e6Var);
        this.f39055kd = y7Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        ((x90) this.f39055kd.d).f40293f.invalidate();
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        x90.b((x90) this.f39055kd.d, this);
    }

    @Override
    public final void u3(org.telegram.messenger.zi ziVar, org.telegram.messenger.ui uiVar, boolean z10, boolean z11, boolean z12, boolean z13) {
        super.u3(ziVar, uiVar, z10, z11, z12, z13);
        x90.b((x90) this.f39055kd.d, this);
    }

    @Override
    public final void invalidate(int i3, int i10, int i11, int i12) {
        super.invalidate(i3, i10, i11, i12);
        ((x90) this.f39055kd.d).f40293f.invalidate();
    }
}
