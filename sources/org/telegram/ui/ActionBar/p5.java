package org.telegram.ui.ActionBar;

import android.util.SparseIntArray;
import org.telegram.ui.l71;
public final class p5 extends t4 {
    public final int U;
    public final Object V;

    public p5(boolean z10, SparseIntArray sparseIntArray, int i3) {
        super(2, z10, false, null);
        this.U = i3;
        this.V = sparseIntArray;
    }

    @Override
    public int h(int i3) {
        switch (this.U) {
            case 0:
                SparseIntArray sparseIntArray = (SparseIntArray) this.V;
                int indexOfKey = sparseIntArray.indexOfKey(i3);
                if (indexOfKey > 0) {
                    return sparseIntArray.valueAt(indexOfKey);
                }
                return k6.em[i3];
            case 1:
                return ((SparseIntArray) this.V).get(i3);
            default:
                return super.h(i3);
        }
    }

    @Override
    public int j(int i3) {
        switch (this.U) {
            case 0:
                return ((SparseIntArray) this.V).get(i3);
            case 1:
                return ((SparseIntArray) this.V).get(i3);
            default:
                return super.j(i3);
        }
    }

    @Override
    public void p(int i3, int i10, int i11) {
        switch (this.U) {
            case 2:
                if (!((l71) this.V).f47162f2) {
                    super.p(i3, i10, i11);
                    return;
                }
                return;
            default:
                super.p(i3, i10, i11);
                return;
        }
    }

    @Override
    public void q(int i3, int i10, int i11, int i12, int i13, int i14, boolean z10, boolean z11) {
        switch (this.U) {
            case 2:
                if (!((l71) this.V).f47162f2) {
                    super.q(i3, i10, i11, i12, i13, i14, z10, z11);
                    return;
                }
                return;
            default:
                super.q(i3, i10, i11, i12, i13, i14, z10, z11);
                return;
        }
    }

    public p5(l71 l71Var, int i3, boolean z10) {
        super(i3, true, z10, null);
        this.U = 2;
        this.V = l71Var;
    }
}
