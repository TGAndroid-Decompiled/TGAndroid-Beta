package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ad0 implements o1.g {
    public final int f35394a;
    public final Object f35395b;

    public ad0(Object obj, int i10) {
        this.f35394a = i10;
        this.f35395b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.f35394a;
        int i11 = 0;
        Object obj = this.f35395b;
        switch (i10) {
            case 0:
                tf0 tf0Var = ((fg0) obj).f36906b0;
                if (tf0Var != null) {
                    int i12 = tf0.E;
                    View view = tf0Var.f41734c;
                    ViewGroup viewGroup = tf0Var.f41733b;
                    PointF pointF = tf0Var.f41741y;
                    ih.j.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.h20 h20Var = tf0Var.h;
                    h20Var.setTranslationX(pointF.x);
                    h20Var.setTranslationY(pointF.y);
                    tf0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                bo0 bo0Var = (bo0) obj;
                float f11 = f7 / 100.0f;
                bo0Var.f35717b = f11;
                TextView textView = bo0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                bo0Var.invalidate();
                return;
            case 2:
                wt0 wt0Var = (wt0) obj;
                wt0Var.f42924c0 = f7;
                wt0Var.f42926e0 = f10;
                wt0Var.G();
                return;
            case 3:
                su0 su0Var = (su0) obj;
                if (su0Var.e > su0Var.f41500f) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                org.telegram.ui.Components.c81 c81Var = su0Var.f41503s.f33373q3;
                int measuredWidth = (int) (((su0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - i11);
                int measuredHeight = su0Var.getMeasuredHeight();
                c81Var.h = measuredWidth;
                c81Var.f25138i = measuredHeight;
                View view2 = c81Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                z21 z21Var = (z21) obj;
                z21Var.f43538y = f7 / 1000.0f;
                z21Var.invalidate();
                return;
            default:
                t31 t31Var = (t31) obj;
                org.telegram.ui.Components.c81 c81Var2 = t31Var.f41585r.Q;
                int measuredWidth2 = (int) (((t31Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                int measuredHeight2 = t31Var.getMeasuredHeight();
                c81Var2.h = measuredWidth2;
                c81Var2.f25138i = measuredHeight2;
                View view3 = c81Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
