package org.telegram.ui.Components;

import android.util.SparseIntArray;
public final class z21 extends org.telegram.ui.ActionBar.l5 {
    public final SparseIntArray T;

    public z21(boolean z10, SparseIntArray sparseIntArray) {
        super(2, z10, false, null);
        this.T = sparseIntArray;
    }

    @Override
    public final int g(int i10) {
        return this.T.get(i10);
    }

    @Override
    public final int h(int i10) {
        return this.T.get(i10);
    }
}
