package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;
public final class m71 extends v71 {
    public final w71 f28332t0;

    public m71(w71 w71Var, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        super(i10, context, p6Var, z10);
        this.f28332t0 = w71Var;
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
        SparseIntArray sparseIntArray = this.f31163b0;
        this.G = sparseIntArray.get(i10);
        if (f10 > 0.0f) {
            this.L = i11;
            this.M = sparseIntArray.get(i11);
        } else {
            this.L = -1;
            this.M = -1;
        }
        this.K = f10;
        this.f31184w.g1();
        invalidate();
        c(i10);
        if (f10 >= 1.0f) {
            this.L = -1;
            this.M = -1;
            this.F = i11;
            this.G = sparseIntArray.get(i11);
        }
        u71 u71Var = this.D;
        if (u71Var != null) {
            ((w71) ((n2.u) u71Var).f13480b).s();
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
        this.f28332t0.z(i12, z10);
    }
}
