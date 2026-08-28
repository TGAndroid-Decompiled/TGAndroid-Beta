package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class n8 extends FrameLayout {
    public TextView f24773a;

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), i10);
    }

    public void setTextColor(int i9) {
        this.f24773a.setTextColor(i9);
    }

    @Override
    public final void onDraw(Canvas canvas) {
    }
}
