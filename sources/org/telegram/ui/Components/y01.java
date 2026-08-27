package org.telegram.ui.Components;

import android.util.SparseIntArray;

public final class y01 extends org.telegram.ui.ActionBar.d5 {
    public final SparseIntArray R;

    public y01(boolean z10, SparseIntArray sparseIntArray) {
        super(2, z10, false, null);
        this.R = sparseIntArray;
    }

    @Override
    public final int g(int i10) {
        return this.R.get(i10);
    }

    @Override
    public final int h(int i10) {
        return this.R.get(i10);
    }
}
