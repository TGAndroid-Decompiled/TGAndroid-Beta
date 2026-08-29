package org.telegram.ui.Cells;

import android.graphics.Canvas;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class j4 extends TextView {
    public boolean f24538a;

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f24538a) {
            canvas.drawLine(0.0f, getHeight() - 1, getWidth(), getHeight() - 1, org.telegram.ui.ActionBar.g6.f23183k0);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(48.0f) + 1);
    }

    public void setNeedDivider(boolean z10) {
        this.f24538a = z10;
    }
}
