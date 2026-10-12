package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;
public final class a91 extends j91 {
    public final k91 f23494t0;

    public a91(k91 k91Var, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, context, c6Var, z10);
        this.f23494t0 = k91Var;
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
        SparseIntArray sparseIntArray = this.f26276b0;
        this.G = sparseIntArray.get(i10);
        if (f10 > 0.0f) {
            i91 i91Var = this.f26299y;
            if (i91Var != null) {
                c91 c91Var = ((k91) ((l2.f) i91Var).f14503b).L;
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
        i91 i91Var2 = this.f26299y;
        if (i91Var2 != null) {
            ((k91) ((l2.f) i91Var2).f14503b).s();
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
        this.f23494t0.y(i12, z10);
    }
}
