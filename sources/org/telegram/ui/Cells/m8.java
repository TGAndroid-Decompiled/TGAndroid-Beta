package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
public final class m8 extends FrameLayout {
    public TextView f21373a;

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
    }

    public void setTextColor(int i10) {
        this.f21373a.setTextColor(i10);
    }

    @Override
    public final void onDraw(Canvas canvas) {
    }
}
