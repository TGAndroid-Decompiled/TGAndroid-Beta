package org.telegram.ui.Components;

import android.widget.LinearLayout;
import android.widget.TextView;
public abstract class l20 extends org.telegram.ui.ActionBar.x2 {
    public c5.l f36984m1;
    public i20 n1;
    public LinearLayout f36985o1;
    public TextView[] f36986p1;
    public float f36987q1;
    public int f36988r1;

    public static void J0(org.telegram.ui.g30 g30Var) {
        TextView textView;
        TextView[] textViewArr = g30Var.f36986p1;
        int i7 = g30Var.f36988r1;
        TextView textView2 = textViewArr[i7];
        if (i7 < textViewArr.length - 1) {
            textView = textViewArr[i7 + 1];
        } else {
            textView = null;
        }
        g30Var.f30192b.getMeasuredWidth();
        float measuredWidth = (textView2.getMeasuredWidth() / 2) + textView2.getLeft();
        float measuredWidth2 = (g30Var.f30192b.getMeasuredWidth() / 2) - measuredWidth;
        if (textView != null) {
            measuredWidth2 -= (((textView.getMeasuredWidth() / 2) + textView.getLeft()) - measuredWidth) * g30Var.f36987q1;
        }
        for (int i10 = 0; i10 < textViewArr.length; i10++) {
            int i11 = g30Var.f36988r1;
            float f10 = 0.9f;
            float f11 = 0.7f;
            if (i10 >= i11 && i10 <= i11 + 1) {
                if (i10 == i11) {
                    float f12 = g30Var.f36987q1;
                    f11 = 1.0f - (0.3f * f12);
                    f10 = 1.0f - (f12 * 0.1f);
                } else {
                    float f13 = g30Var.f36987q1;
                    f11 = 0.7f + (0.3f * f13);
                    f10 = 0.9f + (f13 * 0.1f);
                }
            }
            textViewArr[i10].setAlpha(f11);
            textViewArr[i10].setScaleX(f10);
            textViewArr[i10].setScaleY(f10);
        }
        g30Var.f36985o1.setTranslationX(measuredWidth2);
        g30Var.n1.invalidate();
    }
}
