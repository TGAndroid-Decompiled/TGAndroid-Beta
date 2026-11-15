package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
public final class vl extends TextView {
    public float f40458a;
    public boolean f40459b;
    public final Paint f40460c;

    public vl(Context context, Paint paint) {
        super(context);
        this.f40460c = paint;
        this.f40458a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = (int) ((this.f40458a * 130.0f) + 125.0f);
        Paint paint = this.f40460c;
        paint.setAlpha(i7);
        if (!this.f40459b) {
            float f10 = this.f40458a - 0.026666667f;
            this.f40458a = f10;
            if (f10 <= 0.0f) {
                this.f40458a = 0.0f;
                this.f40459b = true;
            }
        } else {
            float f11 = this.f40458a + 0.026666667f;
            this.f40458a = f11;
            if (f11 >= 1.0f) {
                this.f40458a = 1.0f;
                this.f40459b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(org.telegram.messenger.g0.L(14.0f), getMeasuredHeight() / 2, org.telegram.messenger.g0.L(4.0f), paint);
        invalidate();
    }
}
