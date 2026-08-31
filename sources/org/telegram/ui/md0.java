package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class md0 implements o1.g {
    public final int f39081a;
    public final Object f39082b;

    public md0(Object obj, int i10) {
        this.f39081a = i10;
        this.f39082b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        int i10 = this.f39081a;
        int i11 = 0;
        Object obj = this.f39082b;
        switch (i10) {
            case 0:
                cg0 cg0Var = ((og0) obj).Y;
                if (cg0Var != null) {
                    int i12 = cg0.B;
                    View view = cg0Var.f35803c;
                    ViewGroup viewGroup = cg0Var.f35802b;
                    PointF pointF = cg0Var.f35811y;
                    vg.i.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.a20 a20Var = cg0Var.h;
                    a20Var.setTranslationX(pointF.x);
                    a20Var.setTranslationY(pointF.y);
                    cg0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                ho0 ho0Var = (ho0) obj;
                float f12 = f10 / 100.0f;
                ho0Var.f37555b = f12;
                TextView textView = ho0Var.d.R;
                if (textView != null) {
                    textView.setAlpha((f12 * 0.2f) + 0.8f);
                }
                ho0Var.invalidate();
                return;
            case 2:
                vt0 vt0Var = (vt0) obj;
                vt0Var.W = f10;
                vt0Var.f42290b0 = f11;
                vt0Var.G();
                return;
            case 3:
                su0 su0Var = (su0) obj;
                if (su0Var.f41372e > su0Var.f41373f) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                org.telegram.ui.Components.m71 m71Var = su0Var.f41376s.f34341n3;
                int measuredWidth = (int) (((su0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f10) - i11);
                int measuredHeight = su0Var.getMeasuredHeight();
                m71Var.h = measuredWidth;
                m71Var.f28963i = measuredHeight;
                View view2 = m71Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                v31 v31Var = (v31) obj;
                v31Var.f42120y = f10 / 1000.0f;
                v31Var.invalidate();
                return;
            default:
                l41 l41Var = (l41) obj;
                org.telegram.ui.Components.m71 m71Var2 = l41Var.f38636r.N;
                int measuredWidth2 = (int) (((l41Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f10) - 0);
                int measuredHeight2 = l41Var.getMeasuredHeight();
                m71Var2.h = measuredWidth2;
                m71Var2.f28963i = measuredHeight2;
                View view3 = m71Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
