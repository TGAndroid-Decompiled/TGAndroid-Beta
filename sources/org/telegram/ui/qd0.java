package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class qd0 implements o1.g {
    public final int f36718a;
    public final Object f36719b;

    public qd0(Object obj, int i10) {
        this.f36718a = i10;
        this.f36719b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.f36718a;
        int i11 = 0;
        Object obj = this.f36719b;
        switch (i10) {
            case 0:
                hg0 hg0Var = ((tg0) obj).f37787b0;
                if (hg0Var != null) {
                    int i12 = hg0.E;
                    View view = hg0Var.f34219c;
                    ViewGroup viewGroup = hg0Var.f34218b;
                    PointF pointF = hg0Var.f34226y;
                    hh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.b20 b20Var = hg0Var.h;
                    b20Var.setTranslationX(pointF.x);
                    b20Var.setTranslationY(pointF.y);
                    hg0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                no0 no0Var = (no0) obj;
                float f11 = f7 / 100.0f;
                no0Var.f36066b = f11;
                TextView textView = no0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                no0Var.invalidate();
                return;
            case 2:
                ju0 ju0Var = (ju0) obj;
                ju0Var.f34850c0 = f7;
                ju0Var.f34852e0 = f10;
                ju0Var.G();
                return;
            case 3:
                fv0 fv0Var = (fv0) obj;
                if (fv0Var.e > fv0Var.f33640f) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                org.telegram.ui.Components.w71 w71Var = fv0Var.f33643s.f31331q3;
                int measuredWidth = (int) (((fv0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - i11);
                int measuredHeight = fv0Var.getMeasuredHeight();
                w71Var.h = measuredWidth;
                w71Var.f29870i = measuredHeight;
                View view2 = w71Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                f41 f41Var = (f41) obj;
                f41Var.f33420y = f7 / 1000.0f;
                f41Var.invalidate();
                return;
            default:
                y41 y41Var = (y41) obj;
                org.telegram.ui.Components.w71 w71Var2 = y41Var.f40135r.Q;
                int measuredWidth2 = (int) (((y41Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                int measuredHeight2 = y41Var.getMeasuredHeight();
                w71Var2.h = measuredWidth2;
                w71Var2.f29870i = measuredHeight2;
                View view3 = w71Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
