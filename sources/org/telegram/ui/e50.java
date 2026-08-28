package org.telegram.ui;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class e50 extends org.telegram.ui.Cells.x3 {
    @Override
    public final void onMeasure(int i9, int i10) {
        if (AndroidUtilities.isTablet()) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(420.0f), View.MeasureSpec.getSize(i9)), 1073741824), i10);
        } else {
            super.onMeasure(i9, i10);
        }
    }
}
