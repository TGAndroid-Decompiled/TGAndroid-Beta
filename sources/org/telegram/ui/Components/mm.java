package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class mm extends TextView {
    public float f28565a;
    public boolean f28566b;
    public final Paint f28567c;

    public mm(Context context, Paint paint) {
        super(context);
        this.f28567c = paint;
        this.f28565a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f28565a * 130.0f) + 125.0f);
        Paint paint = this.f28567c;
        paint.setAlpha(i10);
        if (!this.f28566b) {
            float f7 = this.f28565a - 0.026666667f;
            this.f28565a = f7;
            if (f7 <= 0.0f) {
                this.f28565a = 0.0f;
                this.f28566b = true;
            }
        } else {
            float f10 = this.f28565a + 0.026666667f;
            this.f28565a = f10;
            if (f10 >= 1.0f) {
                this.f28565a = 1.0f;
                this.f28566b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
