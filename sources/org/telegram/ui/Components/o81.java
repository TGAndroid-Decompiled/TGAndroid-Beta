package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;
public final class o81 extends y81 {
    public final z81 f27011t0;

    public o81(z81 z81Var, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i10, context, f6Var, z10);
        this.f27011t0 = z81Var;
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
        SparseIntArray sparseIntArray = this.f30586b0;
        this.G = sparseIntArray.get(i10);
        if (f10 > 0.0f) {
            x81 x81Var = this.f30609y;
            if (x81Var != null) {
                q81 q81Var = ((z81) ((ki.e0) x81Var).f13672b).L;
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
        x81 x81Var2 = this.f30609y;
        if (x81Var2 != null) {
            ((z81) ((ki.e0) x81Var2).f13672b).s();
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
        this.f27011t0.z(i12, z10);
    }
}
