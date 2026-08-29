package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import nh.t3;
public final class f3 extends t3 {
    public final Paint H0;
    public final o1 I0;

    public f3(Activity activity, int i10, o1 o1Var, boolean z10) {
        super(activity, i10);
        Paint paint = new Paint(1);
        this.H0 = paint;
        this.I0 = o1Var;
        o1Var.a(this);
        paint.setPathEffect(new CornerPathEffect(this.v));
        if (z10) {
            i();
        }
    }

    @Override
    public final void c(Canvas canvas, float f9) {
        o1 o1Var = this.I0;
        Shader shader = o1Var.b().getShader();
        Paint paint = this.H0;
        paint.setShader(shader);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (Math.min(this.B.getAlpha(), o1Var.b().getAlpha()) * f9), 31);
        Path path = this.f18605p0;
        canvas.drawPath(path, paint);
        if (o1Var.f33886e) {
            paint.setShader(((Paint) o1Var.d.d).getShader());
            canvas.drawPath(path, paint);
        }
        canvas.restore();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        this.I0.d(getX(), getY());
        super.dispatchDraw(canvas);
    }
}
