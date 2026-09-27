package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class km0 extends FrameLayout {
    public final Paint f25793a;
    public final i50 f25794b;
    public final RectF f25795c;
    public final float d;
    public float e;

    public km0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f25793a = paint;
        i50 i50Var = new i50(this, 1);
        this.f25794b = i50Var;
        this.f25795c = new RectF();
        this.d = (AndroidUtilities.dp(3.0f) * 0.5f) + AndroidUtilities.dp(5.0f);
        a(paint, 0.2f);
        a(i50Var, 1.0f);
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
        RectF rectF = this.f25795c;
        rectF.set(f7, f7, getWidth() - f7, getHeight() - f7);
        canvas.drawOval(rectF, this.f25793a);
        canvas.drawArc(rectF, -90.0f, this.e * 360.0f, false, this.f25794b);
    }

    public Paint getPaint() {
        return this.f25794b;
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
