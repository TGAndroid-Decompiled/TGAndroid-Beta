package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
public final class mk extends lu0 {
    public mk(ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
    }

    @Override
    public final void c(Canvas canvas, float f9, float f10, float f11, float f12, float f13) {
        if (f9 > 0.0f) {
            View view = this.f40292e;
            if (view instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f10, (int) Math.max(f12, f11), s1Var.getMeasuredWidth() + f10, (int) Math.min(f13, s1Var.getMeasuredHeight() + f11));
                canvas.saveLayerAlpha(rectF, (int) (f9 * 255.0f), 31);
                canvas.translate(f10, f11 + s1Var.getPaddingTop());
                s1Var.Ad = true;
                s1Var.Y1(canvas);
                if (s1Var.f4() && s1Var.getCurrentMessagesGroup() == null) {
                    s1Var.m2(1.0f, canvas, false);
                }
                s1Var.Ad = false;
                canvas.restore();
            }
        }
    }
}
