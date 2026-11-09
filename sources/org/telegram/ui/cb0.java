package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
public final class cb0 implements r1.d {
    public final int f44262a;
    public final Object f44263b;

    public cb0(Object obj, int i7) {
        this.f44262a = i7;
        this.f44263b = obj;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        int i7 = this.f44262a;
        int i10 = 0;
        Object obj = this.f44263b;
        switch (i7) {
            case 0:
                rd0 rd0Var = ((ee0) obj).f45371b0;
                if (rd0Var != null) {
                    int i11 = rd0.F;
                    View view = rd0Var.f49461c;
                    ViewGroup viewGroup = rd0Var.f49460b;
                    PointF pointF = rd0Var.D;
                    jh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.q00 q00Var = rd0Var.h;
                    q00Var.setTranslationX(pointF.x);
                    q00Var.setTranslationY(pointF.y);
                    rd0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                fl0 fl0Var = (fl0) obj;
                float f12 = f10 / 100.0f;
                fl0Var.f45741b = f12;
                TextView textView = fl0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f12 * 0.2f) + 0.8f);
                }
                fl0Var.invalidate();
                return;
            case 2:
                kq0 kq0Var = (kq0) obj;
                kq0Var.f47341c0 = f10;
                kq0Var.f47343e0 = f11;
                kq0Var.G();
                return;
            case 3:
                er0 er0Var = (er0) obj;
                if (er0Var.f45495e > er0Var.f45496f) {
                    i10 = org.telegram.messenger.g0.L(48.0f);
                }
                org.telegram.ui.Components.w51 w51Var = er0Var.f45499s.f41488p3;
                int measuredWidth = (int) (((er0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - f10) - i10);
                int measuredHeight = er0Var.getMeasuredHeight();
                w51Var.h = measuredWidth;
                w51Var.f39926i = measuredHeight;
                View view2 = w51Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                zy0 zy0Var = (zy0) obj;
                zy0Var.D = f10 / 1000.0f;
                zy0Var.invalidate();
                return;
            default:
                oz0 oz0Var = (oz0) obj;
                org.telegram.ui.Components.w51 w51Var2 = oz0Var.f48574r.O;
                int measuredWidth2 = (int) (((oz0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - f10) - 0);
                int measuredHeight2 = oz0Var.getMeasuredHeight();
                w51Var2.h = measuredWidth2;
                w51Var2.f39926i = measuredHeight2;
                View view3 = w51Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
