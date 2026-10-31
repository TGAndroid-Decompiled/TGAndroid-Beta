package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
public final class jc0 implements o1.g {
    public final int f38490a;
    public final Object f38491b;

    public jc0(Object obj, int i10) {
        this.f38490a = i10;
        this.f38491b = obj;
    }

    @Override
    public final void a(o1.j jVar, float f7, float f10) {
        int i10 = this.f38490a;
        int i11 = 0;
        Object obj = this.f38491b;
        switch (i10) {
            case 0:
                we0 we0Var = ((hf0) obj).f37921b0;
                if (we0Var != null) {
                    int i12 = we0.F;
                    View view = we0Var.f42960c;
                    ViewGroup viewGroup = we0Var.f42959b;
                    PointF pointF = we0Var.D;
                    zg.h.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.f10 f10Var = we0Var.h;
                    f10Var.setTranslationX(pointF.x);
                    f10Var.setTranslationY(pointF.y);
                    we0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                om0 om0Var = (om0) obj;
                float f11 = f7 / 100.0f;
                om0Var.f40303b = f11;
                TextView textView = om0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                om0Var.invalidate();
                return;
            case 2:
                tr0 tr0Var = (tr0) obj;
                tr0Var.f41920c0 = f7;
                tr0Var.f41922e0 = f10;
                tr0Var.G();
                return;
            case 3:
                ms0 ms0Var = (ms0) obj;
                if (ms0Var.e > ms0Var.f39759f) {
                    i11 = org.telegram.messenger.i0.L(48.0f);
                }
                org.telegram.ui.Components.w61 w61Var = ms0Var.f39762s.f33577q3;
                int measuredWidth = (int) (((ms0Var.getMeasuredWidth() - org.telegram.messenger.i0.L(16.0f)) - f7) - i11);
                int measuredHeight = ms0Var.getMeasuredHeight();
                w61Var.h = measuredWidth;
                w61Var.f32027i = measuredHeight;
                View view2 = w61Var.v;
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
                org.telegram.ui.Components.w61 w61Var2 = b11Var.f35947r.O;
                int measuredWidth2 = (int) (((b11Var.getMeasuredWidth() - org.telegram.messenger.i0.L(16.0f)) - f7) - 0);
                int measuredHeight2 = b11Var.getMeasuredHeight();
                w61Var2.h = measuredWidth2;
                w61Var2.f32027i = measuredHeight2;
                View view3 = w61Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
