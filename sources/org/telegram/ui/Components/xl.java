package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class xl extends TextView {
    public float f30656a;
    public boolean f30657b;
    public final Paint f30658c;

    public xl(Context context, Paint paint) {
        super(context);
        this.f30658c = paint;
        this.f30656a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f30656a * 130.0f) + 125.0f);
        Paint paint = this.f30658c;
        paint.setAlpha(i10);
        if (!this.f30657b) {
            float f10 = this.f30656a - 0.026666667f;
            this.f30656a = f10;
            if (f10 <= 0.0f) {
                this.f30656a = 0.0f;
                this.f30657b = true;
            }
        } else {
            float f11 = this.f30656a + 0.026666667f;
            this.f30656a = f11;
            if (f11 >= 1.0f) {
                this.f30656a = 1.0f;
                this.f30657b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
