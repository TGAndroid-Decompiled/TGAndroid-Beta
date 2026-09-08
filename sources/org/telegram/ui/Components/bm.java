package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class bm extends TextView {
    public float f24771a;
    public boolean f24772b;
    public final Paint f24773c;

    public bm(Context context, Paint paint) {
        super(context);
        this.f24773c = paint;
        this.f24771a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f24771a * 130.0f) + 125.0f);
        Paint paint = this.f24773c;
        paint.setAlpha(i10);
        if (!this.f24772b) {
            float f7 = this.f24771a - 0.026666667f;
            this.f24771a = f7;
            if (f7 <= 0.0f) {
                this.f24771a = 0.0f;
                this.f24772b = true;
            }
        } else {
            float f10 = this.f24771a + 0.026666667f;
            this.f24771a = f10;
            if (f10 >= 1.0f) {
                this.f24771a = 1.0f;
                this.f24772b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
