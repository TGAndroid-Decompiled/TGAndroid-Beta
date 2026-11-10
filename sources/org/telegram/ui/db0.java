package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
public final class db0 implements r1.d {
    public final int f44942a;
    public final Object f44943b;

    public db0(Object obj, int i7) {
        this.f44942a = i7;
        this.f44943b = obj;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        int i7 = this.f44942a;
        int i10 = 0;
        Object obj = this.f44943b;
        switch (i7) {
            case 0:
                sd0 sd0Var = ((fe0) obj).f45695b0;
                if (sd0Var != null) {
                    int i11 = sd0.F;
                    View view = sd0Var.f49835c;
                    ViewGroup viewGroup = sd0Var.f49834b;
                    PointF pointF = sd0Var.D;
                    jh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.p00 p00Var = sd0Var.h;
                    p00Var.setTranslationX(pointF.x);
                    p00Var.setTranslationY(pointF.y);
                    sd0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                gl0 gl0Var = (gl0) obj;
                float f12 = f10 / 100.0f;
                gl0Var.f46113b = f12;
                TextView textView = gl0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f12 * 0.2f) + 0.8f);
                }
                gl0Var.invalidate();
                return;
            case 2:
                lq0 lq0Var = (lq0) obj;
                lq0Var.f47665c0 = f10;
                lq0Var.f47667e0 = f11;
                lq0Var.G();
                return;
            case 3:
                fr0 fr0Var = (fr0) obj;
                if (fr0Var.f45832e > fr0Var.f45833f) {
                    i10 = org.telegram.messenger.g0.L(48.0f);
                }
                org.telegram.ui.Components.v51 v51Var = fr0Var.f45836s.f41479p3;
                int measuredWidth = (int) (((fr0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - f10) - i10);
                int measuredHeight = fr0Var.getMeasuredHeight();
                v51Var.h = measuredWidth;
                v51Var.f38870i = measuredHeight;
                View view2 = v51Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                az0 az0Var = (az0) obj;
                az0Var.D = f10 / 1000.0f;
                az0Var.invalidate();
                return;
            default:
                pz0 pz0Var = (pz0) obj;
                org.telegram.ui.Components.v51 v51Var2 = pz0Var.f48890r.O;
                int measuredWidth2 = (int) (((pz0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - f10) - 0);
                int measuredHeight2 = pz0Var.getMeasuredHeight();
                v51Var2.h = measuredWidth2;
                v51Var2.f38870i = measuredHeight2;
                View view3 = v51Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
