package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class nm extends TextView {
    public float f30955a;
    public boolean f30956b;
    public final Paint f30957c;

    public nm(Context context, Paint paint) {
        super(context);
        this.f30957c = paint;
        this.f30955a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f30955a * 130.0f) + 125.0f);
        Paint paint = this.f30957c;
        paint.setAlpha(i10);
        if (!this.f30956b) {
            float f7 = this.f30955a - 0.026666667f;
            this.f30955a = f7;
            if (f7 <= 0.0f) {
                this.f30955a = 0.0f;
                this.f30956b = true;
            }
        } else {
            float f10 = this.f30955a + 0.026666667f;
            this.f30955a = f10;
            if (f10 >= 1.0f) {
                this.f30955a = 1.0f;
                this.f30956b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
