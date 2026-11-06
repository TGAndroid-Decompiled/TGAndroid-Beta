package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
public final class ol extends TextView {
    public float f36639a;
    public boolean f36640b;
    public final Paint f36641c;

    public ol(Context context, Paint paint) {
        super(context);
        this.f36641c = paint;
        this.f36639a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = (int) ((this.f36639a * 130.0f) + 125.0f);
        Paint paint = this.f36641c;
        paint.setAlpha(i7);
        if (!this.f36640b) {
            float f10 = this.f36639a - 0.026666667f;
            this.f36639a = f10;
            if (f10 <= 0.0f) {
                this.f36639a = 0.0f;
                this.f36640b = true;
            }
        } else {
            float f11 = this.f36639a + 0.026666667f;
            this.f36639a = f11;
            if (f11 >= 1.0f) {
                this.f36639a = 1.0f;
                this.f36640b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(org.telegram.messenger.g0.L(14.0f), getMeasuredHeight() / 2, org.telegram.messenger.g0.L(4.0f), paint);
        invalidate();
    }
}
