package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;
public final class n81 extends x81 {
    public final y81 f26620t0;

    public n81(y81 y81Var, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(i10, context, d6Var, z10);
        this.f26620t0 = y81Var;
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
        SparseIntArray sparseIntArray = this.f30182b0;
        this.G = sparseIntArray.get(i10);
        if (f10 > 0.0f) {
            w81 w81Var = this.f30205y;
            if (w81Var != null) {
                p81 p81Var = ((y81) ((l.d) w81Var).f13940a).L;
            }
            this.L = i11;
            this.M = sparseIntArray.get(i11);
        } else {
            this.L = -1;
            this.M = -1;
        }
        this.K = f10;
        this.v.h1();
        invalidate();
        c(i10);
        if (f10 >= 1.0f) {
            this.L = -1;
            this.M = -1;
            this.F = i11;
            this.G = sparseIntArray.get(i11);
        }
        w81 w81Var2 = this.f30205y;
        if (w81Var2 != null) {
            ((y81) ((l.d) w81Var2).f13940a).s();
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
        this.f26620t0.y(i12, z10);
    }
}
