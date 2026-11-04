package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;
public final class d61 extends m61 {
    public final n61 f32970u0;

    public d61(n61 n61Var, Context context, boolean z10, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i3, context, e6Var, z10);
        this.f32970u0 = n61Var;
    }

    @Override
    public final void e(float f10, int i3, int i10) {
        float f11;
        int i11;
        boolean z10;
        if (f10 < 0.0f) {
            f11 = 0.0f;
        } else if (f10 > 1.0f) {
            f11 = 1.0f;
        } else {
            f11 = f10;
        }
        this.G = i3;
        SparseIntArray sparseIntArray = this.f36031c0;
        this.H = sparseIntArray.get(i3);
        if (f11 > 0.0f) {
            this.M = i10;
            this.N = sparseIntArray.get(i10);
        } else {
            this.M = -1;
            this.N = -1;
        }
        this.L = f11;
        this.f36052w.g1();
        invalidate();
        c(i3);
        if (f11 >= 1.0f) {
            this.M = -1;
            this.N = -1;
            this.G = i10;
            this.H = sparseIntArray.get(i10);
        }
        l61 l61Var = this.E;
        if (l61Var != null) {
            ((n61) ((y00) l61Var).f40562a).q();
        }
        if (f10 <= 0.5f) {
            i11 = i3;
        } else {
            i11 = i10;
        }
        if (i3 < i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32970u0.y(i11, z10);
    }
}
