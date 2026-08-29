package org.telegram.ui.Components;

import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class kq0 extends FrameLayout {
    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(300.0f), View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(32.0f)), Integer.MIN_VALUE), i11);
    }
}
