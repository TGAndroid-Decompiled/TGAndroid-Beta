package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class dd0 implements o1.g {
    public final int f36598a;
    public final Object f36599b;

    public dd0(Object obj, int i10) {
        this.f36598a = i10;
        this.f36599b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.f36598a;
        int i11 = 0;
        Object obj = this.f36599b;
        switch (i10) {
            case 0:
                wf0 wf0Var = ((ig0) obj).f38195b0;
                if (wf0Var != null) {
                    int i12 = wf0.F;
                    View view = wf0Var.f43354c;
                    ViewGroup viewGroup = wf0Var.f43353b;
                    PointF pointF = wf0Var.f43361y;
                    ih.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.h20 h20Var = wf0Var.h;
                    h20Var.setTranslationX(pointF.x);
                    h20Var.setTranslationY(pointF.y);
                    wf0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                eo0 eo0Var = (eo0) obj;
                float f11 = f7 / 100.0f;
                eo0Var.f37005b = f11;
                TextView textView = eo0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                eo0Var.invalidate();
                return;
            case 2:
                xt0 xt0Var = (xt0) obj;
                xt0Var.f43645c0 = f7;
                xt0Var.f43647e0 = f10;
                xt0Var.G();
                return;
            case 3:
                tu0 tu0Var = (tu0) obj;
                if (tu0Var.e > tu0Var.f42079f) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                org.telegram.ui.Components.l81 l81Var = tu0Var.f42082s.f33687q3;
                int measuredWidth = (int) (((tu0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - i11);
                int measuredHeight = tu0Var.getMeasuredHeight();
                l81Var.h = measuredWidth;
                l81Var.f28283i = measuredHeight;
                View view2 = l81Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                b31 b31Var = (b31) obj;
                b31Var.f35846y = f7 / 1000.0f;
                b31Var.invalidate();
                return;
            default:
                v31 v31Var = (v31) obj;
                org.telegram.ui.Components.l81 l81Var2 = v31Var.f42592r.Q;
                int measuredWidth2 = (int) (((v31Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                int measuredHeight2 = v31Var.getMeasuredHeight();
                l81Var2.h = measuredWidth2;
                l81Var2.f28283i = measuredHeight2;
                View view3 = l81Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
