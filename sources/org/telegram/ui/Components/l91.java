package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;
public final class l91 extends u91 {
    public final v91 f30200t0;

    public l91(v91 v91Var, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(i10, context, u6Var, z10);
        this.f30200t0 = v91Var;
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
        SparseIntArray sparseIntArray = this.f33299b0;
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
        t91 t91Var = this.f33322y;
        if (t91Var != null) {
            ((v91) ((jg.i) t91Var).f15725a).s();
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
        this.f30200t0.z(i12, z10);
    }
}
