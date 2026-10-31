package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import org.telegram.ui.m91;
public final class a6 extends c5 {
    public final int U;
    public final Object V;

    public a6(boolean z10, SparseIntArray sparseIntArray, int i10) {
        super(2, z10, false, null);
        this.U = i10;
        this.V = sparseIntArray;
    }

    @Override
    public int h(int i10) {
        switch (this.U) {
            case 0:
                SparseIntArray sparseIntArray = (SparseIntArray) this.V;
                int indexOfKey = sparseIntArray.indexOfKey(i10);
                if (indexOfKey > 0) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                return t6.em[i10];
            case 1:
                return ((SparseIntArray) this.V).get(i10);
            default:
                return super.h(i10);
        }
    }

    @Override
    public int j(int i10) {
        switch (this.U) {
            case 0:
                return ((SparseIntArray) this.V).get(i10);
            case 1:
                return ((SparseIntArray) this.V).get(i10);
            default:
                return super.j(i10);
        }
    }

    @Override
    public void p(int i10, int i11, int i12) {
        switch (this.U) {
            case 2:
                if (!((m91) this.V).f39553e2) {
                    super.p(i10, i11, i12);
                    return;
                }
                return;
            default:
                super.p(i10, i11, i12);
                return;
        }
    }

    @Override
    public void q(int i10, int i11, int i12, int i13, int i14, int i15, boolean z10, boolean z11) {
        switch (this.U) {
            case 2:
                if (!((m91) this.V).f39553e2) {
                    super.q(i10, i11, i12, i13, i14, i15, z10, z11);
                    return;
                }
                return;
            default:
                super.q(i10, i11, i12, i13, i14, i15, z10, z11);
                return;
        }
    }

    public a6(m91 m91Var, int i10, boolean z10) {
        super(i10, true, z10, null);
        this.U = 2;
        this.V = m91Var;
    }
}
