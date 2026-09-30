package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class lm0 extends FrameLayout {
    public final Paint f26055a;
    public final j50 f26056b;
    public final RectF f26057c;
    public final float d;
    public float e;

    public lm0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f26055a = paint;
        j50 j50Var = new j50(this, 1);
        this.f26056b = j50Var;
        this.f26057c = new RectF();
        this.d = (AndroidUtilities.dp(3.0f) * 0.5f) + AndroidUtilities.dp(5.0f);
        a(paint, 0.2f);
        a(j50Var, 1.0f);
        setWillNotDraw(false);
    }

    public static void a(Paint paint, float f7) {
        paint.setColor(-1);
        paint.setAlpha(Math.round(f7 * 255.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(3.0f));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float f7 = this.d;
        RectF rectF = this.f26057c;
        rectF.set(f7, f7, getWidth() - f7, getHeight() - f7);
        canvas.drawOval(rectF, this.f26055a);
        canvas.drawArc(rectF, -90.0f, this.e * 360.0f, false, this.f26056b);
    }

    public Paint getPaint() {
        return this.f26056b;
    }

    public void setProgress(float f7) {
        float max = Math.max(0.0f, Math.min(1.0f, f7));
        if (this.e == max) {
            return;
        }
        this.e = max;
        invalidate();
    }
}
