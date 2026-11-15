package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class oa implements eh.a {
    public final int f49880a;
    public final Object f49881b;

    public oa(Object obj, int i7) {
        this.f49880a = i7;
        this.f49881b = obj;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f49880a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            default:
                aVar.f8087a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        int i7 = this.f49880a;
        Object obj = this.f49881b;
        switch (i7) {
            case 0:
                ((jb) obj).X(canvas, rectF);
                return;
            case 1:
                pa0.Z((pa0) obj, canvas, rectF);
                return;
            case 2:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                org.telegram.ui.Components.uj0 uj0Var = premiumPreviewFragment.f42975a;
                ih.d.a(uj0Var, canvas, rectF, uj0Var, premiumPreviewFragment.f42983e0);
                return;
            case 3:
                View view = (View) obj;
                RectF rectF2 = ProfileActivity.X6;
                canvas.save();
                canvas.translate(-view.getScrollX(), -view.getScrollY());
                view.draw(canvas);
                canvas.restore();
                return;
            case 4:
                vw0 vw0Var = ((ProfileActivity) obj).f43087d1;
                vw0Var.P = true;
                vw0Var.draw(canvas);
                vw0Var.P = false;
                return;
            default:
                org.telegram.ui.Components.uj0 uj0Var2 = (org.telegram.ui.Components.uj0) obj;
                org.telegram.ui.Components.n9 n9Var = uj0Var2.S2;
                if (n9Var != null) {
                    n9Var.d(canvas, rectF);
                    return;
                }
                org.telegram.ui.Components.ej0 ej0Var = uj0Var2.H2;
                if (ej0Var != null) {
                    ej0Var.d(canvas, rectF);
                    return;
                }
                return;
        }
    }
}
