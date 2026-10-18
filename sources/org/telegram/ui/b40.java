package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class b40 extends xu0 {
    public final s50 T;

    public b40(s50 s50Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = s50Var;
    }

    @Override
    public final void c(Canvas canvas, float f7, float f10, float f11, float f12, float f13) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        s50 s50Var = this.T;
        l30 l30Var = s50Var.f40898b;
        m30 m30Var = s50Var.C2;
        if (f7 > 0.0f) {
            float x10 = m30Var.getX();
            viewGroup = ((org.telegram.ui.ActionBar.f3) s50Var).containerView;
            float x11 = viewGroup.getX() + x10;
            float y3 = m30Var.getY();
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) s50Var).containerView;
            float y10 = viewGroup2.getY() + y3;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(x11, y10, l30Var.getMeasuredWidth() + x11, l30Var.getMeasuredHeight() + y10);
            canvas.saveLayerAlpha(rectF, (int) (f7 * 255.0f), 31);
            canvas.translate(x11, y10);
            m30Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void e() {
        l30 l30Var = this.T.f40898b;
        super.e();
        for (int i10 = 0; i10 < l30Var.getChildCount(); i10++) {
            l30Var.getChildAt(i10).invalidate();
        }
    }
}
