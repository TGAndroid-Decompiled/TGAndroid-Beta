package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
public final class ol extends TextView {
    public float f36739a;
    public boolean f36740b;
    public final Paint f36741c;

    public ol(Context context, Paint paint) {
        super(context);
        this.f36741c = paint;
        this.f36739a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = (int) ((this.f36739a * 130.0f) + 125.0f);
        Paint paint = this.f36741c;
        paint.setAlpha(i7);
        if (!this.f36740b) {
            float f10 = this.f36739a - 0.026666667f;
            this.f36739a = f10;
            if (f10 <= 0.0f) {
                this.f36739a = 0.0f;
                this.f36740b = true;
            }
        } else {
            float f11 = this.f36739a + 0.026666667f;
            this.f36739a = f11;
            if (f11 >= 1.0f) {
                this.f36739a = 1.0f;
                this.f36740b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(org.telegram.messenger.g0.L(14.0f), getMeasuredHeight() / 2, org.telegram.messenger.g0.L(4.0f), paint);
        invalidate();
    }
}
