package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class dm extends TextView {
    public float f23691a;
    public boolean f23692b;
    public final Paint f23693c;

    public dm(Context context, Paint paint) {
        super(context);
        this.f23693c = paint;
        this.f23691a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f23691a * 130.0f) + 125.0f);
        Paint paint = this.f23693c;
        paint.setAlpha(i10);
        if (!this.f23692b) {
            float f7 = this.f23691a - 0.026666667f;
            this.f23691a = f7;
            if (f7 <= 0.0f) {
                this.f23691a = 0.0f;
                this.f23692b = true;
            }
        } else {
            float f10 = this.f23691a + 0.026666667f;
            this.f23691a = f10;
            if (f10 >= 1.0f) {
                this.f23691a = 1.0f;
                this.f23692b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
