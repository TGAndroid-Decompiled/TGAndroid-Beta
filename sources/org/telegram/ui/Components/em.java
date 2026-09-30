package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class em extends TextView {
    public float f24009a;
    public boolean f24010b;
    public final Paint f24011c;

    public em(Context context, Paint paint) {
        super(context);
        this.f24011c = paint;
        this.f24009a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f24009a * 130.0f) + 125.0f);
        Paint paint = this.f24011c;
        paint.setAlpha(i10);
        if (!this.f24010b) {
            float f7 = this.f24009a - 0.026666667f;
            this.f24009a = f7;
            if (f7 <= 0.0f) {
                this.f24009a = 0.0f;
                this.f24010b = true;
            }
        } else {
            float f10 = this.f24009a + 0.026666667f;
            this.f24009a = f10;
            if (f10 >= 1.0f) {
                this.f24009a = 1.0f;
                this.f24010b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
