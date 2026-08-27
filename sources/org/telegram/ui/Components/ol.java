package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;

public final class ol extends TextView {

    public float f31345a;

    public boolean f31346b;

    public final Paint f31347c;

    public ol(Context context, Paint paint) {
        super(context);
        this.f31347c = paint;
        this.f31345a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f31345a * 130.0f) + 125.0f);
        Paint paint = this.f31347c;
        paint.setAlpha(i10);
        if (this.f31346b) {
            float f10 = this.f31345a + 0.026666667f;
            this.f31345a = f10;
            if (f10 >= 1.0f) {
                this.f31345a = 1.0f;
                this.f31346b = false;
            }
        } else {
            float f11 = this.f31345a - 0.026666667f;
            this.f31345a = f11;
            if (f11 <= 0.0f) {
                this.f31345a = 0.0f;
                this.f31346b = true;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
