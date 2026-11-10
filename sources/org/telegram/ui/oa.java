package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class oa implements eh.a {
    public final int f48476a;
    public final Object f48477b;

    public oa(Object obj, int i7) {
        this.f48476a = i7;
        this.f48477b = obj;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f48476a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            default:
                aVar.f8703a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        int i7 = this.f48476a;
        Object obj = this.f48477b;
        switch (i7) {
            case 0:
                ((kb) obj).X(canvas, rectF);
                return;
            case 1:
                sa0.Z((sa0) obj, canvas, rectF);
                return;
            case 2:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                org.telegram.ui.Components.pj0 pj0Var = premiumPreviewFragment.f41603a;
                ih.d.a(pj0Var, canvas, rectF, pj0Var, premiumPreviewFragment.f41609d0);
                return;
            case 3:
                View view = (View) obj;
                RectF rectF2 = ProfileActivity.V6;
                canvas.save();
                canvas.translate(-view.getScrollX(), -view.getScrollY());
                view.draw(canvas);
                canvas.restore();
                return;
            case 4:
                bx0 bx0Var = ((ProfileActivity) obj).f41707c1;
                bx0Var.O = true;
                bx0Var.draw(canvas);
                bx0Var.O = false;
                return;
            default:
                org.telegram.ui.Components.pj0 pj0Var2 = (org.telegram.ui.Components.pj0) obj;
                org.telegram.ui.Components.p9 p9Var = pj0Var2.R2;
                if (p9Var != null) {
                    p9Var.d(canvas, rectF);
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
