package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class cn0 extends FrameLayout {
    public final Paint f25442a;
    public final x50 f25443b;
    public final RectF f25444c;
    public final float d;
    public float f25445e;

    public cn0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f25442a = paint;
        x50 x50Var = new x50(this, 1);
        this.f25443b = x50Var;
        this.f25444c = new RectF();
        this.d = (AndroidUtilities.dp(3.0f) * 0.5f) + AndroidUtilities.dp(5.0f);
        a(paint, 0.2f);
        a(x50Var, 1.0f);
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
        RectF rectF = this.f25444c;
        rectF.set(f7, f7, getWidth() - f7, getHeight() - f7);
        canvas.drawOval(rectF, this.f25442a);
        canvas.drawArc(rectF, -90.0f, this.f25445e * 360.0f, false, this.f25443b);
    }

    public Paint getPaint() {
        return this.f25443b;
    }

    public void setProgress(float f7) {
        float max = Math.max(0.0f, Math.min(1.0f, f7));
        if (this.f25445e == max) {
            return;
        }
        this.f25445e = max;
        invalidate();
    }
}
