package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class nd0 implements o1.g {
    public final int f35968a;
    public final Object f35969b;

    public nd0(Object obj, int i10) {
        this.f35968a = i10;
        this.f35969b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.f35968a;
        int i11 = 0;
        Object obj = this.f35969b;
        switch (i10) {
            case 0:
                eg0 eg0Var = ((qg0) obj).f36988b0;
                if (eg0Var != null) {
                    int i12 = eg0.E;
                    View view = eg0Var.f33481c;
                    ViewGroup viewGroup = eg0Var.f33480b;
                    PointF pointF = eg0Var.f33488y;
                    hh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.c20 c20Var = eg0Var.h;
                    c20Var.setTranslationX(pointF.x);
                    c20Var.setTranslationY(pointF.y);
                    eg0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                jo0 jo0Var = (jo0) obj;
                float f11 = f7 / 100.0f;
                jo0Var.f34938b = f11;
                TextView textView = jo0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                jo0Var.invalidate();
                return;
            case 2:
                gu0 gu0Var = (gu0) obj;
                gu0Var.f34146c0 = f7;
                gu0Var.f34148e0 = f10;
                gu0Var.G();
                return;
            case 3:
                cv0 cv0Var = (cv0) obj;
                if (cv0Var.e > cv0Var.f32882f) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                org.telegram.ui.Components.x71 x71Var = cv0Var.f32885s.f31403q3;
                int measuredWidth = (int) (((cv0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - i11);
                int measuredHeight = cv0Var.getMeasuredHeight();
                x71Var.h = measuredWidth;
                x71Var.f30158i = measuredHeight;
                View view2 = x71Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                d41 d41Var = (d41) obj;
                d41Var.f32997y = f7 / 1000.0f;
                d41Var.invalidate();
                return;
            default:
                v41 v41Var = (v41) obj;
                org.telegram.ui.Components.x71 x71Var2 = v41Var.f38724r.Q;
                int measuredWidth2 = (int) (((v41Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                int measuredHeight2 = v41Var.getMeasuredHeight();
                x71Var2.h = measuredWidth2;
                x71Var2.f30158i = measuredHeight2;
                View view3 = x71Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
