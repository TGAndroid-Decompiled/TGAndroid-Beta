package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class cm extends TextView {
    public float f23355a;
    public boolean f23356b;
    public final Paint f23357c;

    public cm(Context context, Paint paint) {
        super(context);
        this.f23357c = paint;
        this.f23355a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f23355a * 130.0f) + 125.0f);
        Paint paint = this.f23357c;
        paint.setAlpha(i10);
        if (!this.f23356b) {
            float f7 = this.f23355a - 0.026666667f;
            this.f23355a = f7;
            if (f7 <= 0.0f) {
                this.f23355a = 0.0f;
                this.f23356b = true;
            }
        } else {
            float f10 = this.f23355a + 0.026666667f;
            this.f23355a = f10;
            if (f10 >= 1.0f) {
                this.f23355a = 1.0f;
                this.f23356b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
