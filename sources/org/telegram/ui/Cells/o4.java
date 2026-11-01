package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.widget.TextView;
public final class o4 extends TextView {
    public boolean f22382a;

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f22382a) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth(), getHeight() - 1, org.telegram.ui.ActionBar.t6.f21053k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(48.0f) + 1);
    }

    public void setNeedDivider(boolean z10) {
        this.f22382a = z10;
    }
}
