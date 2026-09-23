package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class cm extends TextView {
    public float f23070a;
    public boolean f23071b;
    public final Paint f23072c;

    public cm(Context context, Paint paint) {
        super(context);
        this.f23072c = paint;
        this.f23070a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f23070a * 130.0f) + 125.0f);
        Paint paint = this.f23072c;
        paint.setAlpha(i10);
        if (!this.f23071b) {
            float f7 = this.f23070a - 0.026666667f;
            this.f23070a = f7;
            if (f7 <= 0.0f) {
                this.f23070a = 0.0f;
                this.f23071b = true;
            }
        } else {
            float f10 = this.f23070a + 0.026666667f;
            this.f23070a = f10;
            if (f10 >= 1.0f) {
                this.f23070a = 1.0f;
                this.f23071b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
