package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
public final class ab0 implements r1.d {
    public final int f43613a;
    public final Object f43614b;

    public ab0(Object obj, int i7) {
        this.f43613a = i7;
        this.f43614b = obj;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        int i7 = this.f43613a;
        int i10 = 0;
        Object obj = this.f43614b;
        switch (i7) {
            case 0:
                pd0 pd0Var = ((ce0) obj).f44759b0;
                if (pd0Var != null) {
                    int i11 = pd0.F;
                    View view = pd0Var.f48803c;
                    ViewGroup viewGroup = pd0Var.f48802b;
                    PointF pointF = pd0Var.D;
                    jh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.p00 p00Var = pd0Var.h;
                    p00Var.setTranslationX(pointF.x);
                    p00Var.setTranslationY(pointF.y);
                    pd0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                dl0 dl0Var = (dl0) obj;
                float f12 = f10 / 100.0f;
                dl0Var.f45092b = f12;
                TextView textView = dl0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f12 * 0.2f) + 0.8f);
                }
                dl0Var.invalidate();
                return;
            case 2:
                iq0 iq0Var = (iq0) obj;
                iq0Var.f46717c0 = f10;
                iq0Var.f46719e0 = f11;
                iq0Var.G();
                return;
            case 3:
                cr0 cr0Var = (cr0) obj;
                if (cr0Var.f44880e > cr0Var.f44881f) {
                    i10 = org.telegram.messenger.g0.L(48.0f);
                }
                org.telegram.ui.Components.v51 v51Var = cr0Var.f44884s.f41477p3;
                int measuredWidth = (int) (((cr0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - f10) - i10);
                int measuredHeight = cr0Var.getMeasuredHeight();
                v51Var.h = measuredWidth;
                v51Var.f38867i = measuredHeight;
                View view2 = v51Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                wy0 wy0Var = (wy0) obj;
                wy0Var.D = f10 / 1000.0f;
                wy0Var.invalidate();
                return;
            default:
                lz0 lz0Var = (lz0) obj;
                org.telegram.ui.Components.v51 v51Var2 = lz0Var.f47609r.O;
                int measuredWidth2 = (int) (((lz0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - f10) - 0);
                int measuredHeight2 = lz0Var.getMeasuredHeight();
                v51Var2.h = measuredWidth2;
                v51Var2.f38867i = measuredHeight2;
                View view3 = v51Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
