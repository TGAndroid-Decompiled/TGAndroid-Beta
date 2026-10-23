package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class mm extends TextView {
    public float f28555a;
    public boolean f28556b;
    public final Paint f28557c;

    public mm(Context context, Paint paint) {
        super(context);
        this.f28557c = paint;
        this.f28555a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f28555a * 130.0f) + 125.0f);
        Paint paint = this.f28557c;
        paint.setAlpha(i10);
        if (!this.f28556b) {
            float f7 = this.f28555a - 0.026666667f;
            this.f28555a = f7;
            if (f7 <= 0.0f) {
                this.f28555a = 0.0f;
                this.f28556b = true;
            }
        } else {
            float f10 = this.f28555a + 0.026666667f;
            this.f28555a = f10;
            if (f10 >= 1.0f) {
                this.f28555a = 1.0f;
                this.f28556b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
