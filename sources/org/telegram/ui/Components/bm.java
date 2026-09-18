package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class bm extends TextView {
    public float f23037a;
    public boolean f23038b;
    public final Paint f23039c;

    public bm(Context context, Paint paint) {
        super(context);
        this.f23039c = paint;
        this.f23037a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f23037a * 130.0f) + 125.0f);
        Paint paint = this.f23039c;
        paint.setAlpha(i10);
        if (!this.f23038b) {
            float f7 = this.f23037a - 0.026666667f;
            this.f23037a = f7;
            if (f7 <= 0.0f) {
                this.f23037a = 0.0f;
                this.f23038b = true;
            }
        } else {
            float f10 = this.f23037a + 0.026666667f;
            this.f23037a = f10;
            if (f10 >= 1.0f) {
                this.f23037a = 1.0f;
                this.f23038b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
