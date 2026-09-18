package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;
public final class z71 extends i81 {
    public final j81 f30412t0;

    public z71(j81 j81Var, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, context, f6Var, z10);
        this.f30412t0 = j81Var;
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
        SparseIntArray sparseIntArray = this.f24876b0;
        this.G = sparseIntArray.get(i10);
        if (f10 > 0.0f) {
            h81 h81Var = this.f24899y;
            if (h81Var != null) {
                b81 b81Var = ((j81) ((ka.c) h81Var).f13567b).L;
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
        h81 h81Var2 = this.f24899y;
        if (h81Var2 != null) {
            ((j81) ((ka.c) h81Var2).f13567b).s();
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
        this.f30412t0.z(i12, z10);
    }
}
