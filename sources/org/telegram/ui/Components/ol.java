package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
public final class ol extends TextView {
    public float f36743a;
    public boolean f36744b;
    public final Paint f36745c;

    public ol(Context context, Paint paint) {
        super(context);
        this.f36745c = paint;
        this.f36743a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = (int) ((this.f36743a * 130.0f) + 125.0f);
        Paint paint = this.f36745c;
        paint.setAlpha(i7);
        if (!this.f36744b) {
            float f10 = this.f36743a - 0.026666667f;
            this.f36743a = f10;
            if (f10 <= 0.0f) {
                this.f36743a = 0.0f;
                this.f36744b = true;
            }
        } else {
            float f11 = this.f36743a + 0.026666667f;
            this.f36743a = f11;
            if (f11 >= 1.0f) {
                this.f36743a = 1.0f;
                this.f36744b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(org.telegram.messenger.g0.L(14.0f), getMeasuredHeight() / 2, org.telegram.messenger.g0.L(4.0f), paint);
        invalidate();
    }
}
