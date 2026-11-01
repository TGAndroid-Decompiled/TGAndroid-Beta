package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
public final class ic0 implements o1.g {
    public final int f38001a;
    public final Object f38002b;

    public ic0(Object obj, int i10) {
        this.f38001a = i10;
        this.f38002b = obj;
    }

    @Override
    public final void a(o1.j jVar, float f7, float f10) {
        int i10 = this.f38001a;
        int i11 = 0;
        Object obj = this.f38002b;
        switch (i10) {
            case 0:
                ve0 ve0Var = ((gf0) obj).f37474b0;
                if (ve0Var != null) {
                    int i12 = ve0.F;
                    View view = ve0Var.f42509c;
                    ViewGroup viewGroup = ve0Var.f42508b;
                    PointF pointF = ve0Var.D;
                    zg.h.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.f10 f10Var = ve0Var.h;
                    f10Var.setTranslationX(pointF.x);
                    f10Var.setTranslationY(pointF.y);
                    ve0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                mm0 mm0Var = (mm0) obj;
                float f11 = f7 / 100.0f;
                mm0Var.f39574b = f11;
                TextView textView = mm0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                mm0Var.invalidate();
                return;
            case 2:
                sr0 sr0Var = (sr0) obj;
                sr0Var.f41443c0 = f7;
                sr0Var.f41445e0 = f10;
                sr0Var.G();
                return;
            case 3:
                ls0 ls0Var = (ls0) obj;
                if (ls0Var.e > ls0Var.f39369f) {
                    i11 = org.telegram.messenger.i0.L(48.0f);
                }
                org.telegram.ui.Components.x61 x61Var = ls0Var.f39372s.f33584q3;
                int measuredWidth = (int) (((ls0Var.getMeasuredWidth() - org.telegram.messenger.i0.L(16.0f)) - f7) - i11);
                int measuredHeight = ls0Var.getMeasuredHeight();
                x61Var.h = measuredWidth;
                x61Var.f32457i = measuredHeight;
                View view2 = x61Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                k01 k01Var = (k01) obj;
                k01Var.D = f7 / 1000.0f;
                k01Var.invalidate();
                return;
            default:
                b11 b11Var = (b11) obj;
                org.telegram.ui.Components.x61 x61Var2 = b11Var.f35906r.O;
                int measuredWidth2 = (int) (((b11Var.getMeasuredWidth() - org.telegram.messenger.i0.L(16.0f)) - f7) - 0);
                int measuredHeight2 = b11Var.getMeasuredHeight();
                x61Var2.h = measuredWidth2;
                x61Var2.f32457i = measuredHeight2;
                View view3 = x61Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
