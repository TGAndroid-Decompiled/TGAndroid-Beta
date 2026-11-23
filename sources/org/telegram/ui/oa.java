package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class oa implements eh.a {
    public final int f50610a;
    public final Object f50611b;

    public oa(Object obj, int i7) {
        this.f50610a = i7;
        this.f50611b = obj;
    }

    @Override
    public final void c(dh.a aVar, RectF rectF) {
        switch (this.f50610a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            default:
                aVar.f8363a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        int i7 = this.f50610a;
        Object obj = this.f50611b;
        switch (i7) {
            case 0:
                ((jb) obj).X(canvas, rectF);
                return;
            case 1:
                pa0.Z((pa0) obj, canvas, rectF);
                return;
            case 2:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                org.telegram.ui.Components.ek0 ek0Var = premiumPreviewFragment.f43546a;
                ih.d.a(ek0Var, canvas, rectF, ek0Var, premiumPreviewFragment.f43554e0);
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
                xw0 xw0Var = ((ProfileActivity) obj).f43659d1;
                xw0Var.P = true;
                xw0Var.draw(canvas);
                xw0Var.P = false;
                return;
            default:
                org.telegram.ui.Components.ek0 ek0Var2 = (org.telegram.ui.Components.ek0) obj;
                org.telegram.ui.Components.u9 u9Var = ek0Var2.S2;
                if (u9Var != null) {
                    u9Var.d(canvas, rectF);
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
