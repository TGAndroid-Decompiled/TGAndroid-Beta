package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class dn0 extends FrameLayout {
    public final Paint f25848a;
    public final y50 f25849b;
    public final RectF f25850c;
    public final float d;
    public float f25851e;

    public dn0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f25848a = paint;
        y50 y50Var = new y50(this, 1);
        this.f25849b = y50Var;
        this.f25850c = new RectF();
        this.d = (AndroidUtilities.dp(3.0f) * 0.5f) + AndroidUtilities.dp(5.0f);
        a(paint, 0.2f);
        a(y50Var, 1.0f);
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
        RectF rectF = this.f25850c;
        rectF.set(f7, f7, getWidth() - f7, getHeight() - f7);
        canvas.drawOval(rectF, this.f25848a);
        canvas.drawArc(rectF, -90.0f, this.f25851e * 360.0f, false, this.f25849b);
    }

    public Paint getPaint() {
        return this.f25849b;
    }

    public void setProgress(float f7) {
        float max = Math.max(0.0f, Math.min(1.0f, f7));
        if (this.f25851e == max) {
            return;
        }
        this.f25851e = max;
        invalidate();
    }
}
