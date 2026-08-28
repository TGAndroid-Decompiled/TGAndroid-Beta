package org.telegram.ui.Cells;

import android.util.DisplayMetrics;
import org.telegram.messenger.AndroidUtilities;
public final class p extends f2.n0 {
    @Override
    public final int i(int i9, int i10, int i11, int i12, int i13) {
        return AndroidUtilities.dp(16.0f) + (i11 - i9);
    }

    @Override
    public final float l(DisplayMetrics displayMetrics) {
        return super.l(displayMetrics) * 3.0f;
    }
}
