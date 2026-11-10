package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
public final class nl extends TextView {
    public float f36329a;
    public boolean f36330b;
    public final Paint f36331c;

    public nl(Context context, Paint paint) {
        super(context);
        this.f36331c = paint;
        this.f36329a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = (int) ((this.f36329a * 130.0f) + 125.0f);
        Paint paint = this.f36331c;
        paint.setAlpha(i7);
        if (!this.f36330b) {
            float f10 = this.f36329a - 0.026666667f;
            this.f36329a = f10;
            if (f10 <= 0.0f) {
                this.f36329a = 0.0f;
                this.f36330b = true;
            }
        } else {
            float f11 = this.f36329a + 0.026666667f;
            this.f36329a = f11;
            if (f11 >= 1.0f) {
                this.f36329a = 1.0f;
                this.f36330b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(org.telegram.messenger.g0.L(14.0f), getMeasuredHeight() / 2, org.telegram.messenger.g0.L(4.0f), paint);
        invalidate();
    }
}
