package org.telegram.ui;

import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class pk0 extends org.telegram.ui.Cells.r8 {
    public ImageView Q;

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int dp;
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        if (LocaleController.isRTL) {
            dp = AndroidUtilities.dp(17.0f);
        } else {
            dp = i14 - AndroidUtilities.dp(41.0f);
        }
        int y3 = org.telegram.messenger.vl.y(24.0f, i13 - i11, 2);
        this.Q.layout(dp, y3, AndroidUtilities.dp(24.0f) + dp, AndroidUtilities.dp(24.0f) + y3);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.Q.measure(i10, i11);
    }
}
