package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;
public final class o71 extends y71 {
    public final z71 f31279p0;

    public o71(z71 z71Var, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(i10, context, c6Var, z10);
        this.f31279p0 = z71Var;
    }

    @Override
    public final void e(float f9, int i10, int i11) {
        float f10;
        int i12;
        boolean z10;
        if (f9 < 0.0f) {
            f10 = 0.0f;
        } else if (f9 > 1.0f) {
            f10 = 1.0f;
        } else {
            f10 = f9;
        }
        this.B = i10;
        SparseIntArray sparseIntArray = this.U;
        this.C = sparseIntArray.get(i10);
        if (f10 > 0.0f) {
            x71 x71Var = this.f34963y;
            if (x71Var != null) {
                q71 q71Var = ((z71) ((n) x71Var).f30787b).H;
            }
            this.H = i11;
            this.I = sparseIntArray.get(i11);
        } else {
            this.H = -1;
            this.I = -1;
        }
        this.G = f10;
        this.v.f1();
        invalidate();
        c(i10);
        if (f10 >= 1.0f) {
            this.H = -1;
            this.I = -1;
            this.B = i11;
            this.C = sparseIntArray.get(i11);
        }
        x71 x71Var2 = this.f34963y;
        if (x71Var2 != null) {
            ((z71) ((n) x71Var2).f30787b).s();
        }
        if (f9 <= 0.5f) {
            i12 = i10;
        } else {
            i12 = i11;
        }
        if (i10 < i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f31279p0.y(i12, z10);
    }
}
