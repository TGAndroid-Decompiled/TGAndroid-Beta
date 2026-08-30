package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ld0 implements o1.g {
    public final int f36064a;
    public final Object f36065b;

    public ld0(Object obj, int i10) {
        this.f36064a = i10;
        this.f36065b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        int i10 = this.f36064a;
        int i11 = 0;
        Object obj = this.f36065b;
        switch (i10) {
            case 0:
                bg0 bg0Var = ((ng0) obj).Y;
                if (bg0Var != null) {
                    int i12 = bg0.B;
                    View view = bg0Var.f32956c;
                    ViewGroup viewGroup = bg0Var.f32955b;
                    PointF pointF = bg0Var.f32963y;
                    ug.i.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.z10 z10Var = bg0Var.h;
                    z10Var.setTranslationX(pointF.x);
                    z10Var.setTranslationY(pointF.y);
                    bg0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                fo0 fo0Var = (fo0) obj;
                float f12 = f10 / 100.0f;
                fo0Var.f34296b = f12;
                TextView textView = fo0Var.d.R;
                if (textView != null) {
                    textView.setAlpha((f12 * 0.2f) + 0.8f);
                }
                fo0Var.invalidate();
                return;
            case 2:
                tt0 tt0Var = (tt0) obj;
                tt0Var.W = f10;
                tt0Var.f38739b0 = f11;
                tt0Var.G();
                return;
            case 3:
                qu0 qu0Var = (qu0) obj;
                if (qu0Var.e > qu0Var.f37847f) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                org.telegram.ui.Components.k71 k71Var = qu0Var.f37850s.f31815n3;
                int measuredWidth = (int) (((qu0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f10) - i11);
                int measuredHeight = qu0Var.getMeasuredHeight();
                k71Var.h = measuredWidth;
                k71Var.f26184i = measuredHeight;
                View view2 = k71Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                t31 t31Var = (t31) obj;
                t31Var.f38537y = f10 / 1000.0f;
                t31Var.invalidate();
                return;
            default:
                j41 j41Var = (j41) obj;
                org.telegram.ui.Components.k71 k71Var2 = j41Var.f35236r.N;
                int measuredWidth2 = (int) (((j41Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f10) - 0);
                int measuredHeight2 = j41Var.getMeasuredHeight();
                k71Var2.h = measuredWidth2;
                k71Var2.f26184i = measuredHeight2;
                View view3 = k71Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
