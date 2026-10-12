package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class um extends TextView {
    public float f31194a;
    public boolean f31195b;
    public final Paint f31196c;

    public um(Context context, Paint paint) {
        super(context);
        this.f31196c = paint;
        this.f31194a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f31194a * 130.0f) + 125.0f);
        Paint paint = this.f31196c;
        paint.setAlpha(i10);
        if (!this.f31195b) {
            float f7 = this.f31194a - 0.026666667f;
            this.f31194a = f7;
            if (f7 <= 0.0f) {
                this.f31194a = 0.0f;
                this.f31195b = true;
            }
        } else {
            float f10 = this.f31194a + 0.026666667f;
            this.f31194a = f10;
            if (f10 >= 1.0f) {
                this.f31194a = 1.0f;
                this.f31195b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
