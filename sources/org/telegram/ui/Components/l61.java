package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;
public final class l61 extends v61 {
    public final w61 f35624t0;

    public l61(w61 w61Var, Context context, boolean z9, int i7, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i7, context, g6Var, z9);
        this.f35624t0 = w61Var;
    }

    @Override
    public final void e(float f10, int i7, int i10) {
        float f11;
        int i11;
        boolean z9;
        if (f10 < 0.0f) {
            f11 = 0.0f;
        } else if (f10 > 1.0f) {
            f11 = 1.0f;
        } else {
            f11 = f10;
        }
        this.F = i7;
        SparseIntArray sparseIntArray = this.f38964b0;
        this.G = sparseIntArray.get(i7);
        if (f11 > 0.0f) {
            this.L = i10;
            this.M = sparseIntArray.get(i10);
        } else {
            this.L = -1;
            this.M = -1;
        }
        this.K = f11;
        this.f38986w.g1();
        invalidate();
        c(i7);
        if (f11 >= 1.0f) {
            this.L = -1;
            this.M = -1;
            this.F = i10;
            this.G = sparseIntArray.get(i10);
        }
        u61 u61Var = this.D;
        if (u61Var != null) {
            ((w61) ((n) u61Var).f36185a).s();
        }
        if (f10 <= 0.5f) {
            i11 = i7;
        } else {
            i11 = i10;
        }
        if (i7 < i10) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f35624t0.z(i11, z9);
    }
}
