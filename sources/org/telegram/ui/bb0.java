package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
public final class bb0 implements r1.d {
    public final int f45781a;
    public final Object f45782b;

    public bb0(Object obj, int i7) {
        this.f45781a = i7;
        this.f45782b = obj;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        int i7 = this.f45781a;
        int i10 = 0;
        Object obj = this.f45782b;
        switch (i7) {
            case 0:
                qd0 qd0Var = ((de0) obj).f46891c0;
                if (qd0Var != null) {
                    int i11 = qd0.G;
                    View view = qd0Var.f51192c;
                    ViewGroup viewGroup = qd0Var.f51191b;
                    PointF pointF = qd0Var.E;
                    jh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.c10 c10Var = qd0Var.h;
                    c10Var.setTranslationX(pointF.x);
                    c10Var.setTranslationY(pointF.y);
                    qd0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                il0 il0Var = (il0) obj;
                float f12 = f10 / 100.0f;
                il0Var.f48759b = f12;
                TextView textView = il0Var.d.V;
                if (textView != null) {
                    textView.setAlpha((f12 * 0.2f) + 0.8f);
                }
                il0Var.invalidate();
                return;
            case 2:
                kq0 kq0Var = (kq0) obj;
                kq0Var.f49332d0 = f10;
                kq0Var.f49334f0 = f11;
                kq0Var.G();
                return;
            case 3:
                dr0 dr0Var = (dr0) obj;
                if (dr0Var.f46999e > dr0Var.f47000f) {
                    i10 = org.telegram.messenger.g0.L(48.0f);
                }
                org.telegram.ui.Components.k61 k61Var = dr0Var.f47003s.f43314q3;
                int measuredWidth = (int) (((dr0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - f10) - i10);
                int measuredHeight = dr0Var.getMeasuredHeight();
                k61Var.h = measuredWidth;
                k61Var.f36791i = measuredHeight;
                View view2 = k61Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                yy0 yy0Var = (yy0) obj;
                yy0Var.E = f10 / 1000.0f;
                yy0Var.invalidate();
                return;
            default:
                nz0 nz0Var = (nz0) obj;
                org.telegram.ui.Components.k61 k61Var2 = nz0Var.f50375r.P;
                int measuredWidth2 = (int) (((nz0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - f10) - 0);
                int measuredHeight2 = nz0Var.getMeasuredHeight();
                k61Var2.h = measuredWidth2;
                k61Var2.f36791i = measuredHeight2;
                View view3 = k61Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
