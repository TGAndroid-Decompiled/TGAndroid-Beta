package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;
public final class e91 extends o91 {
    public final p91 f25977t0;

    public e91(p91 p91Var, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i10, context, e6Var, z10);
        this.f25977t0 = p91Var;
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
        SparseIntArray sparseIntArray = this.f29403b0;
        this.G = sparseIntArray.get(i10);
        if (f10 > 0.0f) {
            n91 n91Var = this.f29427y;
            if (n91Var != null) {
                g91 g91Var = ((p91) ((m2.t) n91Var).f15976b).L;
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
        n91 n91Var2 = this.f29427y;
        if (n91Var2 != null) {
            ((p91) ((m2.t) n91Var2).f15976b).s();
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
        this.f25977t0.y(i12, z10);
    }
}
