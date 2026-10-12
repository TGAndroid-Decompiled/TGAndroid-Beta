package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class pm extends TextView {
    public float f28367a;
    public boolean f28368b;
    public final Paint f28369c;

    public pm(Context context, Paint paint) {
        super(context);
        this.f28369c = paint;
        this.f28367a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f28367a * 130.0f) + 125.0f);
        Paint paint = this.f28369c;
        paint.setAlpha(i10);
        if (!this.f28368b) {
            float f7 = this.f28367a - 0.026666667f;
            this.f28367a = f7;
            if (f7 <= 0.0f) {
                this.f28367a = 0.0f;
                this.f28368b = true;
            }
        } else {
            float f10 = this.f28367a + 0.026666667f;
            this.f28367a = f10;
            if (f10 >= 1.0f) {
                this.f28367a = 1.0f;
                this.f28368b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
