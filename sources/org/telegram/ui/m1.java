package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
public final class m1 extends View {
    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawLine(0.0f, 0.0f, getMeasuredWidth(), 0.0f, j4.f33891r1);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(4.0f) + 1);
    }
}
