package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
public final class ab0 implements r1.d {
    public final int f43589a;
    public final Object f43590b;

    public ab0(Object obj, int i7) {
        this.f43589a = i7;
        this.f43590b = obj;
    }

    @Override
    public final void a(r1.g gVar, float f10, float f11) {
        int i7 = this.f43589a;
        int i10 = 0;
        Object obj = this.f43590b;
        switch (i7) {
            case 0:
                pd0 pd0Var = ((ce0) obj).f44739b0;
                if (pd0Var != null) {
                    int i11 = pd0.F;
                    View view = pd0Var.f48809c;
                    ViewGroup viewGroup = pd0Var.f48808b;
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
                dl0Var.f45068b = f12;
                TextView textView = dl0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f12 * 0.2f) + 0.8f);
                }
                dl0Var.invalidate();
                return;
            case 2:
                hq0 hq0Var = (hq0) obj;
                hq0Var.f46459c0 = f10;
                hq0Var.f46461e0 = f11;
                hq0Var.G();
                return;
            case 3:
                br0 br0Var = (br0) obj;
                if (br0Var.f44453e > br0Var.f44454f) {
                    i10 = org.telegram.messenger.g0.L(48.0f);
                }
                org.telegram.ui.Components.q51 q51Var = br0Var.f44457s.f41453p3;
                int measuredWidth = (int) (((br0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - f10) - i10);
                int measuredHeight = br0Var.getMeasuredHeight();
                q51Var.h = measuredWidth;
                q51Var.f37257i = measuredHeight;
                View view2 = q51Var.v;
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
                org.telegram.ui.Components.q51 q51Var2 = lz0Var.f47583r.O;
                int measuredWidth2 = (int) (((lz0Var.getMeasuredWidth() - org.telegram.messenger.g0.L(16.0f)) - f10) - 0);
                int measuredHeight2 = lz0Var.getMeasuredHeight();
                q51Var2.h = measuredWidth2;
                q51Var2.f37257i = measuredHeight2;
                View view3 = q51Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
