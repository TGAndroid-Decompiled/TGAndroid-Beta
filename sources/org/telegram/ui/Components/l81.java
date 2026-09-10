package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;
public final class l81 extends u81 {
    public final v81 f24904t0;

    public l81(v81 v81Var, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, context, f6Var, z10);
        this.f24904t0 = v81Var;
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
        SparseIntArray sparseIntArray = this.f27617b0;
        this.G = sparseIntArray.get(i10);
        if (f10 > 0.0f) {
            t81 t81Var = this.f27640y;
            if (t81Var != null) {
                n81 n81Var = ((v81) ((l2.h) t81Var).f12721b).L;
            }
            this.L = i11;
            this.M = sparseIntArray.get(i11);
        } else {
            this.L = -1;
            this.M = -1;
        }
        this.K = f10;
        this.v.e1();
        invalidate();
        c(i10);
        if (f10 >= 1.0f) {
            this.L = -1;
            this.M = -1;
            this.F = i11;
            this.G = sparseIntArray.get(i11);
        }
        t81 t81Var2 = this.f27640y;
        if (t81Var2 != null) {
            ((v81) ((l2.h) t81Var2).f12721b).s();
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
        this.f24904t0.y(i12, z10);
    }
}
