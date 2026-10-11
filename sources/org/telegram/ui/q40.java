package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class q40 extends pv0 {
    public final g60 T;

    public q40(g60 g60Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = g60Var;
    }

    @Override
    public final void c(Canvas canvas, float f7, float f10, float f11, float f12, float f13) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        g60 g60Var = this.T;
        a40 a40Var = g60Var.f37871b;
        b40 b40Var = g60Var.C2;
        if (f7 > 0.0f) {
            float x10 = b40Var.getX();
            viewGroup = ((org.telegram.ui.ActionBar.e3) g60Var).containerView;
            float x11 = viewGroup.getX() + x10;
            float y3 = b40Var.getY();
            viewGroup2 = ((org.telegram.ui.ActionBar.e3) g60Var).containerView;
            float y10 = viewGroup2.getY() + y3;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(x11, y10, a40Var.getMeasuredWidth() + x11, a40Var.getMeasuredHeight() + y10);
            canvas.saveLayerAlpha(rectF, (int) (f7 * 255.0f), 31);
            canvas.translate(x11, y10);
            b40Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void e() {
        a40 a40Var = this.T.f37871b;
        super.e();
        for (int i10 = 0; i10 < a40Var.getChildCount(); i10++) {
            a40Var.getChildAt(i10).invalidate();
        }
    }
}
