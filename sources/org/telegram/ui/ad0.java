package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ad0 implements o1.g {
    public final int f35414a;
    public final Object f35415b;

    public ad0(Object obj, int i10) {
        this.f35414a = i10;
        this.f35415b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.f35414a;
        int i11 = 0;
        Object obj = this.f35415b;
        switch (i10) {
            case 0:
                tf0 tf0Var = ((fg0) obj).f36929b0;
                if (tf0Var != null) {
                    int i12 = tf0.E;
                    View view = tf0Var.f41760c;
                    ViewGroup viewGroup = tf0Var.f41759b;
                    PointF pointF = tf0Var.f41767y;
                    ih.j.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.h20 h20Var = tf0Var.h;
                    h20Var.setTranslationX(pointF.x);
                    h20Var.setTranslationY(pointF.y);
                    tf0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                co0 co0Var = (co0) obj;
                float f11 = f7 / 100.0f;
                co0Var.f35981b = f11;
                TextView textView = co0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                co0Var.invalidate();
                return;
            case 2:
                wt0 wt0Var = (wt0) obj;
                wt0Var.f42944c0 = f7;
                wt0Var.f42946e0 = f10;
                wt0Var.G();
                return;
            case 3:
                su0 su0Var = (su0) obj;
                if (su0Var.e > su0Var.f41526f) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                org.telegram.ui.Components.c81 c81Var = su0Var.f41529s.f33380q3;
                int measuredWidth = (int) (((su0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - i11);
                int measuredHeight = su0Var.getMeasuredHeight();
                c81Var.h = measuredWidth;
                c81Var.f25145i = measuredHeight;
                View view2 = c81Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                z21 z21Var = (z21) obj;
                z21Var.f43564y = f7 / 1000.0f;
                z21Var.invalidate();
                return;
            default:
                t31 t31Var = (t31) obj;
                org.telegram.ui.Components.c81 c81Var2 = t31Var.f41611r.Q;
                int measuredWidth2 = (int) (((t31Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                int measuredHeight2 = t31Var.getMeasuredHeight();
                c81Var2.h = measuredWidth2;
                c81Var2.f25145i = measuredHeight2;
                View view3 = c81Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
