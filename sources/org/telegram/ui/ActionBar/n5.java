package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import org.telegram.ui.oc1;
public final class n5 extends d5 {
    public final int R = 1;
    public final Object S;

    public n5(oc1 oc1Var, int i9, boolean z10) {
        super(i9, true, z10, null);
        this.S = oc1Var;
    }

    @Override
    public int g(int i9) {
        switch (this.R) {
            case 0:
                SparseIntArray sparseIntArray = (SparseIntArray) this.S;
                int indexOfKey = sparseIntArray.indexOfKey(i9);
                if (indexOfKey > 0) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                return f6.nl[i9];
            default:
                return super.g(i9);
        }
    }

    @Override
    public int h(int i9) {
        switch (this.R) {
            case 0:
                return ((SparseIntArray) this.S).get(i9);
            default:
                return super.h(i9);
        }
    }

    @Override
    public void n(int i9, int i10, int i11) {
        switch (this.R) {
            case 1:
                if (!((oc1) this.S).Z1) {
                    super.n(i9, i10, i11);
                    return;
                }
                return;
            default:
                super.n(i9, i10, i11);
                return;
        }
    }

    @Override
    public void o(int i9, int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11) {
        switch (this.R) {
            case 1:
                if (!((oc1) this.S).Z1) {
                    super.o(i9, i10, i11, i12, i13, i14, z10, z11);
                    return;
                }
                return;
            default:
                super.o(i9, i10, i11, i12, i13, i14, z10, z11);
                return;
        }
    }

    public n5(boolean z10, SparseIntArray sparseIntArray) {
        super(2, z10, false, null);
        this.S = sparseIntArray;
    }
}
