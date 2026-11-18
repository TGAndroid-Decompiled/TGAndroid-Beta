package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
public final class cm extends TextView {
    public float f34100a;
    public boolean f34101b;
    public final Paint f34102c;

    public cm(Context context, Paint paint) {
        super(context);
        this.f34102c = paint;
        this.f34100a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = (int) ((this.f34100a * 130.0f) + 125.0f);
        Paint paint = this.f34102c;
        paint.setAlpha(i7);
        if (!this.f34101b) {
            float f10 = this.f34100a - 0.026666667f;
            this.f34100a = f10;
            if (f10 <= 0.0f) {
                this.f34100a = 0.0f;
                this.f34101b = true;
            }
        } else {
            float f11 = this.f34100a + 0.026666667f;
            this.f34100a = f11;
            if (f11 >= 1.0f) {
                this.f34100a = 1.0f;
                this.f34101b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(org.telegram.messenger.g0.L(14.0f), getMeasuredHeight() / 2, org.telegram.messenger.g0.L(4.0f), paint);
        invalidate();
    }
}
