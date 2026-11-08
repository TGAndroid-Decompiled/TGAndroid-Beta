package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
public final class ol extends TextView {
    public float f36659a;
    public boolean f36660b;
    public final Paint f36661c;

    public ol(Context context, Paint paint) {
        super(context);
        this.f36661c = paint;
        this.f36659a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = (int) ((this.f36659a * 130.0f) + 125.0f);
        Paint paint = this.f36661c;
        paint.setAlpha(i7);
        if (!this.f36660b) {
            float f10 = this.f36659a - 0.026666667f;
            this.f36659a = f10;
            if (f10 <= 0.0f) {
                this.f36659a = 0.0f;
                this.f36660b = true;
            }
        } else {
            float f11 = this.f36659a + 0.026666667f;
            this.f36659a = f11;
            if (f11 >= 1.0f) {
                this.f36659a = 1.0f;
                this.f36660b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(org.telegram.messenger.g0.L(14.0f), getMeasuredHeight() / 2, org.telegram.messenger.g0.L(4.0f), paint);
        invalidate();
    }
}
