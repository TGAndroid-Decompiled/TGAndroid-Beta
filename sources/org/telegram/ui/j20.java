package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
public final class j20 extends TextView {
    public final RectF f46487a;
    public final Paint f46488b;

    public j20(LaunchActivity launchActivity) {
        super(launchActivity);
        this.f46487a = new RectF();
        Paint paint = new Paint(1);
        this.f46488b = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-16711936);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF = this.f46487a;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), this.f46488b);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.f46488b;
        paint.setColor(-16711936);
        RectF rectF = this.f46487a;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(8.0f), paint);
        super.onDraw(canvas);
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
    }
}
