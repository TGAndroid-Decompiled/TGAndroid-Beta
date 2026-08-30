package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class yl extends TextView {
    public float f31041a;
    public boolean f31042b;
    public final Paint f31043c;

    public yl(Context context, Paint paint) {
        super(context);
        this.f31043c = paint;
        this.f31041a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f31041a * 130.0f) + 125.0f);
        Paint paint = this.f31043c;
        paint.setAlpha(i10);
        if (!this.f31042b) {
            float f10 = this.f31041a - 0.026666667f;
            this.f31041a = f10;
            if (f10 <= 0.0f) {
                this.f31041a = 0.0f;
                this.f31042b = true;
            }
        } else {
            float f11 = this.f31041a + 0.026666667f;
            this.f31041a = f11;
            if (f11 >= 1.0f) {
                this.f31041a = 1.0f;
                this.f31042b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
