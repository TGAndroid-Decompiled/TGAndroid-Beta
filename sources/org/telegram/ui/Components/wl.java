package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
public final class wl extends TextView {
    public float f32276a;
    public boolean f32277b;
    public final Paint f32278c;

    public wl(Context context, Paint paint) {
        super(context);
        this.f32278c = paint;
        this.f32276a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f32276a * 130.0f) + 125.0f);
        Paint paint = this.f32278c;
        paint.setAlpha(i10);
        if (!this.f32277b) {
            float f7 = this.f32276a - 0.026666667f;
            this.f32276a = f7;
            if (f7 <= 0.0f) {
                this.f32276a = 0.0f;
                this.f32277b = true;
            }
        } else {
            float f10 = this.f32276a + 0.026666667f;
            this.f32276a = f10;
            if (f10 >= 1.0f) {
                this.f32276a = 1.0f;
                this.f32277b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(org.telegram.messenger.i0.L(14.0f), getMeasuredHeight() / 2, org.telegram.messenger.i0.L(4.0f), paint);
        invalidate();
    }
}
