package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class od0 implements o1.g {
    public final int f35778a;
    public final Object f35779b;

    public od0(Object obj, int i10) {
        this.f35778a = i10;
        this.f35779b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f7, float f10) {
        int i10 = this.f35778a;
        int i11 = 0;
        Object obj = this.f35779b;
        switch (i10) {
            case 0:
                fg0 fg0Var = ((rg0) obj).f36821b0;
                if (fg0Var != null) {
                    int i12 = fg0.E;
                    View view = fg0Var.f33314c;
                    ViewGroup viewGroup = fg0Var.f33313b;
                    PointF pointF = fg0Var.f33321y;
                    hh.k.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.z10 z10Var = fg0Var.h;
                    z10Var.setTranslationX(pointF.x);
                    z10Var.setTranslationY(pointF.y);
                    fg0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                mo0 mo0Var = (mo0) obj;
                float f11 = f7 / 100.0f;
                mo0Var.f35368b = f11;
                TextView textView = mo0Var.d.U;
                if (textView != null) {
                    textView.setAlpha((f11 * 0.2f) + 0.8f);
                }
                mo0Var.invalidate();
                return;
            case 2:
                hu0 hu0Var = (hu0) obj;
                hu0Var.f33920c0 = f7;
                hu0Var.f33922e0 = f10;
                hu0Var.G();
                return;
            case 3:
                dv0 dv0Var = (dv0) obj;
                if (dv0Var.e > dv0Var.f32728f) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                org.telegram.ui.Components.h71 h71Var = dv0Var.f32731s.f31014q3;
                int measuredWidth = (int) (((dv0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - i11);
                int measuredHeight = dv0Var.getMeasuredHeight();
                h71Var.h = measuredWidth;
                h71Var.f24543i = measuredHeight;
                View view2 = h71Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                e41 e41Var = (e41) obj;
                e41Var.f32803y = f7 / 1000.0f;
                e41Var.invalidate();
                return;
            default:
                u41 u41Var = (u41) obj;
                org.telegram.ui.Components.h71 h71Var2 = u41Var.f37906r.Q;
                int measuredWidth2 = (int) (((u41Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f7) - 0);
                int measuredHeight2 = u41Var.getMeasuredHeight();
                h71Var2.h = measuredWidth2;
                h71Var2.f24543i = measuredHeight2;
                View view3 = h71Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
