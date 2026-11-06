package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class oa implements eh.a {
    public final int f48312a;
    public final Object f48313b;

    public oa(Object obj, int i7) {
        this.f48312a = i7;
        this.f48313b = obj;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f48312a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            default:
                aVar.f8700a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        int i7 = this.f48312a;
        Object obj = this.f48313b;
        switch (i7) {
            case 0:
                ((kb) obj).X(canvas, rectF);
                return;
            case 1:
                pa0.Z((pa0) obj, canvas, rectF);
                return;
            case 2:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                org.telegram.ui.Components.pj0 pj0Var = premiumPreviewFragment.f41577a;
                ih.d.a(pj0Var, canvas, rectF, pj0Var, premiumPreviewFragment.f41583d0);
                return;
            case 3:
                View view = (View) obj;
                RectF rectF2 = ProfileActivity.S6;
                canvas.save();
                canvas.translate(-view.getScrollX(), -view.getScrollY());
                view.draw(canvas);
                canvas.restore();
                return;
            case 4:
                ww0 ww0Var = ((ProfileActivity) obj).f41681c1;
                ww0Var.O = true;
                ww0Var.draw(canvas);
                ww0Var.O = false;
                return;
            default:
                org.telegram.ui.Components.pj0 pj0Var2 = (org.telegram.ui.Components.pj0) obj;
                org.telegram.ui.Components.q9 q9Var = pj0Var2.R2;
                if (q9Var != null) {
                    q9Var.d(canvas, rectF);
                    return;
                }
                org.telegram.ui.Components.zi0 zi0Var = pj0Var2.G2;
                if (zi0Var != null) {
                    zi0Var.d(canvas, rectF);
                    return;
                }
                return;
        }
    }
}
