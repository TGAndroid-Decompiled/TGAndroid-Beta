package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class in0 extends FrameLayout {
    public final Paint f27237a;
    public final a60 f27238b;
    public final RectF f27239c;
    public final float d;
    public float f27240e;

    public in0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f27237a = paint;
        a60 a60Var = new a60(this, 1);
        this.f27238b = a60Var;
        this.f27239c = new RectF();
        this.d = (AndroidUtilities.dp(3.0f) * 0.5f) + AndroidUtilities.dp(5.0f);
        a(paint, 0.2f);
        a(a60Var, 1.0f);
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
        RectF rectF = this.f27239c;
        rectF.set(f7, f7, getWidth() - f7, getHeight() - f7);
        canvas.drawOval(rectF, this.f27237a);
        canvas.drawArc(rectF, -90.0f, this.f27240e * 360.0f, false, this.f27238b);
    }

    public Paint getPaint() {
        return this.f27238b;
    }

    public void setProgress(float f7) {
        float max = Math.max(0.0f, Math.min(1.0f, f7));
        if (this.f27240e == max) {
            return;
        }
        this.f27240e = max;
        invalidate();
    }
}
