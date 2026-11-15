package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;
public final class l61 extends v61 {
    public final w61 f36718u0;

    public l61(w61 w61Var, Context context, boolean z10, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i7, context, e6Var, z10);
        this.f36718u0 = w61Var;
    }

    @Override
    public final void e(float f10, int i7, int i10) {
        float f11;
        int i11;
        boolean z10;
        if (f10 < 0.0f) {
            f11 = 0.0f;
        } else if (f10 > 1.0f) {
            f11 = 1.0f;
        } else {
            f11 = f10;
        }
        this.G = i7;
        SparseIntArray sparseIntArray = this.f40296c0;
        this.H = sparseIntArray.get(i7);
        if (f11 > 0.0f) {
            this.M = i10;
            this.N = sparseIntArray.get(i10);
        } else {
            this.M = -1;
            this.N = -1;
        }
        this.L = f11;
        this.f40317w.g1();
        invalidate();
        c(i7);
        if (f11 >= 1.0f) {
            this.M = -1;
            this.N = -1;
            this.G = i10;
            this.H = sparseIntArray.get(i10);
        }
        u61 u61Var = this.E;
        if (u61Var != null) {
            ((w61) ((cf) u61Var).f33545a).p();
        }
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
        this.f36718u0.w(i11, z10);
    }
}
