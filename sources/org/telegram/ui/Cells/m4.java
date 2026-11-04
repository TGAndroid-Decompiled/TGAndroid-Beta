package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.widget.TextView;
public final class m4 extends TextView {
    public boolean f29628a;

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f29628a) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth(), getHeight() - 1, org.telegram.ui.ActionBar.k6.f28002k0);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(48.0f) + 1);
    }

    public void setNeedDivider(boolean z10) {
        this.f29628a = z10;
    }
}
