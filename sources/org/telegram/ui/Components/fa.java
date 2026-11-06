package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
public final class fa extends View {
    public int f33501a;

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f33501a, 1073741824));
    }
}
