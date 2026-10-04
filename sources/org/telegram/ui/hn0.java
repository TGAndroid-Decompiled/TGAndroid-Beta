package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class hn0 extends View {
    public Paint f37123a;
    public Paint f37124b;
    public float f37125c;

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredWidth = (int) (getMeasuredWidth() * this.f37125c);
        canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.f37124b);
        canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f37123a);
    }
}
