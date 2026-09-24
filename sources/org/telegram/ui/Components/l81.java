package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;
public final class l81 extends v81 {
    public final w81 f26038t0;

    public l81(w81 w81Var, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, context, d6Var, z10);
        this.f26038t0 = w81Var;
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
        SparseIntArray sparseIntArray = this.f29077b0;
        this.G = sparseIntArray.get(i10);
        if (f10 > 0.0f) {
            u81 u81Var = this.f29100y;
            if (u81Var != null) {
                n81 n81Var = ((w81) ((l.d) u81Var).f13909a).L;
            }
            this.L = i11;
            this.M = sparseIntArray.get(i11);
        } else {
            this.L = -1;
            this.M = -1;
        }
        this.K = f10;
        this.v.f1();
        invalidate();
        c(i10);
        if (f10 >= 1.0f) {
            this.L = -1;
            this.M = -1;
            this.F = i11;
            this.G = sparseIntArray.get(i11);
        }
        u81 u81Var2 = this.f29100y;
        if (u81Var2 != null) {
            ((w81) ((l.d) u81Var2).f13909a).s();
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
        this.f26038t0.y(i12, z10);
    }
}
