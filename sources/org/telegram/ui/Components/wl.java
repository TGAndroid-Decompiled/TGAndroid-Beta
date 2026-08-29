package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class wl extends TextView {
    public float f34435a;
    public boolean f34436b;
    public final Paint f34437c;

    public wl(Context context, Paint paint) {
        super(context);
        this.f34437c = paint;
        this.f34435a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f34435a * 130.0f) + 125.0f);
        Paint paint = this.f34437c;
        paint.setAlpha(i10);
        if (!this.f34436b) {
            float f9 = this.f34435a - 0.026666667f;
            this.f34435a = f9;
            if (f9 <= 0.0f) {
                this.f34435a = 0.0f;
                this.f34436b = true;
            }
        } else {
            float f10 = this.f34435a + 0.026666667f;
            this.f34435a = f10;
            if (f10 >= 1.0f) {
                this.f34435a = 1.0f;
                this.f34436b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
