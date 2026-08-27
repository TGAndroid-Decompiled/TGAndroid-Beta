package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;

public final class lk extends ou0 {
    public lk(ViewGroup viewGroup, ViewGroup viewGroup2) {
        super(viewGroup, viewGroup2);
    }

    @Override
    public final void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
        if (f10 > 0.0f) {
            View view = this.f41172e;
            if (view instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
                int iMax = (int) Math.max(f13, f12);
                int iMin = (int) Math.min(f14, s1Var.getMeasuredHeight() + f12);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(f11, iMax, s1Var.getMeasuredWidth() + f11, iMin);
                canvas.saveLayerAlpha(rectF, (int) (f10 * 255.0f), 31);
                canvas.translate(f11, f12 + s1Var.getPaddingTop());
                s1Var.Ad = true;
                s1Var.X1(canvas);
                if (s1Var.e4() && s1Var.getCurrentMessagesGroup() == null) {
                    s1Var.l2(1.0f, canvas, false);
                }
                s1Var.Ad = false;
                canvas.restore();
            }
        }
    }
}
