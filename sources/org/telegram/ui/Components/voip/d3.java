package org.telegram.ui.Components.voip;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
public final class d3 extends ph.f3 {
    public final Paint I0;
    public final n1 J0;

    public d3(Activity activity, int i10, n1 n1Var, boolean z4) {
        super(activity, i10);
        Paint paint = new Paint(1);
        this.I0 = paint;
        this.J0 = n1Var;
        n1Var.a(this);
        paint.setPathEffect(new CornerPathEffect(this.v));
        if (z4) {
            i();
        }
    }

    @Override
    public final void c(Canvas canvas, float f10) {
        n1 n1Var = this.J0;
        Shader shader = n1Var.b().getShader();
        Paint paint = this.I0;
        paint.setShader(shader);
        canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (int) (Math.min(this.C.getAlpha(), n1Var.b().getAlpha()) * f10), 31);
        Path path = this.f41670q0;
        canvas.drawPath(path, paint);
        if (n1Var.e) {
            paint.setShader(((Paint) n1Var.d.f142a).getShader());
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
