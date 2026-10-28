package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class g40 extends ev0 {
    public final x50 T;

    public g40(x50 x50Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = x50Var;
    }

    @Override
    public final void c(Canvas canvas, float f7, float f10, float f11, float f12, float f13) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        x50 x50Var = this.T;
        q30 q30Var = x50Var.f45493b;
        r30 r30Var = x50Var.C2;
        if (f7 > 0.0f) {
            float x9 = r30Var.getX();
            viewGroup = ((org.telegram.ui.ActionBar.k3) x50Var).containerView;
            float x10 = viewGroup.getX() + x9;
            float y3 = r30Var.getY();
            viewGroup2 = ((org.telegram.ui.ActionBar.k3) x50Var).containerView;
            float y10 = viewGroup2.getY() + y3;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(x10, y10, q30Var.getMeasuredWidth() + x10, q30Var.getMeasuredHeight() + y10);
            canvas.saveLayerAlpha(rectF, (int) (f7 * 255.0f), 31);
            canvas.translate(x10, y10);
            r30Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void e() {
        q30 q30Var = this.T.f45493b;
        super.e();
        for (int i10 = 0; i10 < q30Var.getChildCount(); i10++) {
            q30Var.getChildAt(i10).invalidate();
        }
    }
}
