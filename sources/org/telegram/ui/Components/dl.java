package org.telegram.ui.Components;

import android.view.View;
import android.widget.LinearLayout;
public final class dl extends LinearLayout {
    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
    }
}
