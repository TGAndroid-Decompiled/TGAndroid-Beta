package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;
public final class t81 extends c91 {
    public final d91 f30455t0;

    public t81(d91 d91Var, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, context, d6Var, z10);
        this.f30455t0 = d91Var;
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
        SparseIntArray sparseIntArray = this.f25130b0;
        this.G = sparseIntArray.get(i10);
        if (f10 > 0.0f) {
            b91 b91Var = this.f25153y;
            if (b91Var != null) {
                v81 v81Var = ((d91) ((l2.f) b91Var).f15845b).L;
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
        b91 b91Var2 = this.f25153y;
        if (b91Var2 != null) {
            ((d91) ((l2.f) b91Var2).f15845b).s();
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
        this.f30455t0.y(i12, z10);
    }
}
