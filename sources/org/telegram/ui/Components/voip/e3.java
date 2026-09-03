package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
public final class e3 extends qh.e3 {
    public final Paint I0;
    public final o1 J0;

    public e3(Activity activity, int i10, o1 o1Var, boolean z4) {
        super(activity, i10);
        Paint paint = new Paint(1);
        this.I0 = paint;
        this.J0 = o1Var;
        o1Var.a(this);
        paint.setPathEffect(new CornerPathEffect(this.v));
        if (z4) {
            i();
        }
    }

    @Override
    public final void c(Canvas canvas, float f10) {
        o1 o1Var = this.J0;
        Shader shader = o1Var.b().getShader();
        Paint paint = this.I0;
        paint.setShader(shader);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (Math.min(this.C.getAlpha(), o1Var.b().getAlpha()) * f10), 31);
        Path path = this.f45280q0;
        canvas.drawPath(path, paint);
        if (o1Var.f32235e) {
            paint.setShader(((Paint) o1Var.d.f155a).getShader());
            canvas.drawPath(path, paint);
        }
        canvas.restore();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        this.J0.d(getX(), getY());
        super.dispatchDraw(canvas);
    }
}
