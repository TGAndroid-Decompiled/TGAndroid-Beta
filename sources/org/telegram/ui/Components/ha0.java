package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
public final class ha0 extends org.telegram.ui.ActionBar.k5 {
    public final Paint N0;
    public final org.telegram.ui.ActionBar.e6 O0;

    public ha0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.O0 = e6Var;
        this.N0 = new Paint(1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.K5, this.O0);
        Paint paint = this.N0;
        paint.setColor(w02);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
        float height = getHeight() / 2.0f;
        canvas.drawLine(0.0f, height, ((getWidth() / 2.0f) - (getTextWidth() / 2.0f)) - org.telegram.messenger.g0.L(8.0f), height, paint);
        canvas.drawLine((getTextWidth() / 2.0f) + (getWidth() / 2.0f) + org.telegram.messenger.g0.L(8.0f), height, getWidth(), height, paint);
        super.dispatchDraw(canvas);
    }
}
