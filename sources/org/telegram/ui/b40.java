package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class b40 extends lu0 {
    public final r50 T;

    public b40(r50 r50Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = r50Var;
    }

    @Override
    public final void c(Canvas canvas, float f9, float f10, float f11, float f12, float f13) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        r50 r50Var = this.T;
        l30 l30Var = r50Var.f41871b;
        m30 m30Var = r50Var.f41972y2;
        if (f9 > 0.0f) {
            float x4 = m30Var.getX();
            viewGroup = ((org.telegram.ui.ActionBar.f3) r50Var).containerView;
            float x10 = viewGroup.getX() + x4;
            float y8 = m30Var.getY();
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) r50Var).containerView;
            float y10 = viewGroup2.getY() + y8;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(x10, y10, l30Var.getMeasuredWidth() + x10, l30Var.getMeasuredHeight() + y10);
            canvas.saveLayerAlpha(rectF, (int) (f9 * 255.0f), 31);
            canvas.translate(x10, y10);
            m30Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void e() {
        l30 l30Var = this.T.f41871b;
        super.e();
        for (int i10 = 0; i10 < l30Var.getChildCount(); i10++) {
            l30Var.getChildAt(i10).invalidate();
        }
    }
}
