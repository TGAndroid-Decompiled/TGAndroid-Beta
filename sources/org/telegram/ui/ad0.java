package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ad0 implements o1.g {
    public final int f36456a;
    public final Object f36457b;

    public ad0(Object obj, int i9) {
        this.f36456a = i9;
        this.f36457b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        int i9 = this.f36456a;
        int i10 = 0;
        Object obj = this.f36457b;
        switch (i9) {
            case 0:
                tf0 tf0Var = ((fg0) obj).X;
                if (tf0Var != null) {
                    int i11 = tf0.A;
                    View view = tf0Var.f42978c;
                    ViewGroup viewGroup = tf0Var.f42977b;
                    PointF pointF = tf0Var.f42986y;
                    pg.i.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.j10 j10Var = tf0Var.h;
                    j10Var.setTranslationX(pointF.x);
                    j10Var.setTranslationY(pointF.y);
                    tf0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                yn0 yn0Var = (yn0) obj;
                float f12 = f10 / 100.0f;
                yn0Var.f44914b = f12;
                TextView textView = yn0Var.d.Q;
                if (textView != null) {
                    textView.setAlpha((f12 * 0.2f) + 0.8f);
                }
                yn0Var.invalidate();
                return;
            case 2:
                mt0 mt0Var = (mt0) obj;
                mt0Var.V = f10;
                mt0Var.f40518a0 = f11;
                mt0Var.G();
                return;
            case 3:
                iu0 iu0Var = (iu0) obj;
                if (iu0Var.f39288e > iu0Var.f39289f) {
                    i10 = AndroidUtilities.dp(48.0f);
                }
                org.telegram.ui.Components.m61 m61Var = iu0Var.f39292s.f35691m3;
                int measuredWidth = (int) (((iu0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f10) - i10);
                int measuredHeight = iu0Var.getMeasuredHeight();
                m61Var.h = measuredWidth;
                m61Var.f30713i = measuredHeight;
                View view2 = m61Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                h31 h31Var = (h31) obj;
                h31Var.f38671y = f10 / 1000.0f;
                h31Var.invalidate();
                return;
            default:
                x31 x31Var = (x31) obj;
                org.telegram.ui.Components.m61 m61Var2 = x31Var.f44361r.M;
                int measuredWidth2 = (int) (((x31Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f10) - 0);
                int measuredHeight2 = x31Var.getMeasuredHeight();
                m61Var2.h = measuredWidth2;
                m61Var2.f30713i = measuredHeight2;
                View view3 = m61Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
