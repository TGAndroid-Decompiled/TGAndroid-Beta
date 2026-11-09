package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
public final class q20 extends TextView {
    public final RectF f48871a;
    public final Paint f48872b;

    public q20(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f48871a = new RectF();
        Paint paint = new Paint(1);
        this.f48872b = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-16711936);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = this.f48871a;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.f48872b);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f48872b;
        paint.setColor(-16711936);
        RectF rectF = this.f48871a;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
    }
}
