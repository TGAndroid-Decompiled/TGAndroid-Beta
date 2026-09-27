package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class gn0 extends View {
    public Paint f33978a;
    public Paint f33979b;
    public float f33980c;

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredWidth = (int) (getMeasuredWidth() * this.f33980c);
        canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.f33979b);
        canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f33978a);
    }
}
