package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;
public final class oo extends FrameLayout {
    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), i10);
    }
}
