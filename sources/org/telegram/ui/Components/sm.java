package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class sm extends TextView {
    public float f30818a;
    public boolean f30819b;
    public final Paint f30820c;

    public sm(Context context, Paint paint) {
        super(context);
        this.f30820c = paint;
        this.f30818a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f30818a * 130.0f) + 125.0f);
        Paint paint = this.f30820c;
        paint.setAlpha(i10);
        if (!this.f30819b) {
            float f7 = this.f30818a - 0.026666667f;
            this.f30818a = f7;
            if (f7 <= 0.0f) {
                this.f30818a = 0.0f;
                this.f30819b = true;
            }
        } else {
            float f10 = this.f30818a + 0.026666667f;
            this.f30818a = f10;
            if (f10 >= 1.0f) {
                this.f30818a = 1.0f;
                this.f30819b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
