package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class zl extends TextView {
    public float f33908a;
    public boolean f33909b;
    public final Paint f33910c;

    public zl(Context context, Paint paint) {
        super(context);
        this.f33910c = paint;
        this.f33908a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f33908a * 130.0f) + 125.0f);
        Paint paint = this.f33910c;
        paint.setAlpha(i10);
        if (!this.f33909b) {
            float f10 = this.f33908a - 0.026666667f;
            this.f33908a = f10;
            if (f10 <= 0.0f) {
                this.f33908a = 0.0f;
                this.f33909b = true;
            }
        } else {
            float f11 = this.f33908a + 0.026666667f;
            this.f33908a = f11;
            if (f11 >= 1.0f) {
                this.f33908a = 1.0f;
                this.f33909b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
