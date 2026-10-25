package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class nm extends TextView {
    public float f31039a;
    public boolean f31040b;
    public final Paint f31041c;

    public nm(Context context, Paint paint) {
        super(context);
        this.f31041c = paint;
        this.f31039a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i10 = (int) ((this.f31039a * 130.0f) + 125.0f);
        Paint paint = this.f31041c;
        paint.setAlpha(i10);
        if (!this.f31040b) {
            float f7 = this.f31039a - 0.026666667f;
            this.f31039a = f7;
            if (f7 <= 0.0f) {
                this.f31039a = 0.0f;
                this.f31040b = true;
            }
        } else {
            float f10 = this.f31039a + 0.026666667f;
            this.f31039a = f10;
            if (f10 >= 1.0f) {
                this.f31039a = 1.0f;
                this.f31040b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
