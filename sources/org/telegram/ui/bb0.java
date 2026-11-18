package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
public final class bb0 implements r1.d {
    public final int f45797a;
    public final Object f45798b;

    public bb0(Object obj, int i7) {
        this.f45797a = i7;
        this.f45798b = obj;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        int i7 = this.f45797a;
        int i10 = 0;
        Object obj = this.f45798b;
        switch (i7) {
            case 0:
                rd0 rd0Var = ((ee0) obj).f47182c0;
                if (rd0Var != null) {
                    int i11 = rd0.G;
                    View view = rd0Var.f51571c;
                    ViewGroup viewGroup = rd0Var.f51570b;
                    PointF pointF = rd0Var.E;
                    jh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.a10 a10Var = rd0Var.h;
                    a10Var.setTranslationX(pointF.x);
                    a10Var.setTranslationY(pointF.y);
                    rd0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                il0 il0Var = (il0) obj;
                float f12 = f10 / 100.0f;
                il0Var.f48751b = f12;
                TextView textView = il0Var.d.V;
                if (textView != null) {
                    textView.setAlpha((f12 * 0.2f) + 0.8f);
                }
                il0Var.invalidate();
                return;
            case 2:
                jq0 jq0Var = (jq0) obj;
                jq0Var.f49034d0 = f10;
                jq0Var.f49036f0 = f11;
                jq0Var.G();
                return;
            case 3:
                cr0 cr0Var = (cr0) obj;
                if (cr0Var.f46602e > cr0Var.f46603f) {
                    i10 = org.telegram.messenger.g0.L(48.0f);
                }
                org.telegram.ui.Components.h61 h61Var = cr0Var.f46606s.f43304q3;
                int measuredWidth = (int) (((cr0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - f10) - i10);
                int measuredHeight = cr0Var.getMeasuredHeight();
                h61Var.h = measuredWidth;
                h61Var.f35766i = measuredHeight;
                View view2 = h61Var.v;
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
                org.telegram.ui.Components.h61 h61Var2 = nz0Var.f50361r.P;
                int measuredWidth2 = (int) (((nz0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - f10) - 0);
                int measuredHeight2 = nz0Var.getMeasuredHeight();
                h61Var2.h = measuredWidth2;
                h61Var2.f35766i = measuredHeight2;
                View view3 = h61Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
