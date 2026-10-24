package org.telegram.ui.Components;

import android.util.SparseIntArray;
public final class q21 extends org.telegram.ui.ActionBar.j5 {
    public final SparseIntArray T;

    public q21(boolean z10, SparseIntArray sparseIntArray) {
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
