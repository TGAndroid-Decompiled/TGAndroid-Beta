package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import org.telegram.ui.wd1;
public final class q5 extends f5 {
    public final int R = 1;
    public final Object S;

    public q5(wd1 wd1Var, int i10, boolean z10) {
        super(i10, true, z10, null);
        this.S = wd1Var;
    }

    @Override
    public int g(int i10) {
        switch (this.R) {
            case 0:
                SparseIntArray sparseIntArray = (SparseIntArray) this.S;
                int indexOfKey = sparseIntArray.indexOfKey(i10);
                if (indexOfKey > 0) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                return j6.nl[i10];
            default:
                return super.g(i10);
        }
    }

    @Override
    public int h(int i10) {
        switch (this.R) {
            case 0:
                return ((SparseIntArray) this.S).get(i10);
            default:
                return super.h(i10);
        }
    }

    @Override
    public void n(int i10, int i11, int i12) {
        switch (this.R) {
            case 1:
                if (!((wd1) this.S).f41954d2) {
                    super.n(i10, i11, i12);
                    return;
                }
                return;
            default:
                super.n(i10, i11, i12);
                return;
        }
    }

    @Override
    public void o(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, boolean z11) {
        switch (this.R) {
            case 1:
                if (!((wd1) this.S).f41954d2) {
                    super.o(i10, i11, i12, i13, i14, i15, z10, z11);
                    return;
                }
                return;
            default:
                super.o(i10, i11, i12, i13, i14, i15, z10, z11);
                return;
        }
    }

    public q5(boolean z10, SparseIntArray sparseIntArray) {
        super(2, z10, false, null);
        this.S = sparseIntArray;
    }
}
