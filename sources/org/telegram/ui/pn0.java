package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
public final class pn0 extends View {
    public Paint f38976a;
    public Paint f38977b;
    public float f38978c;

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredWidth = (int) (getMeasuredWidth() * this.f38978c);
        canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.f38977b);
        canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.f38976a);
    }
}
