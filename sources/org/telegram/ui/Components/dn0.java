package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
public final class dn0 extends FrameLayout {
    public final Paint f27567a;
    public final r50 f27568b;
    public final RectF f27569c;
    public final float d;
    public float e;

    public dn0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f27567a = paint;
        r50 r50Var = new r50(this, 1);
        this.f27568b = r50Var;
        this.f27569c = new RectF();
        this.d = (AndroidUtilities.dp(3.0f) * 0.5f) + AndroidUtilities.dp(5.0f);
        a(paint, 0.2f);
        a(r50Var, 1.0f);
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
        RectF rectF = this.f27569c;
        rectF.set(f7, f7, getWidth() - f7, getHeight() - f7);
        canvas.drawOval(rectF, this.f27567a);
        canvas.drawArc(rectF, -90.0f, this.e * 360.0f, false, this.f27568b);
    }

    public Paint getPaint() {
        return this.f27568b;
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
