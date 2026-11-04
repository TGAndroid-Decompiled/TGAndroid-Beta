package org.telegram.ui.Cells;

import android.util.DisplayMetrics;
public final class p extends u4.c0 {
    @Override
    public final int i(int i3, int i10, int i11, int i12, int i13) {
        return org.telegram.messenger.g0.L(16.0f) + (i11 - i3);
    }

    @Override
    public final float l(DisplayMetrics displayMetrics) {
        return super.l(displayMetrics) * 3.0f;
    }
}
