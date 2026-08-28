package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
public final class la extends View {
    public int f30408a;

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f30408a, 1073741824));
    }
}
