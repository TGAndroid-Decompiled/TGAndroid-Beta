package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class ad0 implements o1.g {
    public final int f37716a;
    public final Object f37717b;

    public ad0(Object obj, int i10) {
        this.f37716a = i10;
        this.f37717b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.f37716a;
        int i11 = 0;
        Object obj = this.f37717b;
        switch (i10) {
            case 0:
                tf0 tf0Var = ((gg0) obj).f39654b0;
                if (tf0Var != null) {
                    int i12 = tf0.F;
                    View view = tf0Var.f43824c;
                    ViewGroup viewGroup = tf0Var.f43823b;
                    PointF pointF = tf0Var.f43831y;
                    jh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.j20 j20Var = tf0Var.h;
                    j20Var.setTranslationX(pointF.x);
                    j20Var.setTranslationY(pointF.y);
                    tf0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                lo0 lo0Var = (lo0) obj;
                float f11 = f7 / 100.0f;
                lo0Var.f41308b = f11;
                TextView textView = lo0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                lo0Var.invalidate();
                return;
            case 2:
                bu0 bu0Var = (bu0) obj;
                bu0Var.f38162c0 = f7;
                bu0Var.f38164e0 = f10;
                bu0Var.G();
                return;
            case 3:
                xu0 xu0Var = (xu0) obj;
                if (xu0Var.e > xu0Var.f45864f) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                org.telegram.ui.Components.u81 u81Var = xu0Var.f45867s.f35754q3;
                int measuredWidth = (int) (((xu0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - i11);
                int measuredHeight = xu0Var.getMeasuredHeight();
                u81Var.h = measuredWidth;
                u81Var.f33298i = measuredHeight;
                View view2 = u81Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                e31 e31Var = (e31) obj;
                e31Var.f38983y = f7 / 1000.0f;
                e31Var.invalidate();
                return;
            default:
                w31 w31Var = (w31) obj;
                org.telegram.ui.Components.u81 u81Var2 = w31Var.f44971r.Q;
                int measuredWidth2 = (int) (((w31Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                int measuredHeight2 = w31Var.getMeasuredHeight();
                u81Var2.h = measuredWidth2;
                u81Var2.f33298i = measuredHeight2;
                View view3 = u81Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
