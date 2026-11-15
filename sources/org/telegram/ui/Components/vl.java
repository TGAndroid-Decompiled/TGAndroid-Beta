package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
public final class vl extends TextView {
    public float f40461a;
    public boolean f40462b;
    public final Paint f40463c;

    public vl(Context context, Paint paint) {
        super(context);
        this.f40463c = paint;
        this.f40461a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i7 = (int) ((this.f40461a * 130.0f) + 125.0f);
        Paint paint = this.f40463c;
        paint.setAlpha(i7);
        if (!this.f40462b) {
            float f10 = this.f40461a - 0.026666667f;
            this.f40461a = f10;
            if (f10 <= 0.0f) {
                this.f40461a = 0.0f;
                this.f40462b = true;
            }
        } else {
            float f11 = this.f40461a + 0.026666667f;
            this.f40461a = f11;
            if (f11 >= 1.0f) {
                this.f40461a = 1.0f;
                this.f40462b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(org.telegram.messenger.g0.L(14.0f), getMeasuredHeight() / 2, org.telegram.messenger.g0.L(4.0f), paint);
        invalidate();
    }
}
