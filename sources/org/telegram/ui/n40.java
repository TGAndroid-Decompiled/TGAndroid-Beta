package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class n40 extends hv0 {
    public final d60 T;

    public n40(d60 d60Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = d60Var;
    }

    @Override
    public final void c(Canvas canvas, float f7, float f10, float f11, float f12, float f13) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        d60 d60Var = this.T;
        x30 x30Var = d60Var.f32938b;
        y30 y30Var = d60Var.C2;
        if (f7 > 0.0f) {
            float x10 = y30Var.getX();
            viewGroup = ((org.telegram.ui.ActionBar.e3) d60Var).containerView;
            float x11 = viewGroup.getX() + x10;
            float y3 = y30Var.getY();
            viewGroup2 = ((org.telegram.ui.ActionBar.e3) d60Var).containerView;
            float y10 = viewGroup2.getY() + y3;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(x11, y10, x30Var.getMeasuredWidth() + x11, x30Var.getMeasuredHeight() + y10);
            canvas.saveLayerAlpha(rectF, (int) (f7 * 255.0f), 31);
            canvas.translate(x11, y10);
            y30Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void e() {
        x30 x30Var = this.T.f32938b;
        super.e();
        for (int i10 = 0; i10 < x30Var.getChildCount(); i10++) {
            x30Var.getChildAt(i10).invalidate();
        }
    }
}
