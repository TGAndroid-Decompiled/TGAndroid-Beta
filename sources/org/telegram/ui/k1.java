package org.telegram.ui;

import android.graphics.Canvas;
import android.view.View;
public final class k1 extends View {
    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawLine(0.0f, 0.0f, getMeasuredWidth(), 0.0f, h4.f37717s1);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), org.telegram.messenger.i0.L(4.0f) + 1);
    }
}
