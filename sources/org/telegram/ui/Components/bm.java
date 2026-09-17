package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class bm extends TextView {
    public float f22762a;
    public boolean f22763b;
    public final Paint f22764c;

    public bm(Context context, Paint paint) {
        super(context);
        this.f22764c = paint;
        this.f22762a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f22762a * 130.0f) + 125.0f);
        Paint paint = this.f22764c;
        paint.setAlpha(i10);
        if (!this.f22763b) {
            float f7 = this.f22762a - 0.026666667f;
            this.f22762a = f7;
            if (f7 <= 0.0f) {
                this.f22762a = 0.0f;
                this.f22763b = true;
            }
        } else {
            float f10 = this.f22762a + 0.026666667f;
            this.f22762a = f10;
            if (f10 >= 1.0f) {
                this.f22762a = 1.0f;
                this.f22763b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
