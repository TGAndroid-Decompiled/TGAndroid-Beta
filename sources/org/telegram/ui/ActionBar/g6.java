package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import org.telegram.ui.vc1;
public final class g6 extends l5 {
    public final int T = 1;
    public final Object U;

    public g6(vc1 vc1Var, int i10, boolean z10) {
        super(i10, true, z10, null);
        this.U = vc1Var;
    }

    @Override
    public int g(int i10) {
        switch (this.T) {
            case 0:
                SparseIntArray sparseIntArray = (SparseIntArray) this.U;
                int indexOfKey = sparseIntArray.indexOfKey(i10);
                if (indexOfKey > 0) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                return y6.ql[i10];
            default:
                return super.g(i10);
        }
    }

    @Override
    public int h(int i10) {
        switch (this.T) {
            case 0:
                return ((SparseIntArray) this.U).get(i10);
            default:
                return super.h(i10);
        }
    }

    @Override
    public void m(int i10, int i11, int i12) {
        switch (this.T) {
            case 1:
                if (!((vc1) this.U).f44262e2) {
                    super.m(i10, i11, i12);
                    return;
                }
                return;
            default:
                super.m(i10, i11, i12);
                return;
        }
    }

    @Override
    public void n(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, boolean z11) {
        switch (this.T) {
            case 1:
                if (!((vc1) this.U).f44262e2) {
                    super.n(i10, i11, i12, i13, i14, i15, z10, z11);
                    return;
                }
                return;
            default:
                super.n(i10, i11, i12, i13, i14, i15, z10, z11);
                return;
        }
    }

    public g6(boolean z10, SparseIntArray sparseIntArray) {
        super(2, z10, false, null);
        this.U = sparseIntArray;
    }
}
