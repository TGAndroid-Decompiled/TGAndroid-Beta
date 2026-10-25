package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;
public final class k91 extends t91 {
    public final u91 f29883t0;

    public k91(u91 u91Var, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(i10, context, u6Var, z10);
        this.f29883t0 = u91Var;
    }

    @Override
    public final void e(float f7, int i10, int i11) {
        float f10;
        int i12;
        boolean z10;
        if (f7 < 0.0f) {
            f10 = 0.0f;
        } else if (f7 > 1.0f) {
            f10 = 1.0f;
        } else {
            f10 = f7;
        }
        this.F = i10;
        SparseIntArray sparseIntArray = this.f32922b0;
        this.G = sparseIntArray.get(i10);
        if (f10 > 0.0f) {
            this.L = i11;
            this.M = sparseIntArray.get(i11);
        } else {
            this.L = -1;
            this.M = -1;
        }
        this.K = f10;
        this.v.g1();
        invalidate();
        c(i10);
        if (f10 >= 1.0f) {
            this.L = -1;
            this.M = -1;
            this.F = i11;
            this.G = sparseIntArray.get(i11);
        }
        s91 s91Var = this.f32945y;
        if (s91Var != null) {
            ((u91) ((jg.i) s91Var).f15726a).s();
        }
        if (f7 <= 0.5f) {
            i12 = i10;
        } else {
            i12 = i11;
        }
        if (i10 < i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f29883t0.z(i12, z10);
    }
}
