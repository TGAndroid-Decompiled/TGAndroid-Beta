package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class em extends TextView {
    public float f26088a;
    public boolean f26089b;
    public final Paint f26090c;

    public em(Context context, Paint paint) {
        super(context);
        this.f26090c = paint;
        this.f26088a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f26088a * 130.0f) + 125.0f);
        Paint paint = this.f26090c;
        paint.setAlpha(i10);
        if (!this.f26089b) {
            float f7 = this.f26088a - 0.026666667f;
            this.f26088a = f7;
            if (f7 <= 0.0f) {
                this.f26088a = 0.0f;
                this.f26089b = true;
            }
        } else {
            float f10 = this.f26088a + 0.026666667f;
            this.f26088a = f10;
            if (f10 >= 1.0f) {
                this.f26088a = 1.0f;
                this.f26089b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
