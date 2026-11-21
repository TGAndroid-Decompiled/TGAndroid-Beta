package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class oa implements eh.a {
    public final int f50527a;
    public final Object f50528b;

    public oa(Object obj, int i7) {
        this.f50527a = i7;
        this.f50528b = obj;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f50527a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            default:
                aVar.f8398a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        int i7 = this.f50527a;
        Object obj = this.f50528b;
        switch (i7) {
            case 0:
                ((jb) obj).X(canvas, rectF);
                return;
            case 1:
                qa0.Z((qa0) obj, canvas, rectF);
                return;
            case 2:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                org.telegram.ui.Components.ek0 ek0Var = premiumPreviewFragment.f43461a;
                ih.d.a(ek0Var, canvas, rectF, ek0Var, premiumPreviewFragment.f43469e0);
                return;
            case 3:
                View view = (View) obj;
                RectF rectF2 = ProfileActivity.Z6;
                canvas.save();
                canvas.translate(-view.getScrollX(), -view.getScrollY());
                view.draw(canvas);
                canvas.restore();
                return;
            case 4:
                zw0 zw0Var = ((ProfileActivity) obj).f43574d1;
                zw0Var.P = true;
                zw0Var.draw(canvas);
                zw0Var.P = false;
                return;
            default:
                org.telegram.ui.Components.ek0 ek0Var2 = (org.telegram.ui.Components.ek0) obj;
                org.telegram.ui.Components.v9 v9Var = ek0Var2.S2;
                if (v9Var != null) {
                    v9Var.d(canvas, rectF);
                    return;
                }
                org.telegram.ui.Components.oj0 oj0Var = ek0Var2.H2;
                if (oj0Var != null) {
                    oj0Var.d(canvas, rectF);
                    return;
                }
                return;
        }
    }
}
