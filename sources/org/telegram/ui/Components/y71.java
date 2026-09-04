package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;
public final class y71 extends h81 {
    public final i81 f32861t0;

    public y71(i81 i81Var, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, context, f6Var, z10);
        this.f32861t0 = i81Var;
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
        SparseIntArray sparseIntArray = this.f26635b0;
        this.G = sparseIntArray.get(i10);
        if (f10 > 0.0f) {
            g81 g81Var = this.f26659y;
            if (g81Var != null) {
                a81 a81Var = ((i81) ((k2.g0) g81Var).f14578b).L;
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
        g81 g81Var2 = this.f26659y;
        if (g81Var2 != null) {
            ((i81) ((k2.g0) g81Var2).f14578b).s();
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
        this.f32861t0.y(i12, z10);
    }
}
