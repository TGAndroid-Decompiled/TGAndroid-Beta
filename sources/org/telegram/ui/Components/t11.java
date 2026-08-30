package org.telegram.ui.Components;

import android.util.SparseIntArray;
public final class t11 extends org.telegram.ui.ActionBar.g5 {
    public final SparseIntArray R;

    public t11(boolean z4, SparseIntArray sparseIntArray) {
        super(2, z4, false, null);
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
