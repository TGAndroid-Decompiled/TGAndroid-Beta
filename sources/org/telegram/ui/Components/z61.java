package org.telegram.ui.Components;

import android.content.Context;
public final class z61 extends i71 {
    public final j71 f42691u0;

    public z61(j71 j71Var, Context context, boolean z10, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        super(i7, context, h6Var, z10);
        this.f42691u0 = j71Var;
    }

    @Override
    public final void f(float f10, int i7, int i10) {
        int i11;
        boolean z10;
        super.f(f10, i7, i10);
        if (f10 <= 0.5f) {
            i11 = i7;
        } else {
            i11 = i10;
        }
        if (i7 < i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f42691u0.v(i11, z10);
    }
}
