package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;
public final class s81 extends b91 {
    public final c91 f30218t0;

    public s81(c91 c91Var, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, context, d6Var, z10);
        this.f30218t0 = c91Var;
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
        SparseIntArray sparseIntArray = this.f24848b0;
        this.G = sparseIntArray.get(i10);
        if (f10 > 0.0f) {
            a91 a91Var = this.f24871y;
            if (a91Var != null) {
                u81 u81Var = ((c91) ((l2.f) a91Var).f15837b).L;
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
        a91 a91Var2 = this.f24871y;
        if (a91Var2 != null) {
            ((c91) ((l2.f) a91Var2).f15837b).s();
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
        this.f30218t0.y(i12, z10);
    }
}
