package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;
public final class c71 extends m71 {
    public final n71 f27377p0;

    public c71(n71 n71Var, Context context, boolean z10, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(i9, context, b6Var, z10);
        this.f27377p0 = n71Var;
    }

    @Override
    public final void e(float f10, int i9, int i10) {
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
        this.B = i9;
        SparseIntArray sparseIntArray = this.U;
        this.C = sparseIntArray.get(i9);
        if (f11 > 0.0f) {
            l71 l71Var = this.f30759y;
            if (l71Var != null) {
                e71 e71Var = ((n71) ((n2.p) l71Var).f18343b).H;
            }
            this.H = i10;
            this.I = sparseIntArray.get(i10);
        } else {
            this.H = -1;
            this.I = -1;
        }
        this.G = f11;
        this.v.f1();
        invalidate();
        c(i9);
        if (f11 >= 1.0f) {
            this.H = -1;
            this.I = -1;
            this.B = i10;
            this.C = sparseIntArray.get(i10);
        }
        l71 l71Var2 = this.f30759y;
        if (l71Var2 != null) {
            ((n71) ((n2.p) l71Var2).f18343b).s();
        }
        if (f10 <= 0.5f) {
            i11 = i9;
        } else {
            i11 = i10;
        }
        if (i9 < i10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f27377p0.y(i11, z10);
    }
}
