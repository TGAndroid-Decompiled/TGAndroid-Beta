package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;
public final class m81 extends w81 {
    public final x81 f26356t0;

    public m81(x81 x81Var, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i10, context, e6Var, z10);
        this.f26356t0 = x81Var;
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
        SparseIntArray sparseIntArray = this.f29963b0;
        this.G = sparseIntArray.get(i10);
        if (f10 > 0.0f) {
            v81 v81Var = this.f29986y;
            if (v81Var != null) {
                o81 o81Var = ((x81) ((l.d) v81Var).f13859a).L;
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
        v81 v81Var2 = this.f29986y;
        if (v81Var2 != null) {
            ((x81) ((l.d) v81Var2).f13859a).s();
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
        this.f26356t0.z(i12, z10);
    }
}
