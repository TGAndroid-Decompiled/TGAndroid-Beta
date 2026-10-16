package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class om extends TextView {
    public float f27676a;
    public boolean f27677b;
    public final Paint f27678c;

    public om(Context context, Paint paint) {
        super(context);
        this.f27678c = paint;
        this.f27676a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f27676a * 130.0f) + 125.0f);
        Paint paint = this.f27678c;
        paint.setAlpha(i10);
        if (!this.f27677b) {
            float f7 = this.f27676a - 0.026666667f;
            this.f27676a = f7;
            if (f7 <= 0.0f) {
                this.f27676a = 0.0f;
                this.f27677b = true;
            }
        } else {
            float f10 = this.f27676a + 0.026666667f;
            this.f27676a = f10;
            if (f10 >= 1.0f) {
                this.f27676a = 1.0f;
                this.f27677b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
