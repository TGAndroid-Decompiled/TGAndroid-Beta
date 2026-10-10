package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import org.telegram.ui.xd1;
public final class q5 extends f5 {
    public final int T = 1;
    public final Object U;

    public q5(xd1 xd1Var, int i10, boolean z10) {
        super(i10, true, z10, null);
        this.U = xd1Var;
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
                return i6.ql[i10];
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
    public void n(int i10, int i11, int i12) {
        switch (this.T) {
            case 1:
                if (!((xd1) this.U).f43994d2) {
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
        switch (this.T) {
            case 1:
                if (!((xd1) this.U).f43994d2) {
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
        this.U = sparseIntArray;
    }
}
