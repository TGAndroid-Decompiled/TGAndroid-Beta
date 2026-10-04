package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class em extends TextView {
    public float f26083a;
    public boolean f26084b;
    public final Paint f26085c;

    public em(Context context, Paint paint) {
        super(context);
        this.f26085c = paint;
        this.f26083a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f26083a * 130.0f) + 125.0f);
        Paint paint = this.f26085c;
        paint.setAlpha(i10);
        if (!this.f26084b) {
            float f7 = this.f26083a - 0.026666667f;
            this.f26083a = f7;
            if (f7 <= 0.0f) {
                this.f26083a = 0.0f;
                this.f26084b = true;
            }
        } else {
            float f10 = this.f26083a + 0.026666667f;
            this.f26083a = f10;
            if (f10 >= 1.0f) {
                this.f26083a = 1.0f;
                this.f26084b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
