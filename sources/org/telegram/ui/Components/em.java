package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class em extends TextView {
    public float f26157a;
    public boolean f26158b;
    public final Paint f26159c;

    public em(Context context, Paint paint) {
        super(context);
        this.f26159c = paint;
        this.f26157a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f26157a * 130.0f) + 125.0f);
        Paint paint = this.f26159c;
        paint.setAlpha(i10);
        if (!this.f26158b) {
            float f7 = this.f26157a - 0.026666667f;
            this.f26157a = f7;
            if (f7 <= 0.0f) {
                this.f26157a = 0.0f;
                this.f26158b = true;
            }
        } else {
            float f10 = this.f26157a + 0.026666667f;
            this.f26157a = f10;
            if (f10 >= 1.0f) {
                this.f26157a = 1.0f;
                this.f26158b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
