package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
public final class ab0 implements r1.d {
    public final int f45644a;
    public final Object f45645b;

    public ab0(Object obj, int i7) {
        this.f45644a = i7;
        this.f45645b = obj;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        int i7 = this.f45644a;
        int i10 = 0;
        Object obj = this.f45645b;
        switch (i7) {
            case 0:
                pd0 pd0Var = ((de0) obj).f47054c0;
                if (pd0Var != null) {
                    int i11 = pd0.G;
                    View view = pd0Var.f50997c;
                    ViewGroup viewGroup = pd0Var.f50996b;
                    PointF pointF = pd0Var.E;
                    jh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.a10 a10Var = pd0Var.h;
                    a10Var.setTranslationX(pointF.x);
                    a10Var.setTranslationY(pointF.y);
                    pd0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                gl0 gl0Var = (gl0) obj;
                float f12 = f10 / 100.0f;
                gl0Var.f48317b = f12;
                TextView textView = gl0Var.d.V;
                if (textView != null) {
                    textView.setAlpha((f12 * 0.2f) + 0.8f);
                }
                gl0Var.invalidate();
                return;
            case 2:
                jq0 jq0Var = (jq0) obj;
                jq0Var.f49185d0 = f10;
                jq0Var.f49187f0 = f11;
                jq0Var.G();
                return;
            case 3:
                cr0 cr0Var = (cr0) obj;
                if (cr0Var.f46858e > cr0Var.f46859f) {
                    i10 = org.telegram.messenger.g0.L(48.0f);
                }
                org.telegram.ui.Components.l61 l61Var = cr0Var.f46862s.f43430q3;
                int measuredWidth = (int) (((cr0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - f10) - i10);
                int measuredHeight = cr0Var.getMeasuredHeight();
                l61Var.h = measuredWidth;
                l61Var.f37055i = measuredHeight;
                View view2 = l61Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                xy0 xy0Var = (xy0) obj;
                xy0Var.E = f10 / 1000.0f;
                xy0Var.invalidate();
                return;
            default:
                mz0 mz0Var = (mz0) obj;
                org.telegram.ui.Components.l61 l61Var2 = mz0Var.f50162r.P;
                int measuredWidth2 = (int) (((mz0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - f10) - 0);
                int measuredHeight2 = mz0Var.getMeasuredHeight();
                l61Var2.h = measuredWidth2;
                l61Var2.f37055i = measuredHeight2;
                View view3 = l61Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
