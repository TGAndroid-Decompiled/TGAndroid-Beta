package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class nd0 implements o1.g {
    public final int f35856a;
    public final Object f35857b;

    public nd0(Object obj, int i10) {
        this.f35856a = i10;
        this.f35857b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.f35856a;
        int i11 = 0;
        Object obj = this.f35857b;
        switch (i10) {
            case 0:
                eg0 eg0Var = ((qg0) obj).f36887b0;
                if (eg0Var != null) {
                    int i12 = eg0.E;
                    View view = eg0Var.f33397c;
                    ViewGroup viewGroup = eg0Var.f33396b;
                    PointF pointF = eg0Var.f33404y;
                    hh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.a20 a20Var = eg0Var.h;
                    a20Var.setTranslationX(pointF.x);
                    a20Var.setTranslationY(pointF.y);
                    eg0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                ko0 ko0Var = (ko0) obj;
                float f11 = f7 / 100.0f;
                ko0Var.f35116b = f11;
                TextView textView = ko0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                ko0Var.invalidate();
                return;
            case 2:
                gu0 gu0Var = (gu0) obj;
                gu0Var.f34052c0 = f7;
                gu0Var.f34054e0 = f10;
                gu0Var.G();
                return;
            case 3:
                cv0 cv0Var = (cv0) obj;
                if (cv0Var.e > cv0Var.f32803f) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                org.telegram.ui.Components.v71 v71Var = cv0Var.f32806s.f31328q3;
                int measuredWidth = (int) (((cv0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - i11);
                int measuredHeight = cv0Var.getMeasuredHeight();
                v71Var.h = measuredWidth;
                v71Var.f29023i = measuredHeight;
                View view2 = v71Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                d41 d41Var = (d41) obj;
                d41Var.f32918y = f7 / 1000.0f;
                d41Var.invalidate();
                return;
            default:
                v41 v41Var = (v41) obj;
                org.telegram.ui.Components.v71 v71Var2 = v41Var.f38634r.Q;
                int measuredWidth2 = (int) (((v41Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                int measuredHeight2 = v41Var.getMeasuredHeight();
                v71Var2.h = measuredWidth2;
                v71Var2.f29023i = measuredHeight2;
                View view3 = v71Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
