package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class cm extends TextView {
    public float f23356a;
    public boolean f23357b;
    public final Paint f23358c;

    public cm(Context context, Paint paint) {
        super(context);
        this.f23358c = paint;
        this.f23356a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f23356a * 130.0f) + 125.0f);
        Paint paint = this.f23358c;
        paint.setAlpha(i10);
        if (!this.f23357b) {
            float f7 = this.f23356a - 0.026666667f;
            this.f23356a = f7;
            if (f7 <= 0.0f) {
                this.f23356a = 0.0f;
                this.f23357b = true;
            }
        } else {
            float f10 = this.f23356a + 0.026666667f;
            this.f23356a = f10;
            if (f10 >= 1.0f) {
                this.f23356a = 1.0f;
                this.f23357b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
