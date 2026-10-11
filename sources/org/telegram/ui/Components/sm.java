package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class sm extends TextView {
    public float f30898a;
    public boolean f30899b;
    public final Paint f30900c;

    public sm(Context context, Paint paint) {
        super(context);
        this.f30900c = paint;
        this.f30898a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f30898a * 130.0f) + 125.0f);
        Paint paint = this.f30900c;
        paint.setAlpha(i10);
        if (!this.f30899b) {
            float f7 = this.f30898a - 0.026666667f;
            this.f30898a = f7;
            if (f7 <= 0.0f) {
                this.f30898a = 0.0f;
                this.f30899b = true;
            }
        } else {
            float f10 = this.f30898a + 0.026666667f;
            this.f30898a = f10;
            if (f10 >= 1.0f) {
                this.f30898a = 1.0f;
                this.f30899b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
