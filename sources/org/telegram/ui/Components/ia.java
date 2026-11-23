package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
public final class ia extends View {
    public int f35968a;

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f35968a, 1073741824));
    }
}
