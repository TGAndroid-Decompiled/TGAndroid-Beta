package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import org.telegram.ui.ed1;
public final class r5 extends h5 {
    public final int R = 1;
    public final Object S;

    public r5(ed1 ed1Var, int i10, boolean z4) {
        super(i10, true, z4, null);
        this.S = ed1Var;
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
                return k6.nl[i10];
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
                if (!((ed1) this.S).a2) {
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
    public void o(int i10, int i11, int i12, int i13, int i14, int i15, boolean z4, boolean z10) {
        switch (this.R) {
            case 1:
                if (!((ed1) this.S).a2) {
                    super.o(i10, i11, i12, i13, i14, i15, z4, z10);
                    return;
                }
                return;
            default:
                super.o(i10, i11, i12, i13, i14, i15, z4, z10);
                return;
        }
    }

    public r5(boolean z4, SparseIntArray sparseIntArray) {
        super(2, z4, false, null);
        this.S = sparseIntArray;
    }
}
