package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

public final class b40 extends ou0 {
    public final s50 T;

    public b40(s50 s50Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = s50Var;
    }

    @Override
    public final void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
        s50 s50Var = this.T;
        l30 l30Var = s50Var.f42412b;
        m30 m30Var = s50Var.f42514y2;
        if (f10 > 0.0f) {
            float x8 = ((org.telegram.ui.ActionBar.e3) s50Var).containerView.getX() + m30Var.getX();
            float y10 = ((org.telegram.ui.ActionBar.e3) s50Var).containerView.getY() + m30Var.getY();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(x8, y10, l30Var.getMeasuredWidth() + x8, l30Var.getMeasuredHeight() + y10);
            canvas.saveLayerAlpha(rectF, (int) (f10 * 255.0f), 31);
            canvas.translate(x8, y10);
            m30Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void e() {
        l30 l30Var = this.T.f42412b;
        super.e();
        for (int i10 = 0; i10 < l30Var.getChildCount(); i10++) {
            l30Var.getChildAt(i10).invalidate();
        }
    }
}
