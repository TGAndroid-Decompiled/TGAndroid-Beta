package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class sl extends TextView {
    public float f32489a;
    public boolean f32490b;
    public final Paint f32491c;

    public sl(Context context, Paint paint) {
        super(context);
        this.f32491c = paint;
        this.f32489a = 0.0f;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i9 = (int) ((this.f32489a * 130.0f) + 125.0f);
        Paint paint = this.f32491c;
        paint.setAlpha(i9);
        if (!this.f32490b) {
            float f10 = this.f32489a - 0.026666667f;
            this.f32489a = f10;
            if (f10 <= 0.0f) {
                this.f32489a = 0.0f;
                this.f32490b = true;
            }
        } else {
            float f11 = this.f32489a + 0.026666667f;
            this.f32489a = f11;
            if (f11 >= 1.0f) {
                this.f32489a = 1.0f;
                this.f32490b = false;
            }
        }
        super.onDraw(canvas);
        canvas.drawCircle(AndroidUtilities.dp(14.0f), getMeasuredHeight() / 2, AndroidUtilities.dp(4.0f), paint);
        invalidate();
    }
}
