package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class cd0 implements o1.g {
    public final int f36309a;
    public final Object f36310b;

    public cd0(Object obj, int i10) {
        this.f36309a = i10;
        this.f36310b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.f36309a;
        int i11 = 0;
        Object obj = this.f36310b;
        switch (i10) {
            case 0:
                vf0 vf0Var = ((hg0) obj).f37836b0;
                if (vf0Var != null) {
                    int i12 = vf0.F;
                    View view = vf0Var.f42724c;
                    ViewGroup viewGroup = vf0Var.f42723b;
                    PointF pointF = vf0Var.f42731y;
                    ih.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.f20 f20Var = vf0Var.h;
                    f20Var.setTranslationX(pointF.x);
                    f20Var.setTranslationY(pointF.y);
                    vf0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                do0 do0Var = (do0) obj;
                float f11 = f7 / 100.0f;
                do0Var.f36655b = f11;
                TextView textView = do0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                do0Var.invalidate();
                return;
            case 2:
                wt0 wt0Var = (wt0) obj;
                wt0Var.f43400c0 = f7;
                wt0Var.f43402e0 = f10;
                wt0Var.G();
                return;
            case 3:
                su0 su0Var = (su0) obj;
                if (su0Var.e > su0Var.f41807f) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                org.telegram.ui.Components.l81 l81Var = su0Var.f41810s.f33689q3;
                int measuredWidth = (int) (((su0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - i11);
                int measuredHeight = su0Var.getMeasuredHeight();
                l81Var.h = measuredWidth;
                l81Var.f28255i = measuredHeight;
                View view2 = l81Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                a31 a31Var = (a31) obj;
                a31Var.f35570y = f7 / 1000.0f;
                a31Var.invalidate();
                return;
            default:
                u31 u31Var = (u31) obj;
                org.telegram.ui.Components.l81 l81Var2 = u31Var.f42203r.Q;
                int measuredWidth2 = (int) (((u31Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                int measuredHeight2 = u31Var.getMeasuredHeight();
                l81Var2.h = measuredWidth2;
                l81Var2.f28255i = measuredHeight2;
                View view3 = l81Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
