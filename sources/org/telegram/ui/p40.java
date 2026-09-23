package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class p40 extends iv0 {
    public final f60 T;

    public p40(f60 f60Var, ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
        this.T = f60Var;
    }

    @Override
    public final void c(Canvas canvas, float f7, float f10, float f11, float f12, float f13) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        f60 f60Var = this.T;
        z30 z30Var = f60Var.f33101b;
        a40 a40Var = f60Var.C2;
        if (f7 > 0.0f) {
            float x10 = a40Var.getX();
            viewGroup = ((org.telegram.ui.ActionBar.f3) f60Var).containerView;
            float x11 = viewGroup.getX() + x10;
            float y3 = a40Var.getY();
            viewGroup2 = ((org.telegram.ui.ActionBar.f3) f60Var).containerView;
            float y10 = viewGroup2.getY() + y3;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(x11, y10, z30Var.getMeasuredWidth() + x11, z30Var.getMeasuredHeight() + y10);
            canvas.saveLayerAlpha(rectF, (int) (f7 * 255.0f), 31);
            canvas.translate(x11, y10);
            a40Var.draw(canvas);
            canvas.restore();
        }
    }

    @Override
    public final void e() {
        z30 z30Var = this.T.f33101b;
        super.e();
        for (int i10 = 0; i10 < z30Var.getChildCount(); i10++) {
            z30Var.getChildAt(i10).invalidate();
        }
    }
}
