package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
public final class la extends View {
    public int f26607a;

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f26607a, 1073741824));
    }
}
