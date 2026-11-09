package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class oa implements eh.a {
    public final int f48415a;
    public final Object f48416b;

    public oa(Object obj, int i7) {
        this.f48415a = i7;
        this.f48416b = obj;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f48415a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            default:
                aVar.f8698a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        int i7 = this.f48415a;
        Object obj = this.f48416b;
        switch (i7) {
            case 0:
                ((kb) obj).X(canvas, rectF);
                return;
            case 1:
                ra0.Z((ra0) obj, canvas, rectF);
                return;
            case 2:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                org.telegram.ui.Components.qj0 qj0Var = premiumPreviewFragment.f41612a;
                ih.d.a(qj0Var, canvas, rectF, qj0Var, premiumPreviewFragment.f41618d0);
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
                zw0 zw0Var = ((ProfileActivity) obj).f41716c1;
                zw0Var.O = true;
                zw0Var.draw(canvas);
                zw0Var.O = false;
                return;
            default:
                org.telegram.ui.Components.qj0 qj0Var2 = (org.telegram.ui.Components.qj0) obj;
                org.telegram.ui.Components.q9 q9Var = qj0Var2.R2;
                if (q9Var != null) {
                    q9Var.d(canvas, rectF);
                    return;
                }
                org.telegram.ui.Components.aj0 aj0Var = qj0Var2.G2;
                if (aj0Var != null) {
                    aj0Var.d(canvas, rectF);
                    return;
                }
                return;
        }
    }
}
