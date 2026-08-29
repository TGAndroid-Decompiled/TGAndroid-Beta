package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class cd0 implements o1.h {
    public final int f37079a;
    public final Object f37080b;

    public cd0(Object obj, int i10) {
        this.f37079a = i10;
        this.f37080b = obj;
    }

    @Override
    public final void a(o1.i iVar, float f9, float f10) {
        int i10 = this.f37079a;
        int i11 = 0;
        Object obj = this.f37080b;
        switch (i10) {
            case 0:
                tf0 tf0Var = ((fg0) obj).X;
                if (tf0Var != null) {
                    int i12 = tf0.A;
                    View view = tf0Var.f42692c;
                    ViewGroup viewGroup = tf0Var.f42691b;
                    PointF pointF = tf0Var.f42700y;
                    sg.i.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.u10 u10Var = tf0Var.h;
                    u10Var.setTranslationX(pointF.x);
                    u10Var.setTranslationY(pointF.y);
                    tf0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                xn0 xn0Var = (xn0) obj;
                float f11 = f9 / 100.0f;
                xn0Var.f44624b = f11;
                TextView textView = xn0Var.d.Q;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                xn0Var.invalidate();
                return;
            case 2:
                kt0 kt0Var = (kt0) obj;
                kt0Var.V = f9;
                kt0Var.f40006a0 = f10;
                kt0Var.G();
                return;
            case 3:
                gu0 gu0Var = (gu0) obj;
                if (gu0Var.f38669e > gu0Var.f38670f) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                org.telegram.ui.Components.z61 z61Var = gu0Var.f38673s.f35757m3;
                int measuredWidth = (int) (((gu0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f9) - i11);
                int measuredHeight = gu0Var.getMeasuredHeight();
                z61Var.h = measuredWidth;
                z61Var.f35235i = measuredHeight;
                View view2 = z61Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                h31 h31Var = (h31) obj;
                h31Var.f38766y = f9 / 1000.0f;
                h31Var.invalidate();
                return;
            default:
                z31 z31Var = (z31) obj;
                org.telegram.ui.Components.z61 z61Var2 = z31Var.f45062r.M;
                int measuredWidth2 = (int) (((z31Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f9) - 0);
                int measuredHeight2 = z31Var.getMeasuredHeight();
                z61Var2.h = measuredWidth2;
                z61Var2.f35235i = measuredHeight2;
                View view3 = z61Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
