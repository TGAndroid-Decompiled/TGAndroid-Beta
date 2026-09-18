package org.telegram.ui.Components;

import android.view.MotionEvent;
import android.view.View;
public final class ra extends View {
    public int f27592a;

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(this.f27592a, 1073741824));
    }
}
