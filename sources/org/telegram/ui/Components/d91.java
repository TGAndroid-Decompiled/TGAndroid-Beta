package org.telegram.ui.Components;

import android.content.Context;
import android.util.SparseIntArray;
public final class d91 extends n91 {
    public final o91 f25649t0;

    public d91(o91 o91Var, Context context, boolean z10, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(i10, context, e6Var, z10);
        this.f25649t0 = o91Var;
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
        SparseIntArray sparseIntArray = this.f29098b0;
        this.G = sparseIntArray.get(i10);
        if (f10 > 0.0f) {
            m91 m91Var = this.f29122y;
            if (m91Var != null) {
                f91 f91Var = ((o91) ((m2.t) m91Var).f15972b).L;
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
        m91 m91Var2 = this.f29122y;
        if (m91Var2 != null) {
            ((o91) ((m2.t) m91Var2).f15972b).s();
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
        this.f25649t0.y(i12, z10);
    }
}
