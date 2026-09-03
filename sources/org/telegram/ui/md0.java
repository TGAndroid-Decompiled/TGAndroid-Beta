package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class md0 implements o1.g {
    public final int f38954a;
    public final Object f38955b;

    public md0(Object obj, int i10) {
        this.f38954a = i10;
        this.f38955b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        int i10 = this.f38954a;
        int i11 = 0;
        Object obj = this.f38955b;
        switch (i10) {
            case 0:
                cg0 cg0Var = ((og0) obj).Y;
                if (cg0Var != null) {
                    int i12 = cg0.B;
                    View view = cg0Var.f35794c;
                    ViewGroup viewGroup = cg0Var.f35793b;
                    PointF pointF = cg0Var.f35802y;
                    vg.i.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.a20 a20Var = cg0Var.h;
                    a20Var.setTranslationX(pointF.x);
                    a20Var.setTranslationY(pointF.y);
                    cg0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                ho0 ho0Var = (ho0) obj;
                float f12 = f10 / 100.0f;
                ho0Var.f37435b = f12;
                TextView textView = ho0Var.d.R;
                if (textView != null) {
                    textView.setAlpha((f12 * 0.2f) + 0.8f);
                }
                ho0Var.invalidate();
                return;
            case 2:
                au0 au0Var = (au0) obj;
                au0Var.W = f10;
                au0Var.f35253b0 = f11;
                au0Var.G();
                return;
            case 3:
                xu0 xu0Var = (xu0) obj;
                if (xu0Var.f43457e > xu0Var.f43458f) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                org.telegram.ui.Components.l71 l71Var = xu0Var.f43461s.f34341n3;
                int measuredWidth = (int) (((xu0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f10) - i11);
                int measuredHeight = xu0Var.getMeasuredHeight();
                l71Var.h = measuredWidth;
                l71Var.f28662i = measuredHeight;
                View view2 = l71Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                a41 a41Var = (a41) obj;
                a41Var.f35022y = f10 / 1000.0f;
                a41Var.invalidate();
                return;
            default:
                q41 q41Var = (q41) obj;
                org.telegram.ui.Components.l71 l71Var2 = q41Var.f40323r.N;
                int measuredWidth2 = (int) (((q41Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f10) - 0);
                int measuredHeight2 = q41Var.getMeasuredHeight();
                l71Var2.h = measuredWidth2;
                l71Var2.f28662i = measuredHeight2;
                View view3 = l71Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
