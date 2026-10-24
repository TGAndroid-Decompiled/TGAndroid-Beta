package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class km extends TextView {
    public float f28035a;
    public boolean f28036b;
    public final Paint f28037c;

    public km(Context context, Paint paint) {
        super(context);
        this.f28037c = paint;
        this.f28035a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f28035a * 130.0f) + 125.0f);
        Paint paint = this.f28037c;
        paint.setAlpha(i10);
        if (!this.f28036b) {
            float f7 = this.f28035a - 0.026666667f;
            this.f28035a = f7;
            if (f7 <= 0.0f) {
                this.f28035a = 0.0f;
                this.f28036b = true;
            }
        } else {
            float f10 = this.f28035a + 0.026666667f;
            this.f28035a = f10;
            if (f10 >= 1.0f) {
                this.f28035a = 1.0f;
                this.f28036b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
