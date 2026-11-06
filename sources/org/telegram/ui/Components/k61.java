package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;
public final class k61 extends u61 {
    public final v61 f35212t0;

    public k61(v61 v61Var, Context context, boolean z9, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i7, context, f6Var, z9);
        this.f35212t0 = v61Var;
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
        SparseIntArray sparseIntArray = this.f38513b0;
        this.G = sparseIntArray.get(i7);
        if (f11 > 0.0f) {
            this.L = i10;
            this.M = sparseIntArray.get(i10);
        } else {
            this.L = -1;
            this.M = -1;
        }
        this.K = f11;
        this.f38535w.g1();
        invalidate();
        c(i7);
        if (f11 >= 1.0f) {
            this.L = -1;
            this.M = -1;
            this.F = i10;
            this.G = sparseIntArray.get(i10);
        }
        t61 t61Var = this.D;
        if (t61Var != null) {
            ((v61) ((n) t61Var).f36142a).s();
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
        this.f35212t0.z(i11, z9);
    }
}
