package org.telegram.ui.Components;

import android.view.View;
import android.widget.ScrollView;
import org.telegram.messenger.AndroidUtilities;
public final class k70 extends ScrollView {
    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(AndroidUtilities.dp(260.0f), View.MeasureSpec.getSize(i11)), View.MeasureSpec.getMode(i11)));
    }
}
