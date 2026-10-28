package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class cd0 implements o1.g {
    public final int f38266a;
    public final Object f38267b;

    public cd0(Object obj, int i10) {
        this.f38266a = i10;
        this.f38267b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.f38266a;
        int i11 = 0;
        Object obj = this.f38267b;
        switch (i10) {
            case 0:
                vf0 vf0Var = ((ig0) obj).f40143b0;
                if (vf0Var != null) {
                    int i12 = vf0.F;
                    View view = vf0Var.f44334c;
                    ViewGroup viewGroup = vf0Var.f44333b;
                    PointF pointF = vf0Var.f44341y;
                    jh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.j20 j20Var = vf0Var.h;
                    j20Var.setTranslationX(pointF.x);
                    j20Var.setTranslationY(pointF.y);
                    vf0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                no0 no0Var = (no0) obj;
                float f11 = f7 / 100.0f;
                no0Var.f41831b = f11;
                TextView textView = no0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                no0Var.invalidate();
                return;
            case 2:
                du0 du0Var = (du0) obj;
                du0Var.f38679c0 = f7;
                du0Var.f38681e0 = f10;
                du0Var.G();
                return;
            case 3:
                zu0 zu0Var = (zu0) obj;
                if (zu0Var.e > zu0Var.f46368f) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                org.telegram.ui.Components.v81 v81Var = zu0Var.f46371s.f35778q3;
                int measuredWidth = (int) (((zu0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - i11);
                int measuredHeight = zu0Var.getMeasuredHeight();
                v81Var.h = measuredWidth;
                v81Var.f33613i = measuredHeight;
                View view2 = v81Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                g31 g31Var = (g31) obj;
                g31Var.f39494y = f7 / 1000.0f;
                g31Var.invalidate();
                return;
            default:
                z31 z31Var = (z31) obj;
                org.telegram.ui.Components.v81 v81Var2 = z31Var.f46155r.Q;
                int measuredWidth2 = (int) (((z31Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                int measuredHeight2 = z31Var.getMeasuredHeight();
                v81Var2.h = measuredWidth2;
                v81Var2.f33613i = measuredHeight2;
                View view3 = v81Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
