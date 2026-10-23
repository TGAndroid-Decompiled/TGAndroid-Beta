package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class c40 extends yu0 {
    public final u50 T;

    public c40(u50 u50Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = u50Var;
    }

    @Override
    public final void c(Canvas canvas, float f7, float f10, float f11, float f12, float f13) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        u50 u50Var = this.T;
        m30 m30Var = u50Var.f42173b;
        n30 n30Var = u50Var.C2;
        if (f7 > 0.0f) {
            float x10 = n30Var.getX();
            viewGroup = ((org.telegram.ui.ActionBar.h3) u50Var).containerView;
            float x11 = viewGroup.getX() + x10;
            float y3 = n30Var.getY();
            viewGroup2 = ((org.telegram.ui.ActionBar.h3) u50Var).containerView;
            float y10 = viewGroup2.getY() + y3;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(x11, y10, m30Var.getMeasuredWidth() + x11, m30Var.getMeasuredHeight() + y10);
            canvas.saveLayerAlpha(rectF, (int) (f7 * 255.0f), 31);
            canvas.translate(x11, y10);
            n30Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void e() {
        m30 m30Var = this.T.f42173b;
        super.e();
        for (int i10 = 0; i10 < m30Var.getChildCount(); i10++) {
            m30Var.getChildAt(i10).invalidate();
        }
    }
}
