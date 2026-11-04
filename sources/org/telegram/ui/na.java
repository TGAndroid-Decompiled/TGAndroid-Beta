package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
public final class na implements fh.a {
    public final int f47922a;
    public final Object f47923b;

    public na(Object obj, int i3) {
        this.f47922a = i3;
        this.f47923b = obj;
    }

    @Override
    public final void b(eh.a aVar, RectF rectF) {
        switch (this.f47922a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            default:
                aVar.f9978a = true;
                return;
        }
    }

    @Override
    public final void d(Canvas canvas, RectF rectF) {
        int i3 = this.f47922a;
        Object obj = this.f47923b;
        switch (i3) {
            case 0:
                ((ib) obj).X(canvas, rectF);
                return;
            case 1:
                la0.Z((la0) obj, canvas, rectF);
                return;
            case 2:
                PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) obj;
                org.telegram.ui.Components.tj0 tj0Var = premiumPreviewFragment.f41632a;
                jh.d.a(tj0Var, canvas, rectF, tj0Var, premiumPreviewFragment.f41640e0);
                return;
            case 3:
                View view = (View) obj;
                RectF rectF2 = ProfileActivity.T6;
                canvas.save();
                canvas.translate(-view.getScrollX(), -view.getScrollY());
                view.draw(canvas);
                canvas.restore();
                return;
            case 4:
                ow0 ow0Var = ((ProfileActivity) obj).f41743d1;
                ow0Var.P = true;
                ow0Var.draw(canvas);
                ow0Var.P = false;
                return;
            default:
                org.telegram.ui.Components.tj0 tj0Var2 = (org.telegram.ui.Components.tj0) obj;
                org.telegram.ui.Components.p9 p9Var = tj0Var2.S2;
                if (p9Var != null) {
                    p9Var.d(canvas, rectF);
                    return;
                }
                org.telegram.ui.Components.dj0 dj0Var = tj0Var2.H2;
                if (dj0Var != null) {
                    dj0Var.d(canvas, rectF);
                    return;
                }
                return;
        }
    }
}
