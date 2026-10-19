package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class mm extends TextView {
    public float f28563a;
    public boolean f28564b;
    public final Paint f28565c;

    public mm(Context context, Paint paint) {
        super(context);
        this.f28565c = paint;
        this.f28563a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f28563a * 130.0f) + 125.0f);
        Paint paint = this.f28565c;
        paint.setAlpha(i10);
        if (!this.f28564b) {
            float f7 = this.f28563a - 0.026666667f;
            this.f28563a = f7;
            if (f7 <= 0.0f) {
                this.f28563a = 0.0f;
                this.f28564b = true;
            }
        } else {
            float f10 = this.f28563a + 0.026666667f;
            this.f28563a = f10;
            if (f10 >= 1.0f) {
                this.f28563a = 1.0f;
                this.f28564b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
