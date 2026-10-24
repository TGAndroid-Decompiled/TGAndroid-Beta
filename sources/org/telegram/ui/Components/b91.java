package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;
public final class b91 extends k91 {
    public final l91 f24941t0;

    public b91(l91 l91Var, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i10, context, g6Var, z10);
        this.f24941t0 = l91Var;
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
        SparseIntArray sparseIntArray = this.f27966b0;
        this.G = sparseIntArray.get(i10);
        if (f10 > 0.0f) {
            j91 j91Var = this.f27989y;
            if (j91Var != null) {
                d91 d91Var = ((l91) ((l2.f) j91Var).f15906b).L;
            }
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
        j91 j91Var2 = this.f27989y;
        if (j91Var2 != null) {
            ((l91) ((l2.f) j91Var2).f15906b).s();
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
        this.f24941t0.y(i12, z10);
    }
}
