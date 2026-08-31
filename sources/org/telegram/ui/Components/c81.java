package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;
public final class c81 extends l81 {
    public final m81 f25863q0;

    public c81(m81 m81Var, Context context, boolean z4, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(i10, context, g6Var, z4);
        this.f25863q0 = m81Var;
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
            k81 k81Var = this.f28671y;
            if (k81Var != null) {
                e81 e81Var = ((m81) ((oh.h4) k81Var).f17180b).I;
            }
            this.I = i11;
            this.J = sparseIntArray.get(i11);
        } else {
            this.I = -1;
            this.J = -1;
        }
        this.H = f11;
        this.v.f1();
        invalidate();
        c(i10);
        if (f11 >= 1.0f) {
            this.I = -1;
            this.J = -1;
            this.C = i11;
            this.D = sparseIntArray.get(i11);
        }
        k81 k81Var2 = this.f28671y;
        if (k81Var2 != null) {
            ((m81) ((oh.h4) k81Var2).f17180b).s();
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
        this.f25863q0.y(i12, z4);
    }
}
