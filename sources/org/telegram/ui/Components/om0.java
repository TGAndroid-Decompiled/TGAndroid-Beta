package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class om0 extends FrameLayout {
    public final Paint f29506a;
    public final j50 f29507b;
    public final RectF f29508c;
    public final float d;
    public float f29509e;

    public om0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f29506a = paint;
        j50 j50Var = new j50(this, 1);
        this.f29507b = j50Var;
        this.f29508c = new RectF();
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
        RectF rectF = this.f29508c;
        rectF.set(f7, f7, getWidth() - f7, getHeight() - f7);
        canvas.drawOval(rectF, this.f29506a);
        canvas.drawArc(rectF, -90.0f, this.f29509e * 360.0f, false, this.f29507b);
    }

    public Paint getPaint() {
        return this.f29507b;
    }

    public void setProgress(float f7) {
        float max = Math.max(0.0f, Math.min(1.0f, f7));
        if (this.f29509e == max) {
            return;
        }
        this.f29509e = max;
        invalidate();
    }
}
