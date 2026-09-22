package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class bm extends TextView {
    public float f23036a;
    public boolean f23037b;
    public final Paint f23038c;

    public bm(Context context, Paint paint) {
        super(context);
        this.f23038c = paint;
        this.f23036a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f23036a * 130.0f) + 125.0f);
        Paint paint = this.f23038c;
        paint.setAlpha(i10);
        if (!this.f23037b) {
            float f7 = this.f23036a - 0.026666667f;
            this.f23036a = f7;
            if (f7 <= 0.0f) {
                this.f23036a = 0.0f;
                this.f23037b = true;
            }
        } else {
            float f10 = this.f23036a + 0.026666667f;
            this.f23036a = f10;
            if (f10 >= 1.0f) {
                this.f23036a = 1.0f;
                this.f23037b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
