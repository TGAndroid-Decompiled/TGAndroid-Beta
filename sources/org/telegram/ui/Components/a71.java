package org.telegram.ui.Components;

import android.content.Context;
public final class a71 extends j71 {
    public final k71 f33380u0;

    public a71(k71 k71Var, Context context, boolean z10, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i7, context, i6Var, z10);
        this.f33380u0 = k71Var;
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
        this.f33380u0.w(i11, z10);
    }
}
