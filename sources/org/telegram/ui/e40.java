package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class e40 extends cv0 {
    public final v50 T;

    public e40(v50 v50Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = v50Var;
    }

    @Override
    public final void c(Canvas canvas, float f7, float f10, float f11, float f12, float f13) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        v50 v50Var = this.T;
        o30 o30Var = v50Var.f44612b;
        p30 p30Var = v50Var.C2;
        if (f7 > 0.0f) {
            float x9 = p30Var.getX();
            viewGroup = ((org.telegram.ui.ActionBar.k3) v50Var).containerView;
            float x10 = viewGroup.getX() + x9;
            float y3 = p30Var.getY();
            viewGroup2 = ((org.telegram.ui.ActionBar.k3) v50Var).containerView;
            float y10 = viewGroup2.getY() + y3;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(x10, y10, o30Var.getMeasuredWidth() + x10, o30Var.getMeasuredHeight() + y10);
            canvas.saveLayerAlpha(rectF, (int) (f7 * 255.0f), 31);
            canvas.translate(x10, y10);
            p30Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void e() {
        o30 o30Var = this.T.f44612b;
        super.e();
        for (int i10 = 0; i10 < o30Var.getChildCount(); i10++) {
            o30Var.getChildAt(i10).invalidate();
        }
    }
}
