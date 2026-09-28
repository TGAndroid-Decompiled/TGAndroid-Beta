package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class dm extends TextView {
    public float f23690a;
    public boolean f23691b;
    public final Paint f23692c;

    public dm(Context context, Paint paint) {
        super(context);
        this.f23692c = paint;
        this.f23690a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f23690a * 130.0f) + 125.0f);
        Paint paint = this.f23692c;
        paint.setAlpha(i10);
        if (!this.f23691b) {
            float f7 = this.f23690a - 0.026666667f;
            this.f23690a = f7;
            if (f7 <= 0.0f) {
                this.f23690a = 0.0f;
                this.f23691b = true;
            }
        } else {
            float f10 = this.f23690a + 0.026666667f;
            this.f23690a = f10;
            if (f10 >= 1.0f) {
                this.f23690a = 1.0f;
                this.f23691b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
