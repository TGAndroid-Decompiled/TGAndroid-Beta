package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class bm extends TextView {
    public float f22823a;
    public boolean f22824b;
    public final Paint f22825c;

    public bm(Context context, Paint paint) {
        super(context);
        this.f22825c = paint;
        this.f22823a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f22823a * 130.0f) + 125.0f);
        Paint paint = this.f22825c;
        paint.setAlpha(i10);
        if (!this.f22824b) {
            float f7 = this.f22823a - 0.026666667f;
            this.f22823a = f7;
            if (f7 <= 0.0f) {
                this.f22823a = 0.0f;
                this.f22824b = true;
            }
        } else {
            float f10 = this.f22823a + 0.026666667f;
            this.f22823a = f10;
            if (f10 >= 1.0f) {
                this.f22823a = 1.0f;
                this.f22824b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
