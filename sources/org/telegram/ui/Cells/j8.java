package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class j8 extends FrameLayout {
    public TextView f29457a;

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 1073741824), i10);
    }

    public void setTextColor(int i3) {
        this.f29457a.setTextColor(i3);
    }

    @Override
    public final void onDraw(Canvas canvas) {
    }
}
