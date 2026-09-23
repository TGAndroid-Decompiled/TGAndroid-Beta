package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;
public final class x71 extends g81 {
    public final h81 f29942t0;

    public x71(h81 h81Var, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, context, d6Var, z10);
        this.f29942t0 = h81Var;
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
        SparseIntArray sparseIntArray = this.f24211b0;
        this.G = sparseIntArray.get(i10);
        if (f10 > 0.0f) {
            f81 f81Var = this.f24234y;
            if (f81Var != null) {
                z71 z71Var = ((h81) ((ka.c) f81Var).f13554b).L;
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
        f81 f81Var2 = this.f24234y;
        if (f81Var2 != null) {
            ((h81) ((ka.c) f81Var2).f13554b).s();
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
        this.f29942t0.y(i12, z10);
    }
}
