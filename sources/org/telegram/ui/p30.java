package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
public final class p30 extends ps0 {
    public final a50 T;

    public p30(a50 a50Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = a50Var;
    }

    @Override
    public final void c(Canvas canvas, float f7, float f10, float f11, float f12, float f13) {
        a50 a50Var = this.T;
        z20 z20Var = a50Var.f35610i1;
        a30 a30Var = a50Var.f35665t4;
        if (f7 > 0.0f) {
            float x10 = a50Var.f21587b.getX() + a30Var.getX();
            float y3 = a50Var.f21587b.getY() + a30Var.getY();
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(x10, y3, z20Var.getMeasuredWidth() + x10, z20Var.getMeasuredHeight() + y3);
            canvas.saveLayerAlpha(rectF, (int) (f7 * 255.0f), 31);
            canvas.translate(x10, y3);
            a30Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void e() {
        z20 z20Var = this.T.f35610i1;
        super.e();
        for (int i10 = 0; i10 < z20Var.getChildCount(); i10++) {
            z20Var.getChildAt(i10).invalidate();
        }
    }
}
