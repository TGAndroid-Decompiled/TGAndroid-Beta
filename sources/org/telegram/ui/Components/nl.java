package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
public final class nl extends TextView {
    public float f36583a;
    public boolean f36584b;
    public final Paint f36585c;

    public nl(Context context, Paint paint) {
        super(context);
        this.f36585c = paint;
        this.f36583a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i3 = (int) ((this.f36583a * 130.0f) + 125.0f);
        Paint paint = this.f36585c;
        paint.setAlpha(i3);
        if (!this.f36584b) {
            float f10 = this.f36583a - 0.026666667f;
            this.f36583a = f10;
            if (f10 <= 0.0f) {
                this.f36583a = 0.0f;
                this.f36584b = true;
            }
        } else {
            float f11 = this.f36583a + 0.026666667f;
            this.f36583a = f11;
            if (f11 >= 1.0f) {
                this.f36583a = 1.0f;
                this.f36584b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(org.telegram.messenger.g0.L(14.0f), getMeasuredHeight() / 2, org.telegram.messenger.g0.L(4.0f), paint);
        invalidate();
    }
}
