package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class em extends TextView {
    public float f26082a;
    public boolean f26083b;
    public final Paint f26084c;

    public em(Context context, Paint paint) {
        super(context);
        this.f26084c = paint;
        this.f26082a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f26082a * 130.0f) + 125.0f);
        Paint paint = this.f26084c;
        paint.setAlpha(i10);
        if (!this.f26083b) {
            float f7 = this.f26082a - 0.026666667f;
            this.f26082a = f7;
            if (f7 <= 0.0f) {
                this.f26082a = 0.0f;
                this.f26083b = true;
            }
        } else {
            float f10 = this.f26082a + 0.026666667f;
            this.f26082a = f10;
            if (f10 >= 1.0f) {
                this.f26082a = 1.0f;
                this.f26083b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
