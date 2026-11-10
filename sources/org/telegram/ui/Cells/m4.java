package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.widget.TextView;
public final class m4 extends TextView {
    public boolean f29563a;

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f29563a) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth(), getHeight() - 1, org.telegram.ui.ActionBar.m6.f28013k0);
        }
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(48.0f) + 1);
    }

    public void setNeedDivider(boolean z9) {
        this.f29563a = z9;
    }
}
