package org.telegram.ui;

import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
public final class nd0 implements o1.g {
    public final int f36483a;
    public final Object f36484b;

    public nd0(Object obj, int i10) {
        this.f36483a = i10;
        this.f36484b = obj;
    }

    @Override
    public final void a(o1.h hVar, float f10, float f11) {
        int i10 = this.f36483a;
        int i11 = 0;
        Object obj = this.f36484b;
        switch (i10) {
            case 0:
                dg0 dg0Var = ((pg0) obj).Y;
                if (dg0Var != null) {
                    int i12 = dg0.B;
                    View view = dg0Var.f33465c;
                    ViewGroup viewGroup = dg0Var.f33464b;
                    PointF pointF = dg0Var.f33472y;
                    ug.i.b(view, viewGroup, pointF);
                    org.telegram.ui.Components.a20 a20Var = dg0Var.h;
                    a20Var.setTranslationX(pointF.x);
                    a20Var.setTranslationY(pointF.y);
                    dg0Var.requestLayout();
                    return;
                }
                return;
            case 1:
                ho0 ho0Var = (ho0) obj;
                float f12 = f10 / 100.0f;
                ho0Var.f34712b = f12;
                TextView textView = ho0Var.d.R;
                if (textView != null) {
                    textView.setAlpha((f12 * 0.2f) + 0.8f);
                }
                ho0Var.invalidate();
                return;
            case 2:
                au0 au0Var = (au0) obj;
                au0Var.W = f10;
                au0Var.f32649b0 = f11;
                au0Var.G();
                return;
            case 3:
                xu0 xu0Var = (xu0) obj;
                if (xu0Var.e > xu0Var.f40076f) {
                    i11 = AndroidUtilities.dp(48.0f);
                }
                org.telegram.ui.Components.k71 k71Var = xu0Var.f40079s.f31789n3;
                int measuredWidth = (int) (((xu0Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f10) - i11);
                int measuredHeight = xu0Var.getMeasuredHeight();
                k71Var.h = measuredWidth;
                k71Var.f26186i = measuredHeight;
                View view2 = k71Var.v;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 4:
                a41 a41Var = (a41) obj;
                a41Var.f32462y = f10 / 1000.0f;
                a41Var.invalidate();
                return;
            default:
                q41 q41Var = (q41) obj;
                org.telegram.ui.Components.k71 k71Var2 = q41Var.f37304r.N;
                int measuredWidth2 = (int) (((q41Var.getMeasuredWidth() - AndroidUtilities.dp(16.0f)) - f10) - 0);
                int measuredHeight2 = q41Var.getMeasuredHeight();
                k71Var2.h = measuredWidth2;
                k71Var2.f26186i = measuredHeight2;
                View view3 = k71Var2.v;
                if (view3 != null) {
                    view3.invalidate();
                    return;
                }
                return;
        }
    }
}
