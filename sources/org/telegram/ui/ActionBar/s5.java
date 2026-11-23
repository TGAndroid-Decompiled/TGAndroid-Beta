package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import org.telegram.ui.v71;
public final class s5 extends u4 {
    public final int U;
    public final Object V;

    public s5(boolean z10, SparseIntArray sparseIntArray, int i7) {
        super(2, z10, false, null);
        this.U = i7;
        this.V = sparseIntArray;
    }

    @Override
    public int g(int i7) {
        switch (this.U) {
            case 0:
                SparseIntArray sparseIntArray = (SparseIntArray) this.V;
                int indexOfKey = sparseIntArray.indexOfKey(i7);
                if (indexOfKey > 0) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                return n6.hm[i7];
            case 1:
                return ((SparseIntArray) this.V).get(i7);
            default:
                return super.g(i7);
        }
    }

    @Override
    public int i(int i7) {
        switch (this.U) {
            case 0:
                return ((SparseIntArray) this.V).get(i7);
            case 1:
                return ((SparseIntArray) this.V).get(i7);
            default:
                return super.i(i7);
        }
    }

    @Override
    public void o(int i7, int i10, int i11) {
        switch (this.U) {
            case 2:
                if (!((v71) this.V).f52866f2) {
                    super.o(i7, i10, i11);
                    return;
                }
                return;
            default:
                super.o(i7, i10, i11);
                return;
        }
    }

    @Override
    public void p(int i7, int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11) {
        switch (this.U) {
            case 2:
                if (!((v71) this.V).f52866f2) {
                    super.p(i7, i10, i11, i12, i13, i14, z10, z11);
                    return;
                }
                return;
            default:
                super.p(i7, i10, i11, i12, i13, i14, z10, z11);
                return;
        }
    }

    public s5(v71 v71Var, int i7, boolean z10) {
        super(i7, true, z10, null);
        this.U = 2;
        this.V = v71Var;
    }
}
