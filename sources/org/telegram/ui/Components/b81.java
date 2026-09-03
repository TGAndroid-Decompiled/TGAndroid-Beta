package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;
public final class b81 extends k81 {
    public final l81 f25539q0;

    public b81(l81 l81Var, Context context, boolean z4, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i10, context, g6Var, z4);
        this.f25539q0 = l81Var;
    }

    @Override
    public final void e(float f10, int i10, int i11) {
        float f11;
        int i12;
        boolean z4;
        if (f10 < 0.0f) {
            f11 = 0.0f;
        } else if (f10 > 1.0f) {
            f11 = 1.0f;
        } else {
            f11 = f10;
        }
        this.C = i10;
        SparseIntArray sparseIntArray = this.V;
        this.D = sparseIntArray.get(i10);
        if (f11 > 0.0f) {
            j81 j81Var = this.f28346y;
            if (j81Var != null) {
                d81 d81Var = ((l81) ((oh.h4) j81Var).f17182b).I;
            }
            this.I = i11;
            this.J = sparseIntArray.get(i11);
        } else {
            this.I = -1;
            this.J = -1;
        }
        this.H = f11;
        this.v.e1();
        invalidate();
        c(i10);
        if (f11 >= 1.0f) {
            this.I = -1;
            this.J = -1;
            this.C = i11;
            this.D = sparseIntArray.get(i11);
        }
        j81 j81Var2 = this.f28346y;
        if (j81Var2 != null) {
            ((l81) ((oh.h4) j81Var2).f17182b).s();
        }
        if (f10 <= 0.5f) {
            i12 = i10;
        } else {
            i12 = i11;
        }
        if (i10 < i11) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f25539q0.y(i12, z4);
    }
}
