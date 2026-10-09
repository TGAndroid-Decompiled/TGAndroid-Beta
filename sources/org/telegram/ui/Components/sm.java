package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class sm extends TextView {
    public float f30842a;
    public boolean f30843b;
    public final Paint f30844c;

    public sm(Context context, Paint paint) {
        super(context);
        this.f30844c = paint;
        this.f30842a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f30842a * 130.0f) + 125.0f);
        Paint paint = this.f30844c;
        paint.setAlpha(i10);
        if (!this.f30843b) {
            float f7 = this.f30842a - 0.026666667f;
            this.f30842a = f7;
            if (f7 <= 0.0f) {
                this.f30842a = 0.0f;
                this.f30843b = true;
            }
        } else {
            float f10 = this.f30842a + 0.026666667f;
            this.f30842a = f10;
            if (f10 >= 1.0f) {
                this.f30842a = 1.0f;
                this.f30843b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
