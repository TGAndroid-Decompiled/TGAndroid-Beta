package org.telegram.ui;

import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class ek0 extends org.telegram.ui.Cells.o8 {
    public ImageView N;

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int dp;
        super.onLayout(z4, i10, i11, i12, i13);
        int i14 = i12 - i10;
        if (LocaleController.isRTL) {
            dp = AndroidUtilities.dp(17.0f);
        } else {
            dp = i14 - AndroidUtilities.dp(41.0f);
        }
        int x10 = b.x(24.0f, i13 - i11, 2);
        this.N.layout(dp, x10, AndroidUtilities.dp(24.0f) + dp, AndroidUtilities.dp(24.0f) + x10);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.N.measure(i10, i11);
    }
}
