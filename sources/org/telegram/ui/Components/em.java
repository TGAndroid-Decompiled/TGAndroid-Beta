package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
public final class em extends TextView {
    public float f34885a;
    public boolean f34886b;
    public final Paint f34887c;

    public em(Context context, Paint paint) {
        super(context);
        this.f34887c = paint;
        this.f34885a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = (int) ((this.f34885a * 130.0f) + 125.0f);
        Paint paint = this.f34887c;
        paint.setAlpha(i7);
        if (!this.f34886b) {
            float f10 = this.f34885a - 0.026666667f;
            this.f34885a = f10;
            if (f10 <= 0.0f) {
                this.f34885a = 0.0f;
                this.f34886b = true;
            }
        } else {
            float f11 = this.f34885a + 0.026666667f;
            this.f34885a = f11;
            if (f11 >= 1.0f) {
                this.f34885a = 1.0f;
                this.f34886b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(org.telegram.messenger.g0.L(14.0f), getMeasuredHeight() / 2, org.telegram.messenger.g0.L(4.0f), paint);
        invalidate();
    }
}
