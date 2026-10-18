package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class mm extends TextView {
    public float f28557a;
    public boolean f28558b;
    public final Paint f28559c;

    public mm(Context context, Paint paint) {
        super(context);
        this.f28559c = paint;
        this.f28557a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f28557a * 130.0f) + 125.0f);
        Paint paint = this.f28559c;
        paint.setAlpha(i10);
        if (!this.f28558b) {
            float f7 = this.f28557a - 0.026666667f;
            this.f28557a = f7;
            if (f7 <= 0.0f) {
                this.f28557a = 0.0f;
                this.f28558b = true;
            }
        } else {
            float f10 = this.f28557a + 0.026666667f;
            this.f28557a = f10;
            if (f10 >= 1.0f) {
                this.f28557a = 1.0f;
                this.f28558b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
